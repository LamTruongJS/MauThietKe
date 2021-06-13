/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package template.BT2_2_BT4On;

/**
 *
 * @author Administrator
 */
public class KhachHangKimCuong extends HoaDon{

    @Override
    public double tinhChietKhau() {
         if(tinhTien() >= 1_500_000)
            return tinhTien() * 0.06;
        else
            if(tinhTien() >= 1_000_000)
                return tinhTien() * 0.05;
            return tinhTien() * 0.03;
    }
    
}
