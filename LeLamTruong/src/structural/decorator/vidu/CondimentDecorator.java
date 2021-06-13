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
public abstract class CondimentDecorator extends Beverage{

    Beverage beverage;
    public CondimentDecorator(Beverage beverage, String description) {
        super(description);
        this.beverage = beverage;
    }

    @Override
        public String getDescription() {
           return beverage.getDescription()+" "+this.description;
        }    
    
}
