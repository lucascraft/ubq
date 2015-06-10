/***********************************************************************************
 * Ubiquisense - A ubiquitous computing utilities framework 
 * 
 * Copyright (c) 2008 - 2014, Lucas Bigeardel
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

import net.sf.smbt.ubqt.UbqBounds;
import net.sf.smbt.ubqt.UbqPoint;
import net.sf.smbt.ubqt.UbqSlot;
import net.sf.smbt.ubqt.UbqtPackage;
import net.sf.ubq.draw2d.renderer.ui.figures.UBQSlotFigure;
import net.sf.ubq.interfaces.gui.interfaces.UIAdapterImpl;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.gef.editparts.AbstractGraphicalEditPart;

public class UBQSlotEditPart extends AbstractGraphicalEditPart {
	private UIAdapterImpl slotUIAdapter;
	
    @Override
    protected IFigure createFigure() {
    	slotUIAdapter = new UIAdapterImpl() {
			@Override
			public void uiNotification(Notification msg) {
				if (msg.getFeature().equals(UbqtPackage.eINSTANCE.getUbqSlot_Bounds())) {
					if (msg.getEventType() == Notification.SET) {
						Object newObjValue = msg.getNewValue();
						if (newObjValue instanceof UbqBounds) {
							UbqBounds bounds = (UbqBounds) newObjValue;
							getFigure().setSize(
									bounds.getWidth(),
									bounds.getHeight()
								);
							getFigure().setLocation(
								new Point(
									bounds.getX()-(bounds.getWidth()/2),
									bounds.getY()-(bounds.getHeight()/2)
								)
							);
							refreshVisuals();
						}
					}
				} else if (msg.getFeature().equals(UbqtPackage.eINSTANCE.getUbqSlot_Position())) {
					if (msg.getEventType() == Notification.SET) {
						Object newObjValue = msg.getNewValue();
						if (newObjValue instanceof UbqPoint) {
							UbqPoint bounds = (UbqPoint) newObjValue;
							getFigure().setLocation(
								new Point(
									bounds.getX(),
									bounds.getY()
								)
							);
						}
						refreshVisuals();
					}
				} else if (msg.getFeature().equals(UbqtPackage.eINSTANCE.getUbqSlot_Status())) {
					if (msg.getEventType() == Notification.SET) {
						refreshVisuals();
					}
				}
			}
		};
		
   		UBQSlotFigure fig = new UBQSlotFigure();
    	fig.setSlot((UbqSlot)getModel());
    	fig.setSize(50, 50);
    	
        return fig;
    }
    
    @Override
    public void activate() {
    	synchronized (getModel()) {
		    synchronized (((UbqSlot)getModel()).eAdapters()) {
		    	((UbqSlot)getModel()).eAdapters().add(slotUIAdapter);
		    }
    	}
    	super.activate();
    }
    
    @Override
    public void deactivate() {
    	super.deactivate();
    	synchronized (getModel()) {
    		if (getModel() != null) {
			    synchronized (((UbqSlot)getModel()).eAdapters()) {
				    if (getModel() != null && ((UbqSlot)getModel()).eAdapters().contains(slotUIAdapter)) {
				    	((UbqSlot)getModel()).eAdapters().remove(slotUIAdapter);
				    }
			    }
    		}
    	}
    }

    

    @Override
    protected void createEditPolicies() {
    }
}
