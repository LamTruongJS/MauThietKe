/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OnThi.singleton.BT04;

/**
 *
 * @author Administrator
 */
public class SanPham {
   int maSP;
    String tenSP;
    double donGia;
    int soLuong;

    public SanPham(int maSP, String tenSP, double donGia, int soLuong) {
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.donGia = donGia;
        this.soLuong = soLuong;
    }

    @Override
    public String toString() {
        return "Mã : " + maSP
                + "\t Tên : " + tenSP
                + "\t\t Đơn giá : "  + donGia
                + "\t Số lượng : " + soLuong;
    }
}
