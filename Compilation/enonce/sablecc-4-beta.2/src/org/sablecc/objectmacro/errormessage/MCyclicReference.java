/* This file was generated by SableCC's ObjectMacro. */

package org.sablecc.objectmacro.errormessage;

public class MCyclicReference {

    private final String pReference;

    private final String pLine;

    private final String pChar;

    private final String pContext;

    private final String pContextLine;

    private final String pContextChar;

    private final MCyclicReference mCyclicReference = this;

    public MCyclicReference(
            String pReference,
            String pLine,
            String pChar,
            String pContext,
            String pContextLine,
            String pContextChar) {

        if (pReference == null) {
            throw new NullPointerException();
        }
        this.pReference = pReference;
        if (pLine == null) {
            throw new NullPointerException();
        }
        this.pLine = pLine;
        if (pChar == null) {
            throw new NullPointerException();
        }
        this.pChar = pChar;
        if (pContext == null) {
            throw new NullPointerException();
        }
        this.pContext = pContext;
        if (pContextLine == null) {
            throw new NullPointerException();
        }
        this.pContextLine = pContextLine;
        if (pContextChar == null) {
            throw new NullPointerException();
        }
        this.pContextChar = pContextChar;
    }

    String pReference() {

        return this.pReference;
    }

    String pLine() {

        return this.pLine;
    }

    String pChar() {

        return this.pChar;
    }

    String pContext() {

        return this.pContext;
    }

    String pContextLine() {

        return this.pContextLine;
    }

    String pContextChar() {

        return this.pContextChar;
    }

    private String rLine() {

        return this.mCyclicReference.pLine();
    }

    private String rChar() {

        return this.mCyclicReference.pChar();
    }

    private String rReference() {

        return this.mCyclicReference.pReference();
    }

    private String rContext() {

        return this.mCyclicReference.pContext();
    }

    private String rContextLine() {

        return this.mCyclicReference.pContextLine();
    }

    private String rContextChar() {

        return this.mCyclicReference.pContextChar();
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append(new MSemanticErrorHead().toString());
        sb.append(System.getProperty("line.separator"));
        sb.append("Line: ");
        sb.append(rLine());
        sb.append(System.getProperty("line.separator"));
        sb.append("Char: ");
        sb.append(rChar());
        sb.append(System.getProperty("line.separator"));
        sb.append("\"");
        sb.append(rReference());
        sb.append("\" is a cyclic reference to text block \"");
        sb.append(rContext());
        sb.append("\" of line ");
        sb.append(rContextLine());
        sb.append(", char ");
        sb.append(rContextChar());
        sb.append(".");
        sb.append(System.getProperty("line.separator"));
        return sb.toString();
    }

}
