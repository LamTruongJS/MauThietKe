/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OnThi.singleton.BT04.F2;

/**
 *
 * @author Administrator
 */
public class SanPham {
     String maSP,tenSP;
    double donGia;
    int soLuong;

    public SanPham(String maSP, String tenSP, double donGia, int soLuong) {
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.donGia = donGia;
        this.soLuong = soLuong;
    }

    public String getMaSP() {
        return maSP;
    }

    public String getTenSP() {
        return tenSP;
    }

    public double getDonGia() {
        return donGia;
    }

    public int getSoLuong() {
        return soLuong;
    }
    
    @Override
    public String toString() {
        return "Mã : " + getMaSP()
                + "\t Tên : " + getTenSP()
                + "\t\t Đơn giá : "  + getDonGia()
                + "\t Số lượng : " + getSoLuong();
    }
}
