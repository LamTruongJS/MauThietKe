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
public class TriTuyetDoi extends BieuThucDecorator{
    private float toanHang;
    public TriTuyetDoi(int toanHang, BieuThuc Bieuthuc) {
        super(Bieuthuc);
        this.toanHang = toanHang;
    }
 
    @Override
    public float giaTri() {   
       if(bieuthuc.giaTri() >=0)
           return bieuthuc.giaTri();
       else return -bieuthuc.giaTri();
    }

    @Override
    public String bieuThuc() {
        return super.bieuThuc() +" ="+"|"+ Float.toString(toanHang)+"|";
    }
}
