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
public class KhachHangVang extends HoaDon{

    @Override
    public double tienChietKhau() {
        if(tongTien()>=500000)
            return tongTien()*0.03;
        else if(tongTien() >=1000000)
            return tongTien()*0.05;
        return 0;
    }
    
}
