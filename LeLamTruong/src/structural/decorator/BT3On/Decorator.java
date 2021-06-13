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
public abstract class Decorator extends MayTinh{
   MayTinh mayTinh;

    public Decorator(MayTinh mayTinh, String moTa) {
        super(moTa);
        this.mayTinh = mayTinh;
    }


    public String cauHinh(){
        return mayTinh.cauHinh() + ' ' + moTa;
    }
    public abstract int gia();
}
