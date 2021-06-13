/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package structural.decorator.BT3On;

/**
 *
 * @author Administrator
 */
public class Ram extends Decorator{

    public Ram(MayTinh mayTinh, String moTa) {
        super(mayTinh, moTa);
    }

    @Override
    public int gia() {
        return 7 + mayTinh.gia();
    }

   
     

    
}
