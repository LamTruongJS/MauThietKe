/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OnThi.BT02.F2;

/**
 *
 * @author Administrator
 */
public class MenhGiaFactory {

    public MenhGiaFactory() {}
    public static IRutTien chonMenhGia(String loai)
    {
        IRutTien r500 = new RutTien(500); 
                    IRutTien r100 = new RutTien(100);
                    IRutTien r50 = new RutTien(50);
                    IRutTien r10= new RutTien(10);
                    IRutTien r1 = new RutTien(1);
                    r500.setSuccessor(r500)
                         .setSuccessor(r100)
                         .setSuccessor(r50)
                         .setSuccessor(r10)
                         .setSuccessor(r1);
        if(loai == "Max500")
            return r500;
        else if(loai == "Max100")
            return r100;
        else if(loai == "Max50")
            return r50;
        else if(loai == "Max10")
            return r10;
        else if(loai == "Max1")
            return r1;
        return null;     
         
              
    }
}
