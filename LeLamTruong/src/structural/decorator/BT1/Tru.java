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
public class Tru extends BieuThucDecorator{
     private float toanHang;

    public Tru(float toanHang, BieuThuc Bieuthuc) {
        super(Bieuthuc);
        this.toanHang = toanHang;
    }
 
    @Override
    public float giaTri() {
        return super.giaTri() - toanHang;
    }
  
}
