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
public class NinjaVan implements IVanChuyen{

    @Override
    public void vanChuyen() {
        System.out.println("Giao Hàng sau 5 ngày");
    }

    @Override
    public double phiVanChuyen() {
        return 20000;
    }
    
}
