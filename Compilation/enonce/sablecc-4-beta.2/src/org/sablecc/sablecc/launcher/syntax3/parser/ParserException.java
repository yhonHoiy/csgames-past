/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.sablecc.sablecc.launcher.syntax3.parser;

import org.sablecc.sablecc.launcher.syntax3.node.*;

@SuppressWarnings("serial")
public class ParserException extends Exception
{
    Token token;

    public ParserException(@SuppressWarnings("hiding") Token token, String  message)
    {
        super(message);
        this.token = token;
    }

    public Token getToken()
    {
        return this.token;
    }
}