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

package net.sf.ubq.draw2d.renderer.actions;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import net.sf.ubq.draw2d.renderer.Activator;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.debug.core.DebugPlugin;
import org.eclipse.debug.core.ILaunch;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchConfigurationType;
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.eclipse.debug.core.ILaunchManager;
import org.eclipse.debug.core.model.IProcess;
import org.eclipse.debug.internal.core.LaunchConfigurationWorkingCopy;
import org.eclipse.jdt.launching.IJavaLaunchConfigurationConstants;
import org.eclipse.jdt.launching.IRuntimeClasspathEntry;
import org.eclipse.jdt.launching.IVMInstall;
import org.eclipse.jdt.launching.IVMInstallType;
import org.eclipse.jdt.launching.JavaRuntime;
import org.eclipse.ui.progress.UIJob;

public class TuioSimulatorLaunchUtils {
	
	public final static TuioSimulatorLaunchUtils INSTANCE = new TuioSimulatorLaunchUtils();
	
	private ILaunchConfiguration createLaunchConfiguration() throws CoreException {
		ILaunchManager manager = DebugPlugin.getDefault().getLaunchManager();
		   ILaunchConfigurationType type =
		      manager.getLaunchConfigurationType(IJavaLaunchConfigurationConstants.ID_JAVA_APPLICATION);
		ILaunchConfiguration[] configurations =
		      manager.getLaunchConfigurations(type);
		   for (int i = 0; i < configurations.length; i++) {
		      ILaunchConfiguration configuration = configurations[i];
		      if (configuration.getName().equals("Start TUIO Simulator")) {
		         configuration.delete();
		         break;
		      }
		   }
		ILaunchConfigurationWorkingCopy workingCopy =
		      type.newInstance(null, "Start TUIO Simulator");
		
		return workingCopy;
	}
		
	private List computeClassPath() throws CoreException {
	     URL url = null;
	     List classpath = new ArrayList();
	     
	      try {
			String ubiquisenseJarPath = "/TUIO_Simulator/TuioSimulator.jar";
			url = FileLocator.find(Activator.getDefault().getBundle(), new Path(ubiquisenseJarPath), null);
	 		
	        java.net.URI fileUri = FileLocator.resolve(url).toURI();
	        
	        File f = new File(fileUri);
	        
			IPath ubiquisensePath = new Path(f.getCanonicalPath());
			
			IRuntimeClasspathEntry ubiquisenseEntry = JavaRuntime.newArchiveRuntimeClasspathEntry(ubiquisensePath);
			ubiquisenseEntry.setClasspathProperty(IRuntimeClasspathEntry.ARCHIVE);
			
			IPath systemLibsPath = new Path(JavaRuntime.JRE_CONTAINER);
			IRuntimeClasspathEntry systemLibsEntry = JavaRuntime.newRuntimeContainerClasspathEntry(systemLibsPath, IRuntimeClasspathEntry.STANDARD_CLASSES);

			classpath.add(ubiquisenseEntry.getMemento());
			classpath.add(systemLibsEntry.getMemento());
	      } catch (Exception exception1) {
	    	  exception1.printStackTrace();
	      }
		   
		return classpath;
	}
	
	public void launchTuioSimulator() throws CoreException, URISyntaxException, IOException {
		String argsLine = ""; 
		
		LaunchConfigurationWorkingCopy launchConfig = (LaunchConfigurationWorkingCopy) createLaunchConfiguration();

		IVMInstall jre = JavaRuntime.getDefaultVMInstall();
		List classpath = computeClassPath();
		
		launchConfig.setAttribute(IJavaLaunchConfigurationConstants.ATTR_VM_INSTALL_NAME, jre.getName());
		launchConfig.setAttribute(IJavaLaunchConfigurationConstants.ATTR_VM_INSTALL_TYPE, jre.getVMInstallType().getId());
		launchConfig.setAttribute(IJavaLaunchConfigurationConstants.ATTR_MAIN_TYPE_NAME, "TuioSimulator");
		launchConfig.setAttribute(IJavaLaunchConfigurationConstants.ATTR_PROGRAM_ARGUMENTS, argsLine);
		launchConfig.setAttribute(IJavaLaunchConfigurationConstants.ATTR_CLASSPATH, classpath);
		
		String ubiquisenseJarPath = "/TUIO_Simulator/TuioSimulator.jar";
		URL url = FileLocator.find(Activator.getDefault().getBundle(), new Path(ubiquisenseJarPath), null);
 		
        java.net.URI fileUri = FileLocator.resolve(url).toURI();
        
        File f = new File(fileUri);
        
		launchConfig.setAttribute(IJavaLaunchConfigurationConstants.ATTR_WORKING_DIRECTORY, new Path(f.getCanonicalPath()).removeLastSegments(1).toOSString());
		launchConfig.setAttribute(IJavaLaunchConfigurationConstants.ATTR_DEFAULT_CLASSPATH, false);
		
		ILaunch launch = launchConfig.launch(ILaunchManager.RUN_MODE, UIJob.getJobManager().createProgressGroup());
		IProcess[] p = launch.getProcesses();
//		for (IProcess pp : p) {
//			pp.getStreamsProxy().getOutputStreamMonitor().addListener(new IStreamListener() {
//				@Override
//				public void streamAppended(String text, IStreamMonitor monitor) {
//					System.out.println(text);
//				}
//			});
//		}
		
	}
	
	public void testUbiquisenseJarLaunchConfig() {
		try {
			INSTANCE.launchTuioSimulator();
		} catch (CoreException e) {
			e.printStackTrace();
		} catch (URISyntaxException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
