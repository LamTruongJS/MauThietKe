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
public class ConcreteAggregate extends Aggregate{
    int [] soNguyen ={0, 1, 2, 3, 4, 5};    

    public int Count(){
        return soNguyen.length;
    }
    public int GetItem(int i) {
        return soNguyen[i];
    }

    @Override
    public Iterator CreateIterator() {
        return new CreateIterator(this);
    }
}
