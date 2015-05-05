/*
* Copyright (c) 2012 Vienna University of Technology.
* All rights reserved. This program and the accompanying materials are made 
* available under the terms of the Eclipse Public License v1.0 which accompanies 
* this distribution, and is available at http://www.eclipse.org/legal/epl-v10.html
* 
* Contributors:
* Philip Langer - initial API and generator
*/
package eu.artist.postmigration.mbt.modelexecution.fuml.convert.uml2.internal.gen;
    	
import javax.annotation.Generated;

import org.modelexecution.fuml.convert.impl.ConversionResultImpl;

import eu.artist.postmigration.mbt.modelexecution.fuml.convert.uml2.internal.IElementPopulator;

@Generated(value="Generated by org.modelexecution.fuml.convert.uml2.gen.ElementPopulatorGenerator.xtend")
public class NamedElementPopulator implements IElementPopulator {

	@Override
	public void populate(fUML.Syntax.Classes.Kernel.Element fumlElement,
		org.eclipse.uml2.uml.Element uml2Element, ConversionResultImpl result) {
			
		if (!(uml2Element instanceof org.eclipse.uml2.uml.NamedElement) ||
			!(fumlElement instanceof fUML.Syntax.Classes.Kernel.NamedElement)) {
			return;
		}
		
		fUML.Syntax.Classes.Kernel.NamedElement fumlNamedElement = (fUML.Syntax.Classes.Kernel.NamedElement) fumlElement;
		org.eclipse.uml2.uml.NamedElement uml2NamedElement = (org.eclipse.uml2.uml.NamedElement) uml2Element;
		
		fumlNamedElement.setName(uml2NamedElement.getName());
		fumlNamedElement.visibility = castVisibilityKind(uml2NamedElement.getVisibility());
		fumlNamedElement.qualifiedName = uml2NamedElement.getQualifiedName();
		if (!(fumlNamedElement instanceof fUML.Syntax.Classes.Kernel.Parameter)) {    				
			fumlNamedElement.namespace = (fUML.Syntax.Classes.Kernel.Namespace) result
								.getFUMLElement(uml2NamedElement.getNamespace());
		}
		
		
		
		
	}
	
	private fUML.Syntax.Classes.Kernel.VisibilityKind castVisibilityKind(org.eclipse.uml2.uml.VisibilityKind enumVal) {
		switch (enumVal.getValue()) {
			case org.eclipse.uml2.uml.VisibilityKind.PUBLIC:
				return fUML.Syntax.Classes.Kernel.VisibilityKind.public_;
			case org.eclipse.uml2.uml.VisibilityKind.PRIVATE:
				return fUML.Syntax.Classes.Kernel.VisibilityKind.private_;
			case org.eclipse.uml2.uml.VisibilityKind.PROTECTED:
				return fUML.Syntax.Classes.Kernel.VisibilityKind.protected_;
			case org.eclipse.uml2.uml.VisibilityKind.PACKAGE:
				return fUML.Syntax.Classes.Kernel.VisibilityKind.package_;
		}
		return null;
	}
}
