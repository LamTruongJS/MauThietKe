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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ConcreteAggregate ca = new ConcreteAggregate();
        Iterator ite = ca.CreateIterator();
        System.out.println(ite.First());
        while(ite.isDone() == false)
        {
            System.out.println(ite.Next());
        }
    }
    
}
