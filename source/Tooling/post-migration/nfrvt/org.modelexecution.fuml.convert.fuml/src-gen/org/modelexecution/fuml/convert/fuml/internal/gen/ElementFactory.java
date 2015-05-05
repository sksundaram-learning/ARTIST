/*
* Copyright (c) 2013 Vienna University of Technology.
* All rights reserved. This program and the accompanying materials are made 
* available under the terms of the Eclipse Public License v1.0 which accompanies 
* this distribution, and is available at http://www.eclipse.org/legal/epl-v10.html
* 
* Contributors:
* Philip Langer - initial API and generator
* Tanja Mayerhofer - generator
*/
package org.modelexecution.fuml.convert.fuml.internal.gen;

import javax.annotation.Generated;

import org.eclipse.emf.ecore.EObject;

@Generated(value="Generated by org.modelexecution.fuml.convert.fuml.gen.ElementPopulatorGenerator.xtend")
public class ElementFactory {

	public fUML.Syntax.Classes.Kernel.Element create(EObject element) {
		String className = element.eClass().getName();
		switch(className) {
		case "OpaqueBehavior":
			return create((org.modelexecution.fuml.Syntax.CommonBehaviors.BasicBehaviors.OpaqueBehavior) element);
		case "FunctionBehavior":
			return create((org.modelexecution.fuml.Syntax.CommonBehaviors.BasicBehaviors.FunctionBehavior) element);
		case "Trigger":
			return create((org.modelexecution.fuml.Syntax.CommonBehaviors.Communications.Trigger) element);
		case "Signal":
			return create((org.modelexecution.fuml.Syntax.CommonBehaviors.Communications.Signal) element);
		case "SignalEvent":
			return create((org.modelexecution.fuml.Syntax.CommonBehaviors.Communications.SignalEvent) element);
		case "Reception":
			return create((org.modelexecution.fuml.Syntax.CommonBehaviors.Communications.Reception) element);
		case "TypedElement":
			return create((org.modelexecution.fuml.Syntax.Classes.Kernel.TypedElement) element);
		case "ElementImport":
			return create((org.modelexecution.fuml.Syntax.Classes.Kernel.ElementImport) element);
		case "PackageImport":
			return create((org.modelexecution.fuml.Syntax.Classes.Kernel.PackageImport) element);
		case "Package":
			return create((org.modelexecution.fuml.Syntax.Classes.Kernel.Package) element);
		case "Generalization":
			return create((org.modelexecution.fuml.Syntax.Classes.Kernel.Generalization) element);
		case "Property":
			return create((org.modelexecution.fuml.Syntax.Classes.Kernel.Property) element);
		case "Association":
			return create((org.modelexecution.fuml.Syntax.Classes.Kernel.Association) element);
		case "DataType":
			return create((org.modelexecution.fuml.Syntax.Classes.Kernel.DataType) element);
		case "MultiplicityElement":
			return create((org.modelexecution.fuml.Syntax.Classes.Kernel.MultiplicityElement) element);
		case "Parameter":
			return create((org.modelexecution.fuml.Syntax.Classes.Kernel.Parameter) element);
		case "Operation":
			return create((org.modelexecution.fuml.Syntax.Classes.Kernel.Operation) element);
		case "InstanceSpecification":
			return create((org.modelexecution.fuml.Syntax.Classes.Kernel.InstanceSpecification) element);
		case "Slot":
			return create((org.modelexecution.fuml.Syntax.Classes.Kernel.Slot) element);
		case "InstanceValue":
			return create((org.modelexecution.fuml.Syntax.Classes.Kernel.InstanceValue) element);
		case "LiteralBoolean":
			return create((org.modelexecution.fuml.Syntax.Classes.Kernel.LiteralBoolean) element);
		case "LiteralInteger":
			return create((org.modelexecution.fuml.Syntax.Classes.Kernel.LiteralInteger) element);
		case "LiteralNull":
			return create((org.modelexecution.fuml.Syntax.Classes.Kernel.LiteralNull) element);
		case "LiteralString":
			return create((org.modelexecution.fuml.Syntax.Classes.Kernel.LiteralString) element);
		case "LiteralUnlimitedNatural":
			return create((org.modelexecution.fuml.Syntax.Classes.Kernel.LiteralUnlimitedNatural) element);
		case "PrimitiveType":
			return create((org.modelexecution.fuml.Syntax.Classes.Kernel.PrimitiveType) element);
		case "Enumeration":
			return create((org.modelexecution.fuml.Syntax.Classes.Kernel.Enumeration) element);
		case "EnumerationLiteral":
			return create((org.modelexecution.fuml.Syntax.Classes.Kernel.EnumerationLiteral) element);
		case "Class":
			return create((org.modelexecution.fuml.Syntax.Classes.Kernel.Class) element);
		case "ObjectFlow":
			return create((org.modelexecution.fuml.Syntax.Activities.IntermediateActivities.ObjectFlow) element);
		case "Activity":
			return create((org.modelexecution.fuml.Syntax.Activities.IntermediateActivities.Activity) element);
		case "MergeNode":
			return create((org.modelexecution.fuml.Syntax.Activities.IntermediateActivities.MergeNode) element);
		case "JoinNode":
			return create((org.modelexecution.fuml.Syntax.Activities.IntermediateActivities.JoinNode) element);
		case "InitialNode":
			return create((org.modelexecution.fuml.Syntax.Activities.IntermediateActivities.InitialNode) element);
		case "ForkNode":
			return create((org.modelexecution.fuml.Syntax.Activities.IntermediateActivities.ForkNode) element);
		case "ControlFlow":
			return create((org.modelexecution.fuml.Syntax.Activities.IntermediateActivities.ControlFlow) element);
		case "DecisionNode":
			return create((org.modelexecution.fuml.Syntax.Activities.IntermediateActivities.DecisionNode) element);
		case "ActivityFinalNode":
			return create((org.modelexecution.fuml.Syntax.Activities.IntermediateActivities.ActivityFinalNode) element);
		case "ActivityParameterNode":
			return create((org.modelexecution.fuml.Syntax.Activities.IntermediateActivities.ActivityParameterNode) element);
		case "LoopNode":
			return create((org.modelexecution.fuml.Syntax.Activities.CompleteStructuredActivities.LoopNode) element);
		case "Clause":
			return create((org.modelexecution.fuml.Syntax.Activities.CompleteStructuredActivities.Clause) element);
		case "ConditionalNode":
			return create((org.modelexecution.fuml.Syntax.Activities.CompleteStructuredActivities.ConditionalNode) element);
		case "StructuredActivityNode":
			return create((org.modelexecution.fuml.Syntax.Activities.CompleteStructuredActivities.StructuredActivityNode) element);
		case "ExpansionNode":
			return create((org.modelexecution.fuml.Syntax.Activities.ExtraStructuredActivities.ExpansionNode) element);
		case "ExpansionRegion":
			return create((org.modelexecution.fuml.Syntax.Activities.ExtraStructuredActivities.ExpansionRegion) element);
		case "TestIdentityAction":
			return create((org.modelexecution.fuml.Syntax.Actions.IntermediateActions.TestIdentityAction) element);
		case "ValueSpecificationAction":
			return create((org.modelexecution.fuml.Syntax.Actions.IntermediateActions.ValueSpecificationAction) element);
		case "LinkEndData":
			return create((org.modelexecution.fuml.Syntax.Actions.IntermediateActions.LinkEndData) element);
		case "RemoveStructuralFeatureValueAction":
			return create((org.modelexecution.fuml.Syntax.Actions.IntermediateActions.RemoveStructuralFeatureValueAction) element);
		case "ReadLinkAction":
			return create((org.modelexecution.fuml.Syntax.Actions.IntermediateActions.ReadLinkAction) element);
		case "ReadSelfAction":
			return create((org.modelexecution.fuml.Syntax.Actions.IntermediateActions.ReadSelfAction) element);
		case "ReadStructuralFeatureAction":
			return create((org.modelexecution.fuml.Syntax.Actions.IntermediateActions.ReadStructuralFeatureAction) element);
		case "LinkEndCreationData":
			return create((org.modelexecution.fuml.Syntax.Actions.IntermediateActions.LinkEndCreationData) element);
		case "LinkEndDestructionData":
			return create((org.modelexecution.fuml.Syntax.Actions.IntermediateActions.LinkEndDestructionData) element);
		case "ClearAssociationAction":
			return create((org.modelexecution.fuml.Syntax.Actions.IntermediateActions.ClearAssociationAction) element);
		case "ClearStructuralFeatureAction":
			return create((org.modelexecution.fuml.Syntax.Actions.IntermediateActions.ClearStructuralFeatureAction) element);
		case "CreateLinkAction":
			return create((org.modelexecution.fuml.Syntax.Actions.IntermediateActions.CreateLinkAction) element);
		case "CreateObjectAction":
			return create((org.modelexecution.fuml.Syntax.Actions.IntermediateActions.CreateObjectAction) element);
		case "DestroyLinkAction":
			return create((org.modelexecution.fuml.Syntax.Actions.IntermediateActions.DestroyLinkAction) element);
		case "DestroyObjectAction":
			return create((org.modelexecution.fuml.Syntax.Actions.IntermediateActions.DestroyObjectAction) element);
		case "AddStructuralFeatureValueAction":
			return create((org.modelexecution.fuml.Syntax.Actions.IntermediateActions.AddStructuralFeatureValueAction) element);
		case "StartClassifierBehaviorAction":
			return create((org.modelexecution.fuml.Syntax.Actions.CompleteActions.StartClassifierBehaviorAction) element);
		case "StartObjectBehaviorAction":
			return create((org.modelexecution.fuml.Syntax.Actions.CompleteActions.StartObjectBehaviorAction) element);
		case "ReduceAction":
			return create((org.modelexecution.fuml.Syntax.Actions.CompleteActions.ReduceAction) element);
		case "ReadExtentAction":
			return create((org.modelexecution.fuml.Syntax.Actions.CompleteActions.ReadExtentAction) element);
		case "ReadIsClassifiedObjectAction":
			return create((org.modelexecution.fuml.Syntax.Actions.CompleteActions.ReadIsClassifiedObjectAction) element);
		case "ReclassifyObjectAction":
			return create((org.modelexecution.fuml.Syntax.Actions.CompleteActions.ReclassifyObjectAction) element);
		case "AcceptEventAction":
			return create((org.modelexecution.fuml.Syntax.Actions.CompleteActions.AcceptEventAction) element);
		case "InputPin":
			return create((org.modelexecution.fuml.Syntax.Actions.BasicActions.InputPin) element);
		case "SendSignalAction":
			return create((org.modelexecution.fuml.Syntax.Actions.BasicActions.SendSignalAction) element);
		case "CallBehaviorAction":
			return create((org.modelexecution.fuml.Syntax.Actions.BasicActions.CallBehaviorAction) element);
		case "CallOperationAction":
			return create((org.modelexecution.fuml.Syntax.Actions.BasicActions.CallOperationAction) element);
		case "OutputPin":
			return create((org.modelexecution.fuml.Syntax.Actions.BasicActions.OutputPin) element);
		}
		return null;
	}
	public fUML.Syntax.CommonBehaviors.BasicBehaviors.OpaqueBehavior create(org.modelexecution.fuml.Syntax.CommonBehaviors.BasicBehaviors.OpaqueBehavior element) {
		return new fUML.Syntax.CommonBehaviors.BasicBehaviors.OpaqueBehavior();
	}
	public fUML.Syntax.CommonBehaviors.BasicBehaviors.FunctionBehavior create(org.modelexecution.fuml.Syntax.CommonBehaviors.BasicBehaviors.FunctionBehavior element) {
		return new fUML.Syntax.CommonBehaviors.BasicBehaviors.FunctionBehavior();
	}
	public fUML.Syntax.CommonBehaviors.Communications.Trigger create(org.modelexecution.fuml.Syntax.CommonBehaviors.Communications.Trigger element) {
		return new fUML.Syntax.CommonBehaviors.Communications.Trigger();
	}
	public fUML.Syntax.CommonBehaviors.Communications.Signal create(org.modelexecution.fuml.Syntax.CommonBehaviors.Communications.Signal element) {
		return new fUML.Syntax.CommonBehaviors.Communications.Signal();
	}
	public fUML.Syntax.CommonBehaviors.Communications.SignalEvent create(org.modelexecution.fuml.Syntax.CommonBehaviors.Communications.SignalEvent element) {
		return new fUML.Syntax.CommonBehaviors.Communications.SignalEvent();
	}
	public fUML.Syntax.CommonBehaviors.Communications.Reception create(org.modelexecution.fuml.Syntax.CommonBehaviors.Communications.Reception element) {
		return new fUML.Syntax.CommonBehaviors.Communications.Reception();
	}
	public fUML.Syntax.Classes.Kernel.TypedElement create(org.modelexecution.fuml.Syntax.Classes.Kernel.TypedElement element) {
		return new fUML.Syntax.Classes.Kernel.TypedElement();
	}
	public fUML.Syntax.Classes.Kernel.ElementImport create(org.modelexecution.fuml.Syntax.Classes.Kernel.ElementImport element) {
		return new fUML.Syntax.Classes.Kernel.ElementImport();
	}
	public fUML.Syntax.Classes.Kernel.PackageImport create(org.modelexecution.fuml.Syntax.Classes.Kernel.PackageImport element) {
		return new fUML.Syntax.Classes.Kernel.PackageImport();
	}
	public fUML.Syntax.Classes.Kernel.Package create(org.modelexecution.fuml.Syntax.Classes.Kernel.Package element) {
		return new fUML.Syntax.Classes.Kernel.Package();
	}
	public fUML.Syntax.Classes.Kernel.Generalization create(org.modelexecution.fuml.Syntax.Classes.Kernel.Generalization element) {
		return new fUML.Syntax.Classes.Kernel.Generalization();
	}
	public fUML.Syntax.Classes.Kernel.Property create(org.modelexecution.fuml.Syntax.Classes.Kernel.Property element) {
		return new fUML.Syntax.Classes.Kernel.Property();
	}
	public fUML.Syntax.Classes.Kernel.Association create(org.modelexecution.fuml.Syntax.Classes.Kernel.Association element) {
		return new fUML.Syntax.Classes.Kernel.Association();
	}
	public fUML.Syntax.Classes.Kernel.DataType create(org.modelexecution.fuml.Syntax.Classes.Kernel.DataType element) {
		return new fUML.Syntax.Classes.Kernel.DataType();
	}
	public fUML.Syntax.Classes.Kernel.MultiplicityElement create(org.modelexecution.fuml.Syntax.Classes.Kernel.MultiplicityElement element) {
		return new fUML.Syntax.Classes.Kernel.MultiplicityElement();
	}
	public fUML.Syntax.Classes.Kernel.Parameter create(org.modelexecution.fuml.Syntax.Classes.Kernel.Parameter element) {
		return new fUML.Syntax.Classes.Kernel.Parameter();
	}
	public fUML.Syntax.Classes.Kernel.Operation create(org.modelexecution.fuml.Syntax.Classes.Kernel.Operation element) {
		return new fUML.Syntax.Classes.Kernel.Operation();
	}
	public fUML.Syntax.Classes.Kernel.InstanceSpecification create(org.modelexecution.fuml.Syntax.Classes.Kernel.InstanceSpecification element) {
		return new fUML.Syntax.Classes.Kernel.InstanceSpecification();
	}
	public fUML.Syntax.Classes.Kernel.Slot create(org.modelexecution.fuml.Syntax.Classes.Kernel.Slot element) {
		return new fUML.Syntax.Classes.Kernel.Slot();
	}
	public fUML.Syntax.Classes.Kernel.InstanceValue create(org.modelexecution.fuml.Syntax.Classes.Kernel.InstanceValue element) {
		return new fUML.Syntax.Classes.Kernel.InstanceValue();
	}
	public fUML.Syntax.Classes.Kernel.LiteralBoolean create(org.modelexecution.fuml.Syntax.Classes.Kernel.LiteralBoolean element) {
		return new fUML.Syntax.Classes.Kernel.LiteralBoolean();
	}
	public fUML.Syntax.Classes.Kernel.LiteralInteger create(org.modelexecution.fuml.Syntax.Classes.Kernel.LiteralInteger element) {
		return new fUML.Syntax.Classes.Kernel.LiteralInteger();
	}
	public fUML.Syntax.Classes.Kernel.LiteralNull create(org.modelexecution.fuml.Syntax.Classes.Kernel.LiteralNull element) {
		return new fUML.Syntax.Classes.Kernel.LiteralNull();
	}
	public fUML.Syntax.Classes.Kernel.LiteralString create(org.modelexecution.fuml.Syntax.Classes.Kernel.LiteralString element) {
		return new fUML.Syntax.Classes.Kernel.LiteralString();
	}
	public fUML.Syntax.Classes.Kernel.LiteralUnlimitedNatural create(org.modelexecution.fuml.Syntax.Classes.Kernel.LiteralUnlimitedNatural element) {
		return new fUML.Syntax.Classes.Kernel.LiteralUnlimitedNatural();
	}
	public fUML.Syntax.Classes.Kernel.PrimitiveType create(org.modelexecution.fuml.Syntax.Classes.Kernel.PrimitiveType element) {
		return new fUML.Syntax.Classes.Kernel.PrimitiveType();
	}
	public fUML.Syntax.Classes.Kernel.Enumeration create(org.modelexecution.fuml.Syntax.Classes.Kernel.Enumeration element) {
		return new fUML.Syntax.Classes.Kernel.Enumeration();
	}
	public fUML.Syntax.Classes.Kernel.EnumerationLiteral create(org.modelexecution.fuml.Syntax.Classes.Kernel.EnumerationLiteral element) {
		return new fUML.Syntax.Classes.Kernel.EnumerationLiteral();
	}
	public fUML.Syntax.Classes.Kernel.Class_ create(org.modelexecution.fuml.Syntax.Classes.Kernel.Class element) {
		return new fUML.Syntax.Classes.Kernel.Class_();
	}
	public fUML.Syntax.Activities.IntermediateActivities.ObjectFlow create(org.modelexecution.fuml.Syntax.Activities.IntermediateActivities.ObjectFlow element) {
		return new fUML.Syntax.Activities.IntermediateActivities.ObjectFlow();
	}
	public fUML.Syntax.Activities.IntermediateActivities.Activity create(org.modelexecution.fuml.Syntax.Activities.IntermediateActivities.Activity element) {
		return new fUML.Syntax.Activities.IntermediateActivities.Activity();
	}
	public fUML.Syntax.Activities.IntermediateActivities.MergeNode create(org.modelexecution.fuml.Syntax.Activities.IntermediateActivities.MergeNode element) {
		return new fUML.Syntax.Activities.IntermediateActivities.MergeNode();
	}
	public fUML.Syntax.Activities.IntermediateActivities.JoinNode create(org.modelexecution.fuml.Syntax.Activities.IntermediateActivities.JoinNode element) {
		return new fUML.Syntax.Activities.IntermediateActivities.JoinNode();
	}
	public fUML.Syntax.Activities.IntermediateActivities.InitialNode create(org.modelexecution.fuml.Syntax.Activities.IntermediateActivities.InitialNode element) {
		return new fUML.Syntax.Activities.IntermediateActivities.InitialNode();
	}
	public fUML.Syntax.Activities.IntermediateActivities.ForkNode create(org.modelexecution.fuml.Syntax.Activities.IntermediateActivities.ForkNode element) {
		return new fUML.Syntax.Activities.IntermediateActivities.ForkNode();
	}
	public fUML.Syntax.Activities.IntermediateActivities.ControlFlow create(org.modelexecution.fuml.Syntax.Activities.IntermediateActivities.ControlFlow element) {
		return new fUML.Syntax.Activities.IntermediateActivities.ControlFlow();
	}
	public fUML.Syntax.Activities.IntermediateActivities.DecisionNode create(org.modelexecution.fuml.Syntax.Activities.IntermediateActivities.DecisionNode element) {
		return new fUML.Syntax.Activities.IntermediateActivities.DecisionNode();
	}
	public fUML.Syntax.Activities.IntermediateActivities.ActivityFinalNode create(org.modelexecution.fuml.Syntax.Activities.IntermediateActivities.ActivityFinalNode element) {
		return new fUML.Syntax.Activities.IntermediateActivities.ActivityFinalNode();
	}
	public fUML.Syntax.Activities.IntermediateActivities.ActivityParameterNode create(org.modelexecution.fuml.Syntax.Activities.IntermediateActivities.ActivityParameterNode element) {
		return new fUML.Syntax.Activities.IntermediateActivities.ActivityParameterNode();
	}
	public fUML.Syntax.Activities.CompleteStructuredActivities.LoopNode create(org.modelexecution.fuml.Syntax.Activities.CompleteStructuredActivities.LoopNode element) {
		return new fUML.Syntax.Activities.CompleteStructuredActivities.LoopNode();
	}
	public fUML.Syntax.Activities.CompleteStructuredActivities.Clause create(org.modelexecution.fuml.Syntax.Activities.CompleteStructuredActivities.Clause element) {
		return new fUML.Syntax.Activities.CompleteStructuredActivities.Clause();
	}
	public fUML.Syntax.Activities.CompleteStructuredActivities.ConditionalNode create(org.modelexecution.fuml.Syntax.Activities.CompleteStructuredActivities.ConditionalNode element) {
		return new fUML.Syntax.Activities.CompleteStructuredActivities.ConditionalNode();
	}
	public fUML.Syntax.Activities.CompleteStructuredActivities.StructuredActivityNode create(org.modelexecution.fuml.Syntax.Activities.CompleteStructuredActivities.StructuredActivityNode element) {
		return new fUML.Syntax.Activities.CompleteStructuredActivities.StructuredActivityNode();
	}
	public fUML.Syntax.Activities.ExtraStructuredActivities.ExpansionNode create(org.modelexecution.fuml.Syntax.Activities.ExtraStructuredActivities.ExpansionNode element) {
		return new fUML.Syntax.Activities.ExtraStructuredActivities.ExpansionNode();
	}
	public fUML.Syntax.Activities.ExtraStructuredActivities.ExpansionRegion create(org.modelexecution.fuml.Syntax.Activities.ExtraStructuredActivities.ExpansionRegion element) {
		return new fUML.Syntax.Activities.ExtraStructuredActivities.ExpansionRegion();
	}
	public fUML.Syntax.Actions.IntermediateActions.TestIdentityAction create(org.modelexecution.fuml.Syntax.Actions.IntermediateActions.TestIdentityAction element) {
		return new fUML.Syntax.Actions.IntermediateActions.TestIdentityAction();
	}
	public fUML.Syntax.Actions.IntermediateActions.ValueSpecificationAction create(org.modelexecution.fuml.Syntax.Actions.IntermediateActions.ValueSpecificationAction element) {
		return new fUML.Syntax.Actions.IntermediateActions.ValueSpecificationAction();
	}
	public fUML.Syntax.Actions.IntermediateActions.LinkEndData create(org.modelexecution.fuml.Syntax.Actions.IntermediateActions.LinkEndData element) {
		return new fUML.Syntax.Actions.IntermediateActions.LinkEndData();
	}
	public fUML.Syntax.Actions.IntermediateActions.RemoveStructuralFeatureValueAction create(org.modelexecution.fuml.Syntax.Actions.IntermediateActions.RemoveStructuralFeatureValueAction element) {
		return new fUML.Syntax.Actions.IntermediateActions.RemoveStructuralFeatureValueAction();
	}
	public fUML.Syntax.Actions.IntermediateActions.ReadLinkAction create(org.modelexecution.fuml.Syntax.Actions.IntermediateActions.ReadLinkAction element) {
		return new fUML.Syntax.Actions.IntermediateActions.ReadLinkAction();
	}
	public fUML.Syntax.Actions.IntermediateActions.ReadSelfAction create(org.modelexecution.fuml.Syntax.Actions.IntermediateActions.ReadSelfAction element) {
		return new fUML.Syntax.Actions.IntermediateActions.ReadSelfAction();
	}
	public fUML.Syntax.Actions.IntermediateActions.ReadStructuralFeatureAction create(org.modelexecution.fuml.Syntax.Actions.IntermediateActions.ReadStructuralFeatureAction element) {
		return new fUML.Syntax.Actions.IntermediateActions.ReadStructuralFeatureAction();
	}
	public fUML.Syntax.Actions.IntermediateActions.LinkEndCreationData create(org.modelexecution.fuml.Syntax.Actions.IntermediateActions.LinkEndCreationData element) {
		return new fUML.Syntax.Actions.IntermediateActions.LinkEndCreationData();
	}
	public fUML.Syntax.Actions.IntermediateActions.LinkEndDestructionData create(org.modelexecution.fuml.Syntax.Actions.IntermediateActions.LinkEndDestructionData element) {
		return new fUML.Syntax.Actions.IntermediateActions.LinkEndDestructionData();
	}
	public fUML.Syntax.Actions.IntermediateActions.ClearAssociationAction create(org.modelexecution.fuml.Syntax.Actions.IntermediateActions.ClearAssociationAction element) {
		return new fUML.Syntax.Actions.IntermediateActions.ClearAssociationAction();
	}
	public fUML.Syntax.Actions.IntermediateActions.ClearStructuralFeatureAction create(org.modelexecution.fuml.Syntax.Actions.IntermediateActions.ClearStructuralFeatureAction element) {
		return new fUML.Syntax.Actions.IntermediateActions.ClearStructuralFeatureAction();
	}
	public fUML.Syntax.Actions.IntermediateActions.CreateLinkAction create(org.modelexecution.fuml.Syntax.Actions.IntermediateActions.CreateLinkAction element) {
		return new fUML.Syntax.Actions.IntermediateActions.CreateLinkAction();
	}
	public fUML.Syntax.Actions.IntermediateActions.CreateObjectAction create(org.modelexecution.fuml.Syntax.Actions.IntermediateActions.CreateObjectAction element) {
		return new fUML.Syntax.Actions.IntermediateActions.CreateObjectAction();
	}
	public fUML.Syntax.Actions.IntermediateActions.DestroyLinkAction create(org.modelexecution.fuml.Syntax.Actions.IntermediateActions.DestroyLinkAction element) {
		return new fUML.Syntax.Actions.IntermediateActions.DestroyLinkAction();
	}
	public fUML.Syntax.Actions.IntermediateActions.DestroyObjectAction create(org.modelexecution.fuml.Syntax.Actions.IntermediateActions.DestroyObjectAction element) {
		return new fUML.Syntax.Actions.IntermediateActions.DestroyObjectAction();
	}
	public fUML.Syntax.Actions.IntermediateActions.AddStructuralFeatureValueAction create(org.modelexecution.fuml.Syntax.Actions.IntermediateActions.AddStructuralFeatureValueAction element) {
		return new fUML.Syntax.Actions.IntermediateActions.AddStructuralFeatureValueAction();
	}
	public fUML.Syntax.Actions.CompleteActions.StartClassifierBehaviorAction create(org.modelexecution.fuml.Syntax.Actions.CompleteActions.StartClassifierBehaviorAction element) {
		return new fUML.Syntax.Actions.CompleteActions.StartClassifierBehaviorAction();
	}
	public fUML.Syntax.Actions.CompleteActions.StartObjectBehaviorAction create(org.modelexecution.fuml.Syntax.Actions.CompleteActions.StartObjectBehaviorAction element) {
		return new fUML.Syntax.Actions.CompleteActions.StartObjectBehaviorAction();
	}
	public fUML.Syntax.Actions.CompleteActions.ReduceAction create(org.modelexecution.fuml.Syntax.Actions.CompleteActions.ReduceAction element) {
		return new fUML.Syntax.Actions.CompleteActions.ReduceAction();
	}
	public fUML.Syntax.Actions.CompleteActions.ReadExtentAction create(org.modelexecution.fuml.Syntax.Actions.CompleteActions.ReadExtentAction element) {
		return new fUML.Syntax.Actions.CompleteActions.ReadExtentAction();
	}
	public fUML.Syntax.Actions.CompleteActions.ReadIsClassifiedObjectAction create(org.modelexecution.fuml.Syntax.Actions.CompleteActions.ReadIsClassifiedObjectAction element) {
		return new fUML.Syntax.Actions.CompleteActions.ReadIsClassifiedObjectAction();
	}
	public fUML.Syntax.Actions.CompleteActions.ReclassifyObjectAction create(org.modelexecution.fuml.Syntax.Actions.CompleteActions.ReclassifyObjectAction element) {
		return new fUML.Syntax.Actions.CompleteActions.ReclassifyObjectAction();
	}
	public fUML.Syntax.Actions.CompleteActions.AcceptEventAction create(org.modelexecution.fuml.Syntax.Actions.CompleteActions.AcceptEventAction element) {
		return new fUML.Syntax.Actions.CompleteActions.AcceptEventAction();
	}
	public fUML.Syntax.Actions.BasicActions.InputPin create(org.modelexecution.fuml.Syntax.Actions.BasicActions.InputPin element) {
		return new fUML.Syntax.Actions.BasicActions.InputPin();
	}
	public fUML.Syntax.Actions.BasicActions.SendSignalAction create(org.modelexecution.fuml.Syntax.Actions.BasicActions.SendSignalAction element) {
		return new fUML.Syntax.Actions.BasicActions.SendSignalAction();
	}
	public fUML.Syntax.Actions.BasicActions.CallBehaviorAction create(org.modelexecution.fuml.Syntax.Actions.BasicActions.CallBehaviorAction element) {
		return new fUML.Syntax.Actions.BasicActions.CallBehaviorAction();
	}
	public fUML.Syntax.Actions.BasicActions.CallOperationAction create(org.modelexecution.fuml.Syntax.Actions.BasicActions.CallOperationAction element) {
		return new fUML.Syntax.Actions.BasicActions.CallOperationAction();
	}
	public fUML.Syntax.Actions.BasicActions.OutputPin create(org.modelexecution.fuml.Syntax.Actions.BasicActions.OutputPin element) {
		return new fUML.Syntax.Actions.BasicActions.OutputPin();
	}
	
}			
