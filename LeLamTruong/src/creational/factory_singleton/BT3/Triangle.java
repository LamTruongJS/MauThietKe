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
public class Triangle extends Shape{

    private static Triangle instance;

    private Triangle(String brush, String paper, String frame) {
        super(brush, paper, frame);
    }

    
    public static Triangle createInstance(){
        if(instance == null)
            instance = new Triangle("pen and ruler", "A5 paper","landscape frame");
        return instance;   
    }
    @Override
    public String draw() {
        return "Draw a triangle";
    }
    
}
