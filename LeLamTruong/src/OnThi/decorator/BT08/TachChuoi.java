/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OnThi.decorator.BT08;

/**
 *
 * @author Administrator
 */
public class TachChuoi extends Tokienize{

    public TachChuoi(String chuoi) {
        super(chuoi);
    }
 
    @Override
    public void tachChuoi() {
        String[] strs = chuoi.split("[ ]");
       for (int i=0; i < strs.length; i++) {
            System.out.println("["+i+"]:"+strs[i]);
        }
    }
    
}
