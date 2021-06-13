/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creational.builder.BT1;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Administrator
 */
public class HoaDonHeader {
    int maHD;
    Date ngayBan;
    String tenKH;

    public HoaDonHeader(int maHD, Date ngayBan, String tenKH) {
        this.maHD = maHD;
        this.ngayBan = ngayBan;
        this.tenKH = tenKH;
    }

    
    
    @Override
    public String toString() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        return "Mã Hóa Đơn : " + maHD
                + "\nNgày Bán : " + dateFormat.format(ngayBan)
                + "\nTên Khách Hàng : " + tenKH;
    }

 
   
}
