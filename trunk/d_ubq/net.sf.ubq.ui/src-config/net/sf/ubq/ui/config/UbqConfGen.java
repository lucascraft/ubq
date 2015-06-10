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

package net.sf.ubq.ui.config;

import java.io.IOException;

import net.sf.xqz.engine.script.orchestror.DSLCommandEngine;
import net.sf.xqz.engine.script.orchestror.DSLEngineClient;
import net.sf.xqz.engine.script.orchestror.DSLOrchestror;
import net.sf.xqz.engine.script.orchestror.OrchestrorFactory;
import net.sf.xqz.model.temporal.Orchestror;
import net.sf.xqz.script.utils.OrchestrorUtil;

import org.eclipse.emf.common.util.URI;

/**
 * Ubqt utilities
 * 
 * @author lucas bigeardel
 *
 */
public class UbqConfGen {
	//
	// Singleton
	//
	public final static UbqConfGen INSTANCE = new UbqConfGen();
	
	/**
	 * Create a default {@link DSLOrchestror} for initialization purpose.
	 * 
	 * @return newly created {@link DSLOrchestror} orchestror
	 */
	public DSLOrchestror createDefaultOrchestror() {
		DSLOrchestror orchestror = OrchestrorFactory.eINSTANCE.createDSLOrchestror();
		orchestror.setName("Sample_Orchestror");
	
		DSLCommandEngine engine0 = OrchestrorFactory.eINSTANCE.createDSLCommandEngine();
		engine0.setName("Engine0");
		
		DSLEngineClient client = OrchestrorFactory.eINSTANCE.createDSLEngineClient();
		
		client.getRefCmdEngines().add(engine0);
		
		orchestror.getClients().add(client);
		orchestror.getEngines().add(engine0);
		
		return orchestror;
	}
	
	/**
	 * Save a given {@link DSLOrchestror} into the given path.
	 * 
	 * @param orchestror given {@link Orchestror} reference
	 * @param pathName given path where to dump the XMI form of the {@link DSLOrchestror}
	 * 
	 * @return persisted {@link URI}
	 */
	public URI saveDSLOrchestror(DSLOrchestror orchestror, String pathName) {
		try {
			return OrchestrorUtil.INSTANCE.saveModel2(orchestror, pathName);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	/**
	 * Initialize a default {@link DSLOrchestror} and dump it into the givzn path.
	 * 
	 * @param pathName given path where to dump the XMI form of the {@link DSLOrchestror}
	 * 
	 * @return persisted {@link URI}
	 */
	public URI initDefaultOrchestror(String pathName) {
		return saveDSLOrchestror(createDefaultOrchestror(), pathName);
	}
}
