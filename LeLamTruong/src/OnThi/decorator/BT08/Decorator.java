/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OnThi.decorator.BT08;

/**
 *
 * @author Administrator
 */
public abstract class Decorator extends Tokienize{
    Tokienize tokienize;

    public Decorator(Tokienize tokienize, String chuoi) {
        super(chuoi);
        this.tokienize = tokienize;
    }

    @Override
    public abstract void tachChuoi();
   
   
    
     
}
