/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OnThi.observer.BT07.test;

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
        Stream s = new Stream();
        Consumer c = new Consumer(s);
        c.dangKy();
        
        s.them("Chuoi1");
        s.them("chuoi2");
        s.capNhatchuoi("chuoi2","chuoi can thay the");
        
    }
    
}
