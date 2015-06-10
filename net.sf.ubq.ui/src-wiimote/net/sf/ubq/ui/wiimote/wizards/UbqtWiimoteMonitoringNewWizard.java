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

package net.sf.ubq.ui.wiimote.wizards;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.CommonPlugin;
import org.eclipse.emf.common.util.URI;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWizard;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.ide.IDE;

public class UbqtWiimoteMonitoringNewWizard extends Wizard implements INewWizard {
	private UbqtWiimoteMonitoringNewWizardPage page;
	private ISelection selection;

	public UbqtWiimoteMonitoringNewWizard() {
		super();
		setNeedsProgressMonitor(true);
	}
	
	public void addPages() {
		page = new UbqtWiimoteMonitoringNewWizardPage(selection);
		addPage(page);
	}

	public boolean performFinish() {
		final String containerName = page.getContainerName();
		final String netConfName = page.getNetConfFileName();
		final String orchestrorfName = page.getOrchestrorFileName();
		IRunnableWithProgress op = new IRunnableWithProgress() {
			public void run(IProgressMonitor monitor) throws InvocationTargetException {
				try {
					doFinish(containerName, netConfName, orchestrorfName, monitor);
				} catch (CoreException e) {
					throw new InvocationTargetException(e);
				} finally {
					monitor.done();
				}
			}
		};
		try {
			getContainer().run(true, false, op);
		} catch (InterruptedException e) {
			return false;
		} catch (InvocationTargetException e) {
			Throwable realException = e.getTargetException();
			MessageDialog.openError(getShell(), "Error", realException.getMessage());
			return false;
		}
		return true;
	}
	
	private void doFinish(String containerName, String netconfFileName, String orchestrorFileName, IProgressMonitor monitor) throws CoreException {
		
		//
		// create a wiimote sample files
		//
		monitor.beginTask("Creating " + netconfFileName, 8);
		IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
		IResource resource = root.findMember(new Path(containerName));
		if (!resource.exists() || !(resource instanceof IContainer)) {
			throwCoreException("Container \"" + containerName + "\" does not exist.");
		}
		IContainer container = (IContainer) resource;
		final IFile netConfFile = container.getFile(new Path(netconfFileName));
		try {
			InputStream stream = openNetConfContentStream(orchestrorFileName);
			if (netConfFile.exists()) {
				netConfFile.setContents(stream, true, true, monitor);
			} else {
				netConfFile.create(stream, true, monitor);
			}
			stream.close();
		} catch (IOException e) {
		}
		monitor.worked(1);
		final IFile  orchestrorFile = container.getFile(new Path(orchestrorFileName));
		try {
			InputStream stream = openOrchestrorContentStream();
			if (orchestrorFile.exists()) {
				orchestrorFile.setContents(stream, true, true, monitor);
			} else {
				orchestrorFile.create(stream, true, monitor);
			}
			stream.close();
		} catch (IOException e) {
		}
		monitor.worked(1);
		
		final IFile  readmeTxtFile = container.getFile(new Path("Readme.txt"));
		try {
			InputStream stream = openReadmeTxtFileContentStream();
			if (readmeTxtFile.exists()) {
				readmeTxtFile.setContents(stream, true, true, monitor);
			} else {
				readmeTxtFile.create(stream, true, monitor);
			}
			stream.close();
		} catch (IOException e) {
		}
		monitor.worked(1);
		
		try {
			URI uri = URI.createURI("platform:/plugin/net.sf.ubq.ui/osculator/WiimoteUbqt.oscd", false);
			String pathname = CommonPlugin.resolve(uri).toFileString();
			if (!container.getFile(new Path("WiimoteUbqt.oscd")).exists()) {
				container.getFile(new Path("WiimoteUbqt.oscd")).create(new FileInputStream(new File(pathname)), true, new NullProgressMonitor());
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		monitor.setTaskName("Opening file for editing...");
		getShell().getDisplay().asyncExec(new Runnable() {
			public void run() {
				IWorkbenchPage page =
					PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
				try {
					IDE.openEditor(page, orchestrorFile, false);
				} catch (PartInitException e) {
				}
			}
		});
		monitor.worked(1);
		getShell().getDisplay().asyncExec(new Runnable() {
			public void run() {
				IWorkbenchPage page =
					PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
				try {
					IDE.openEditor(page, netConfFile, true);
				} catch (PartInitException e) {
				}
			}
		});
		monitor.worked(1);
		getShell().getDisplay().asyncExec(new Runnable() {
			public void run() {
				IWorkbenchPage page =
					PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
				try {
					IDE.openEditor(page, readmeTxtFile, true);
				} catch (PartInitException e) {
				}
			}
		});
		monitor.worked(1);
	}
	
	/**
	 * We will initialize file contents with a sample text.
	 */

	private InputStream openNetConfContentStream(String orchestrorFileName) {
		String contents = "import \""+orchestrorFileName+"\";" + 
		"\ninterpreter interpreterMd8Osc0 : \"net.sf.smbt.osc.md8.cmdInterpreter\";" +
		"\ndecoder decoderMd8Osc0 : \"net.sf.smbt.osc.wiimote.frameInterpreter\";" +
		"\nport md8Udp0 : \"localhost:8002\" as UDP accept 1234;" +
		"\nscope orchestror1 {" +
		"\n\tbind engineMd8Osc0 => interpreterMd8Osc0 <= decoderMd8Osc0 to md8Udp0;" +
		"\n};\n";
		return new ByteArrayInputStream(contents.getBytes());
	}

	private InputStream openOrchestrorContentStream() {
		String contents = "orchestror orchestror1 {" +
			"\nengine engineMd8Osc0 speed MAX strategy PICK_N_RUSH threshold 75;" +
			"\nclient client1 speed MAX{ engineMd8Osc0 };" +
			"\n  timeline timeline1 : engineMd8Osc0;" +
			"\n  application application1 { client1 };" +
			"\n}\n";		
		return new ByteArrayInputStream(contents.getBytes());
	}
	
	private InputStream openReadmeTxtFileContentStream() {
		String contents = "If not already, grab osculator from here : http://www.osculator.net/\n" +
		"1) Get your Wiimote ready to go\n" +
		"2) Double-Click on WiimoteUbqt.oscd\n" +
		"3) In OSculator, open the Wiimote drawer in right upper corner\n" +
		"4) associate by starting the discovery and simulteanously press 1 & 2 buttons on wiimote\n" +
		"5) In ubqt Rcp select wiimote.netconf file and click on the wireless icon on the top\n" +
		"6) It should display something like a dancing curve .. ?!?" +
		"\n\n\nEnjoy & read the code ... !";
		return new ByteArrayInputStream(contents.getBytes());
	}

	private void throwCoreException(String message) throws CoreException {
		IStatus status =
			new Status(IStatus.ERROR, "net.sf.ubq.ui", IStatus.OK, message, null);
		throw new CoreException(status);
	}

	/**
	 * We will accept the selection in the workbench to see if
	 * we can initialize from it.
	 * @see IWorkbenchWizard#init(IWorkbench, IStructuredSelection)
	 */
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		this.selection = selection;
	}
}