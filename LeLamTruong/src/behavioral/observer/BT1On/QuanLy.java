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
public class QuanLy implements INhanBaoCao{
     List<INhanViec> dsNhanVien = new ArrayList<>();
    List<BaoCao> dsBaoCao = new ArrayList<>();

    public void dangKy(INhanViec nhanVien){
        if(!dsNhanVien.contains(nhanVien)){
            dsNhanVien.add(nhanVien);
        }
    }
    public void huyDangKy(INhanViec nhanVien){
        dsNhanVien.remove(nhanVien);
    }

    public void giaoViec(CongViec congViec){
        for(INhanViec nv : dsNhanVien){
            nv.nhanViec(congViec);
        }
    }

    @Override
    public void nhanBaoCao(BaoCao baoCao) {
        if(!dsBaoCao.contains(baoCao)){
            dsBaoCao.add(baoCao);
        }
    }

    public void danhSachBaoCao(){
        for(BaoCao baoCao : dsBaoCao){
            System.out.println(baoCao.toString());
            System.out.println("-------------------------------");
        }
    }
}

