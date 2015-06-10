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

import java.util.HashMap;
import java.util.Map;

import net.sf.smbt.ubqt.PROXIMA_STATUS;
import net.sf.smbt.ubqt.UbqColor;
import net.sf.smbt.ubqt.UbqProxima;
import net.sf.smbt.ubqt.UbqtFactory;
import net.sf.ubq.utils.proximi.ProximaUtils;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.Graphics;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.swt.widgets.Display;
import org.lwjgl.util.vector.Vector2f;

public class UBQProximaFigure extends Figure {
	private float angle;
	private UbqProxima proxima;
	private UbqColor defaultFG;
	private UbqColor defaultBG;

	
	Map<String, Color> colors;
	Color getColor(int r, int g, int b) {
		String k = r+"_"+g+"_"+b;
		if (!colors.containsKey(k)) {
			return colors.put(k, new Color(Display.getDefault(), new RGB(r, g, b)));
		}
		return colors.get(k);
	}

	public void setAngle(float angle) {
		this.angle = angle;
	}

    public UBQProximaFigure() {
    	colors = new HashMap<String, Color>();
		defaultFG = UbqtFactory.eINSTANCE.createUbqColor();
		defaultFG.setR(255);
		defaultFG.setG(0);
		defaultFG.setB(0);
		defaultBG = UbqtFactory.eINSTANCE.createUbqColor();
		defaultBG.setR(0);
		defaultBG.setG(255);
		defaultBG.setB(0);
		setSize(100, 100);
    }
    
    public void setProxima(UbqProxima proxima) {
    	this.proxima = proxima;
    	setSize(this.proxima.getRadius(), this.proxima.getRadius());
    }
    
    @Override
    public void paint(Graphics graphics) {
    	super.paint(graphics);

    	graphics.pushState();
    	
    	int disabledAlphaOffset = (proxima.getStatus() == PROXIMA_STATUS.ACTIVATED) ? 0 : 66;
    	
    	
    	graphics.setLineWidth(2);

    	graphics.setForegroundColor(ColorConstants.darkGray);
    	graphics.setBackgroundColor(ColorConstants.darkGray);
    	
    	float dist = this.proxima.getRadius()/2;
    	float distX2 = this.proxima.getRadius();
    	float distMax = this.proxima.getLimit();
    	float angleRadians = (float) Math.toRadians(angle);
    	
    	//setSize((int)distX2, (int)distX2);
    	
       	int tX = getLocation().x + (int) distX2;
    	int tY = getLocation().y + (int) distX2;
    	    	
		Vector2f vCenter = ProximaUtils.INSTANCE.rotoTranslate(0, 0, angleRadians, tX, tY);
		
		//
		// Triangle "cursor"
		//
		Vector2f tUpLeft = ProximaUtils.INSTANCE.rotoTranslate(-10, -dist-10, angleRadians, tX, tY);
		Vector2f tUpRight = ProximaUtils.INSTANCE.rotoTranslate(10, -dist-10, angleRadians, tX, tY);
		Vector2f tBottom = ProximaUtils.INSTANCE.rotoTranslate(0, -dist, angleRadians, tX, tY);

		graphics.setAlpha(255-disabledAlphaOffset);

    	graphics.fillPolygon(
    		new int[] { 
    			(int) tUpLeft.x, 
    			(int) tUpLeft.y, 
    			(int) tUpRight.x, 
    			(int) tUpRight.y, 
    			(int) tBottom.x, 
    			(int) tBottom.y
    		}
    	);
    	
		graphics.setAlpha(125-disabledAlphaOffset);
		
		
		UbqColor fg = proxima.getFgColor() == null ? defaultFG : proxima.getFgColor();
		UbqColor bg = proxima.getBgColor() == null ? defaultBG : proxima.getBgColor();
				
       	graphics.setForegroundColor(getColor(fg.getR(), fg.getG(), fg.getB()));
    	graphics.setBackgroundColor(getColor(bg.getR(), bg.getG(), bg.getB()));

    	graphics.fillOval(
    		(int) (vCenter.x - dist), 
    		(int) (vCenter.y - dist), 
    		(int) distX2, 
    		(int) distX2
    	);
	
    	
	   	int lX = getLocation().x + (int) distMax;
    	int lY = getLocation().y + (int) distMax;
    	    	
		Vector2f lCenter = ProximaUtils.INSTANCE.rotoTranslate(0, 0, angleRadians, lX, lY);
	
		graphics.setLineWidth(5);
	   	graphics.drawOval(
	    		(int) (lCenter.x - 1.5*distX2), 
	    		(int) (lCenter.y - 1.5*distX2), 
	    		(int) distMax, 
	    		(int) distMax
	    	);


    	graphics.setAlpha(255-disabledAlphaOffset);

      	graphics.setForegroundColor(ColorConstants.black);
    	graphics.setBackgroundColor(ColorConstants.black);

    	String txt = " Val : " + proxima.getRange().getVal();
    	
    	GC gc = new GC(Display.getDefault());
    	Point pt = gc.textExtent(txt);
    	gc.dispose();
    	
    	if (proxima.getRange() != null) {
	    	graphics.drawText(
	    		txt, 
	    		(int) vCenter.x - pt.x/2, 
	    		(int) vCenter.y - pt.y/2
	    	);
    	}
    	graphics.setLineWidth(1);

    	graphics.setForegroundColor(ColorConstants.black);
    	graphics.setBackgroundColor(ColorConstants.black);
    
    	graphics.popState();
}
}
