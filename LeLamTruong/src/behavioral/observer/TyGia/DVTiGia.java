/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package behavioral.observer.TyGia;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Administrator
 */
public class DVTiGia {
    //B2: khai báo 1 list
    List<CapNhatTiGia> listeners = new ArrayList<>();
    float tigia;

    public DVTiGia(float tigia) {
        this.tigia = tigia;
    }
    
    public void dangKy(CapNhatTiGia o){
        if(!listeners.contains(o))
            listeners.add(o);
    }
    public void huyDangKy(CapNhatTiGia o){
        if(listeners.contains(o))
            listeners.remove(o);
    }
    public void thongBaoCapNhat(float tiGiaMoi){
        this.tigia= tiGiaMoi;
        for(CapNhatTiGia o: listeners)
            o.capNhatTiGia(tigia);
    }
    
    //B1:Khai báo giao diện
    public interface CapNhatTiGia{
        void capNhatTiGia(float tiGiaMoi);
    }
}
