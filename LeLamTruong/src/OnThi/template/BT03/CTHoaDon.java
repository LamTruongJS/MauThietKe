/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OnThi.template.BT03;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Administrator
 */
public class CTHoaDon {
    List<MatHang> lstmh= new ArrayList<>();
    MatHang matHang;
    int soLuongMua;
    double donGia;

    public CTHoaDon(MatHang matHang, int soLuongMua, double donGia) {
        this.matHang = matHang;
        this.soLuongMua = soLuongMua;
        this.donGia = donGia;
    }

    public MatHang getMatHang() {
        return matHang;
    }

    public int getSoLuongMua() {
        return soLuongMua;
    }

    public double getDonGia() {
        return donGia;
    }
    public double thanhTien(){
        return getDonGia()*getSoLuongMua();
    }
    
}
