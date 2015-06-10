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

import java.util.List;

import net.sf.smbt.ubqt.PROXIMA_STATUS;
import net.sf.smbt.ubqt.UbqBounds;
import net.sf.smbt.ubqt.UbqProxima;
import net.sf.smbt.ubqt.UbqtPackage;
import net.sf.ubq.draw2d.renderer.ui.figures.UBQProximaFigure;
import net.sf.ubq.interfaces.gui.interfaces.UIAdapterImpl;

import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.gef.editparts.AbstractGraphicalEditPart;

public class UBQProximaEditPart extends AbstractGraphicalEditPart {
	private UIAdapterImpl proximaUIAdapter;
	
    @Override
    protected IFigure createFigure() {
    	proximaUIAdapter = new UIAdapterImpl() {
			@Override
			public void uiNotification(Notification msg) {
				if (msg != null && msg.getFeature() != null) {
					if (msg.getFeature().equals(UbqtPackage.eINSTANCE.getUbqProxima_Bounds())) {
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
							}
							refreshVisuals();
						}
					} else if (msg.getFeature().equals(UbqtPackage.eINSTANCE.getUbqProxima_Status())) {
						if (msg.getEventType() == Notification.SET) {
							refreshVisuals();
						}
					}
				}
			}
		};
		
		Figure fig = new UBQProximaFigure();
		fig.setSize(150, 150);
        return fig;
    }
    
    @Override
    public void activate() {
    	synchronized ((UbqProxima)getModel()) {
		    synchronized (((UbqProxima)getModel()).eAdapters()) {
		    	((UbqProxima)getModel()).eAdapters().add(proximaUIAdapter);
		    }
    	}
    	super.activate();
    }
    
    @Override
    public void deactivate() {
    	super.deactivate();
    	synchronized ((UbqProxima)getModel()) {
    		if (getModel() != null) {
			    synchronized (((UbqProxima)getModel()).eAdapters()) {
				    if (getModel() != null && ((UbqProxima)getModel()).eAdapters().contains(proximaUIAdapter)) {
				    	((UbqProxima)getModel()).eAdapters().remove(proximaUIAdapter);
				    }
			    }
    		}
    	}
    }
    
    @Override
    protected void refreshVisuals() {
	    super.refreshVisuals();

   	    UbqProxima proxima = ((UbqProxima)getModel());
   	    
   	    ((UBQProximaFigure)getFigure()).setProxima(proxima);
   	    getFigure().setVisible(((UbqProxima)getModel()).getStatus() != PROXIMA_STATUS.DEACTIVATED);
	    getFigure().setSize(proxima.getRadius() * 2, proxima.getRadius() * 2);
	    
	    ((UBQProximaFigure)getFigure()).setAngle(proxima.getAngle());
	    
//		for (UbqSlot slot : proxima.getSlots()) {
//	   		double slotPosAngle = ProximaUtils.INSTANCE.getDegresValue(slot.getPosition());
//    		double toPosAngle = (double) proxima.getAngle() + slotPosAngle;
//    		float angleRadians = (float) -Math.toRadians(proxima.getAngle() + 180);
//
//    		double x1Pos = Math.cos(Math.toRadians(toPosAngle)) * getFigure().getSize().width/3;
//    		double y1Pos = Math.sin(Math.toRadians(toPosAngle)) * getFigure().getSize().height/3;
//    		
//    		Vector2f v1Pos = ProximaUtils.INSTANCE.rotoTranslate(
//    			new Vector2f(
//        		    (float) x1Pos,
//        		    (float) y1Pos
//    			), angleRadians, 
//    			(int) getFigure().getSize().width / 2, 
//    			(int) getFigure().getSize().height / 2
//    		);
//
//    		slot.setBounds(
//    			ubqUtil.createUbqBounds(
//    				getFigure().getBounds().x + (int) v1Pos.x-22, 
//    				getFigure().getBounds().y + (int) v1Pos.y-22, 
//    				46, 
//    				46
//    			)
//    		);   
//		}
    }
    
    @Override
    protected List<?> getModelChildren() {
        if(getModel() instanceof UbqProxima) {
        	return ((UbqProxima)getModel()).getSlots();
        }
        return super.getModelChildren();
    }

    @Override
    protected void createEditPolicies() {
    }
}
