/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OnThi.singleton.BT04.F2;

/**
 *
 * @author Administrator
 */
public class SQL extends DataAccess{
   @Override
    public void themSP(SanPham sp) {
       
           if(!listSp.contains(sp))
           {
               listSp.add(sp); 
               System.out.println("Sản phẩm "+sp.getMaSP()+ " đã thêm vào SQL");
           }  
           else System.out.println("Sản phẩm "+sp.getMaSP()+ " đã tồn tại trong SQL");
    }

    @Override
    public void XoaSP(SanPham sp) {
        
           if(listSp.contains(sp))
           {
               listSp.remove(sp);
               System.out.println("Sản phẩm "+sp.getMaSP()+ " đã xóa khỏi SQL");
           }
           else System.out.println("Sản phẩm "+sp.getMaSP()+ " đã chưa tồn tại trong SQL");
          
    }

    @Override
    public void capNhat(SanPham sanPhamCu, SanPham sanPhamMoi) {
         if(listSp.contains(sanPhamCu)){
            listSp.set(listSp.indexOf(sanPhamCu), sanPhamMoi);
             System.out.println("Sản phẩm "+sanPhamMoi.getMaSP()+ " đã cập nhật vào SQL");
        }
         else System.out.println("Sản phẩm "+sanPhamCu.getMaSP()+ "không được tìm thấy trong SQL");
    }

 
  
}
