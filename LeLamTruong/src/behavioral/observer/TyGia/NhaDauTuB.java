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
public class NhaDauTuB extends NhaDauTu{
//     float tigia=20000;
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
            System.out.println("Nhà đầu tư B: mua vào");
      else
            System.out.println("Nhà đầu tư B: bán ra");
      this.tigia=tiGiaMoi;
    }
}
