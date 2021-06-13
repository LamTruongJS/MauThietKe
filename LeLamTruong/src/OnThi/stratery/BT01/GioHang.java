/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OnThi.stratery.BT01;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Administrator
 */
public class GioHang {
    List<MatHang> lstmh = new ArrayList<>();
    IThanhToan HinhThucTT;
    IVanChuyen HinhThucVC;
    IKhuyenMai HinhThucKM;

    public GioHang(IThanhToan HinhThucTT, IVanChuyen HinhThucVC, IKhuyenMai HinhThucKM) {
        this.HinhThucTT = HinhThucTT;
        this.HinhThucVC = HinhThucVC;
        this.HinhThucKM= HinhThucKM;
    }

   
   public GioHang(){
       lstmh.add(new MatHang("Cam", 10, 40000));
       lstmh.add(new MatHang("Bưởi", 10, 50000));
       lstmh.add(new MatHang("Xoài", 20, 10000));
       lstmh.add(new MatHang("Quýt", 10, 20000));
   }
   //Cung cấp hình thức thanh toán
    public void setThanhToan(IThanhToan thanhToan) {
        this.HinhThucTT = thanhToan;
    }
    

    public void setHinhThucVC(IVanChuyen HinhThucVC) {
        this.HinhThucVC = HinhThucVC;
    }

    public void setHinhThucKM(IKhuyenMai HinhThucKM) {
        this.HinhThucKM = HinhThucKM;
    }
    
    //tong tien ban dau
    public double tongTien(){
        double tong=0;
        if(lstmh.size()>0)
        {
            for(MatHang t: lstmh)
            {
                tong +=t.getDonGia()* t.getSoLuong();
            }
        }
        return tong;
    }
    public double tienHTTT(){
        double tienGiam = lstmh.stream().mapToDouble(e ->HinhThucTT.tienGiam(e.getDonGia()*e.getSoLuong())).sum();
            return tienGiam;         
    }
    public double tienVC(){
        return HinhThucVC.phiVanChuyen();
    }
    public double tienKM(){
        double tienKM=0;
        if(HinhThucKM==null)
            return 0;
        return tienKM=lstmh.stream().mapToDouble(e->HinhThucKM.tienKhuyenMai(e.getDonGia()* e.getSoLuong())).sum();
       
    }
    //tien duoc khuyen mai
    //tính tổng tiền cuoi cung rồi in ra
    public double tienCanThanhToan(){
        double sum = lstmh.stream().mapToDouble(e->HinhThucTT.thanhToan(e.getDonGia()* e.getSoLuong())).sum();       
                sum += tienVC();
                sum -= tienKM();
        return sum;
    }
    public void inDS(){
        lstmh.forEach((t)->{
        System.out.println(t.tenMH+" "+t.donGia+" "+t.soLuong);
        });
        
    }
   
}
