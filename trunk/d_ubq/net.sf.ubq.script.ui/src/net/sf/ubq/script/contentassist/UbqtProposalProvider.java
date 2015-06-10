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

package net.sf.ubq.script.contentassist;

import net.sf.ubq.script.ui.contentassist.AbstractUbqtProposalProvider;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.ui.editor.contentassist.ContentAssistContext;
import org.eclipse.xtext.ui.editor.contentassist.ICompletionProposalAcceptor;
/**
 * see http://www.eclipse.org/Xtext/documentation/latest/xtext.html#contentAssist on how to customize content assistant
 */
public class UbqtProposalProvider extends AbstractUbqtProposalProvider {
	@Override
	public void complete_DSLEngineClient(EObject model, RuleCall ruleCall,
			ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		// TODO Auto-generated method stub
		super.complete_DSLEngineClient(model, ruleCall, context, acceptor);
	}
	
	@Override
	public void complete_NetConfImport(EObject model, RuleCall ruleCall,
			ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		// TODO Auto-generated method stub
		super.complete_NetConfImport(model, ruleCall, context, acceptor);
	}
	
	@Override
	public void complete_OrchestrorImport(EObject model, RuleCall ruleCall,
			ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		// TODO Auto-generated method stub
		super.complete_OrchestrorImport(model, ruleCall, context, acceptor);
	}
	
	@Override
	public void completeNetConfImport_ImportURI(EObject model,
			Assignment assignment, ContentAssistContext context,
			ICompletionProposalAcceptor acceptor) {
		// TODO Auto-generated method stub
		super.completeNetConfImport_ImportURI(model, assignment, context, acceptor);
	}
	
	@Override
	public void completeOrchestrorImport_ImportURI(EObject model,
			Assignment assignment, ContentAssistContext context,
			ICompletionProposalAcceptor acceptor) {
		// TODO Auto-generated method stub
		super.completeOrchestrorImport_ImportURI(model, assignment, context, acceptor);
	}
	
	
}
