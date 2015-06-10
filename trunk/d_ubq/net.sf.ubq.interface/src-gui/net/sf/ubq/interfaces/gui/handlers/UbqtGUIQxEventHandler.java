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

import net.sf.smbt.comm.script.config.utils.NetConfigUtil;
import net.sf.smbt.ubqt.PROXIMA_STATUS;
import net.sf.smbt.ubqt.SLOT_STATUS;
import net.sf.smbt.ubqt.UbqAction;
import net.sf.smbt.ubqt.UbqCursor;
import net.sf.smbt.ubqt.UbqEmmitedActions;
import net.sf.smbt.ubqt.UbqPoint;
import net.sf.smbt.ubqt.UbqProxima;
import net.sf.smbt.ubqt.UbqSession;
import net.sf.smbt.ubqt.UbqSlot;
import net.sf.smbt.ubqt.UbqtPackage;
import net.sf.ubq.gui.services.UbqActionUtils;
import net.sf.ubq.interfaces.gui.interfaces.IUbqtCursorHandler;
import net.sf.ubq.interfaces.gui.interfaces.IUbqtProximaHandler;
import net.sf.ubq.interfaces.gui.ubqtgui.UbqtGuiCursorCmd;
import net.sf.ubq.interfaces.gui.ubqtgui.UbqtGuiProximaCmd;
import net.sf.ubq.interfaces.gui.ubqtgui.UbqtGuiWidgetCmd;
import net.sf.ubq.utils.proximi.ProximaUtils;
import net.sf.xqz.model.engine.CmdEngineActionArg;
import net.sf.xqz.model.engine.CmdPipe;
import net.sf.xqz.model.engine.EVENT_KIND;
import net.sf.xqz.model.engine.EnginePackage;
import net.sf.xqz.model.engine.Event;
import net.sf.xqz.model.engine.Qx;
import net.sf.xqz.model.engine.impl.AbstractCmdEngineActionImpl;
import net.sf.xqz.model.engine.impl.AbstractQxEventHandlerImpl;

import org.eclipse.core.runtime.Platform;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * Handles Proxima (fiducial), Cursor & Widget events.
 * 
 * It globally organizes event handling based on the current *.ubqt file config.
 * 
 * @author lucas
 *
 */
public class UbqtGUIQxEventHandler extends AbstractQxEventHandlerImpl implements IUbqtProximaHandler, IUbqtCursorHandler {
	private final static Object LOCK = new Object();
	
	private UbqSlot lastSlotMatched;

	private final NetConfigUtil cfgUtil;
	private final UbqSession ubqSession;
	private CmdPipe pipe;
	
	public UbqtGUIQxEventHandler(UbqSession session, NetConfigUtil cfgUtil, CmdPipe pipe) {
		this.cfgUtil = cfgUtil;
		this.ubqSession = session;
		this.pipe = pipe;
	}
	
	@Override
	public synchronized void handleQxEvent(final Event event) {
		synchronized (LOCK) {
			if(event.getKind()==EVENT_KIND.TX_DONE) {
				if (event.getCmd() instanceof UbqtGuiProximaCmd) {
					UbqtGuiProximaCmd proximaCmd = (UbqtGuiProximaCmd) event.getCmd();
					UbqProxima proxima = ProximaUtils.INSTANCE.getUbqProximaByFiducialID(ubqSession, proximaCmd.getProximaID());
					switch(proximaCmd.getEvent()) {
						case ADD:
							handleAddProximaCmd(proximaCmd, proxima);
							break;
						case REMOVE:
							handleRemoveProximaCmd(proximaCmd, proxima);
							break;
						case MOVE:
						case ROTATION:
							handleUpdateProximaCmd(proximaCmd, proxima);
							break;
						case ACCEL:
							throw new UnsupportedOperationException();
					}
				} else if (event.getCmd() instanceof UbqtGuiCursorCmd) {
					UbqtGuiCursorCmd cursorCmd = (UbqtGuiCursorCmd) event.getCmd();
					switch(cursorCmd.getEvent()) {
						case ADD:
							handleAddCursorCmd(cursorCmd);
							break;
						case REMOVE:
							handleRemoveCursorCmd(cursorCmd);
							break;
						case MOVE:
							handleMoveCursorCmd(cursorCmd);
							break;
					}
				} else if (event.getCmd() instanceof UbqtGuiWidgetCmd) {
					// Widget
				}
			}
		}
	}
	
