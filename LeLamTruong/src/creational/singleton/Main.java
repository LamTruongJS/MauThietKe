/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creational.singleton;

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
        //ko dung new de tao doi tuong thi ca 2 doi tuong duoc xem nhu la 1
        SingletonDemo s1 =  SingletonDemo.createInstance();
        SingletonDemo s2 =  SingletonDemo.createInstance(); 
        
        s1.increase();
        s2.increase();
        s1.pritnInfo();
        s2.pritnInfo();
    }
    
}
