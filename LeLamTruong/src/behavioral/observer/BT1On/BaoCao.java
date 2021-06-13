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
public class BaoCao {
    CongViec congViec;
    NhanVien nhanVien;
    String danhGiaCongViec;

    public BaoCao(CongViec congViec, NhanVien nhanVien, String danhGiaCongViec) {
        this.congViec = congViec;
        this.nhanVien = nhanVien;
        this.danhGiaCongViec = danhGiaCongViec;
    }

    @Override
    public String toString() {
        return "Tên công việc : " + congViec.ten
                + "\nTên nhân viên thực hiện : " + nhanVien.ten
                + "\nNgày kết thúc : " + congViec.ngayKetThuc
                + "\nĐánh giá công việc : " + danhGiaCongViec;
    }
}
