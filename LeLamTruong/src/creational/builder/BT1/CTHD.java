/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creational.builder.BT1;



/**
 *
 * @author Administrator
 */
public class CTHD {
    String tenSP;
    int soLuong;
    double donGia, chietKhau;

    public CTHD(String tenSP, int soLuong, double donGia, double chietKhau) {
        this.tenSP = tenSP;
        this.soLuong = soLuong;
        this.donGia = donGia;
        this.chietKhau = chietKhau;
    }

    
    @Override
    public String toString() {
//        return "Tên Sản Phẩm : " + tenSP
//                +"\nSố Lượng : " + soLuong
//                +"\nĐơn Giá : " + donGia
//                +"\nChiết Khấu : " + chietKhau;
        return tenSP + "\t\t\t" + soLuong + "\t\t" + donGia + "\t\t\t" + chietKhau;
    }
    // tính tiền sản phẩm
    public double tinhTien(){
        return donGia * soLuong * (1 - chietKhau);
    }

   
}
