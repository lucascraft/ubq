/***********************************************************************************
 * UBQT - A ubiquitous computing utilities framework 
 * 
 * Copyright (c) 2008 - 2010, Lucas Bigeardel
 * 
 * The library is released under:
 * 
 * A) LGPL
 * 
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General
 * Public License along with this library; if not, write to the
 * Free Software Foundation, Inc., 51 Franklin Street, Fifth Floor,
 * Boston, MA 02110-1301 USA
 * 
 * B) EPL
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Lucas Bigeardel <lucas.bigeardel@gmail.com> - Initial API and implementation
 ***********************************************************************************/

package net.sf.ubq.interfaces.gui.handlers;

import net.sf.reactivision.tuio.TuioCursor;
import net.sf.reactivision.tuio.TuioObject;
import net.sf.smbt.osc.eztuio.Tuio2DCur;
import net.sf.smbt.osc.eztuio.Tuio2DCurAdd;
import net.sf.smbt.osc.eztuio.Tuio2DCurRemove;
import net.sf.smbt.osc.eztuio.Tuio2DCurUpdate;
import net.sf.smbt.osc.eztuio.Tuio2DObj;
import net.sf.smbt.osc.eztuio.Tuio2DObjAdd;
import net.sf.smbt.osc.eztuio.Tuio2DObjRemove;
import net.sf.smbt.osc.eztuio.Tuio2DObjUpdate;
import net.sf.smbt.ubqt.PROXIMA_STATUS;
import net.sf.smbt.ubqt.UbqBounds;
import net.sf.smbt.ubqt.UbqColor;
import net.sf.smbt.ubqt.UbqCursor;
import net.sf.smbt.ubqt.UbqDisplayMode;
import net.sf.smbt.ubqt.UbqFiducial;
import net.sf.smbt.ubqt.UbqIncrementableRange;
import net.sf.smbt.ubqt.UbqPoint;
import net.sf.smbt.ubqt.UbqProxima;
import net.sf.smbt.ubqt.UbqSession;
import net.sf.smbt.ubqt.UbqtFactory;
import net.sf.smbt.ubqt.UbqtPackage;
import net.sf.ubq.interfaces.gui.ubqtgui.CURSOR_EVENT;
import net.sf.ubq.interfaces.gui.ubqtgui.PROXIMA_EVENT;
import net.sf.ubq.interfaces.gui.ubqtgui.UbqtGuiCursorCmd;
import net.sf.ubq.interfaces.gui.ubqtgui.UbqtGuiProximaCmd;
import net.sf.ubq.interfaces.gui.ubqtgui.UbqtguiPackage;
import net.sf.ubq.utils.cursors.CursorUtils;
import net.sf.ubq.utils.proximi.ProximaUtils;
import net.sf.xqz.model.cmd.Cmd;
import net.sf.xqz.model.cmd.CompoundCmd;
import net.sf.xqz.model.cmd.PRIORITY;
import net.sf.xqz.model.engine.CmdPipe;
import net.sf.xqz.model.engine.EVENT_KIND;
import net.sf.xqz.model.engine.Event;
import net.sf.xqz.model.engine.impl.AbstractQxEventHandlerImpl;

import org.eclipse.core.runtime.Platform;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;

public class TuioQxEventHandlerImpl extends AbstractQxEventHandlerImpl {
	private UbqColor defaultFG;
	private UbqColor defaultBG;
	
	
	private int UPDATE_ARTIFACT_SKIP_RATE = 150;
	private static int updateCounter = 0;

	private Dimension displayMode;
	
	private UbqSession ubqSession;
	private CmdPipe guiEngine;
		
	public synchronized void refresh(long timestamp) {}
	
