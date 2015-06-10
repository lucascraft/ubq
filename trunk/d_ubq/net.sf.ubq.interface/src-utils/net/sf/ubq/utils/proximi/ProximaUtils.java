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

package net.sf.ubq.utils.proximi;

import java.util.Arrays;
import java.util.List;

import net.sf.reactivision.tuio.TuioObject;
import net.sf.smbt.ubqt.SLOTS;
import net.sf.smbt.ubqt.UbqBounds;
import net.sf.smbt.ubqt.UbqCursor;
import net.sf.smbt.ubqt.UbqFiducial;
import net.sf.smbt.ubqt.UbqProxima;
import net.sf.smbt.ubqt.UbqSession;
import net.sf.smbt.ubqt.UbqSlot;

import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.widgets.Display;
import org.lwjgl.util.vector.Matrix2f;
import org.lwjgl.util.vector.Vector2f;

public class ProximaUtils {
	private Matrix2f rotationMatrix2f;
	
	public static ProximaUtils INSTANCE = new ProximaUtils();
	
	public ProximaUtils() {
		rotationMatrix2f = new Matrix2f();
	}
	
	public int getDegresValue(SLOTS slot) {
		switch (slot) {
			case P0:
				return 0;
			case P23:
				return 23;
			case P45:
				return 45;
			case P67:
				return 67;
			case P90:
				return 90;
			case P113:
				return 113;
			case P135:
				return 135;
			case P157:
				return 157;
			case P180:
				return 180;
			case P203:
				return 203;
			case P225:
				return 225;
			case P247:
				return 247;
			case P270:
				return 270;
			case P293:
				return 293;
			case P315:
				return 315;
			case P337:
				return 337;
		}
		return -1;
	}
	
	public synchronized UbqProxima getUbqProximaByFiducial(UbqSession ubqSession, TuioObject tuioObj) {
		synchronized (ubqSession) {
			synchronized (ubqSession.getProximi()) {
				for (UbqProxima proxima : ubqSession.getProximi()) {
					if (proxima.getFiducial() != null) {
						if (proxima.getFiducial().getFidcode() == tuioObj.getFiducialID()) {
							return proxima;
						}
					}
				}
			}
		}
		return null;
	}
	
	public synchronized UbqProxima getUbqProximaByFiducialID(UbqSession ubqSession, int ID) {
		synchronized (ubqSession) {
			synchronized (ubqSession.getProximi()) {
				for (UbqProxima proxima : ubqSession.getProximi()) {
					if (proxima.getFiducial() != null) {
						if (proxima.getFiducial().getFidcode() == ID) {
							return proxima;
						}
					}
				}
			}
		}
		return null;
	}
	
	public synchronized UbqFiducial getUbqFiducialByTuioObject(UbqSession ubqSession, TuioObject tuioObj) {
		synchronized (ubqSession) {
			for (UbqFiducial fid : ubqSession.getFiducials()) {
				if (fid.getFidcode() == tuioObj.getFiducialID()) {
					return fid;
				}
			}
		}
		return null;
	}
	
	public synchronized UbqFiducial getUbqFiducialByFiducialID(UbqSession ubqSession, int ID) {
		synchronized (ubqSession) {
			synchronized (ubqSession.getFiducials()) {
				for (UbqFiducial fid : ubqSession.getFiducials()) {
					if (fid.getFidcode() == ID) {
						return fid;
					}
				}
			}
		}
		return null;
	}

	public synchronized UbqCursor getUbqCursorByID(UbqSession ubqSession, String ID) {
		synchronized (ubqSession) {
			synchronized (ubqSession.getFingers()) {
				for (UbqCursor cursor : ubqSession.getFingers()) {
					if (cursor.getName().equals(ID)) {
						return cursor;
					}
				}
			}
		}
		return null;
	}

