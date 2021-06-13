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
public class DuckMain1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        Duck duck = new VitBau();
        IFlyBehavior flyBehavior= new FlyWithWings();
        IQuackBehavior quackBehavior= new RapQuack();
        IFlyBehavior flyBehavior1 = new FlyNoWings();
        Pool pool= new Pool();
        pool.duckInPool(duck, flyBehavior, quackBehavior);
        pool.duckInPool(duck, flyBehavior1, quackBehavior);
    }
    
}
