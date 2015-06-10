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

package net.sf.ubq.draw2d.renderer.ui.factory;

import net.sf.smbt.ubqt.UbqCursor;
import net.sf.smbt.ubqt.UbqKnob;
import net.sf.smbt.ubqt.UbqProxima;
import net.sf.smbt.ubqt.UbqSession;
import net.sf.smbt.ubqt.UbqSlider;
import net.sf.smbt.ubqt.UbqSlot;
import net.sf.ubq.draw2d.renderer.ui.parts.UBQCursorEditPart;
import net.sf.ubq.draw2d.renderer.ui.parts.UBQFaderEditPart;
import net.sf.ubq.draw2d.renderer.ui.parts.UBQKnobEditPart;
import net.sf.ubq.draw2d.renderer.ui.parts.UBQProximaEditPart;
import net.sf.ubq.draw2d.renderer.ui.parts.UBQSessionEditPart;
import net.sf.ubq.draw2d.renderer.ui.parts.UBQSlotEditPart;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;

public class UBQSceneEditPartFactory implements EditPartFactory {

    public EditPart createEditPart(EditPart context, Object model) {
        EditPart part = null;
        
        if (model instanceof UbqSession) {
        	part = new UBQSessionEditPart();
        } else if (model instanceof UbqProxima) {
            part = new UBQProximaEditPart();
        } else if (model instanceof UbqCursor) {
            part = new UBQCursorEditPart();
        } else if (model instanceof UbqSlot) {
            part = new UBQSlotEditPart();
        } else if (model instanceof UbqSlider) {
        	part = new UBQFaderEditPart();
        } else if (model instanceof UbqKnob) {
        	part = new UBQKnobEditPart();
        } /*else if (model instanceof UbqGesture) {
        	part = new UBQGestureEditPart();
        } else if (model instanceof UbqLed) {
        	part = new UBQLedEditPart();
        } else if (model instanceof UbqMenu) {
        	part = new UBQMenuEditPart();
        } else if (model instanceof UbqMonitor) {
        	part = new UBQMonitorEditPart();
        } else if (model instanceof UbqMultiBalls) {
        	part = new UBQMultiBallsEditPart();
        } else if (model instanceof UbqMultiSlider) {
        	part = new UBQMultiSliderEditPart();
        } else if (model instanceof UbqPads) {
        	part = new UBQPadsEditPart();
        } else if (model instanceof UbqRange) {
        	part = new UBQRangeEditPart();
        } else if (model instanceof UbqRingArea) {
        	part = new UBQRingAreaEditPart();
        } else if (model instanceof UbqSignalScope) {
        	part = new UBQSignalScopeEditPart();
        } else if (model instanceof UbqSurfaceLCD) {
        	part = new UBQSurfaceLCDEditPart();
        } else if (model instanceof UbqSwitches) {
        	part = new UBQSwitchesEditPart();
        } else if (model instanceof UbqText) {
        	part = new UBQTextEditPart();
        } else if (model instanceof UbqTrack) {
        	part = new UBQTrackEditPart();
        }*/
        
        if (part instanceof EditPart) {
            part.setModel(model);
        }
        
        return part;
    }
}
