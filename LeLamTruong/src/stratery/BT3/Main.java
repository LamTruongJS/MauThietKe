/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stratery.BT3;

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
      QLSV qlsv= new QLSV();
      System.out.println("So sanh theo DTB: ");
      qlsv.setSoSanh(new SoSanhTheoDiem());
      qlsv.sapXep();
      qlsv.inDS();
      System.out.println("So sanh theo Ten:");
      qlsv.setSoSanh(new SoSanhTheoTen());
      qlsv.sapXep();
      qlsv.inDS();
      
    }
    
}
