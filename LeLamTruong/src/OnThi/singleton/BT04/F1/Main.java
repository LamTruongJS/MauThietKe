/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OnThi.singleton.BT04.F1;

/**
 *
 * @author Administrator
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        DataAccess t= DataAccess.createInstance();
        SanPham sp1 = new SanPham("123","Cam",10000,20);
        SanPham sp2 = new SanPham("234","Buoi", 2000, 10);
        SanPham sp3 = new SanPham("345","Man",30000,20);
        t.themSP(sp1);
        t.themSP(sp2);
        t.themSP(sp1);
        t.inDS();
        
        
        System.out.println("-------------------------");
        t.XoaSP(sp1);
        t.inDS();
        
        System.out.println("--------------------------");
        t.capNhat(sp2, sp3);
        t.inDS();
        
    }
    
}
