/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OnThi.BT02.F1;

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
        
        // khởi tạo các mệnh giá tiền
        IRutTien mg500 = new RutTien(500);
        IRutTien mg100 = new RutTien(100); 
        IRutTien mg50 = new RutTien(50);      
        IRutTien mg10= new RutTien(10);               
        IRutTien mg1 = new RutTien(1);

        // nối chuỗi từ cao đến thấp
        mg500.setSuccessor(mg500)
                .setSuccessor(mg100)
                .setSuccessor(mg50)               
                .setSuccessor(mg10)               
                .setSuccessor(mg1);

        // câu lệnh thực hiện tính số tờ tiền cần tính
        System.out.println("-----------Rút tiền mệnh giá cao nhất mg100----------");
        mg100.soTo(588);
        System.out.println("-----------Rút tiền mệnh giá cao nhất mg500----------");
        mg500.soTo(588);
    }
    
}
