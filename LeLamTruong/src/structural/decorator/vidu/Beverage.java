/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package structural.decorator.vidu;

/**
 *
 * @author Administrator
 */
public abstract class Beverage {
    String description;
    
    public Beverage(String description) {
        this.description = description;
    }
    
    public String getDescription() {
        return description;
    }
    public abstract int cost();
}
