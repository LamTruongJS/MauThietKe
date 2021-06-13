/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creational.factory_singleton.BT3;

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
         Shape shape1 = ShapeFactory.createShape(ShapeType.Rectangle);
        Shape shape2 = ShapeFactory.createShape(ShapeType.Triangle);
        Shape shape3 = ShapeFactory.createShape(ShapeType.Circle);
         
        System.out.println(shape1.toString());
        System.out.println(shape2.toString());
        System.out.println(shape3.toString());
    }
    
}
