/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OnThi.template.BT03;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Administrator
 */
public abstract class HoaDon {
    List<CTHoaDon> lsthd = new ArrayList<>();   
    public HoaDon(){
        lsthd.add(new CTHoaDon(new MatHang("Cam", 100), 20, 10000));
        lsthd.add(new CTHoaDon(new MatHang("Đào", 90), 10, 20000));
        lsthd.add(new CTHoaDon(new MatHang("Mít", 100), 20, 20000));
        lsthd.add(new CTHoaDon(new MatHang("Mận", 100), 10, 10000));
    }
    public abstract double tienChietKhau();
    
    public double tongTien(){
        double tongTien=0;
        if(lsthd.size()>0)
        {
            for(CTHoaDon t : lsthd)
            {
                tongTien += t.thanhTien();
            }
        }
        return tongTien;
    }
    public double tienThanhToan(){
        return tongTien()-tienChietKhau();
    }
    public void inDS(){
      for(CTHoaDon item : lsthd){
            System.out.println("Tên MH : " + item.getMatHang().getTenMH()
            +"\nSố lượng mua : " + item.getSoLuongMua()
            +"\nĐơn giá : " + item.getDonGia()
            +"\nThành Tiền:" + item.thanhTien()
            +"\n------------------------------------");
        }
        System.out.println("Tổng tiền mua hàng : " +tongTien());
        System.out.println("Tiền chiết khấu : " + tienChietKhau());
        System.out.println("Tiền cần thanh toán : " + tienThanhToan());
    }
}
