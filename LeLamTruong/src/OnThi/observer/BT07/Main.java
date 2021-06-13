/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OnThi.observer.BT07;

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
         Stream stream = new Stream();

        Consumer consumer = new Consumer(stream);
        consumer.dangKy();
        
        
        consumer.add("Chuỗi 1");
        consumer.add("Chuỗi 2");
        consumer.capNhatChuoi("Chuỗi 2", "Chuỗi thay thế chuỗi 2");
        
    }
    
}
