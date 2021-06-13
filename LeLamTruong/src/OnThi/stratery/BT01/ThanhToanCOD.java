/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OnThi.stratery.BT01;

/**
 *
 * @author Administrator
 */
public class ThanhToanCOD implements IThanhToan{

    @Override
    public double thanhToan(double tienHang) {
       if(tienHang>=2000000)
           return tienHang*0.98;
       return tienHang;
    }

    @Override
    public double tienGiam(double tienHang) {
        if(tienHang >=2000000)
            return tienHang*0.02;
        return 0;
    }
    
}
