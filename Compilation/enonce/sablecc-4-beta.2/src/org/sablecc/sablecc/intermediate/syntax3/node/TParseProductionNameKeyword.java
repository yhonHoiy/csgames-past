/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.sablecc.sablecc.intermediate.syntax3.node;

import org.sablecc.sablecc.intermediate.syntax3.analysis.*;

@SuppressWarnings("nls")
public final class TParseProductionNameKeyword extends Token
{
    public TParseProductionNameKeyword()
    {
        super.setText("parse_production_name");
    }

    public TParseProductionNameKeyword(int line, int pos)
    {
        super.setText("parse_production_name");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TParseProductionNameKeyword(getLine(), getPos());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTParseProductionNameKeyword(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TParseProductionNameKeyword text.");
    }
}