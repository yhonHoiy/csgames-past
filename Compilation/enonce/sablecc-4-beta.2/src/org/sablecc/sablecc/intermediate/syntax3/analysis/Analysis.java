/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.sablecc.sablecc.intermediate.syntax3.analysis;

import org.sablecc.sablecc.intermediate.syntax3.node.*;

public interface Analysis extends Switch
{
    Object getIn(Node node);
    void setIn(Node node, Object o);
    Object getOut(Node node);
    void setOut(Node node, Object o);

    void caseStart(Start node);
    void caseAIntermediateRepresentation(AIntermediateRepresentation node);
    void caseALanguage(ALanguage node);
    void caseALexer(ALexer node);
    void caseAGroup(AGroup node);
    void caseANormalToken(ANormalToken node);
    void caseASelectionToken(ASelectionToken node);
    void caseATokenSelector(ATokenSelector node);
    void caseATokenInvestigator(ATokenInvestigator node);
    void caseAContext(AContext node);
    void caseAAlphabet(AAlphabet node);
    void caseASymbol(ASymbol node);
    void caseAInterval(AInterval node);
    void caseALexerAutomaton(ALexerAutomaton node);
    void caseAProgressLexerState(AProgressLexerState node);
    void caseATokenLexerState(ATokenLexerState node);
    void caseALexerTransition(ALexerTransition node);
    void caseAAcceptLexerAction(AAcceptLexerAction node);
    void caseAIgnoreLexerAction(AIgnoreLexerAction node);
    void caseARejectLexerAction(ARejectLexerAction node);
    void caseAParseLexerAction(AParseLexerAction node);
    void caseATrueBoolean(ATrueBoolean node);
    void caseAFalseBoolean(AFalseBoolean node);
    void caseAParser(AParser node);
    void caseAProduction(AProduction node);
    void caseAAlternative(AAlternative node);
    void caseAElement(AElement node);
    void caseASingleElementType(ASingleElementType node);
    void caseAListElementType(AListElementType node);
    void caseAOneSingleType(AOneSingleType node);
    void caseAZeroOrOneSingleType(AZeroOrOneSingleType node);
    void caseANumberListType(ANumberListType node);
    void caseAIntervalListType(AIntervalListType node);
    void caseAAtLeastListType(AAtLeastListType node);
    void caseASeparatedNumberListType(ASeparatedNumberListType node);
    void caseASeparatedIntervalListType(ASeparatedIntervalListType node);
    void caseASeparatedAtLeastListType(ASeparatedAtLeastListType node);
    void caseAParseProduction(AParseProduction node);
    void caseARetainedElement(ARetainedElement node);
    void caseAParseAlternative(AParseAlternative node);
    void caseAParseElement(AParseElement node);
    void caseATransformation(ATransformation node);
    void caseANullValue(ANullValue node);
    void caseAReferenceValue(AReferenceValue node);
    void caseANewValue(ANewValue node);
    void caseANumberValue(ANumberValue node);
    void caseAIntervalValue(AIntervalValue node);
    void caseAAtLeastValue(AAtLeastValue node);
    void caseASeparatedNumberValue(ASeparatedNumberValue node);
    void caseASeparatedIntervalValue(ASeparatedIntervalValue node);
    void caseASeparatedAtLeastValue(ASeparatedAtLeastValue node);
    void caseAReferenceListValue(AReferenceListValue node);
    void caseAListReferenceListValue(AListReferenceListValue node);
    void caseANewListValue(ANewListValue node);
    void caseAStart(AStart node);
    void caseAParserAutomaton(AParserAutomaton node);
    void caseAParserState(AParserState node);
    void caseAParserInvestigator(AParserInvestigator node);
    void caseANoLookDecision(ANoLookDecision node);
    void caseALookDecision(ALookDecision node);
    void caseADepth(ADepth node);
    void caseAChoice(AChoice node);
    void caseACondition(ACondition node);
    void caseALookSymbol(ALookSymbol node);
    void caseAShiftAction(AShiftAction node);
    void caseAReduceAction(AReduceAction node);
    void caseASelectionAction(ASelectionAction node);
    void caseATreeAction(ATreeAction node);
    void caseATokenAction(ATokenAction node);
    void caseAExpectedSelection(AExpectedSelection node);
    void caseAParserSelector(AParserSelector node);
    void caseATokenParserTransition(ATokenParserTransition node);
    void caseAProductionParserTransition(AProductionParserTransition node);

