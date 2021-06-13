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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      
      IRutTien rutTien= MenhGiaFactory.chonMenhGia("Max50");
        System.out.println("Rút tiền với Max 50");
        rutTien.soTo(533);
    }
    
}
