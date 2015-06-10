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

import net.sf.smbt.ubqt.UbqCursor;
import net.sf.smbt.ubqt.UbqPoint;
import net.sf.smbt.ubqt.UbqtPackage;
import net.sf.ubq.draw2d.renderer.ui.figures.UBQCursorFigure;
import net.sf.ubq.interfaces.gui.interfaces.UIAdapterImpl;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.gef.editparts.AbstractGraphicalEditPart;

public class UBQCursorEditPart extends AbstractGraphicalEditPart {
	private UIAdapterImpl cursorUIAdapter;

    @Override
    protected IFigure createFigure() {
    	cursorUIAdapter = new UIAdapterImpl() {
			@Override
			public void uiNotification(Notification msg) {
				if (msg != null && msg.getFeature() != null) {
					if (msg.getFeature().equals(UbqtPackage.eINSTANCE.getUbqCursor_Pos())) {
						if (msg.getEventType() == Notification.SET) {
							Object newObjValue = msg.getNewValue();
							if (newObjValue instanceof UbqPoint) {
								UbqPoint pt = (UbqPoint) newObjValue;
								getFigure().setLocation(
									new Point(
										pt.getX(),
										pt.getY()
									)
								);
							}
							refreshVisuals();
						}
					}
				}
			}
		};
        return new UBQCursorFigure();
    }
    
    @Override
    public void activate() {
    	synchronized (getModel()) {
		    synchronized (((UbqCursor)getModel()).eAdapters()) {
		    	((UbqCursor)getModel()).eAdapters().add(cursorUIAdapter);
		    }
    	}
    	super.activate();
    }
    
    @Override
    public void deactivate() {
    	super.deactivate();
    	synchronized (getModel()) {
    		if (getModel() != null) {
			    synchronized (((UbqCursor)getModel()).eAdapters()) {
				    if (getModel() != null && ((UbqCursor)getModel()).eAdapters().contains(cursorUIAdapter)) {
				    	((UbqCursor)getModel()).eAdapters().remove(cursorUIAdapter);
				    }
			    }
    		}
    	}
    }
    @Override
    protected void refreshVisuals() {
    	super.refreshVisuals();
    }
    
    @Override
    public void refresh() {
    	super.refresh();
    }
    
    @Override
    protected void createEditPolicies() {
    }
}
