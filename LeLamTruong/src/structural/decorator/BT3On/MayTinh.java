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
public class MayTinh {
   String moTa;

    public MayTinh(String moTa) {
        this.moTa = moTa;
    }

    public int gia(){
        return 1000;
    }
    public String cauHinh() {
        return moTa;
    }
}
