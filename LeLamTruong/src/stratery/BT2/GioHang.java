/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stratery.BT2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Administrator
 */
public class GioHang {
   private IThanhToan HinhThucTT;
   List<HangHoa> lsthh = new ArrayList<>();

    public GioHang(IThanhToan ThanhToan) {
        this.HinhThucTT = ThanhToan;
    }
    
    public GioHang(){
        lsthh.add(new HangHoa("Chuoi",2000000 ,"Chuoi VN"));
        lsthh.add(new HangHoa("Cam",100000 ,"Cam My"));
        lsthh.add(new HangHoa("Tao",500000 ,"Tao China"));
        lsthh.add(new HangHoa("Khe",500000,"Khe Chua"));
    }
    //cung cap hinh thuc thanh toan
    public void setThanhToan(IThanhToan ThanhToan) {
        this.HinhThucTT = ThanhToan;
    }
    public void inDS(){
        lsthh.forEach((t)->{
        System.out.println(t.tenHH+" "+t.gia+" "+t.moTa);
        });
    }

    public double thanhtoan() {
       double sum = lsthh.stream().mapToDouble(e->HinhThucTT.thanhToan(e.getGia())).sum();
        return sum;
    }
}