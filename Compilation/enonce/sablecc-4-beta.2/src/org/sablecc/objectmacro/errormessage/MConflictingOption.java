/* This file was generated by SableCC's ObjectMacro. */

package org.sablecc.objectmacro.errormessage;

public class MConflictingOption {

    private final String pName;

    private final String pLine;

    private final String pChar;

    private final String pRefName;

    private final String pRefLine;

    private final String pRefChar;

    private final MConflictingOption mConflictingOption = this;

    public MConflictingOption(
            String pName,
            String pLine,
            String pChar,
            String pRefName,
            String pRefLine,
            String pRefChar) {

        if (pName == null) {
            throw new NullPointerException();
        }
        this.pName = pName;
        if (pLine == null) {
            throw new NullPointerException();
        }
        this.pLine = pLine;
        if (pChar == null) {
            throw new NullPointerException();
        }
        this.pChar = pChar;
        if (pRefName == null) {
            throw new NullPointerException();
        }
        this.pRefName = pRefName;
        if (pRefLine == null) {
            throw new NullPointerException();
        }
        this.pRefLine = pRefLine;
        if (pRefChar == null) {
            throw new NullPointerException();
        }
        this.pRefChar = pRefChar;
    }

    String pName() {

        return this.pName;
    }

    String pLine() {

        return this.pLine;
    }

    String pChar() {

        return this.pChar;
    }

    String pRefName() {

        return this.pRefName;
    }

    String pRefLine() {

        return this.pRefLine;
    }

    String pRefChar() {

        return this.pRefChar;
    }

    private String rLine() {

        return this.mConflictingOption.pLine();
    }

    private String rChar() {

        return this.mConflictingOption.pChar();
    }

    private String rName() {

        return this.mConflictingOption.pName();
    }

    private String rRefName() {

        return this.mConflictingOption.pRefName();
    }

    private String rRefLine() {

        return this.mConflictingOption.pRefLine();
    }

    private String rRefChar() {

        return this.mConflictingOption.pRefChar();
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
        sb.append("Option \"");
        sb.append(rName());
        sb.append("\" conflicts with \"");
        sb.append(rRefName());
        sb.append("\" option at line ");
        sb.append(rRefLine());
        sb.append(", char ");
        sb.append(rRefChar());
        sb.append(".");
        sb.append(System.getProperty("line.separator"));
        return sb.toString();
    }

}
