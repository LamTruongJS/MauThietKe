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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       DataAccess sql = DataAccess.getInstance("SQL");
        DataAccess sql1 = DataAccess.getInstance("SQL");
        DataAccess mysql = DataAccess.getInstance("MySQL");

        SanPham sp1 = new SanPham(1, "Trứng", 6000, 10);
        SanPham sp2 = new SanPham(2, "Đường", 11000, 2);
        SanPham sp3 = new SanPham(3, "Dầu ăn", 25000,50);

        // thêm
        sql.them(sp1);
        sql1.them(sp2);
        sql.them(sp3);

        // xóa cái sản phẩm 3
        sql1.xoa(sp3);

        // cập nhật sản phẩm 2 thành sản phẩm 3
        sql.capNhat(sp2, sp3);

        // in thông tin các giỏ hàng
        sql1.thongTin();
    }
   
    
}
