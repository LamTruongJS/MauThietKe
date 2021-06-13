/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package template.BT1_2_BT5On;

/**
 *
 * @author Administrator
 */
public class ThanhToanOnline extends GioHang{
    @Override
        public double tinhChietKhau() {
            if(tinhTien() >= 1_000_000 )
                return tinhTien() * 0.05;
            return tinhTien() * 0.03;
        }
  
}
