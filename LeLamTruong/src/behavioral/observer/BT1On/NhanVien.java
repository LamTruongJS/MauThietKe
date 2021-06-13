/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package behavioral.observer.BT1On;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Administrator
 */
public class NhanVien implements INhanViec{
    
    List<CongViec> dsCongViec = new ArrayList<>();
    String ten;
    QuanLy quanLy;

    public NhanVien(String ten, QuanLy quanLy) {
        this.ten = ten;
        this.quanLy = quanLy;
    }

    @Override
    public void nhanViec(CongViec congViec) {
        dsCongViec.add(congViec);
    }
    /* vai trò là subject */
    public void guiBaoCao(BaoCao baoCao){
        quanLy.nhanBaoCao(baoCao);
    }

    /* trong vai trò là một observer*/
    public void dangKy(){
        quanLy.dangKy(this);

    }
    public void huyDangKy(){
        quanLy.huyDangKy(this);
    }
    public void danhSachCongViec(){
        for(CongViec cv : dsCongViec){
            System.out.println(cv.toString());
            System.out.println("----------------------------");
        }
    }
}
