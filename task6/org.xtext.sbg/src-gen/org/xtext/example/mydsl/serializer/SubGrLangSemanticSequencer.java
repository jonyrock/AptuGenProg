package org.xtext.example.mydsl.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.xtext.example.mydsl.services.SubGrLangGrammarAccess;
import org.xtext.example.mydsl.subGrLang.FollowRecord;
import org.xtext.example.mydsl.subGrLang.Model;
import org.xtext.example.mydsl.subGrLang.Person;
import org.xtext.example.mydsl.subGrLang.SubGrLangPackage;

@SuppressWarnings("all")
public class SubGrLangSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private SubGrLangGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == SubGrLangPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case SubGrLangPackage.FOLLOW_RECORD:
				if(context == grammarAccess.getFollowRecordRule()) {
					sequence_FollowRecord(context, (FollowRecord) semanticObject); 
					return; 
				}
				else break;
			case SubGrLangPackage.MODEL:
				if(context == grammarAccess.getModelRule()) {
					sequence_Model(context, (Model) semanticObject); 
					return; 
				}
				else break;
			case SubGrLangPackage.PERSON:
				if(context == grammarAccess.getPersonRule()) {
					sequence_Person(context, (Person) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     person=[Person|ID]
	 */
	protected void sequence_FollowRecord(EObject context, FollowRecord semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SubGrLangPackage.Literals.FOLLOW_RECORD__PERSON) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SubGrLangPackage.Literals.FOLLOW_RECORD__PERSON));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getFollowRecordAccess().getPersonPersonIDTerminalRuleCall_1_0_1(), semanticObject.getPerson());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     persons+=Person*
	 */
	protected void sequence_Model(EObject context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID following+=FollowRecord*)
	 */
	protected void sequence_Person(EObject context, Person semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
