/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OnThi.template.BT03;

/**
 *
 * @author Administrator
 */
public class MatHang {
    String tenMH;
    int soLuongCon;
    

    public MatHang(String tenMH, int soLuongCon) {
        this.tenMH = tenMH;
        this.soLuongCon = soLuongCon;
       
    }

    public String getTenMH() {
        return tenMH;
    }

    public int getSoLuongCon() {
        return soLuongCon;
    }

}
