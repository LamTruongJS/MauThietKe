/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package structural.decorator.BT1;

import static java.lang.Math.abs;

/**
 *
 * @author Administrator
 */
public class Nhan extends BieuThucDecorator{
    private int toanHang;

    public Nhan(int toanHang, BieuThuc Bieuthuc) {
        super(Bieuthuc);
        this.toanHang = toanHang;
    }
 
    @Override
    public float giaTri() {   
        return super.giaTri() * toanHang;
    }

    @Override
      public String bieuThuc() {
        return super.bieuThuc() +"*"+ Float.toString(toanHang);
    }
}
