/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creational.builder.BT1;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

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
//       // khai báo các builder khởi tạo cần dùng
//        
//        CTHD.Builder chiTietHoaDonBuilder = new CTHD.Builder(); // các đối tượng chi tiết hóa đơn sẽ có trong hóa chính
//        HoaDon.Builder hoaDonBuilder = new HoaDon.Builder(); // đây là hóa đơn chính
//
//        // tạo 1 Hóa đơn header theo builder pattern
//     
//
//        // tạo một list danh sách các CTHD của hóa đơn header 1
//        List<CTHD> dsCTHD = new ArrayList<CTHD>();
//
//        // tạo các chi tiết hóa đơn để thêm vào danh sách chi tiết hóa đơn
//        CTHD cthd1 = chiTietHoaDonBuilder.addTenSP("Xì gà").addDonGia(2000).addChietKhau(0).addSoLuong(10).build();
//        CTHD cthd2 = chiTietHoaDonBuilder.addTenSP("Milo").addDonGia(3000).addChietKhau(0.03).addSoLuong(1).build();
//        CTHD cthd3 = chiTietHoaDonBuilder.addTenSP("Cà phê").addDonGia(12000).addChietKhau(0.05).addSoLuong(1).build();
//        CTHD cthd4 = chiTietHoaDonBuilder.addTenSP("Kem ABC").addDonGia(2500).addChietKhau(0).addSoLuong(5).build();
//
//        // thêm các đối tượng chi tiết hóa đơn vào danh sách chi tiết hóa đơn
//        dsCTHD.add(cthd1);
//        dsCTHD.add(cthd2);
//        dsCTHD.add(cthd3);
//        dsCTHD.add(cthd4);
//
//        // sau khi có đầy đủ dữ liệu ta thêm vào hóa đơn chính (bao gồm 1 header Hóa đơn và 1 danh sách các chi tiết hóa đơn)
//        HoaDon hoaDon = hoaDonBuilder.addCTHD(dsCTHD).build();
//
//        // sau khi đã có hóa đơn chính, ta in ra xem thử kết quả
//        hoaDon.xuatTT();
//    }
    }
}
