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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          //thêm danh sách sản phẩm
        MatHang mh1 = new MatHang("Sữa", 25, 100_000);
        MatHang mh2 = new MatHang("Thịt heo", 55, 250_000);
        MatHang mh3 = new MatHang("Cá hồi", 35, 1_300);
        MatHang mh4 = new MatHang("Táo", 24, 10_500);
        MatHang mh5 = new MatHang("Nho", 62, 105_060);
        MatHang mh6 = new MatHang("Gạo", 39, 100_600);

        //thêm ct giỏ hàng

        HoaDon hoaDon = new KhachHangKimCuong();
        hoaDon.themVaoHoaDon(new CTHoaDon(mh1, 10));
        hoaDon.themVaoHoaDon(new CTHoaDon(mh4, 12));
        hoaDon.themVaoHoaDon(new CTHoaDon(mh2, 4));

        hoaDon.ttGioHang();
    }
    
}
