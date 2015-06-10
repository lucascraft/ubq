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

package net.sf.ubq.draw2d.renderer.actions;

import java.io.File;
import java.io.IOException;
import java.net.URL;

import net.sf.smbt.ubqt.UbqColor;
import net.sf.smbt.ubqt.UbqProxima;
import net.sf.smbt.ubqt.UbqSession;
import net.sf.ubq.draw2d.renderer.ui.widgets.UBQSceneWidget;
import net.sf.ubq.musitable.tuio.UbqtTUIOApp;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Status;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.DisposeEvent;
import org.eclipse.swt.events.DisposeListener;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.KeyListener;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Monitor;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.progress.UIJob;
import org.osgi.framework.Bundle;

public class TangibleGuiUtuils {
	public static TangibleGuiUtuils INSTANCE = new TangibleGuiUtuils();
	
	public UbqtTUIOApp createTangibleGui() {
		if (shell != null && !shell.isDisposed()) {
			shell.dispose();
		}
		return doIt(
			new UbqtTUIOApp()
		);
	}	
	public UbqtTUIOApp createTangibleGui(UbqSession session) {
		if (shell != null && !shell.isDisposed()) {
			shell.dispose();
		}
		return doIt(
			new UbqtTUIOApp(session)
		);
	}	
	private Shell shell;
	
	public Shell getShell() {
		return shell;
	}
	
	private UbqtTUIOApp doIt(final UbqtTUIOApp app) {
		Display display = Display.getDefault();
		Monitor monitors[] = display.getMonitors();
		
		Monitor ubqtMonitor = monitors[0];
		if (monitors.length>1) {
			ubqtMonitor = monitors[1];
		}
		Shell shell = new Shell(display, SWT.CLOSE);
		
		shell.setMaximized(true);
		//shell.setFullScreen(true);
		shell.setLayout(new FillLayout());
		shell.setBounds(ubqtMonitor.getBounds());

		UBQSceneWidget ubqScene = new UBQSceneWidget(shell, app.getUbqSession());

		KeyListener keyListener = new KeyListener() {
			public void keyReleased(KeyEvent e) {
				if (e.character == SWT.ESC) {
					getShell().close();
				}
			}
			public void keyPressed(KeyEvent e) {
				keyReleased(e);
			}
		};
		
		ubqScene.addKeyListener(keyListener);
		shell.addKeyListener(keyListener);
		shell.addDisposeListener(new DisposeListener() {
			public void widgetDisposed(DisposeEvent e) {
				app.close();
			}
		});
		shell.open ();
		return app;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void launchTuiosimulator(final Bundle bundle) {
		new UIJob("FMURF Launcher") {
			@Override
			public IStatus runInUIThread(IProgressMonitor monitor) {
				_launchTuiosimulator(bundle);				
				return Status.OK_STATUS;
			}
		}.schedule();
	}
	private static void _launchTuiosimulator(Bundle bundle) {
		try {
	        String commanPath = "";
	        String dirPath = "";
	        URL url = null;
			try {
				String ubiquisenseJarPath = "/TUIO_Simulator/TuioSimulator.jar";
				url = FileLocator.find(bundle, new Path(ubiquisenseJarPath), null);
				if (url != null) {
					java.net.URI fileUri = FileLocator.resolve(url).toURI();
					if (fileUri != null) {
						File f = new File(fileUri);
						if (f != null) {
							commanPath = new Path(f.getCanonicalPath()).toOSString();
							dirPath = new Path(f.getCanonicalPath()).removeLastSegments(1).toOSString();
						}
					}
				}
			} catch(Exception e) {
			    e.toString();
			}
	        if (!"".equals(commanPath)) {
		        File dir = new File(dirPath);
		        if (dir != null && dir.exists() && dir.isDirectory()) {
		        	final Process pr = new ProcessBuilder("\"C:\\Program Files\\Java\\jre8\\bin\\java\" -jar TuioSimulator.jar").directory(dir).start();
		        }
	        
	        }
	    } catch (IOException e) {
			System.out.println("exception happened - here's what I know: ");
			e.printStackTrace();
		}	
	}	
	
	
	
	
	
	
	
	
	
	
	
	public String refreshSettingsXMLAndRunFMURF(UbqSession session) {
		String oscSendAddr = "localhost";
		int oscIN = 4448;
		int oscOUT = 4449;
		int tuioIN = 3333;
		
		String buffer = "<smurf>" + "\n" +
			"<settings>"+ "\n" +
				"<OscSendAddress>" + oscSendAddr +"</OscSendAddress>" + "\n" +
				"<OscSendPort>" + oscOUT +"</OscSendPort>" + "\n" +
				"<OscReceivePort>" + oscIN +"</OscReceivePort>" + "\n" +
				"<TuioPort>" + tuioIN +"</TuioPort>" + "\n" +
			"</settings>" +"\n" + "\n" ;
		
		for (UbqProxima p : session.getProximi()) {
			UbqColor bg = p.getBgColor();
			UbqColor fg = p.getFgColor();
			buffer += 
			"<fid>"+  "\n" +
			  "<id>" + p.getId() + "</id>" + "\n" +
			  "<style>DISC</style>" + "\n" +
			  "<kind>SIN_OSC</kind>" + "\n" +
			  "<BG>" + bg.getR() + ", " + bg.getG() + ", " + bg.getB()  + "</BG>" + "\n" +
			  "<FG>" + fg.getR() + ", " + fg.getG() + ", " + fg.getB()  + "</FG>" + "\n" +
			  "<radius>" + p.getRadius() + "</radius>" + "\n" +
			  "<proxima>" + p.getLimit() + "</proxima>" + "\n" +
			  "<proximaVisible>True</proximaVisible>" + "\n" +
			  "<range>" + 100 + "</range>" + "\n" +
			  "<function>KNOB</function>" + "\n" +
			"</fid>"+ "\n";
		}

		buffer += "</smurf>";
		
		return buffer;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