	public TuioQxEventHandlerImpl() {
		defaultFG = UbqtFactory.eINSTANCE.createUbqColor();
		defaultFG.setR(255);
		defaultFG.setG(0);
		defaultFG.setB(0);
		defaultBG = UbqtFactory.eINSTANCE.createUbqColor();
		defaultBG.setR(0);
		defaultBG.setG(255);
		defaultBG.setB(0);
	}
	public TuioQxEventHandlerImpl(UbqSession ubqSession, CmdPipe guiEngine) {
		this.ubqSession = ubqSession;
		this.guiEngine = guiEngine;

		UbqDisplayMode dim = ubqSession.getDisplayMode();
		
		this.displayMode = new Dimension(dim.getMode().getX(), dim.getMode().getY());
	}
	
	
	private void handleCommand(Cmd cmd) {
		if (cmd instanceof CompoundCmd) {
			for (Cmd c : ((CompoundCmd)cmd).getChildren()) {
				handleCommand(c);
			}
		} else {
			if (cmd instanceof Tuio2DObj) {
				if (cmd instanceof Tuio2DObjAdd) {
					addTuioObject(((Tuio2DObj)cmd).getTuioObject());
				} else if (cmd instanceof Tuio2DObjUpdate) {
					updateTuioObject(((Tuio2DObj)cmd).getTuioObject());
				} else if (cmd instanceof Tuio2DObjRemove) {
					removeTuioObject(((Tuio2DObj)cmd).getTuioObject());
				}
//				if (Platform.inDebugMode()) {
//					System.out.println( 
//						"s_id    : " + ((Tuio2DObj)cmd).getS_id() + ", \n" +
//						"fid_id  : " + ((Tuio2DObj)cmd).getF_id() + ", \n" +
//						"angle   : " + ((Tuio2DObj)cmd).getAngle() + ", \n" +
//						"m_accel : " + ((Tuio2DObj)cmd).getMaccel() + ", \n" +
//						"r_accel : " + ((Tuio2DObj)cmd).getRaccel() + ", \n" +
//						"r_speed : " + ((Tuio2DObj)cmd).getRspeed() + ", \n" +
//						"x_pos   : " + ((Tuio2DObj)cmd).getXpos() + ", \n" +
//						"y_pos   : " + ((Tuio2DObj)cmd).getYpos() + ", \n" +
//						"x_speed : " + ((Tuio2DObj)cmd).getXspeed() + ", \n" +
//						"y_speed : " + ((Tuio2DObj)cmd).getXspeed()
//					);
//				}
			} else if (cmd instanceof Tuio2DCur) {
				if (cmd instanceof Tuio2DCurAdd) {
					addTuioCursor(((Tuio2DCur)cmd).getTuioCursor());
				} else if (cmd instanceof Tuio2DCurUpdate) {
					updateTuioCursor(((Tuio2DCur)cmd).getTuioCursor());
				} else if (cmd instanceof Tuio2DCurRemove) {
					removeTuioCursor(((Tuio2DCur)cmd).getTuioCursor());
				}
//				if (Platform.inDebugMode()) {
//					System.out.println( 
//						"s_id    : " + ((Tuio2DCur)cmd).getS_id() + ", \n" +
//						"m_accel : " + ((Tuio2DCur)cmd).getMaccel() + ", \n" +
//						"x_pos   : " + ((Tuio2DCur)cmd).getXpos() + ", \n" +
//						"y_pos   : " + ((Tuio2DCur)cmd).getYpos() + ", \n" +
//						"x_speed : " + ((Tuio2DCur)cmd).getXspeed() + ", \n" +
//						"y_speed : " + ((Tuio2DCur)cmd).getXspeed()
//					);
//				}
			}
		}
	}
	
	@Override
	public void handleQxEvent(Event event) {
		if (event.getKind().equals(EVENT_KIND.RX_DONE)) {
			handleCommand(event.getCmd());
		}
	}
	
	/*
	 * compute a value between ubqt defined [min..max] range for a proxima w/ given angle
	 */
	private void updateUbqRange(TuioObject tuioObject, UbqProxima proxima) {
		float angleDegrees = tuioObject.getAngleDegrees();
		float ratio = angleDegrees / 360.0f;

		if (proxima.getRange() != null) {
			UbqIncrementableRange range = proxima.getRange();
			float min = range.getMin();
			float max = range.getMax();
			//float increment = range.getIncrement();
			float dist = (max - min);
			float val = min + (dist * ratio);
			
			range.setVal(Math.round(val));
		}
	}

