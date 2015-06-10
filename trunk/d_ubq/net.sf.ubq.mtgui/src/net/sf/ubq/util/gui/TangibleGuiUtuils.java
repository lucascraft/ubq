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

package net.sf.ubq.util.gui;

import java.util.List;

import net.sf.smbt.ubqt.UbqFiducial;
import net.sf.smbt.ubqt.UbqtFactory;
import net.sf.ubq.draw2d.renderer.ui.widgets.UBQSceneWidget;
import net.sf.ubq.musitable.tuio.UbqtTUIOApp;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.KeyListener;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Monitor;
import org.eclipse.swt.widgets.Shell;

public class TangibleGuiUtuils {
	public static TangibleGuiUtuils INSTANCE = new TangibleGuiUtuils();
	
	public void createTangibleGui() {
		UbqtTUIOApp app = new UbqtTUIOApp();
		List<UbqFiducial> fiducials = app.getUbqSession().getFiducials();
		
		UbqFiducial f0 = UbqtFactory.eINSTANCE.createUbqFiducial();
		f0.setFidcode(0);
		f0.setName("0");
		
		UbqFiducial f1 = UbqtFactory.eINSTANCE.createUbqFiducial();
		f1.setFidcode(1);
		f1.setName("1");
		
		UbqFiducial f2 = UbqtFactory.eINSTANCE.createUbqFiducial();
		f2.setFidcode(2);
		f2.setName("2");
		
		UbqFiducial f3 = UbqtFactory.eINSTANCE.createUbqFiducial();
		f3.setFidcode(3);
		f3.setName("3");
		
		UbqFiducial f4 = UbqtFactory.eINSTANCE.createUbqFiducial();
		f4.setFidcode(4);
		f4.setName("4");
		
		UbqFiducial f5 = UbqtFactory.eINSTANCE.createUbqFiducial();
		f5.setFidcode(5);
		f5.setName("5");
		
		UbqFiducial f6 = UbqtFactory.eINSTANCE.createUbqFiducial();
		f6.setFidcode(6);
		f6.setName("6");
		
		UbqFiducial f7 = UbqtFactory.eINSTANCE.createUbqFiducial();
		f7.setFidcode(7);
		f7.setName("7");
		
		UbqFiducial f8 = UbqtFactory.eINSTANCE.createUbqFiducial();
		f8.setFidcode(8);
		f8.setName("8");
		
		fiducials.add(f1);
		fiducials.add(f2);
		fiducials.add(f3);
		fiducials.add(f4);
		fiducials.add(f5);
		fiducials.add(f6);
		fiducials.add(f7);
		fiducials.add(f8);

		doIt(
			app
		);
	}	
	
	private void doIt(UbqtTUIOApp app) {
		Display display = Display.getDefault();
		Monitor monitors[] = display.getMonitors();
		
		Monitor ubqtMonitor = monitors[0];
		if (monitors.length>1) {
			ubqtMonitor = monitors[1];
		}
		final Shell shell = new Shell(display, SWT.NONE);
		
		shell.setMaximized(true);
		shell.setFullScreen(true);
		shell.setLayout(new FillLayout());
		shell.setBounds(ubqtMonitor.getBounds());

		UBQSceneWidget ubqScene = new UBQSceneWidget(shell, app.getUbqSession());

		KeyListener keyListener = new KeyListener() {
			public void keyReleased(KeyEvent e) {
				if (e.character == SWT.ESC) {
					shell.close();
				}
			}
			public void keyPressed(KeyEvent e) {
				keyReleased(e);
			}
		};
		
		ubqScene.addKeyListener(keyListener);
		
		shell.open ();
	}
}
