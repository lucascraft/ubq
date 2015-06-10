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

package net.sf.ubq.musitable.tuio;

import net.sf.smbt.comm.script.config.utils.NetConfigUtil;
import net.sf.smbt.quantic.warp.QuanticMojo;
import net.sf.smbt.ubqt.UbqDisplayMode;
import net.sf.smbt.ubqt.UbqFiducial;
import net.sf.smbt.ubqt.UbqHandledReactions;
import net.sf.smbt.ubqt.UbqPoint;
import net.sf.smbt.ubqt.UbqProxima;
import net.sf.smbt.ubqt.UbqReaction;
import net.sf.smbt.ubqt.UbqSession;
import net.sf.smbt.ubqt.UbqtFactory;
import net.sf.ubq.interfaces.gui.handlers.ProximaQxEventHandlerImpl;
import net.sf.ubq.interfaces.gui.handlers.TuioQxEventHandlerImpl;
import net.sf.ubq.interfaces.gui.handlers.UbqtGUIQxEventHandler;
import net.sf.xqz.model.engine.CmdPipe;
import net.sf.xqz.model.engine.IQxEventHandler;

/**
 * Constructor for ubqt application from tangible GUI definition file
 */
public class UbqtTUIOApp {

	private UbqSession ubqSession;

	private NetConfigUtil cfgUtil;

	private CmdPipe guiEngine;
	private CmdPipe tuioEngine;

	private UbqSession linkOSGiQxEventHandlersExtPoints(UbqSession ubqSession) {
		for (UbqProxima proxima : ubqSession.getProximi()) {
			for (UbqHandledReactions handledReactions : proxima.getReacted()) {
				for (UbqReaction reaction : handledReactions.getReactions()) {
					IQxEventHandler qxEventHandler = cfgUtil
							.resolveListenerInOSGiContext(reaction.getClazz());
					if (qxEventHandler instanceof ProximaQxEventHandlerImpl) {
						ProximaQxEventHandlerImpl proximaQxEventHandler = (ProximaQxEventHandlerImpl) qxEventHandler;

						proximaQxEventHandler.setCmdIdList(reaction.getCmdIDs());
						proximaQxEventHandler.setProxim(proxima);
						proximaQxEventHandler.setProximiAsRef(handledReactions .getProximiAsRef());
					}
				}
			}
		}
		return null;
	}

	public UbqtTUIOApp(UbqSession session) {
		ubqSession = session;
	
		if (ubqSession.getDisplayMode() == null || ubqSession.getDisplayMode().getMode() == null) {
			UbqDisplayMode mode = UbqtFactory.eINSTANCE.createUbqDisplayMode();
			UbqPoint pt = UbqtFactory.eINSTANCE.createUbqPoint();
			pt.setX(1280);
			pt.setY(960);
			mode.setMode(pt);
			ubqSession.setDisplayMode(mode);

		}
		linkOSGiQxEventHandlersExtPoints(ubqSession);

		cfgUtil = new NetConfigUtil();
		
		//
		// Create the specific ubqt gui engine for proximi, slots, cursors
		// handling
		//
		guiEngine = QuanticMojo.INSTANCE.openUdpPipe("osc", "localhost:5555", 6666);
		guiEngine.addQxEventHandler(new UbqtGUIQxEventHandler(ubqSession, cfgUtil, guiEngine));

		tuioEngine = QuanticMojo.INSTANCE.openUdpPipe("tuio10", 3333);
		tuioEngine.addQxEventHandler(new TuioQxEventHandlerImpl(ubqSession, guiEngine));
	}
	
	/**
	 * Constructor for ubqt application from tangible GUI definition file
	 * 
	 * @param netCfgPathname
	 *            Connectivity topology definition (TCP, UDP, USB channels to
	 *            equipments and apps
	 * @param ubqSessionPathname
	 *            Tangible GUI definition file
	 */
	public UbqtTUIOApp() {
		cfgUtil = new NetConfigUtil();
		
		ubqSession = UbqtFactory.eINSTANCE.createUbqSession();
		
		for (int i=0;i<50;i++) {
			UbqFiducial fid = UbqtFactory.eINSTANCE.createUbqFiducial();
			fid.setFidcode(i);
			fid.setName("fid"+i);
			ubqSession.getFiducials().add(fid);
		}

		UbqDisplayMode mode = UbqtFactory.eINSTANCE.createUbqDisplayMode();
		UbqPoint pt = UbqtFactory.eINSTANCE.createUbqPoint();
		pt.setX(1280);
		pt.setY(960);
		mode.setMode(pt);
		ubqSession.setDisplayMode(mode);

		linkOSGiQxEventHandlersExtPoints(ubqSession);

		//
		// Create the specific ubqt gui engine for proximi, slots, cursors
		// handling
		//
		
		guiEngine = QuanticMojo.INSTANCE.openUdpPipe("osc", "localhost:5555", 6666);
		guiEngine.addQxEventHandler(new UbqtGUIQxEventHandler(ubqSession, cfgUtil, guiEngine));

		tuioEngine = QuanticMojo.INSTANCE.openUdpPipe("tuio10", 3333);
		tuioEngine.addQxEventHandler(new TuioQxEventHandlerImpl(ubqSession, guiEngine));

		
	}
	
	public void close() {
		QuanticMojo.INSTANCE.closePipe(tuioEngine, true);
		QuanticMojo.INSTANCE.closePipe(guiEngine, true);
	}

	public UbqSession getUbqSession() {
		return ubqSession;
	}

	public CmdPipe getGuiEngine() {
		return guiEngine;
	}
}
