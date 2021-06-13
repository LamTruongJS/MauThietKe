/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package template.BT2_2_BT4On;

/**
 *
 * @author Administrator
 */
public class MatHang {
    private String tenMH;
    private int soLuongCo;
    private double donGia;

    public MatHang(String tenMH, int soLuongCo, double donGia) {
        this.tenMH = tenMH;
        this.soLuongCo = soLuongCo;
        this.donGia = donGia;
    }

    public String getTenMH() {
        return tenMH;
    }

    public int getSoLuongCo() {
        return soLuongCo;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setTenMH(String tenMH) {
        this.tenMH = tenMH;
    }

    public void setSoLuongCo(int soLuongCo) {
        this.soLuongCo = soLuongCo;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }
    
}
