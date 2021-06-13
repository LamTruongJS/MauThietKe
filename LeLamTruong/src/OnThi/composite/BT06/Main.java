/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OnThi.composite.BT06;

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
        MonHocAbstract mh1 = new MonHoc("Toán", 3, 300);
        MonHocAbstract mh2 = new MonHoc("Hóa", 3, 300);
        MonHocAbstract mh3 = new MonHoc("Anh", 3, 500);
        MonHocAbstract mh4 = new MonHoc("Văn", 1, 200);


        MonHocAbstract ky1 = new Composite("Học kỳ 1");
        ky1.add(mh1);
        ky1.add(mh2);

        MonHocAbstract ky2 = new Composite("Học kỳ 2");
        ky2.add(mh3);
        ky2.add(mh4);

        MonHocAbstract namHoc = new Composite("18-19");
        namHoc.add(ky1);
        namHoc.add(ky2);

        MonHocAbstract khoa = new Composite("K60");
        khoa.add(namHoc);

        System.out.println("Cây hiển thị");
        System.out.println(khoa.hienThiCay());

        System.out.println("Tổng học phí : " + khoa.tongHocPhi());
        System.out.println("Tổng số tín chỉ : " + khoa.tongTC());
        
        
    }
    
}
