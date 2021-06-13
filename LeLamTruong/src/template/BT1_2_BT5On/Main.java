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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      //thêm danh sách sản phẩm
        MatHang mh1 = new MatHang("Sữa", 25, 1000);
        MatHang mh2 = new MatHang("Thịt heo", 55, 2000);
        MatHang mh3 = new MatHang("Cá hồi", 35, 1300);
        MatHang mh4 = new MatHang("Táo", 24, 1500);
        MatHang mh5 = new MatHang("Nho", 62, 1060);
        MatHang mh6 = new MatHang("Gạo", 39, 6000);

        //thêm ct giỏ hàng

        GioHang gioHang = new ThanhToanOnline();
        gioHang.themVaoGio(new CTGioHang(mh1, 10));
        gioHang.themVaoGio(new CTGioHang(mh4, 20));
        gioHang.themVaoGio(new CTGioHang(mh2, 4));

        gioHang.ttGioHang();
    
    }
    
}
