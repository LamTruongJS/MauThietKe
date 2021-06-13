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
public class ThanhToanCOD implements IThanhToan{
    @Override
    public double thanhToan(int TienHang) {
        if(TienHang > 2000000) return TienHang*0.98;
        else return 0;
    }
}


