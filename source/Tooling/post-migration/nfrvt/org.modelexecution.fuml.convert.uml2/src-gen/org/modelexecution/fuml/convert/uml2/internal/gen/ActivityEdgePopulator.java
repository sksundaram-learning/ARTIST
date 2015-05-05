/*
* Copyright (c) 2012 Vienna University of Technology.
* All rights reserved. This program and the accompanying materials are made 
* available under the terms of the Eclipse Public License v1.0 which accompanies 
* this distribution, and is available at http://www.eclipse.org/legal/epl-v10.html
* 
* Contributors:
* Philip Langer - initial API and generator
*/
package org.modelexecution.fuml.convert.uml2.internal.gen;
    	
import javax.annotation.Generated;
import org.modelexecution.fuml.convert.impl.ConversionResultImpl;
import org.modelexecution.fuml.convert.uml2.internal.IElementPopulator;

@Generated(value="Generated by org.modelexecution.fuml.convert.uml2.gen.ElementPopulatorGenerator.xtend")
public class ActivityEdgePopulator implements IElementPopulator {

	@Override
	public void populate(fUML.Syntax.Classes.Kernel.Element fumlElement,
		org.eclipse.uml2.uml.Element uml2Element, ConversionResultImpl result) {
			
		if (!(uml2Element instanceof org.eclipse.uml2.uml.ActivityEdge) ||
			!(fumlElement instanceof fUML.Syntax.Activities.IntermediateActivities.ActivityEdge)) {
			return;
		}
		
		fUML.Syntax.Activities.IntermediateActivities.ActivityEdge fumlNamedElement = (fUML.Syntax.Activities.IntermediateActivities.ActivityEdge) fumlElement;
		org.eclipse.uml2.uml.ActivityEdge uml2NamedElement = (org.eclipse.uml2.uml.ActivityEdge) uml2Element;
		
		fumlNamedElement.activity = (fUML.Syntax.Activities.IntermediateActivities.Activity) result
							.getFUMLElement(uml2NamedElement.getActivity());
		fumlNamedElement.source = (fUML.Syntax.Activities.IntermediateActivities.ActivityNode) result
							.getFUMLElement(uml2NamedElement.getSource());
		fumlNamedElement.target = (fUML.Syntax.Activities.IntermediateActivities.ActivityNode) result
							.getFUMLElement(uml2NamedElement.getTarget());
		fumlNamedElement.inStructuredNode = (fUML.Syntax.Activities.CompleteStructuredActivities.StructuredActivityNode) result
							.getFUMLElement(uml2NamedElement.getInStructuredNode());
		fumlNamedElement.guard = (fUML.Syntax.Classes.Kernel.ValueSpecification) result
							.getFUMLElement(uml2NamedElement.getGuard());
		
		
		
		
	}
	
}
