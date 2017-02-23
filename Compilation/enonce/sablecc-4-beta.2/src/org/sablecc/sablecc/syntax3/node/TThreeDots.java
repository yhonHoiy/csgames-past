/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.sablecc.sablecc.syntax3.node;

import org.sablecc.sablecc.syntax3.analysis.*;

@SuppressWarnings("nls")
public final class TThreeDots extends Token
{
    public TThreeDots()
    {
        super.setText("...");
    }

    public TThreeDots(int line, int pos)
    {
        super.setText("...");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TThreeDots(getLine(), getPos());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTThreeDots(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TThreeDots text.");
    }
}
