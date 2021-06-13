/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stratery.BT3;

import java.util.Comparator;

/**
 *
 * @author Administrator
 */
public class SoSanhTheoDiem2 implements Comparator<SinhVien>{

    @Override
    public int compare(SinhVien o1, SinhVien o2) {
       if(o1.dtb > o2.dtb)
           return 1;
       else 
           if(o1.dtb < o2.dtb)
            return -1;
        return 0;
    }
 
}
