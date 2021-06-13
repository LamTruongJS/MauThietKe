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
public abstract class Tokienize {
    String chuoi; 

    public Tokienize(String chuoi) {
        this.chuoi = chuoi;
    }
    
    public abstract void tachChuoi();
    
   
}
