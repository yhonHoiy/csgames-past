/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.sablecc.sablecc.syntax3.node;

import org.sablecc.sablecc.syntax3.analysis.*;

@SuppressWarnings("nls")
public final class AZeroOrMoreManyOperator extends PManyOperator
{
    private TStar _star_;

    public AZeroOrMoreManyOperator()
    {
        // Constructor
    }

    public AZeroOrMoreManyOperator(
        @SuppressWarnings("hiding") TStar _star_)
    {
        // Constructor
        setStar(_star_);

    }

    @Override
    public Object clone()
    {
        return new AZeroOrMoreManyOperator(
            cloneNode(this._star_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAZeroOrMoreManyOperator(this);
    }

    public TStar getStar()
    {
        return this._star_;
    }

    public void setStar(TStar node)
    {
        if(this._star_ != null)
        {
            this._star_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._star_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._star_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._star_ == child)
        {
            this._star_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._star_ == oldChild)
        {
            setStar((TStar) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
