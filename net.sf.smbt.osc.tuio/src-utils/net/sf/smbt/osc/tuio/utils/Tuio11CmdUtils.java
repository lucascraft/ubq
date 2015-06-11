/***********************************************************************************
 * Ubiquisense - A smart ambient utilities framework 
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

package net.sf.smbt.osc.tuio.utils;

import java.util.Date;

import net.sf.reactivision.tuio.TuioContainer;
import net.sf.reactivision.tuio.TuioCursor;
import net.sf.reactivision.tuio.TuioObject;
import net.sf.smbt.osc.eztuio.EztuioPackage;
import net.sf.smbt.osc.eztuio.STATE;
import net.sf.smbt.osc.eztuio.Tuio2DCur;
import net.sf.smbt.osc.eztuio.Tuio2DCurAdd;
import net.sf.smbt.osc.eztuio.Tuio2DCurRemove;
import net.sf.smbt.osc.eztuio.Tuio2DCurUpdate;
import net.sf.smbt.osc.eztuio.Tuio2DObj;
import net.sf.smbt.osc.eztuio.Tuio2DObjAdd;
import net.sf.smbt.osc.eztuio.Tuio2DObjRemove;
import net.sf.smbt.osc.eztuio.Tuio2DObjUpdate;
import net.sf.smbt.osc.eztuio.TuioBundle;
import net.sf.smbt.osccmd.OscRcvCmd;
import net.sf.xqz.model.cmd.Cmd;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;

import com.illposed.osc.OSCBundle;
import com.illposed.osc.OSCMessage;
import com.illposed.osc.OSCPacket;

/**
 * Translate osc messages to valuated {@link OscRcvCmd} instances.
 * 
 * @author lucas
 *
 */
public class Tuio11CmdUtils {
	/** SINGLETON */
	public final static Tuio11CmdUtils INSTANCE = new Tuio11CmdUtils();
	
	/**
	 * Creates and return a new {@link EztuioPackage} command coming from a given {@link TuioContainer} reference.
	 * 
	 * @param tuio either a {@link TuioObject} or a {@link TuioCursor} object
	 * @param literal a literal corresponding to the Tuio cmd exact {@link EClass} to be created and filled
	 * 
	 * @return newly created Tuio 1.1 command according to {@link EztuioPackage} definitions
	 */
	public Cmd createTuio11CmdFromEClassifierMsg(TuioContainer tuio, EClassifier literal, OSCMessage msg) {
		if (EztuioPackage.Literals.TUIO2_DOBJ_ADD.equals(literal)) {
			TuioObject tuioObject = (TuioObject) tuio; 
			Tuio2DObjAdd tuioObjAddCmd = (Tuio2DObjAdd) EcoreUtil.create(EztuioPackage.Literals.TUIO2_DOBJ_ADD);
			tuioObjAddCmd.setMsg(msg);
			initTuio2DFromDualTuio(tuioObject, tuioObjAddCmd);
			return tuioObjAddCmd;
		} else if (EztuioPackage.Literals.TUIO2_DOBJ_UPDATE.equals(literal)) {
			TuioObject tuioObject = (TuioObject) tuio; 
			Tuio2DObjUpdate tuioObjUpdateCmd = (Tuio2DObjUpdate) EcoreUtil.create(EztuioPackage.Literals.TUIO2_DOBJ_UPDATE);
			tuioObjUpdateCmd.setMsg(msg);
			initTuio2DFromDualTuio(tuioObject, tuioObjUpdateCmd);
			return tuioObjUpdateCmd;
		} else if (EztuioPackage.Literals.TUIO2_DOBJ_REMOVE.equals(literal)) {
			TuioObject tuioObject = (TuioObject) tuio; 
			Tuio2DObjRemove tuioObjRemoveCmd = (Tuio2DObjRemove) EcoreUtil.create(EztuioPackage.Literals.TUIO2_DOBJ_REMOVE);
			tuioObjRemoveCmd.setMsg(msg);
			initTuio2DFromDualTuio(tuioObject, tuioObjRemoveCmd);
			tuioObjRemoveCmd.setState(STATE.TUIO_REMOVED);
			return tuioObjRemoveCmd;
		} else if (EztuioPackage.Literals.TUIO2_DCUR_ADD.equals(literal)) {
			TuioCursor tuioCursor = (TuioCursor) tuio; 
			Tuio2DCurAdd tuioCurAddCmd = (Tuio2DCurAdd) EcoreUtil.create(EztuioPackage.Literals.TUIO2_DCUR_ADD);
			tuioCurAddCmd.setMsg(msg);
			initTuio2DFromDualTuio(tuioCursor, tuioCurAddCmd);
			return tuioCurAddCmd;
		} else if (EztuioPackage.Literals.TUIO2_DCUR_UPDATE.equals(literal)) {
			TuioCursor tuioCursor = (TuioCursor) tuio; 
			Tuio2DCurUpdate tuioCurUpdateCmd = (Tuio2DCurUpdate) EcoreUtil.create(EztuioPackage.Literals.TUIO2_DCUR_UPDATE);
			tuioCurUpdateCmd.setMsg(msg);
			initTuio2DFromDualTuio(tuioCursor, tuioCurUpdateCmd);
			return tuioCurUpdateCmd;
		} else if (EztuioPackage.Literals.TUIO2_DCUR_REMOVE.equals(literal)) {
			TuioCursor tuioCursor = (TuioCursor) tuio; 
			Tuio2DCurRemove tuioCurRemoveCmd = (Tuio2DCurRemove) EcoreUtil.create(EztuioPackage.Literals.TUIO2_DCUR_REMOVE);
			tuioCurRemoveCmd.setMsg(msg);
			initTuio2DFromDualTuio(tuioCursor, tuioCurRemoveCmd);
			tuioCurRemoveCmd.setState(STATE.TUIO_REMOVED);
			return tuioCurRemoveCmd;
		}
		return null;
	}
	