    void caseTAcceptKeyword(TAcceptKeyword node);
    void caseTAlphabetKeyword(TAlphabetKeyword node);
    void caseTAlternativeKeyword(TAlternativeKeyword node);
    void caseTArgumentNameKeyword(TArgumentNameKeyword node);
    void caseTAtLeastTypeKeyword(TAtLeastTypeKeyword node);
    void caseTAtLeastValueKeyword(TAtLeastValueKeyword node);
    void caseTBackCountKeyword(TBackCountKeyword node);
    void caseTChoiceKeyword(TChoiceKeyword node);
    void caseTConditionKeyword(TConditionKeyword node);
    void caseTContextNameKeyword(TContextNameKeyword node);
    void caseTDepthKeyword(TDepthKeyword node);
    void caseTElementKeyword(TElementKeyword node);
    void caseTEndExpectedKeyword(TEndExpectedKeyword node);
    void caseTExpectedSelectionKeyword(TExpectedSelectionKeyword node);
    void caseTFalseKeyword(TFalseKeyword node);
    void caseTFromKeyword(TFromKeyword node);
    void caseTGroupKeyword(TGroupKeyword node);
    void caseTGroupsKeyword(TGroupsKeyword node);
    void caseTIgnoreKeyword(TIgnoreKeyword node);
    void caseTIntervalKeyword(TIntervalKeyword node);
    void caseTIntervalTypeKeyword(TIntervalTypeKeyword node);
    void caseTIntervalValueKeyword(TIntervalValueKeyword node);
    void caseTInvestigatorNameKeyword(TInvestigatorNameKeyword node);
    void caseTInvestigatorsKeyword(TInvestigatorsKeyword node);
    void caseTLanguageKeyword(TLanguageKeyword node);
    void caseTLexerKeyword(TLexerKeyword node);
    void caseTLexerAutomatonKeyword(TLexerAutomatonKeyword node);
    void caseTLexerStateKeyword(TLexerStateKeyword node);
    void caseTLexerTransitionKeyword(TLexerTransitionKeyword node);
    void caseTListReferenceValueKeyword(TListReferenceValueKeyword node);
    void caseTLookDepthKeyword(TLookDepthKeyword node);
    void caseTLookSymbolKeyword(TLookSymbolKeyword node);
    void caseTMarkerKeyword(TMarkerKeyword node);
    void caseTNameKeyword(TNameKeyword node);
    void caseTNewValueKeyword(TNewValueKeyword node);
    void caseTNullValueKeyword(TNullValueKeyword node);
    void caseTNumberTypeKeyword(TNumberTypeKeyword node);
    void caseTNumberValueKeyword(TNumberValueKeyword node);
    void caseTOneKeyword(TOneKeyword node);
    void caseTParseKeyword(TParseKeyword node);
    void caseTParseAlternativeKeyword(TParseAlternativeKeyword node);
    void caseTParseAlternativeNameKeyword(TParseAlternativeNameKeyword node);
    void caseTParseElementKeyword(TParseElementKeyword node);
    void caseTParseElementNameKeyword(TParseElementNameKeyword node);
    void caseTParseProductionKeyword(TParseProductionKeyword node);
    void caseTParseProductionNameKeyword(TParseProductionNameKeyword node);
    void caseTParserKeyword(TParserKeyword node);
    void caseTParserInvestigatorKeyword(TParserInvestigatorKeyword node);
    void caseTParserSelectorKeyword(TParserSelectorKeyword node);
    void caseTParserStateKeyword(TParserStateKeyword node);
    void caseTProductionKeyword(TProductionKeyword node);
    void caseTProductionTransitionKeyword(TProductionTransitionKeyword node);
    void caseTPublicKeyword(TPublicKeyword node);
    void caseTReduceActionKeyword(TReduceActionKeyword node);
    void caseTReferenceValueKeyword(TReferenceValueKeyword node);
    void caseTRejectKeyword(TRejectKeyword node);
    void caseTRetainedElementKeyword(TRetainedElementKeyword node);
    void caseTRetainedElementNameKeyword(TRetainedElementNameKeyword node);
    void caseTShiftActionKeyword(TShiftActionKeyword node);
    void caseTStartNameKeyword(TStartNameKeyword node);
    void caseTSelectionActionKeyword(TSelectionActionKeyword node);
    void caseTSelectorNameKeyword(TSelectorNameKeyword node);
    void caseTSeparatorKeyword(TSeparatorKeyword node);
    void caseTStartKeyword(TStartKeyword node);
    void caseTSymbolKeyword(TSymbolKeyword node);
    void caseTSymbolNameKeyword(TSymbolNameKeyword node);
    void caseTTargetNameKeyword(TTargetNameKeyword node);
    void caseTToKeyword(TToKeyword node);
    void caseTTokenKeyword(TTokenKeyword node);
    void caseTTokenActionKeyword(TTokenActionKeyword node);
    void caseTTokenNameKeyword(TTokenNameKeyword node);
    void caseTTokenTransitionKeyword(TTokenTransitionKeyword node);
    void caseTTokensKeyword(TTokensKeyword node);
    void caseTTransformationKeyword(TTransformationKeyword node);
    void caseTTreeActionKeyword(TTreeActionKeyword node);
    void caseTTrueKeyword(TTrueKeyword node);
    void caseTZeroOrOneKeyword(TZeroOrOneKeyword node);
    void caseTAssign(TAssign node);
    void caseTSemicolon(TSemicolon node);
    void caseTLBrace(TLBrace node);
    void caseTRBrace(TRBrace node);
    void caseTString(TString node);
    void caseTNumber(TNumber node);
    void caseTBlank(TBlank node);
    void caseTInvalidCharacter(TInvalidCharacter node);
    void caseEOF(EOF node);
}
