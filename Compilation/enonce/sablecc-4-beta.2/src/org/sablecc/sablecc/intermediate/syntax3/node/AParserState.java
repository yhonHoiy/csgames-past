/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.sablecc.sablecc.intermediate.syntax3.node;

import java.util.*;
import org.sablecc.sablecc.intermediate.syntax3.analysis.*;

@SuppressWarnings("nls")
public final class AParserState extends PParserState
{
    private TString _name_;
    private TString _investigator_;
    private PDecision _decision_;
    private final LinkedList<PParserTransition> _parserTransitions_ = new LinkedList<PParserTransition>();

    public AParserState()
    {
        // Constructor
    }

    public AParserState(
        @SuppressWarnings("hiding") TString _name_,
        @SuppressWarnings("hiding") TString _investigator_,
        @SuppressWarnings("hiding") PDecision _decision_,
        @SuppressWarnings("hiding") List<PParserTransition> _parserTransitions_)
    {
        // Constructor
        setName(_name_);

        setInvestigator(_investigator_);

        setDecision(_decision_);

        setParserTransitions(_parserTransitions_);

    }

    @Override
    public Object clone()
    {
        return new AParserState(
            cloneNode(this._name_),
            cloneNode(this._investigator_),
            cloneNode(this._decision_),
            cloneList(this._parserTransitions_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAParserState(this);
    }

    public TString getName()
    {
        return this._name_;
    }

    public void setName(TString node)
    {
        if(this._name_ != null)
        {
            this._name_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._name_ = node;
    }

    public TString getInvestigator()
    {
        return this._investigator_;
    }

    public void setInvestigator(TString node)
    {
        if(this._investigator_ != null)
        {
            this._investigator_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._investigator_ = node;
    }

    public PDecision getDecision()
    {
        return this._decision_;
    }

    public void setDecision(PDecision node)
    {
        if(this._decision_ != null)
        {
            this._decision_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._decision_ = node;
    }

    public LinkedList<PParserTransition> getParserTransitions()
    {
        return this._parserTransitions_;
    }

    public void setParserTransitions(List<PParserTransition> list)
    {
        this._parserTransitions_.clear();
        this._parserTransitions_.addAll(list);
        for(PParserTransition e : list)
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
            + toString(this._name_)
            + toString(this._investigator_)
            + toString(this._decision_)
            + toString(this._parserTransitions_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._name_ == child)
        {
            this._name_ = null;
            return;
        }

        if(this._investigator_ == child)
        {
            this._investigator_ = null;
            return;
        }

        if(this._decision_ == child)
        {
            this._decision_ = null;
            return;
        }

        if(this._parserTransitions_.remove(child))
        {
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._name_ == oldChild)
        {
            setName((TString) newChild);
            return;
        }

        if(this._investigator_ == oldChild)
        {
            setInvestigator((TString) newChild);
            return;
        }

        if(this._decision_ == oldChild)
        {
            setDecision((PDecision) newChild);
            return;
        }

        for(ListIterator<PParserTransition> i = this._parserTransitions_.listIterator(); i.hasNext();)
        {
            if(i.next() == oldChild)
            {
                if(newChild != null)
                {
                    i.set((PParserTransition) newChild);
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
