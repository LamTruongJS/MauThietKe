/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OnThi.template.BT03;

/**
 *
 * @author Administrator
 */
public class KhachHangThanThiet extends HoaDon{

    @Override
    public double tienChietKhau() {
       if(tongTien() > 500000)
           return tongTien() * 0.02;
       return 0;
    }
    
}
