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

package net.sf.ubq.interfaces.gui.actions;

import java.util.Iterator;

import net.sf.ubq.util.gui.TangibleGuiUtuils;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.URI;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.IWorkbenchWindowActionDelegate;


public class UbqtMTGuiLaunchAction implements IWorkbenchWindowActionDelegate {
	private UbqSelection ubqSelection;

	/**
	 * The action has been activated. The argument of the
	 * method represents the 'real' action sitting
	 * in the workbench UI.
	 * @see IWorkbenchWindowActionDelegate#run
	 */
	public void run(IAction action) {
		TangibleGuiUtuils.INSTANCE.createTangibleGui();
	}

	class UbqSelection {
		public UbqSelection() {
			netconf = "";
			ubqt = "";
		}
		public String netconf;
		public String ubqt;
		public boolean isValid() {
			return netconf.length()>0 && ubqt.length()>0;
		}
	}
	
	/**
	 * Selection in the workbench has been changed. We 
	 * can change the state of the 'real' action here
	 * if we want, but this can only happen after 
	 * the delegate has been created.
	 * @see IWorkbenchWindowActionDelegate#selectionChanged
	 */
	public void selectionChanged(IAction action, ISelection selection) {
		ubqSelection = new UbqSelection();
		if (selection instanceof StructuredSelection) {
			if (!selection.isEmpty()) {
				@SuppressWarnings("unchecked")
				Iterator<Object> it = ((StructuredSelection)selection).iterator();
				while(it.hasNext()) {
					Object obj = it.next();
					if (obj instanceof IFile) {
						if (((IFile)obj).getFileExtension().equals("ubqt")) {
							ubqSelection.ubqt = URI.createPlatformResourceURI(((IFile)obj).getFullPath().toOSString(), false).toString();
						} else if (((IFile)obj).getFileExtension().equals("netconf")) {
							ubqSelection.netconf = URI.createPlatformResourceURI(((IFile)obj).getFullPath().toOSString(), false).toString();
						}
					}
				}
			}
		}
		action.setEnabled(ubqSelection.isValid());
	}

	/**
	 * We can use this method to dispose of any system
	 * resources we previously allocated.
	 * @see IWorkbenchWindowActionDelegate#dispose
	 */
	public void dispose() {
	}

	/**
	 * We will cache window object in order to
	 * be able to provide parent shell for the message dialog.
	 * @see IWorkbenchWindowActionDelegate#init
	 */
	public void init(IWorkbenchWindow window) {
		//this.window = window;
	}
}