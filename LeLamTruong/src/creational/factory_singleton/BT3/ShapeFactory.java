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
public class ShapeFactory {
    public ShapeFactory() {
    }
    
    public static Shape createShape(ShapeType shapeType){   
        
        return switch (shapeType) {
            case Rectangle -> Rectangle.createInstance();
            case Triangle -> Triangle.createInstance();
            case Circle -> Circle.createInstance();
            default -> null;
        };
    }
}

