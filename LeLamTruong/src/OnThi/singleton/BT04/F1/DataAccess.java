/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OnThi.singleton.BT04.F1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Administrator
 */
public class DataAccess {
    protected List<SanPham> listSp = new ArrayList<>();
    // phần khai báo singleton
    private static DataAccess instance;
    //Hàm khởi tạo
    protected DataAccess(){}
    //hàm khởi tạo
    public static DataAccess createInstance(){
        if(instance == null){
            instance = new DataAccess();
        }
        return instance;
    }
    //them
    public void themSP(SanPham sp){
      
           if(!listSp.contains(sp))
           {
               listSp.add(sp);              
           }
           else
               System.out.println("Sản phẩm "+sp.getMaSP()+" đã tồn tại");
   }
    //xoa
    public void XoaSP(SanPham sp){
       
           if(listSp.contains(sp))
           {
               listSp.remove(sp);
               System.out.println("Sản phẩm "+sp.getMaSP()+" xóa thành công");
           }      
           else
               System.out.println("Sản phẩm "+sp.getMaSP()+" chưa có");
   }
    //Cap nhat
    public void capNhat(SanPham sanPhamCu, SanPham sanPhamMoi) {
        if(listSp.contains(sanPhamCu)){
            listSp.set(listSp.indexOf(sanPhamCu), sanPhamMoi);
             System.out.println("Sản phẩm "+sanPhamMoi.getMaSP()+" đã được cập nhật");
        }
        else System.out.println("Cập nhật thất bại");
    }
    //In Danh Sachs
    public void inDS() {
        listSp.forEach((t) -> {
            System.out.println(t.toString());
        });
    }
    
}
