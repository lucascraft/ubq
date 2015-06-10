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

package net.sf.ubq.gui.services;

import java.util.Arrays;
import java.util.List;

import net.sf.smbt.ubqt.PROXIMA_STATUS;
import net.sf.smbt.ubqt.UBQ_EVENTS;
import net.sf.smbt.ubqt.UbqProxima;
import net.sf.ubq.interfaces.gui.ubqtgui.PROXIMA_EVENT;
import net.sf.xqz.model.engine.impl.AbstractCmdEngineActionImpl;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtension;
import org.eclipse.core.runtime.IExtensionPoint;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * 
 * @author lucas
 *
 */
public class UbqActionUtils {
	public final static UbqActionUtils INSTANCE = new UbqActionUtils();
	
	public AbstractCmdEngineActionImpl getUbqActionFromID(String actionID) {
		IExtensionRegistry registry = Platform.getExtensionRegistry();
		IExtensionPoint point = registry.getExtensionPoint("net.sf.xqz.engine.cmdEngineAction");
		if (point == null) return null;
		IExtension[] extensions = point.getExtensions();
		for (int i = 0; i < extensions.length; i++) {
			for (IConfigurationElement elem : extensions[i].getConfigurationElements()) {
				String ID = elem.getAttribute("id");
				if (ID.equals(actionID)) {
					try {
					    AbstractCmdEngineActionImpl action = (AbstractCmdEngineActionImpl) elem.createExecutableExtension("action");
					    action.setId(actionID);
					    return action;
					} catch (CoreException e) {
						e.printStackTrace();
					}
				}
			}
		}
		return null;
	}
	
	public synchronized boolean areRequiredProximiSatisfied(final UbqProxima proxima) {
		synchronized (proxima) {
			synchronized (proxima.getRequiredProximi()) {
				for (UbqProxima pRequired : proxima.getRequiredProximi()) {
					if (pRequired.eIsProxy()) {
						EcoreUtil.resolveAll(pRequired);
					}
					if (pRequired.getStatus().equals(PROXIMA_STATUS.DEACTIVATED)) {
						return false;
					}
				}
			}
		}
		return true;
	}
	
	public UBQ_EVENTS translateProximaEvents(PROXIMA_EVENT event) {
		switch(event) {
			case ADD:
				return UBQ_EVENTS.PROXIMA_ADD;
			case REMOVE:
				return UBQ_EVENTS.PROXIMA_REMOVE;
			case MOVE:
			case ROTATION:
				return UBQ_EVENTS.PROXIMA_UPDATE;
			case ACCEL:
			default:
				break;
		}
		return null;
	}
	
	public PROXIMA_EVENT translateUbqEvents(UBQ_EVENTS event) {
		switch(event) {
			case PROXIMA_ADD:
				return PROXIMA_EVENT.ADD;
			case PROXIMA_REMOVE:
				return PROXIMA_EVENT.REMOVE;
			case PROXIMA_UPDATE:
				return PROXIMA_EVENT.MOVE;
			default:
				break;
		}
		return null;
	}
	
	public boolean areUCompatibleEvents(PROXIMA_EVENT pEvent, List<UBQ_EVENTS> uEvents) {
		return areUCompatibleEvents(Arrays.asList(pEvent), uEvents);
	}
	
	public boolean areUCompatibleEvents(List<PROXIMA_EVENT> pEvents, UBQ_EVENTS uEvent) {
		return areUCompatibleEvents(pEvents, Arrays.asList(uEvent));
	}	
	
	public boolean areUCompatibleEvents(List<PROXIMA_EVENT> pEvents, List<UBQ_EVENTS> uEvents) {
		for (PROXIMA_EVENT pEvent : pEvents) {
			for (UBQ_EVENTS uEvent : uEvents) {
				if (areEquals(pEvent, uEvent) || areEquals(uEvent, pEvent)) {
					return true;
				}
			}
		}
		return false;
	}
	
	public boolean arePCompatibleEvents(List<UBQ_EVENTS> uEvents, List<PROXIMA_EVENT> pEvents) {
		return areUCompatibleEvents(pEvents, uEvents);
	}
	
	public boolean arePCompatibleEvents(UBQ_EVENTS uEvent, List<PROXIMA_EVENT> pEvents) {
		return areUCompatibleEvents(pEvents, uEvent);
	}
	
	public boolean arePCompatibleEvents(List<UBQ_EVENTS> uEvents, PROXIMA_EVENT pEvent) {
		return areUCompatibleEvents(pEvent, uEvents);
	}
	
	public boolean areEquals(PROXIMA_EVENT pEvent, UBQ_EVENTS uEvent) {
		return pEvent.equals(translateUbqEvents(uEvent));
	}
	
	public boolean areEquals(UBQ_EVENTS uEvent, PROXIMA_EVENT pEvent) {
		return uEvent.equals(translateProximaEvents(pEvent));
	}
}
