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
public class Circle extends Shape{

    private static Circle instance;

    private Circle(String brush, String paper, String frame) {
        super(brush, paper, frame);
    }

    public static Circle createInstance(){
        if(instance == null)
            instance = new Circle("pencil and compass","A4 paper","squared frame");
        return instance;   
    }
    @Override
    public String draw() {
        return "Draw a circle";
    }
}
