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

package net.sf.ubq.script.linking;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import net.sf.smbt.comm.script.netConf.NetCfg;
import net.sf.ubq.script.ubqt.NetConfImport;
import net.sf.ubq.script.ubqt.OrchestrorImport;
import net.sf.ubq.script.ubqt.UbqSession;
import net.sf.xqz.engine.script.orchestror.DSLOrchestror;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.linking.impl.DefaultLinkingService;
import org.eclipse.xtext.linking.impl.IllegalNodeException;
import org.eclipse.xtext.parsetree.AbstractNode;

public class UbqLinker extends DefaultLinkingService {
	private HashMap<String, DSLOrchestror> resolvedScopesMap = new HashMap<String, DSLOrchestror>();
	private HashMap<String, NetCfg> resolvedNetworksMap = new HashMap<String, NetCfg>();
	
	@Override
	public List<EObject> getLinkedObjects(EObject context, EReference ref,
			AbstractNode node) throws IllegalNodeException {
		List<EObject> objs = super.getLinkedObjects(context, ref, node);

		if (context instanceof OrchestrorImport) {

			OrchestrorImport orchestrorScope = (OrchestrorImport) context;
			UbqSession session = (UbqSession) orchestrorScope.eContainer();
			for (OrchestrorImport imp : session.getOrchestrors()) {
				URI newURI = session.eResource().getURI().trimSegments(1).appendSegment(imp.getImportURI());
				Resource r = EcoreUtil2.getResource(session.eResource(), newURI.toString());
				session.eResource().getResourceSet().getResources().add(r);
				DSLOrchestror orchestror = (DSLOrchestror) r.getContents().get(0);

				if (!resolvedScopesMap.containsKey(orchestror.eResource().getURI().toString())) {
					resolvedScopesMap.put(orchestror.eResource().getURI().toString(), orchestror);
				}
			}
			return Arrays.asList(new EObject[]{resolvedScopesMap.get(super.getCrossRefNodeAsString(node))});
		} else if (context instanceof NetConfImport) {

			NetConfImport netconfsScope = (NetConfImport) context;
			UbqSession session = (UbqSession) netconfsScope.eContainer();
			for (NetConfImport imp : session.getNetconfs()) {
				URI newURI = session.eResource().getURI().trimSegments(1).appendSegment(imp.getImportURI());
				Resource r = EcoreUtil2.getResource(session.eResource(), newURI.toString());
				session.eResource().getResourceSet().getResources().add(r);
				NetCfg cfg = (NetCfg) r.getContents().get(0);

				if (!resolvedNetworksMap.containsKey(cfg.eResource().getURI().toString())) {
					resolvedNetworksMap.put(cfg.eResource().getURI().toString(), cfg);
				}
			}
			return Arrays.asList(new EObject[]{resolvedNetworksMap.get(super.getCrossRefNodeAsString(node))});
		}
		
		return objs; 
	}
}
