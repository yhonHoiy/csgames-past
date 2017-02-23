/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.sablecc.objectmacro.launcher.syntax3.node;

import org.sablecc.objectmacro.launcher.syntax3.analysis.*;

@SuppressWarnings("nls")
public final class ALongOption extends PLongOption
{
    private TLongName _longName_;
    private POperand _operand_;

    public ALongOption()
    {
        // Constructor
    }

    public ALongOption(
        @SuppressWarnings("hiding") TLongName _longName_,
        @SuppressWarnings("hiding") POperand _operand_)
    {
        // Constructor
        setLongName(_longName_);

        setOperand(_operand_);

    }

    @Override
    public Object clone()
    {
        return new ALongOption(
            cloneNode(this._longName_),
            cloneNode(this._operand_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseALongOption(this);
    }

    public TLongName getLongName()
    {
        return this._longName_;
    }

    public void setLongName(TLongName node)
    {
        if(this._longName_ != null)
        {
            this._longName_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._longName_ = node;
    }

    public POperand getOperand()
    {
        return this._operand_;
    }

    public void setOperand(POperand node)
    {
        if(this._operand_ != null)
        {
            this._operand_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._operand_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._longName_)
            + toString(this._operand_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._longName_ == child)
        {
            this._longName_ = null;
            return;
        }

        if(this._operand_ == child)
        {
            this._operand_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._longName_ == oldChild)
        {
            setLongName((TLongName) newChild);
            return;
        }

        if(this._operand_ == oldChild)
        {
            setOperand((POperand) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
