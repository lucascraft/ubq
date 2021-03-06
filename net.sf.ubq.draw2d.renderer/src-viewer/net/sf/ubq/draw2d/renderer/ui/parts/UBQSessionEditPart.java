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

package net.sf.ubq.draw2d.renderer.ui.parts;

import java.util.ArrayList;
import java.util.List;

import net.sf.smbt.ubqt.UbqPoint;
import net.sf.smbt.ubqt.UbqSession;
import net.sf.smbt.ubqt.UbqtPackage;
import net.sf.ubq.draw2d.renderer.ui.figures.UBQSessionFigure;
import net.sf.ubq.interfaces.gui.interfaces.UIAdapterImpl;

import org.eclipse.draw2d.IFigure;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.gef.editparts.AbstractGraphicalEditPart;

public class UBQSessionEditPart extends AbstractGraphicalEditPart {
	private UIAdapterImpl sessionUIAdapter;
    
    @Override
    public void activate() {
    	synchronized ((UbqSession)getModel()) {
		    synchronized (((UbqSession)getModel()).eAdapters()) {
		    	((UbqSession)getModel()).eAdapters().add(sessionUIAdapter);
		    }
    	}
    	super.activate();
    }
    
    @Override
    public void deactivate() {
    	super.deactivate();
    	synchronized (getModel()) {
    		if (getModel() != null) {
			    synchronized (((UbqSession)getModel()).eAdapters()) {
				    if (getModel() != null && ((UbqSession)getModel()).eAdapters().contains(sessionUIAdapter)) {
				    	((UbqSession)getModel()).eAdapters().remove(sessionUIAdapter);
				    }
			    }
    		}
    	}
    }

	public UBQSessionEditPart() {}

	@Override
	protected IFigure createFigure() {
    	sessionUIAdapter = new UIAdapterImpl() {
			@Override
			public void uiNotification(Notification msg) {
				if (msg != null && msg.getFeature() != null ) {
					if (msg.getFeature().equals(UbqtPackage.eINSTANCE.getUbqSession_Fingers())) {
						if (msg.getEventType() == Notification.ADD) {
							refreshChildren();
							refreshVisuals();
						}
					} else if (msg.getFeature().equals(UbqtPackage.eINSTANCE.getUbqSession_Proximi())) {
						if (msg.getEventType() == Notification.ADD) {
							refreshChildren();
							refreshVisuals();
						}
					}
				}
			}
		};
		return new UBQSessionFigure();
	}

	@Override
	protected void createEditPolicies() {}
	
	@Override
	protected List<?> getModelChildren() {
		List<Object> children = new ArrayList<Object>();
		children.addAll(((UbqSession)getModel()).getProximi());
		children.addAll(((UbqSession)getModel()).getFingers());
		return children;
	}
	
	@Override
	protected void refreshVisuals() {
		UbqSession ubqSession = (UbqSession) getModel();
		UbqPoint mode = ubqSession.getDisplayMode().getMode();
		UBQSessionFigure figure = (UBQSessionFigure) getFigure();
		figure.setUbqSession(ubqSession);
		figure.setSize(mode.getX(), mode.getY());
		super.refreshVisuals();
	}
}
