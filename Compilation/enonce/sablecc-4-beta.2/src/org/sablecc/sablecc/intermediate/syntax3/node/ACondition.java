/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.sablecc.sablecc.intermediate.syntax3.node;

import java.util.*;
import org.sablecc.sablecc.intermediate.syntax3.analysis.*;

@SuppressWarnings("nls")
public final class ACondition extends PCondition
{
    private TNumber _lookDepth_;
    private final LinkedList<PLookSymbol> _lookSymbols_ = new LinkedList<PLookSymbol>();

    public ACondition()
    {
        // Constructor
    }

    public ACondition(
        @SuppressWarnings("hiding") TNumber _lookDepth_,
        @SuppressWarnings("hiding") List<PLookSymbol> _lookSymbols_)
    {
        // Constructor
        setLookDepth(_lookDepth_);

        setLookSymbols(_lookSymbols_);

    }

    @Override
    public Object clone()
    {
        return new ACondition(
            cloneNode(this._lookDepth_),
            cloneList(this._lookSymbols_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseACondition(this);
    }

    public TNumber getLookDepth()
    {
        return this._lookDepth_;
    }

    public void setLookDepth(TNumber node)
    {
        if(this._lookDepth_ != null)
        {
            this._lookDepth_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._lookDepth_ = node;
    }

    public LinkedList<PLookSymbol> getLookSymbols()
    {
        return this._lookSymbols_;
    }

    public void setLookSymbols(List<PLookSymbol> list)
    {
        this._lookSymbols_.clear();
        this._lookSymbols_.addAll(list);
        for(PLookSymbol e : list)
        {
            if(e.parent() != null)
            {
                e.parent().removeChild(e);
            }

            e.parent(this);
        }
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._lookDepth_)
            + toString(this._lookSymbols_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._lookDepth_ == child)
        {
            this._lookDepth_ = null;
            return;
        }

        if(this._lookSymbols_.remove(child))
        {
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._lookDepth_ == oldChild)
        {
            setLookDepth((TNumber) newChild);
            return;
        }

        for(ListIterator<PLookSymbol> i = this._lookSymbols_.listIterator(); i.hasNext();)
        {
            if(i.next() == oldChild)
            {
                if(newChild != null)
                {
                    i.set((PLookSymbol) newChild);
                    newChild.parent(this);
                    oldChild.parent(null);
                    return;
                }

                i.remove();
                oldChild.parent(null);
                return;
            }
        }

        throw new RuntimeException("Not a child.");
    }
}
