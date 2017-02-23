/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.sablecc.sablecc.intermediate.syntax3.node;

import org.sablecc.sablecc.intermediate.syntax3.analysis.*;

@SuppressWarnings("nls")
public final class ASeparatedAtLeastListType extends PListType
{
    private TString _unit_;
    private PBoolean _publicUnit_;
    private TString _separator_;
    private PBoolean _publicSeparator_;
    private TNumber _number_;

    public ASeparatedAtLeastListType()
    {
        // Constructor
    }

    public ASeparatedAtLeastListType(
        @SuppressWarnings("hiding") TString _unit_,
        @SuppressWarnings("hiding") PBoolean _publicUnit_,
        @SuppressWarnings("hiding") TString _separator_,
        @SuppressWarnings("hiding") PBoolean _publicSeparator_,
        @SuppressWarnings("hiding") TNumber _number_)
    {
        // Constructor
        setUnit(_unit_);

        setPublicUnit(_publicUnit_);

        setSeparator(_separator_);

        setPublicSeparator(_publicSeparator_);

        setNumber(_number_);

    }

    @Override
    public Object clone()
    {
        return new ASeparatedAtLeastListType(
            cloneNode(this._unit_),
            cloneNode(this._publicUnit_),
            cloneNode(this._separator_),
            cloneNode(this._publicSeparator_),
            cloneNode(this._number_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseASeparatedAtLeastListType(this);
    }

    public TString getUnit()
    {
        return this._unit_;
    }

    public void setUnit(TString node)
    {
        if(this._unit_ != null)
        {
            this._unit_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._unit_ = node;
    }

    public PBoolean getPublicUnit()
    {
        return this._publicUnit_;
    }

    public void setPublicUnit(PBoolean node)
    {
        if(this._publicUnit_ != null)
        {
            this._publicUnit_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._publicUnit_ = node;
    }

    public TString getSeparator()
    {
        return this._separator_;
    }

    public void setSeparator(TString node)
    {
        if(this._separator_ != null)
        {
            this._separator_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._separator_ = node;
    }

    public PBoolean getPublicSeparator()
    {
        return this._publicSeparator_;
    }

    public void setPublicSeparator(PBoolean node)
    {
        if(this._publicSeparator_ != null)
        {
            this._publicSeparator_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._publicSeparator_ = node;
    }

    public TNumber getNumber()
    {
        return this._number_;
    }

    public void setNumber(TNumber node)
    {
        if(this._number_ != null)
        {
            this._number_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._number_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._unit_)
            + toString(this._publicUnit_)
            + toString(this._separator_)
            + toString(this._publicSeparator_)
            + toString(this._number_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._unit_ == child)
        {
            this._unit_ = null;
            return;
        }

        if(this._publicUnit_ == child)
        {
            this._publicUnit_ = null;
            return;
        }

        if(this._separator_ == child)
        {
            this._separator_ = null;
            return;
        }

        if(this._publicSeparator_ == child)
        {
            this._publicSeparator_ = null;
            return;
        }

        if(this._number_ == child)
        {
            this._number_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._unit_ == oldChild)
        {
            setUnit((TString) newChild);
            return;
        }

        if(this._publicUnit_ == oldChild)
        {
            setPublicUnit((PBoolean) newChild);
            return;
        }

        if(this._separator_ == oldChild)
        {
            setSeparator((TString) newChild);
            return;
        }

        if(this._publicSeparator_ == oldChild)
        {
            setPublicSeparator((PBoolean) newChild);
            return;
        }

        if(this._number_ == oldChild)
        {
            setNumber((TNumber) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