	public synchronized void handleAddProximaCmd(final UbqtGuiProximaCmd proximaCmd, final UbqProxima proxima) {
		if (proxima != null && proximaCmd != null) {
			handleProximaCmd(proximaCmd, proxima);
		}
	}

	public synchronized void handleRemoveProximaCmd(final UbqtGuiProximaCmd proximaCmd, final UbqProxima proxima) {
		if (proxima != null && proximaCmd != null) {
			handleProximaCmd(proximaCmd, proxima);
		}
	}

	public synchronized void handleUpdateProximaCmd(final UbqtGuiProximaCmd proximaCmd, final UbqProxima proxima) {
		if (proxima != null && proximaCmd != null) {
			handleProximaCmd(proximaCmd, proxima);
		}
	}

	private synchronized void handleProximaCmd(final UbqtGuiProximaCmd proximaCmd, final UbqProxima proxima) {
		synchronized (ubqSession) {
			synchronized (proximaCmd) {
				synchronized (proxima) {
					boolean allRequiredRefsResolved = true;
					for (UbqProxima pRequired : proxima.getRequiredProximi()) {
						if (pRequired.getStatus().equals(PROXIMA_STATUS.DEACTIVATED)) {
							allRequiredRefsResolved = false;
						}
					}
					if (allRequiredRefsResolved) {
						if (proxima.getStatus() != PROXIMA_STATUS.ACTIVATED) {
							proxima.setStatus(PROXIMA_STATUS.ACTIVATED);
						}
						for (UbqEmmitedActions emittedAction : proxima.getEmitted()) {
							if (emittedAction != null && 
									emittedAction.getEvents() != null && 
								  proximaCmd.getEvent() != null) {
								if (UbqActionUtils.INSTANCE.arePCompatibleEvents(
										emittedAction.getEvents(),
									  proximaCmd.getEvent()
									)
								) {
									doIt(emittedAction, proxima);
								}
							}
						}
					} else {
						proxima.setStatus(PROXIMA_STATUS.DISABLED);
					}
				}
			}
		}
	}
	
	private void doIt(UbqEmmitedActions emittedAction, UbqProxima proxima) {
		for (final UbqAction action : emittedAction.getActions()) {
			if (action != null && action.getActionIDs() != null) {
				for (String actionID : action.getActionIDs()) {
					AbstractCmdEngineActionImpl cmdAction = UbqActionUtils.INSTANCE.getUbqActionFromID(actionID);
					if (cmdAction instanceof AbstractCmdEngineActionImpl) {
						cmdAction.getArgs().add(createCmdEngineActionArg("proxima", proxima));
						int idx = 1;
						for (UbqProxima proximaRef : emittedAction.getProximiAsRef()) {
							cmdAction.getArgs().add(createCmdEngineActionArg("proxima" + idx, proximaRef));
							idx++;
						}
					} else {
						return;
					}
		
					Qx qx = pipe.getTx();
					
					if (action.getArgs() != null && action.getArgs().size()>0) {
						String args = "";
						for (String arg : action.getArgs()) {
							args += action.getArgs().get(0) + ((action.getArgs().indexOf(arg)==action.getArgs().size()-1)?"":" ");
						}
						cmdAction.run(qx, args);
					} else {
						cmdAction.run(qx);								
					}
				}
			}
		}

	}
	