	/**
	 * Initialize a {@link Tuio2DObj} or a {@link Tuio2DCur} from a {@link TuioContainer}
	 * 
	 * @param fromTuioContainer {@link TuioContainer} just delivered as source for initialization
	 * @param eObj {@link Tuio2DObj} or {@link Tuio2DCur} to be initialized from  {@link TuioContainer}
	 */
	private Cmd initTuio2DFromDualTuio(TuioContainer fromTuioContainer, EObject eObj) {
		if (eObj instanceof Tuio2DCur) {
			return initTuio2DCurFromDualTuioCur((TuioCursor) fromTuioContainer, (Tuio2DCur)eObj);
		} else if (eObj instanceof Tuio2DObj) {
			return initTuio2DObjFromDualTuioObject((TuioObject) fromTuioContainer, (Tuio2DObj)eObj);
		}
		throw new UnsupportedOperationException();
	}
	
	/**
	 * Initialize a {@link Tuio2DObj} from a {@link TuioObject}
	 * 
	 * @param fromTuioObject {@link TuioObject} just delivered as source for initialization
	 * @param toTuio2dObj {@link Tuio2DObj} to be initialized from  {@link TuioObject}
	 */
	private Cmd initTuio2DObjFromDualTuioObject(TuioObject fromTuioObject, Tuio2DObj toTuio2dObj) {
		toTuio2dObj.setAngle(fromTuioObject.getAngle());
		toTuio2dObj.setF_id(fromTuioObject.getFiducialID());
		toTuio2dObj.setS_id(fromTuioObject.getSessionID());
		toTuio2dObj.setMaccel(fromTuioObject.getMotionAccel());
		toTuio2dObj.setRaccel(fromTuioObject.getRotationAccel());
		toTuio2dObj.setXpos(fromTuioObject.getX());
		toTuio2dObj.setYpos(fromTuioObject.getY());
		toTuio2dObj.setXspeed(fromTuioObject.getSpeedX());
		toTuio2dObj.setYspeed(fromTuioObject.getSpeedY());
		toTuio2dObj.setUpdateTime(fromTuioObject.getUpdateTime());
		toTuio2dObj.setTuioObject(fromTuioObject);

		return toTuio2dObj;
	}
	
