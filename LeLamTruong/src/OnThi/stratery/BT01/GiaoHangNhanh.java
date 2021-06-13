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
public class GiaoHangNhanh implements IVanChuyen{

    @Override
    public void vanChuyen() {
        System.out.println("Giao hàng sau 4 ngày");
    }

    @Override
    public double phiVanChuyen() {
        return 20000;
    }
    
}
