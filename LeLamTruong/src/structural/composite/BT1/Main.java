/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package structural.composite.BT1;

/**
 *
 * @author Administrator
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here Folder g1 = new Folder("goc1", new Date(10));
            AbstractFile data = new Folder("Data","30/4/2021");
            AbstractFile toan = new Folder("Toán","30/4/2021");
            AbstractFile ly = new Folder("Lý","30/4/2021");
            AbstractFile hoa = new Folder("Hóa","30/4/2021");
            AbstractFile giaiTich = new Folder("Giải Tích","30/4/2021");
             AbstractFile baiGiangGTA = new Folder("Baigiang.pdf","30/4/2021");
            AbstractFile hinhNY = new Folder("hinh.jpg","30/4/2021");
            
            data.add(toan);
            data.add(ly);
            data.add(hoa);
            toan.add(giaiTich);
            giaiTich.add(baiGiangGTA);
            data.add(hinhNY);
            
            System.out.println("Cây thư mục data");
            System.out.println(data.getStringTreeFolder());
            System.out.println("Cây như mục toan");
            System.out.println(toan.getStringTreeFolder());
            System.out.println(baiGiangGTA.getDuongDan());

    } 
    
}
