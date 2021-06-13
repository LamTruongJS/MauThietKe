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
public class NhaDauTuA extends NhaDauTu{
//    float tigia;
//    DVTiGia dvTiGia;
//
//    
////    có thể không cần phương thwucs này
//    public void setDvTiGia(DVTiGia dvTiGia) {
//        this.dvTiGia = dvTiGia;
//    }
//    
//    
//    
//    //có thể không cần phương thức này
//    public void dangKy(){
//        dvTiGia.dangKy(this);
//        this.tigia= dvTiGia.tigia;
//    }
//    public void huyDangKy(){
//        dvTiGia.huyDangKy(this);
//    }
//    
//    
//    
//    
    @Override
    public void capNhatTiGia(float tiGiaMoi) {
      if(tiGiaMoi > this.tigia)
            System.out.println("Nhà đầu tư A: bán ra");
      else
            System.out.println("Nhà đầu tư A: mua vào");
      this.tigia=tiGiaMoi;
    }
    
}
