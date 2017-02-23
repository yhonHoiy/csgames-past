/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.sablecc.sablecc.syntax3.node;

import org.sablecc.sablecc.syntax3.analysis.*;

@SuppressWarnings("nls")
public final class ALexerPriority extends PLexerPriority
{
    private PUnit _high_;
    private TGt _gt_;
    private PUnit _low_;

    public ALexerPriority()
    {
        // Constructor
    }

    public ALexerPriority(
        @SuppressWarnings("hiding") PUnit _high_,
        @SuppressWarnings("hiding") TGt _gt_,
        @SuppressWarnings("hiding") PUnit _low_)
    {
        // Constructor
        setHigh(_high_);

        setGt(_gt_);

        setLow(_low_);

    }

    @Override
    public Object clone()
    {
        return new ALexerPriority(
            cloneNode(this._high_),
            cloneNode(this._gt_),
            cloneNode(this._low_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseALexerPriority(this);
    }

    public PUnit getHigh()
    {
        return this._high_;
    }

    public void setHigh(PUnit node)
    {
        if(this._high_ != null)
        {
            this._high_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._high_ = node;
    }

    public TGt getGt()
    {
        return this._gt_;
    }

    public void setGt(TGt node)
    {
        if(this._gt_ != null)
        {
            this._gt_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._gt_ = node;
    }

    public PUnit getLow()
    {
        return this._low_;
    }

    public void setLow(PUnit node)
    {
        if(this._low_ != null)
        {
            this._low_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._low_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._high_)
            + toString(this._gt_)
            + toString(this._low_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._high_ == child)
        {
            this._high_ = null;
            return;
        }

        if(this._gt_ == child)
        {
            this._gt_ = null;
            return;
        }

        if(this._low_ == child)
        {
            this._low_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._high_ == oldChild)
        {
            setHigh((PUnit) newChild);
            return;
        }

        if(this._gt_ == oldChild)
        {
            setGt((TGt) newChild);
            return;
        }

        if(this._low_ == oldChild)
        {
            setLow((PUnit) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
