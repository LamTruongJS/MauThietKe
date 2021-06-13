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
public class HoaDon {
    HoaDonHeader hoaDonHeader;
    List<CTHD> cthd;
    private HoaDon(Builder builder){
        this.hoaDonHeader = builder.hoaDonHeader;
        this.cthd = builder.cthd;
}
      public void xuatTT() {
        System.out.println("Thông tin chung của hóa đơn \n"
                + hoaDonHeader.toString()
                + "\n------------------------------------------\n"
                + "Chi tiết các món hàng đã mua như sau\n\n"
                + "Tên SP\t\t\tSL\t\tĐơn Giá \t\tChiết Khấu");
        cthd.forEach((e)->{
            System.out.println(e.toString());
        });
        double tongTien = 0;
        tongTien = cthd.stream().mapToDouble(CTHD::tinhTien).sum();
        System.out.println("\nSố tiền cần thanh toán là : " + tongTien);
    }

    // class builder dành cho việc khởi tạo từ bên ngoài bằng Builder
    public static class Builder{
        HoaDonHeader hoaDonHeader;
        List<CTHD> cthd;

        public Builder addHoaDonHeader(HoaDonHeader hoaDonHeader){
            this.hoaDonHeader = hoaDonHeader;
            return this;
        }
        public Builder addCTHD(List<CTHD> cthd){
            this.cthd = cthd;
            return this;
        }
        public HoaDon build(){
            return new HoaDon(this);
        }
    }
}
