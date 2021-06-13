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
public class Rectangle extends Shape{
    
    private static Rectangle instance;

    private Rectangle(String brush, String paper, String frame) {
        super(brush, paper, frame);
    }
    
    public static Rectangle createInstance(){
        if(instance == null)
            instance = new Rectangle("Pencil-2B","A4 paper","portrait frame");
        return instance;   
    }

   

    @Override
    public String draw() {
        return "Draw a rectangle";
    }
    
}
