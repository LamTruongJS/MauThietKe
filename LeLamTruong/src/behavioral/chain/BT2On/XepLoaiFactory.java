/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package behavioral.chain.BT2On;

/**
 *
 * @author Administrator
 */
public class XepLoaiFactory {

    public XepLoaiFactory() {
    }
    public static IXepLoai chonLoai(NhomBac bac){
        switch(bac){
            case BaBac: 
                  XepLoai xl1 = new XepLoai(1000, "thành viên");
                  XepLoai xl2 = new XepLoai(2500, "bạc");                 
                  XepLoai xl3 = new XepLoai(5000, "vàng");
                  
                  xl1.setSuccessor(xl2).setSuccessor(xl3);
                  return xl1;
                 
                 
            case NamBac: 
                XepLoai xl11 = new XepLoai(1000, "thành viên");
                XepLoai xl22 = new XepLoai(1500, "thân thiết");
                XepLoai xl33 = new XepLoai(2500, "bạc");
                XepLoai xl44 = new XepLoai(5000, "vàng");
                XepLoai xl55 = new XepLoai(Integer.MAX_VALUE, "kim cương"); 
                xl11.setSuccessor(xl22).setSuccessor(xl33).setSuccessor(xl44).setSuccessor(xl55);
                 return xl11;
            default: return null;   
        } 
    }
}
