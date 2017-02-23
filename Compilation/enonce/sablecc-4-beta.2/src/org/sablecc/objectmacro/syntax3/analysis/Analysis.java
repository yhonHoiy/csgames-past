/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.sablecc.objectmacro.syntax3.analysis;

import org.sablecc.objectmacro.syntax3.node.*;

public interface Analysis extends Switch
{
    Object getIn(Node node);
    void setIn(Node node, Object o);
    Object getOut(Node node);
    void setOut(Node node, Object o);

    void caseStart(Start node);
    void caseASourceFile(ASourceFile node);
    void caseAMacroSourceFilePart(AMacroSourceFilePart node);
    void caseATextBlockSourceFilePart(ATextBlockSourceFilePart node);
    void caseAMacro(AMacro node);
    void caseATextMacroBodyPart(ATextMacroBodyPart node);
    void caseAEolMacroBodyPart(AEolMacroBodyPart node);
    void caseAEscapeMacroBodyPart(AEscapeMacroBodyPart node);
    void caseAVarMacroBodyPart(AVarMacroBodyPart node);
    void caseAExpandMacroBodyPart(AExpandMacroBodyPart node);
    void caseAMacroMacroBodyPart(AMacroMacroBodyPart node);
    void caseATextInsertMacroBodyPart(ATextInsertMacroBodyPart node);
    void caseATextBlockMacroBodyPart(ATextBlockMacroBodyPart node);
    void caseATextBlock(ATextBlock node);
    void caseATextTextBlockBodyPart(ATextTextBlockBodyPart node);
    void caseAEolTextBlockBodyPart(AEolTextBlockBodyPart node);
    void caseAEscapeTextBlockBodyPart(AEscapeTextBlockBodyPart node);
    void caseAVarTextBlockBodyPart(AVarTextBlockBodyPart node);
    void caseATextInsertTextBlockBodyPart(ATextInsertTextBlockBodyPart node);
    void caseATextBlockTextBlockBodyPart(ATextBlockTextBlockBodyPart node);
    void caseAParam(AParam node);
    void caseAExpand(AExpand node);
    void caseAOption(AOption node);
    void caseATextInsertStaticValue(ATextInsertStaticValue node);
    void caseAVarStaticValue(AVarStaticValue node);
    void caseAStringStaticValue(AStringStaticValue node);
    void caseAString(AString node);
    void caseATextStringPart(ATextStringPart node);
    void caseAEscapeStringPart(AEscapeStringPart node);
    void caseAMacroReference(AMacroReference node);
    void caseATextInsert(ATextInsert node);

    void caseTMacroCommand(TMacroCommand node);
    void caseTTextBlockCommand(TTextBlockCommand node);
    void caseTExpandCommand(TExpandCommand node);
    void caseTInsertCommand(TInsertCommand node);
    void caseTEndCommand(TEndCommand node);
    void caseTShortCommentCommand(TShortCommentCommand node);
    void caseTCommandTail(TCommandTail node);
    void caseTLongCommentStart(TLongCommentStart node);
    void caseTLongCommentEnd(TLongCommentEnd node);
    void caseTNoEol(TNoEol node);
    void caseTInvalidMidLineNoEol(TInvalidMidLineNoEol node);
    void caseTInvalidCommand(TInvalidCommand node);
    void caseTShortCommentText(TShortCommentText node);
    void caseTLongCommentText(TLongCommentText node);
    void caseTText(TText node);
    void caseTEol(TEol node);
    void caseTEscape(TEscape node);
    void caseTVar(TVar node);
    void caseTInvalidVar(TInvalidVar node);
    void caseTIdentifier(TIdentifier node);
    void caseTInvalidIdentifier(TInvalidIdentifier node);
    void caseTLPar(TLPar node);
    void caseTRPar(TRPar node);
    void caseTComma(TComma node);
    void caseTAssign(TAssign node);
    void caseTBlank(TBlank node);
    void caseTDquote(TDquote node);
    void caseTStringText(TStringText node);
    void caseTStringEscape(TStringEscape node);
    void caseTCtrlZ(TCtrlZ node);
    void caseTInvalidCharacter(TInvalidCharacter node);
    void caseEOF(EOF node);
}