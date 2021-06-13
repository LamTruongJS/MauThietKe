/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package template.BT2_2_BT4On;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Administrator
 */
public abstract class HoaDon {
      private List<CTHoaDon> cTHoaDon= null;
      
    public HoaDon(){
      cTHoaDon = new ArrayList<>();         
    }
    public double tinhTien(){
        double tongTien=0;
        if(cTHoaDon.size()>0)
        {
            for(CTHoaDon iteam: cTHoaDon)
            {
                tongTien += iteam.thanhTien();
            }
        }
    return tongTien;
    }
    
    public abstract double tinhChietKhau();
    
    public void themVaoHoaDon(CTHoaDon tt){
        cTHoaDon.add(tt);
    }
     public void ttGioHang(){
        for(CTHoaDon item : cTHoaDon){
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
