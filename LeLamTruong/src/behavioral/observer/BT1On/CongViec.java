/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package behavioral.observer.BT1On;

/**
 *
 * @author Administrator
 */
public class CongViec {
    String ten;
    String noiDung;
    String ngayKetThuc;

    public CongViec(String ten, String noiDung, String ngayKetThuc) {
        this.ten = ten;
        this.noiDung = noiDung;
        this.ngayKetThuc = ngayKetThuc;
    }

    @Override
    public String toString() {
        return "Tên công việc : " + ten
                + "\nNội dung : " + noiDung
                + "\nNgày kết thúc : " + ngayKetThuc;
    }
}
