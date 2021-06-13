/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package behavioral.iterator.vd1;

/**
 *
 * @author Administrator
 */
public class CreateIterator implements Iterator{
    ConcreteAggregate concreteAggregate;
    public CreateIterator(ConcreteAggregate concreteAggregate) {
        this.concreteAggregate = concreteAggregate;
    }

    int i;
    @Override
    public int First() {
        int i=0;
        return concreteAggregate.GetItem(i);
    }

    @Override
    public int Next() {
        if(isDone() == false)
            return concreteAggregate.GetItem(++i);
        else
        {
            return 4;
        }
    }
    
    @Override
    public boolean isDone() {
        if(i >= concreteAggregate.Count()-1)
            return true;
        else 
            return false;
    }

    @Override
    public int CurrentItem() {
        return concreteAggregate.GetItem(i);
    }
}