	//
	// TUIO Listener : cursors
	//
	public synchronized void addTuioCursor(TuioCursor tuioCursor) {
		if (tuioCursor != null) {
			UbqtGuiCursorCmd addCursorCmd = CursorUtils.INSTANCE.createCursorCmd(
					""+tuioCursor.getFingerID(), 
					tuioCursor.getPosition().getScreenX(displayMode.width), 
					tuioCursor.getPosition().getScreenY(displayMode.height), 
					CURSOR_EVENT.ADD, 
					PRIORITY.HIGHEST
			);
			if (Platform.inDebugMode()) {
				System.out.println("Add cursor/finger : [" + tuioCursor.getFingerID() + "] at position (" + addCursorCmd.getX() + ", " + addCursorCmd.getY() + ")");
			}
			guiEngine.getTx().postCommand(addCursorCmd);
		}
	}
	
	public synchronized void removeTuioCursor(TuioCursor tuioCursor) {
		UbqCursor cursor = ProximaUtils.INSTANCE.getUbqCursorByID(ubqSession, ""+tuioCursor.getFingerID());
		if (cursor != null) {
			UbqtGuiCursorCmd removeCursorCmd = (UbqtGuiCursorCmd) EcoreUtil.create(UbqtguiPackage.Literals.UBQT_GUI_CURSOR_CMD);
			removeCursorCmd.setCursorID(""+tuioCursor.getFingerID());
			removeCursorCmd.setEvent(CURSOR_EVENT.REMOVE);
			guiEngine.getTx().postCommand(removeCursorCmd);
		}
	}

	public synchronized void updateTuioCursor(TuioCursor tuioCursor) {
		synchronized (tuioCursor) {
			UbqCursor cursor = ProximaUtils.INSTANCE.getUbqCursorByID(ubqSession, ""+tuioCursor.getFingerID());
			if (cursor != null) {
				UbqPoint position = cursor.getPos();
				position.setX(tuioCursor.getScreenX(displayMode.width));
				position.setY(tuioCursor.getScreenY(displayMode.height));
			
				cursor.setPos(position);

				UbqtGuiCursorCmd updateCursorCmd = (UbqtGuiCursorCmd) EcoreUtil.create(UbqtguiPackage.Literals.UBQT_GUI_CURSOR_CMD);					
				updateCursorCmd.setCursorID(""+tuioCursor.getFingerID());
				updateCursorCmd.setEvent(CURSOR_EVENT.MOVE);
					
				if (updateCounter>UPDATE_ARTIFACT_SKIP_RATE) {
					updateCounter = 0;
					guiEngine.getTx().postCommand(updateCursorCmd);
				}
				updateCounter++;
			}
		}
	}

	//
	// TUIO Listener : proxima
	//
	public synchronized void removeTuioObject(final TuioObject tuioObject) {
		UbqProxima proxima = ProximaUtils.INSTANCE.getUbqProximaByFiducial(ubqSession, tuioObject);
		if (proxima != null) {
			proxima.setBounds(proxima.getBounds());
			
			UbqtGuiProximaCmd removeArtifactCmd = (UbqtGuiProximaCmd) EcoreUtil.create(UbqtguiPackage.Literals.UBQT_GUI_PROXIMA_CMD);
			removeArtifactCmd.setProximaID(proxima.getFiducial().getFidcode());
			removeArtifactCmd.setEvent(PROXIMA_EVENT.REMOVE);
			guiEngine.getTx().postCommand(removeArtifactCmd);
			
			proxima.setStatus(PROXIMA_STATUS.DEACTIVATED);
		}
	}

