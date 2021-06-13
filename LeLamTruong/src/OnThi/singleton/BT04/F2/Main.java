/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OnThi.singleton.BT04.F2;

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
        DataAccess dataAccess = DataAccess.getInstance("SQL");
        SanPham sp1 = new SanPham("1","Cam",10000,20);
        SanPham sp2 = new SanPham("2","Buoi", 2000, 10);
        SanPham sp3 = new SanPham("3","Man",30000,20);
        SanPham sp4 = new SanPham("4","Chanh",10000,20);
        SanPham sp5 = new SanPham("5","Xoai", 2000, 10);
        SanPham sp6 = new SanPham("6","Mit",30000,20);
        
        dataAccess.themSP(sp1);
        dataAccess.themSP(sp3);
        dataAccess.themSP(sp4);
        dataAccess.themSP(sp5);
        dataAccess.themSP(sp3);
        
        dataAccess.XoaSP(sp3);
        
        dataAccess.capNhat(sp1, sp6);
        dataAccess.inDS();
        
    }
    
}
