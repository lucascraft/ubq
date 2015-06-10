/***********************************************************************************
 * XQZ - A cross queues utilities framework 
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

package net.sf.ubq.script.utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import net.sf.ubq.script.UbqtStandaloneSetup;
import net.sf.ubq.script.ubqt.UbqBounds;
import net.sf.ubq.script.ubqt.UbqPoint;
import net.sf.ubq.script.ubqt.UbqProxima;
import net.sf.ubq.script.ubqt.UbqSession;
import net.sf.ubq.script.ubqt.UbqtPackage;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;

import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.Injector;

public class UbqUtil implements IUbqUtil {
	
	public UbqSession loadUbqSession(String pathname) {
		try {
			return buildUbqSession((UbqSession) getModel3(pathname));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}

	public UbqSession loadUbqSession(URI uri) {
		try {
			return buildUbqSession((UbqSession) getModel2(uri));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	
	private Injector injector;
	
	@Inject
	public UbqUtil() {
		UbqtStandaloneSetup.doSetup();
		injector = Guice.createInjector(new UbqUtilModule());
	}	
	
	public EObject getModel3(String pathname) throws IOException {
		return getModel2(URI.createURI(pathname));
	}

	public EObject getModel2(URI uri) throws IOException {
		XtextResourceSet set = injector.getInstance(XtextResourceSet.class);
		set.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);
		return set.getResource(uri, true).getContents().get(0);
	}
	
	private UbqSession buildUbqSession(UbqSession ubqSession) {
		return ubqSession;
	}
	
	public static void main(String[] args) {
		try {
			Injector injector = Guice.createInjector(new UbqUtilModule());

			UbqUtil ubqUtil = (UbqUtil) injector.getInstance(IUbqUtil.class);
			
			ubqUtil.buildUbqSession(
				ubqUtil.loadUbqSession(new File("data/u.ubqt").getCanonicalPath())
			);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public UbqProxima getUbqProximaFromFiducialID(UbqSession ubqSession, String fiducialID) {
		if (ubqSession != null) {
			for (UbqProxima ubqProxima : ubqSession.getProximi()) {
				String code = "" + ubqProxima.getFiducial().getFidcode();
				if (code.equals(fiducialID)) {
					return ubqProxima;
				}
			}
		}
		return null;
	}
	
	public UbqBounds createUbqBounds(int x, int y, int width, int height) {
		UbqBounds bounds = (UbqBounds) EcoreUtil.create(UbqtPackage.Literals.UBQ_BOUNDS);
		bounds.setX(x);
		bounds.setY(y);
		bounds.setWidth(width);
		bounds.setHeight(height);
		return bounds;
	}
	
	public UbqPoint createUbqPoint(int x, int y) {
		UbqPoint bounds = (UbqPoint) EcoreUtil.create(UbqtPackage.Literals.UBQ_POINT);
		bounds.setX(x);
		bounds.setY(y);
		return bounds;
	}

}
