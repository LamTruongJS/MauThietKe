/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stratery.BT2;

/**
 *
 * @author Administrator
 */
public class ThanhToanOnline implements IThanhToan {

    @Override
    public double thanhToan(int TienHang) {
         if(TienHang < 1000000) return TienHang*0.95;
        else return TienHang*0.93;
    }
}

