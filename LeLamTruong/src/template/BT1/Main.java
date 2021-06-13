/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package template.BT1;

import java.util.ArrayList;
import java.util.List;

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
        EntityDB<SinhVien> sv = new SinhVienDB();
        sv.add(new SinhVien(1234,"Truong","60.CNTT2"));
        sv.add(new SinhVien(1239,"Nam","60.CNTT2"));
        sv.add(new SinhVien(1235,"An","60.CNTT2"));
        sv.add(new SinhVien(1233,"Bao","60.CNTT2"));
        sv.add(new SinhVien(1236,"Giang","60.CNTT2"));
        sv.printInfo();
        sv.update(new SinhVien(1234,"Lam","60.CNPP-2"));
        System.out.println("\nSau khi cap nhat");
        sv.printInfo();
       
  
        EntityDB<MonHoc> mh = new MonHocDB();
        mh.add(new MonHoc(111,"Toan",4));
        mh.add(new MonHoc(112,"Ly",3));
        mh.add(new MonHoc(113,"Hoa",3));
        mh.add(new MonHoc(114,"Anh",2));
        mh.add(new MonHoc(115,"Van",4));
        System.out.println("\nDanh Sach Mon Hoc");
        mh.printInfo();
        System.out.println("\nDanh Sach sau khi cap nhat");
        mh.update(new MonHoc(111,"ToanCaoCap",10));
        mh.printInfo();      
    }
}