	/**
	 * @deprecated
	 * 
	 * @param proxima
	 * @param slot
	 * @param angleShift
	 * @return
	 */
	public List<Point> getSlotBounds(UbqProxima proxima, UbqSlot slot, double angleShift) {
		double angleRadians = Math.toRadians(proxima.getAngle());
		angleRadians+=angleShift;
		
		int dist = 75;
		
		Rectangle slotRect = Rectangle.SINGLETON;
		slotRect.width = 30;
		slotRect.height = 30;
		
		switch (slot.getPosition()) {
			case P0: 
			{
				angleRadians += Math.toRadians(getDegresValue(SLOTS.P0));
				break;
			}
			case P23: 
			{
				angleRadians += Math.toRadians(getDegresValue(SLOTS.P23));
				break;
			}
			case P45: 
			{
				angleRadians += Math.toRadians(getDegresValue(SLOTS.P45));
				break;
			}
			case P67:
			{
				angleRadians += Math.toRadians(getDegresValue(SLOTS.P67));
				break;
			}
			case P90:
			{
				angleRadians += Math.toRadians(getDegresValue(SLOTS.P90));
				break;
			}
			case P113:
			{
				angleRadians += Math.toRadians(getDegresValue(SLOTS.P113));
				break;
			}
			case P135:
			{
				angleRadians += Math.toRadians(getDegresValue(SLOTS.P135));
				break;
			}
			case P157:
			{
				angleRadians += Math.toRadians(getDegresValue(SLOTS.P157));
				break;
			}
			case P180:
			{
				angleRadians += Math.toRadians(getDegresValue(SLOTS.P180));
				break;
			}
			case P203:
			{
				angleRadians += Math.toRadians(getDegresValue(SLOTS.P203));
				break;
			}
			case P225:
			{
				angleRadians += Math.toRadians(getDegresValue(SLOTS.P225));
				break;
			}
			case P247:
			{
				angleRadians += Math.toRadians(getDegresValue(SLOTS.P247));
				break;
			}
			case P270:
			{
				angleRadians += Math.toRadians(getDegresValue(SLOTS.P270));
				break;
			}
			case P293:
			{
				angleRadians += Math.toRadians(getDegresValue(SLOTS.P293));
				break;
			}
			case P315:
			{
				angleRadians += Math.toRadians(getDegresValue(SLOTS.P315));
				break;
			}
			case P337:
			{
				angleRadians += Math.toRadians(getDegresValue(SLOTS.P337));
				break;
			}
			default:
				break;
		}
		
		slotRect.x = dist;
		slotRect.y = 15;
		
		UbqBounds rect = proxima.getBounds();
		Rectangle rectProxima = new Rectangle(rect.getX(), rect.getY(), rect.getWidth(), rect.getHeight());

		Vector2f v1 = ProximaUtils.INSTANCE.rotoTranslate(slotRect.x, slotRect.y, (float) angleRadians, -rectProxima.x, -rectProxima.y);
		Vector2f v2 = ProximaUtils.INSTANCE.rotoTranslate(slotRect.x + slotRect.width, slotRect.y, (float) angleRadians, -rectProxima.x, -rectProxima.y);
		Vector2f v3 = ProximaUtils.INSTANCE.rotoTranslate(slotRect.x + slotRect.width, slotRect.y - slotRect.height, (float) angleRadians, -rectProxima.x, -rectProxima.y);
		Vector2f v4 = ProximaUtils.INSTANCE.rotoTranslate(slotRect.x, slotRect.y - slotRect.height, (float) angleRadians, -rectProxima.x, -rectProxima.y);
		
		return Arrays.asList(new Point[] {
				new Point(v1.x, v1.y),
				new Point(v2.x, v2.y),
				new Point(v3.x, v3.y),
				new Point(v4.x, v4.y)
		});
	}
	
	public Vector2f rotoTranslate(float x, float y, int angleDegrees, int tX, int tY) {
		return rotoTranslate(x, y, (float) Math.toRadians(angleDegrees), tX, tY);
	}

	public Vector2f rotoTranslate(float x, float y, float angleRadians, int tX, int tY) {
		Vector2f v = new Vector2f(x, y);

		rotationMatrix2f.m00 = (float) Math.cos(angleRadians);
		rotationMatrix2f.m01 = (float) Math.sin(angleRadians);
		rotationMatrix2f.m10 = (float) -Math.sin(angleRadians);
		rotationMatrix2f.m11 = (float) Math.cos(angleRadians);
		
		Matrix2f.transform(rotationMatrix2f, v, v);

		v.translate(tX, tY);
		
		return v;
	}
	
	// Degrees
	public Vector2f rotoTranslate(Vector2f v, int angleDegrees, int tX, int tY) {
		return rotoTranslate(v.x, v.y, (float) Math.toRadians(angleDegrees), tX, tY);
	}
	
	// Radians
	public Vector2f rotoTranslate(Vector2f v, float angleRadians, int tX, int tY) {
		return rotoTranslate(v.x, v.y, angleRadians, tX, tY);
	}
	
	public void drawText(Graphics graphics, String text, Point position) {
	    GC gc = new GC(Display.getDefault());
	   	gc.setFont(graphics.getFont());
	   	org.eclipse.swt.graphics.Point textZone = gc.textExtent(text);
	   	Point offset = new Rectangle(0, 0, textZone.x, textZone.y).getCenter();
	   	graphics.drawText(text, position.x - offset.x, position.y - offset.y);
	   	gc.dispose();
	}
}
