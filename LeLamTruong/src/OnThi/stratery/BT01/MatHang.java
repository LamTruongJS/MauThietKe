/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OnThi.stratery.BT01;

/**
 *
 * @author Administrator
 */
public class MatHang {

    String tenMH;
    int soLuong;
    double donGia;

    public MatHang(String tenMH, int soLuong, double donGia) {
        this.tenMH = tenMH;
        this.soLuong = soLuong;
        this.donGia = donGia;
    }
     public void setTenMH(String tenMH) {
        this.tenMH = tenMH;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public String getTenMH() {
        return tenMH;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public double getDonGia() {
        return donGia;
    }
    
}
