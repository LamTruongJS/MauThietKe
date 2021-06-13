/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package behavioral.observer.TyGia;

/**
 *
 * @author Administrator
 */
public abstract class NhaDauTu implements DVTiGia.CapNhatTiGia{
    float tigia;
    DVTiGia dvTiGia;

    

    public void setDvTiGia(DVTiGia dvTiGia) {
        this.dvTiGia = dvTiGia;
    }
    
  
    public void dangKy(){
        dvTiGia.dangKy(this);
        this.tigia= dvTiGia.tigia;
    }
    public void huyDangKy(){
        dvTiGia.huyDangKy(this);
    }
    
    
      
}
