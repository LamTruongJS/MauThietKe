/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package template.BT1_2_BT5On;

/**
 *
 * @author Administrator
 */
public class MatHang {
    String tenMH;
    int soLuong;
    int donGia;

    public MatHang(String tenMH, int soLuong, int donGia) {
        this.tenMH = tenMH;
        this.soLuong = soLuong;
        this.donGia = donGia;
    }

    public String getTenMH() {
        return tenMH;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public float getDonGia() {
        return donGia;
    }
    public void setTenMH(String tenMH) {
        this.tenMH = tenMH;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public void setDonGia(int donGia) {
        this.donGia = donGia;
    }
    
    
}