	protected synchronized CmdEngineActionArg createCmdEngineActionArg(String id, final Object obj) {
		CmdEngineActionArg arg = (CmdEngineActionArg) EcoreUtil.create(EnginePackage.Literals.CMD_ENGINE_ACTION_ARG);
		arg.setId(id);
		arg.setValue(obj);
		return arg;
	}

	public void handleMoveCursorCmd(final UbqtGuiCursorCmd cursorCmd) {
		synchronized (ubqSession) {
			synchronized (cursorCmd) {
				Point pt = new Point(cursorCmd.getX(), cursorCmd.getY());
			    Rectangle.SINGLETON.x = pt.x;
			    Rectangle.SINGLETON.y = pt.y;
			    Rectangle.SINGLETON.width = 10; //cursor.getDim().getX();
			    Rectangle.SINGLETON.height = 10; //cursor.getDim().getY();
			    
			    if (Platform.inDebugMode()) {
			    	System.out.println("Move cursor " + cursorCmd.getCursorID());
			    }
			    
			    UbqCursor cursor = ProximaUtils.INSTANCE.getUbqCursorByID(ubqSession, cursorCmd.getCursorID());
			    ubqSession.getFingers().remove(cursor);
			    ubqSession.getFingers().add(cursor);
			    
			    UbqPoint pos = cursor.getPos();
			    pos.setX(pt.x);
			    pos.setY(pt.y);
			    cursor.setPos(pos);
			    
			    Rectangle rectCursor = Rectangle.SINGLETON.getCopy();
			    		
				for (UbqProxima proxima : ubqSession.getProximi()) {
					for (UbqSlot slot : proxima.getSlots()) {
						if (slot.getBounds() != null) {
							Rectangle.SINGLETON.x = slot.getBounds().getX();
							Rectangle.SINGLETON.y = slot.getBounds().getY();
							Rectangle.SINGLETON.width = slot.getBounds().getWidth();
							Rectangle.SINGLETON.height = slot.getBounds().getHeight();
							    		
							if (Rectangle.SINGLETON.contains(pt) || Rectangle.SINGLETON.intersects(rectCursor)) {
								if (slot != lastSlotMatched) {
									lastSlotMatched = slot;
									slot.setStatus(slot.getStatus() == SLOT_STATUS.UNSELECTED ? SLOT_STATUS.SELECTED : SLOT_STATUS.UNSELECTED);
								    for (UbqEmmitedActions emittedAction : slot.getEmitted()) {
								    	doIt(emittedAction, proxima);
								    }
								}
							}
						}
					}
				}
			}
		}
	}
	
	public void handleRemoveCursorCmd(final UbqtGuiCursorCmd cursorCmd) {
		synchronized (ubqSession) {
			synchronized (ubqSession.getFingers()) {
				UbqCursor finger = ProximaUtils.INSTANCE.getUbqCursorByID(ubqSession, cursorCmd.getCursorID());
				ubqSession.getFingers().remove(finger);
			}
		}
	}
	
	public void handleAddCursorCmd(final UbqtGuiCursorCmd cursorCmd) {
		synchronized (ubqSession) {
			synchronized (ubqSession.getFingers()) {
				UbqCursor cursor = (UbqCursor) EcoreUtil.create(UbqtPackage.Literals.UBQ_CURSOR);
				if (cursor != null) {
					cursor.setName(cursorCmd.getCursorID());
					
					ubqSession.getFingers().add(cursor);

					UbqPoint dim = (UbqPoint) EcoreUtil.create(UbqtPackage.Literals.UBQ_POINT);
					dim.setX(5);
					dim.setY(5);
					
					cursor.setDim(dim);
					
					UbqPoint point = (UbqPoint) EcoreUtil.create(UbqtPackage.Literals.UBQ_POINT);
					point.setX(cursorCmd.getX());
					point.setY(cursorCmd.getY());
					
					cursor.setPos(point);
				}
			}
		}
	}
}
