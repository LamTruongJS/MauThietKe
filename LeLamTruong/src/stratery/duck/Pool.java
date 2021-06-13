/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stratery.duck;

/**
 *
 * @author Administrator
 */
public class Pool {
    void duckInPool(Duck d, IFlyBehavior f, IQuackBehavior q)
    {
        d.setFlyBehavior(f);
        d.setQuackBehavior(q);
        System.out.print(d.display());
    }
}
