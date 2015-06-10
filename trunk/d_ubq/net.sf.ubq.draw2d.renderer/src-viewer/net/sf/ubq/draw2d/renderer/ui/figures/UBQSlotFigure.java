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

package net.sf.ubq.draw2d.renderer.ui.figures;

import net.sf.smbt.ubqt.SLOT_STATUS;
import net.sf.smbt.ubqt.UbqSlot;
import net.sf.ubq.utils.proximi.ProximaUtils;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.geometry.Rectangle;

public class UBQSlotFigure extends Figure {
	private UbqSlot slot;

	public void setSlot(UbqSlot slot) {
		this.slot = slot;
	}
	
	public SLOT_STATUS getStatus() {
		return slot.getStatus();
	}
	
	public UbqSlot getSlot() {
		return slot;
	}

	public UBQSlotFigure() {
	}

	@Override
	public void paint(Graphics graphics) {
				
		graphics.setBackgroundColor(ColorConstants.gray);
		graphics.setForegroundColor(ColorConstants.gray);

		Rectangle shrinked = getBounds().getCopy().shrink(1, 1);
		
		graphics.fillOval(shrinked);

		if (getStatus() == SLOT_STATUS.SELECTED) {
			graphics.setForegroundColor(ColorConstants.red);
			graphics.setBackgroundColor(ColorConstants.yellow);
			graphics.drawOval(shrinked);
		}

		graphics.setForegroundColor(ColorConstants.black);
		graphics.setBackgroundColor(ColorConstants.black);

		Rectangle bounds = getBounds().getCopy();
		
		
		ProximaUtils.INSTANCE.drawText(graphics, "" + slot.getPosition().getValue(), bounds.getCenter());

	}
}
