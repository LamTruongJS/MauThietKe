/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package structural.decorator.BT1;

/**
 *
 * @author Administrator
 */
public class Cong extends BieuThucDecorator {
     private float toanHang;

    public Cong(float toanHang, BieuThuc Bieuthuc) {
        super(Bieuthuc);
        this.toanHang = toanHang;
    }
 
    @Override
    public float giaTri() {
        return super.giaTri()+toanHang;
    }

    @Override
    public String bieuThuc() {
        return super.bieuThuc() +" + "+ Float.toString(toanHang);
    }
        
}
