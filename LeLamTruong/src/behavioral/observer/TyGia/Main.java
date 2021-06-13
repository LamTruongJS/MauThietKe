/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package behavioral.observer.TyGia;

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
        DVTiGia dvtg= new DVTiGia(20500);
        NhaDauTu a= new NhaDauTuA();
        NhaDauTu b= new NhaDauTuB();
        a.setDvTiGia(dvtg);
        b.setDvTiGia(dvtg);
        a.dangKy();
        b.dangKy();
        dvtg.thongBaoCapNhat(21000);
        System.out.println("--------------------------------");
        dvtg.thongBaoCapNhat(20300);
        b.huyDangKy();
        System.out.println("---------------------------------");
        dvtg.thongBaoCapNhat(20600);
    }
    
}
