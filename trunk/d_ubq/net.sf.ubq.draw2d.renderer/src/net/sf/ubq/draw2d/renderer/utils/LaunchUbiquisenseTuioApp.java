/***********************************************************************************
 * Ubiquisense - A ubiquitous computing utilities framework 
 * 
 * Copyright (c) 2014, Lucas Bigeardel
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

package net.sf.ubq.draw2d.renderer.utils;
import net.sf.smbt.ubqt.UbqSession;
import net.sf.smbt.ubqt.UbqtFactory;
import net.sf.ubq.draw2d.renderer.actions.TangibleGuiUtuils;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.ui.IEditorActionDelegate;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchPart;


public class LaunchUbiquisenseTuioApp extends Action implements IEditorActionDelegate{
	private UbqSession seesion;
	
	public LaunchUbiquisenseTuioApp() {
		super("Launch As Tuio App");
		seesion = UbqtFactory.eINSTANCE.createUbqSession();
	}
	@Override
	public void run() {
		run(this);
	}
	public void run(IAction action) {
		TangibleGuiUtuils.INSTANCE.createTangibleGui(seesion);		
	}

	public void selectionChanged(IAction action, ISelection selection) {
		if (selection instanceof StructuredSelection) {
			Object o = ((StructuredSelection)selection).getFirstElement();
			if (o instanceof UbqSession) {
				seesion = (UbqSession) o;
			} if (o instanceof EObject && ((EObject)o).eContainer() instanceof UbqSession) {
				seesion = (UbqSession) ((EObject)o).eContainer();
			}
		}
	}

	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		System.out.println(targetPart);
	}
	
	public void setActiveEditor(IAction action, IEditorPart targetEditor) {
		// TODO Auto-generated method stub
		
	}
}
