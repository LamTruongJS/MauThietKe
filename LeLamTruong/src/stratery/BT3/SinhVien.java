/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stratery.BT3;

import java.util.Date;

/**
 *
 * @author Administrator
 */
public class SinhVien {
    String hoTen;
    Date ngaySinh;
    float dtb;

    public SinhVien(String hoTen, Date ngaySinh, float dtb) {
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.dtb = dtb;
    }

    public String getHoTen() {
        return hoTen;
    }
    
    
}
