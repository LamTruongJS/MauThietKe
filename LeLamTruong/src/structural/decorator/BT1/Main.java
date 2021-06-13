/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package structural.decorator.BT1;

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
        BieuThuc b = new BieuThucDonGian(5);
        b = new Cong(-30,b);
        b = new Tru(2, b);
        b = new Nhan(2, b);
        b = new Chia(3,b);
        b= new TriTuyetDoi((int) b.giaTri(), b);
        System.out.println(b.bieuThuc()+" = "+ b.giaTri());
//   BieuThuc b= new BieuThucDonGian(5);
//   b= new TriTuyetDoi(-2, b);
//    System.out.println(b.bieuThuc()+" = "+ b.giaTri());
   
    }
    
}
