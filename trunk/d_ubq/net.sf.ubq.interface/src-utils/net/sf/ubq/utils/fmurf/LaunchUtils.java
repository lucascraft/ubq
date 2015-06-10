/***********************************************************************************
 * Ubiquisense - A smart ambient utilities framework 
 * 
 * Copyright (c) 2013, Lucas Bigeardel
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

package net.sf.ubq.utils.fmurf;

import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.nio.charset.Charset;

import net.sf.smbt.quantic.warp.QuanticMojo;
import net.sf.ubq.gui.Activator;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;
import org.eclipse.ui.progress.UIJob;


public class LaunchUtils {

	public static void launch(final String appID) {
		new UIJob("FMURF Launcher") {
			@Override
			public IStatus runInUIThread(IProgressMonitor monitor) {
				QuanticMojo.INSTANCE.hookInputPort("udp", "osc", 4448);
				if( "FMURF".equalsIgnoreCase(appID)) {
					_launchFMURF();
				} else if( "IANNIX".equalsIgnoreCase(appID)) {
					_launchIANNIX();
				} else if( "REACTIVISION".equalsIgnoreCase(appID)) {
					_launchREACTIVISION();
				}  else if( "CHUCK".equalsIgnoreCase(appID)) {
					_launchCHUCK();
				} /*else if( "ARDUINO".equalsIgnoreCase(appID)) {
					_launchARDUINO();
				} else if( "MAXRUNTIME".equalsIgnoreCase(appID)) {
					_launchMAXRUNTIME();
				} */
				return Status.OK_STATUS;
			}
		}.schedule();
	}
	public static void updateFmurfSettings(String settings) {
	    String settingsFile = "";
	    URL url = null;
		try {
			String ubiquisenseJarPath = "/fmurf/data/settings.xml";
			url = FileLocator.find(Activator.getDefault().getBundle(), new Path(ubiquisenseJarPath), null);
			if (url != null) {
				java.net.URI fileUri = FileLocator.resolve(url).toURI();
				if (fileUri != null) {
					File f = new File(fileUri);
					if (f != null) {
						settingsFile = new Path(f.getCanonicalPath()).toOSString();
						
						FileOutputStream os	= new FileOutputStream(settingsFile);
						
						BufferedWriter writer = new BufferedWriter(
							new OutputStreamWriter(
								os, 
								Charset.forName("UTF-8")
							)
						);
						
						writer.write(settings);
						writer.flush();
						
						os.flush();
						os.close();
					}
				}
			}
		} catch(Exception e) {
			e.toString();
		}     
	}
	private static void _launchFMURF() {
		try {
	        String commanPath = "";
	        URL url = null;
			try {
				String ubiquisenseJarPath = "/fmurf/" + (Platform.getOS().equals(Platform.OS_WIN32) ? "FMURF.exe" : "Fmurf.app");
				url = FileLocator.find(Activator.getDefault().getBundle(), new Path(ubiquisenseJarPath), null);
				if (url != null) {
					java.net.URI fileUri = FileLocator.resolve(url).toURI();
					if (fileUri != null) {
						File f = new File(fileUri);
						if (f != null) {
							commanPath = new Path(f.getCanonicalPath()).toOSString();
						}
					}
				}
			} catch(Exception e) {
			    e.toString();
			}
	        if (!"".equals(commanPath)) {
		        String commandLine = commanPath;
		            Runtime.getRuntime().exec(commandLine);
	        	}
	        }
	        catch (IOException e) {
	            System.out.println("exception happened - here's what I know: ");
	            e.printStackTrace();
	        }	
	}
	
	private static void _launchIANNIX() {
		try {
	        String commanPath = "";
	        URL url = null;
			try {
				String app = "";
				if (Platform.getOS().equals(Platform.OS_WIN32)) {
					app = "IanniX.exe";
				} else if (Platform.getOS().equals(Platform.OS_LINUX)) {
					app = "IanniX.sh";
				} else if (Platform.getOS().equals(Platform.OS_MACOSX)) {
					app = "IanniX.app";
				}
				String ubiquisenseJarPath = "/iannix/" +  app;
				url = FileLocator.find(Activator.getDefault().getBundle(), new Path(ubiquisenseJarPath), null);
				if (url != null) {
					java.net.URI fileUri = FileLocator.resolve(url).toURI();
					if (fileUri != null) {
						File f = new File(fileUri);
						if (f != null) {
							commanPath = new Path(f.getCanonicalPath()).toOSString();
						}
					}
				}
			} catch(Exception e) {
			    e.toString();
			}
	        if (!"".equals(commanPath)) {
		        String commandLine = commanPath;
		        	Runtime.getRuntime().exec(commandLine);
	        	}
	        }
	        catch (IOException e) {
	            System.out.println("exception happened - here's what I know: ");
	            e.printStackTrace();
	        }	
	}
	private static void _launchREACTIVISION() {
		try {
	        String commanPath = "";
	        URL url = null;
			try {
				String app = "";
				if (Platform.getOS().equals(Platform.OS_WIN32)) {
					app = "reacTIVision.exe";
				} else if (Platform.getOS().equals(Platform.OS_LINUX)) {
					app = "reacTIVision";
				} else if (Platform.getOS().equals(Platform.OS_MACOSX)) {
					app = "reacTIVision.app";
				}
				String ubiquisenseJarPath = "/reactvision14/" +  app;
				url = FileLocator.find(Activator.getDefault().getBundle(), new Path(ubiquisenseJarPath), null);
				if (url != null) {
					java.net.URI fileUri = FileLocator.resolve(url).toURI();
					if (fileUri != null) {
						File f = new File(fileUri);
						if (f != null) {
							commanPath = new Path(f.getCanonicalPath()).toOSString();
						}
					}
				}
			} catch(Exception e) {
			    e.toString();
			}
	        if (!"".equals(commanPath)) {
		        String commandLine = commanPath;
		        	Runtime.getRuntime().exec(commandLine);
	        	}
	        }
	        catch (IOException e) {
	            System.out.println("exception happened - here's what I know: ");
	            e.printStackTrace();
	        }	
	}
	private static void _launchCHUCK() {
		try {
	        String commanPath = "";
	        URL url = null;
			try {
				String app = "";
				if (Platform.getOS().equals(Platform.OS_WIN32)) {
					app = "miniAudicle.exe";
				} else if (Platform.getOS().equals(Platform.OS_LINUX)) {
					app = "miniAudicle";
				} else if (Platform.getOS().equals(Platform.OS_MACOSX)) {
					app = "miniAudicle.app";
				}
				String ubiquisenseJarPath = "/chuck/" +  app;
				url = FileLocator.find(Activator.getDefault().getBundle(), new Path(ubiquisenseJarPath), null);
				if (url != null) {
					java.net.URI fileUri = FileLocator.resolve(url).toURI();
					if (fileUri != null) {
						File f = new File(fileUri);
						if (f != null) {
							commanPath = new Path(f.getCanonicalPath()).toOSString();
						}
					}
				}
			} catch(Exception e) {
			    e.toString();
			}
	        if (!"".equals(commanPath)) {
		        String commandLine = commanPath;
		        	Runtime.getRuntime().exec(commandLine);
	        	}
	        }
	        catch (IOException e) {
	            System.out.println("exception happened - here's what I know: ");
	            e.printStackTrace();
	        }	
	}
}
