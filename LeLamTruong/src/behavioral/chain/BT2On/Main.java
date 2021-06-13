/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package behavioral.chain.BT2On;

import java.util.Scanner;

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
         Scanner sc =new Scanner(System.in);
        System.out.print("Nhập vào điểm tích lũy: ");
        int x = sc.nextInt();
        
        System.out.println("Khách hàng có điểm tích lũy "+x+" là ");

        IXepLoai iXepLoai = XepLoaiFactory.chonLoai(NhomBac.NamBac);       
        iXepLoai.XL(x);
    }
    
}