	public synchronized void addTuioObject(final TuioObject tuioObject) {
		UbqProxima proxima = ProximaUtils.INSTANCE.getUbqProximaByFiducial(ubqSession, tuioObject);
		
		if (proxima == null) {
			proxima = (UbqProxima) EcoreUtil.create(UbqtPackage.Literals.UBQ_PROXIMA);
			proxima.setRadius(150);
			proxima.setFgColor(defaultFG);
			proxima.setFgColor(defaultBG);
			proxima.setLimit(250);
			
			UbqIncrementableRange range = (UbqIncrementableRange) EcoreUtil.create(UbqtPackage.Literals.UBQ_INCREMENTABLE_RANGE);
			proxima.setRange(range);
			
			synchronized (ubqSession.getProximi()) {
				ubqSession.getProximi().add(proxima);
			}
		}
		if (proxima != null) {
			UbqBounds bounds = (UbqBounds) EcoreUtil.create(UbqtPackage.Literals.UBQ_BOUNDS);
			bounds.setX(tuioObject.getScreenX(displayMode.width));
			bounds.setY(tuioObject.getScreenY(displayMode.height));
			bounds.setWidth(proxima.getRadius());
			bounds.setHeight(proxima.getRadius());
			
			UbqFiducial fid = ProximaUtils.INSTANCE.getUbqFiducialByTuioObject(ubqSession, tuioObject);
			if (fid == null) {
				UbqFiducial fiducial = (UbqFiducial) EcoreUtil.create(UbqtPackage.Literals.UBQ_FIDUCIAL);
				fiducial.setFidcode(tuioObject.getFiducialID());
				fiducial.setName(""+tuioObject.getFiducialID());
				proxima.setFiducial(fiducial);
				ubqSession.getFiducials().add(fiducial);
			} else if (null == proxima.getFiducial()) {
				proxima.setFiducial(fid);
			}
			
			bounds.setWidth(proxima.getRadius());
			bounds.setHeight(proxima.getRadius());

			if (proxima.getRange() == null) {
				UbqIncrementableRange range = (UbqIncrementableRange) EcoreUtil.create(UbqtPackage.Literals.UBQ_INCREMENTABLE_RANGE);
				proxima.setRange(range);
			}
			
			proxima.setAngle((int) tuioObject.getAngleDegrees());
			proxima.setBounds(bounds);
			proxima.setStatus(PROXIMA_STATUS.ACTIVATED);
			
			updateUbqRange(tuioObject, proxima);
			 
			//
			// Ubiquisense event init
			//
			UbqtGuiProximaCmd addArtifactCmd = (UbqtGuiProximaCmd) EcoreUtil.create(UbqtguiPackage.Literals.UBQT_GUI_PROXIMA_CMD);
			addArtifactCmd.setProximaID(proxima.getFiducial().getFidcode());
			addArtifactCmd.setEvent(PROXIMA_EVENT.ADD);
			guiEngine.getTx().postCommand(addArtifactCmd);
		}
	}

	public synchronized void updateTuioObject(final TuioObject tuioObject) {
		synchronized (tuioObject) {
			UbqProxima proxima = ProximaUtils.INSTANCE.getUbqProximaByFiducial(ubqSession, tuioObject);
			if (proxima != null && proxima.getBounds() != null) {
				
				
				if (proxima.getFiducial() == null) {
					UbqFiducial fid = (UbqFiducial) EcoreUtil.create(UbqtPackage.Literals.UBQ_FIDUCIAL);
					fid.setFidcode(tuioObject.getFiducialID());
					fid.setName(""+tuioObject.getFiducialID());
					proxima.setFiducial(fid);
				}
				
				UbqBounds bounds = proxima.getBounds();
				bounds.setX(tuioObject.getScreenX(displayMode.width));
				bounds.setY(tuioObject.getScreenY(displayMode.height));
			
				updateUbqRange(tuioObject, proxima);

				proxima.setAngle((int) tuioObject.getAngleDegrees());
				proxima.setBounds(bounds);

				UbqtGuiProximaCmd updateArtifactCmd = (UbqtGuiProximaCmd) EcoreUtil.create(UbqtguiPackage.Literals.UBQT_GUI_PROXIMA_CMD);					
				updateArtifactCmd.setProximaID(proxima.getFiducial().getFidcode());
				updateArtifactCmd.setEvent(PROXIMA_EVENT.MOVE);
					
				if (updateCounter>UPDATE_ARTIFACT_SKIP_RATE) {
					updateCounter = 0;
					guiEngine.getTx().postCommand(updateArtifactCmd);
				}
				updateCounter++;
			}
		}
	}
}