	/**
	 * Initialize a {@link Tuio2DCur} from a {@link TuioCursor}
	 * 
	 * @param fromTuioCursor {@link TuioCursor} just delivered as source for initialization
	 * @param toTuio2dCur {@link Tuio2DCur} to be initialized from  {@link TuioCursor}
	 */
	private Cmd initTuio2DCurFromDualTuioCur(TuioCursor fromTuioCursor, Tuio2DCur toTuio2dCur) {
		toTuio2dCur.setS_id(fromTuioCursor.getSessionID());
		toTuio2dCur.setMaccel(fromTuioCursor.getMotionAccel());
		toTuio2dCur.setXpos(fromTuioCursor.getX());
		toTuio2dCur.setYpos(fromTuioCursor.getY());
		toTuio2dCur.setXspeed(fromTuioCursor.getSpeedX());
		toTuio2dCur.setYspeed(fromTuioCursor.getSpeedY());
		toTuio2dCur.setUpdateTime(fromTuioCursor.getUpdateTime());
		toTuio2dCur.setTuioCursor(fromTuioCursor);
		
		return toTuio2dCur;
	}
	
	private OSCPacket processCmd(Cmd cmd, OSCPacket packet) {
		if (cmd instanceof TuioBundle) {
			if (packet instanceof OSCBundle) {
				for (Cmd p : ((TuioBundle)cmd).getChildren()) {
					if (p instanceof Tuio2DObj || p instanceof Tuio2DCur) {
						if (p instanceof Tuio2DObj) {
							((OSCBundle)packet).addPacket(((Tuio2DObj)p).getMsg());
						} else if (p instanceof Tuio2DCur) {
							((OSCBundle)packet).addPacket(((Tuio2DCur)p).getMsg());
						}
					} else {
						OSCBundle bundle = new OSCBundle();
						bundle.setTimestamp(((OSCBundle)packet).getTimestamp());
						((OSCBundle)packet).addPacket(processCmd(p, bundle));
					}
				}
			}
		}
		return packet;
	}

	/**
	 * Creates a new {@link OSCPacket} from either a {@link Tuio2DObj} or a {@link Tuio2DCur} cmd.
	 * 
	 * @param cmd Tuio2DObj or a Tuio2DCur cmd
	 * 
	 * @return a newly created {@link OSCPacket} 
	 */
	public OSCPacket createOSCPacketFromCmd(Cmd cmd) {
		if (cmd instanceof TuioBundle) {
			OSCBundle oscBundle = new OSCBundle(new Date(((TuioBundle)cmd).getTime()));
			return processCmd(cmd, oscBundle);
		} else {
			if (cmd instanceof Tuio2DObj) {
				return ((Tuio2DObj) cmd).getMsg();
			} else if (cmd instanceof Tuio2DCur) {
				return ((Tuio2DCur) cmd).getMsg();
			}
		}
		return null;
	}
	
	/**
	 * Dump of a Tuio2D command as its byte[] form.
	 * 
	 * @param cmd {@link Tuio2DCur} or {@link Tuio2DObj} command to dump as byte[]
	 * 
	 * @return a byte[] form of the {@link Tuio2DCur} or {@link Tuio2DObj} command 
	 */
	public byte[] dumpTuio11CmdFromEClassifierMsg(Cmd cmd) {
		if (cmd instanceof TuioBundle) {
			OSCPacket packet = createOSCPacketFromCmd(cmd);
			return packet == null ? new byte[0] : packet.getByteArray();
		} else if (cmd instanceof Tuio2DCur) {
			return ((Tuio2DCur)cmd).getMsg().getByteArray();
		} else if (cmd instanceof Tuio2DObj) {
			return ((Tuio2DObj)cmd).getMsg().getByteArray();
		}
		return new byte[0];
	}
}
