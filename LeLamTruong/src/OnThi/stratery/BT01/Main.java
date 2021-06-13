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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        GioHang g= new GioHang();
        g.setThanhToan(new ThanhToanCOD());
        g.setHinhThucVC(new GiaoHangNhanh());
        g.setHinhThucKM(new KhuyenMai30());
        g.inDS();
        g.HinhThucVC.vanChuyen();
        System.out.println("-------Tong tien ban dau---------");
        System.out.println(g.tongTien());
        System.out.println("-------So tien duoc khuyen mai khi chon HTTT");
        System.out.println(g.tienHTTT());
        System.out.println("-------Phi van chuyen---------");
        System.out.println(g.tienVC());
        System.out.println("------So tien duoc khuyen mai");
        System.out.println(g.tienKM());
        System.out.println("------Tong tien can thanh toan");
        System.out.println(g.tienCanThanhToan());
        
    }
    
}
