/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.sablecc.sablecc.intermediate.syntax3.node;

import org.sablecc.sablecc.intermediate.syntax3.analysis.*;

@SuppressWarnings("nls")
public final class AReferenceValue extends PValue
{
    private TString _parseElement_;
    private TString _retainedElement_;

    public AReferenceValue()
    {
        // Constructor
    }

    public AReferenceValue(
        @SuppressWarnings("hiding") TString _parseElement_,
        @SuppressWarnings("hiding") TString _retainedElement_)
    {
        // Constructor
        setParseElement(_parseElement_);

        setRetainedElement(_retainedElement_);

    }

    @Override
    public Object clone()
    {
        return new AReferenceValue(
            cloneNode(this._parseElement_),
            cloneNode(this._retainedElement_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAReferenceValue(this);
    }

    public TString getParseElement()
    {
        return this._parseElement_;
    }

    public void setParseElement(TString node)
    {
        if(this._parseElement_ != null)
        {
            this._parseElement_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._parseElement_ = node;
    }

    public TString getRetainedElement()
    {
        return this._retainedElement_;
    }

    public void setRetainedElement(TString node)
    {
        if(this._retainedElement_ != null)
        {
            this._retainedElement_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._retainedElement_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._parseElement_)
            + toString(this._retainedElement_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._parseElement_ == child)
        {
            this._parseElement_ = null;
            return;
        }

        if(this._retainedElement_ == child)
        {
            this._retainedElement_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._parseElement_ == oldChild)
        {
            setParseElement((TString) newChild);
            return;
        }

        if(this._retainedElement_ == oldChild)
        {
            setRetainedElement((TString) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
