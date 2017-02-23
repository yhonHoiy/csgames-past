/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.sablecc.sablecc.intermediate.syntax3.node;

import org.sablecc.sablecc.intermediate.syntax3.analysis.*;

@SuppressWarnings("nls")
public final class TTargetNameKeyword extends Token
{
    public TTargetNameKeyword()
    {
        super.setText("target_name");
    }

    public TTargetNameKeyword(int line, int pos)
    {
        super.setText("target_name");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TTargetNameKeyword(getLine(), getPos());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTTargetNameKeyword(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TTargetNameKeyword text.");
    }
}
