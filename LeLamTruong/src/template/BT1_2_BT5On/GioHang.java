/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package template.BT1_2_BT5On;

import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author Administrator
 */
public abstract class GioHang {
    
    private List<CTGioHang> cTGioHang= null;
    

    public GioHang(){
      cTGioHang = new ArrayList<>();
              
    }
    public double tinhTien(){
        double tongTien=0;
        if(cTGioHang.size() > 0)
        {
          for(CTGioHang t :cTGioHang)
          {
              tongTien += t.thanhTien();
          }
        }
    return tongTien;    
    }
     public void themVaoGio(CTGioHang tt){
        cTGioHang.add(tt);
    }
     
     public abstract double tinhChietKhau();
     
     
     public void ttGioHang(){
        for(CTGioHang item : cTGioHang){
            System.out.println("Tên MH : " + item.getMatHang().getTenMH()
            +"\nSố lượng mua : " + item.getSoLuongMua()
            +"\nĐơn giá : " + item.getMatHang().getDonGia()
            +"\nThành tiền : " + item.thanhTien()
            +"\n------------------------------------");
        }
        double tienCanThanhToan = tinhTien() - tinhChietKhau();
        System.out.println("Tổng tiền mua hàng : " + tinhTien());
        System.out.println("Tiền chiết khấu : " + tinhChietKhau());
        System.out.println("Tiền cần thanh toán : " + tienCanThanhToan);
    }
}
