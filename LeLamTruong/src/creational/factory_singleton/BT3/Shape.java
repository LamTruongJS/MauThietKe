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
public abstract class Shape {
    String brush;
    String paper;
    String frame;

    public Shape(String brush, String paper, String frame) {
        this.brush = brush;
        this.paper = paper;
        this.frame = frame;
    }
    

    public abstract String draw();
    
    @Override
    public String toString() {
        return draw()+" with "+ brush+ " on "+paper+" using "+ frame;
    }

}
