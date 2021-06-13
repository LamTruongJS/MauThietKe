/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package behavioral.chain.vidu;

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
        IXepLoai kem = new XepLoai(3,"Kém");
        IXepLoai yeu= new XepLoai(5, "Yếu");
        IXepLoai tb= new XepLoai(7, "Trung bình"); 
        IXepLoai kha= new XepLoai(8,"Khá");
        IXepLoai gioi = new XepLoai((float)10.0000001,"Giỏi");
        kem.setSuccessor(yeu)
            .setSuccessor(tb)
                .setSuccessor(kha)
                .setSuccessor(gioi);
        System.out.println("Diểm 2: "+ kem.xepLoai((float)2));

    }
    
}
