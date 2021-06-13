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
public class SingletonDemo {
    private static SingletonDemo instance;
    int count =0; 

    private SingletonDemo() {
    }

  
    public static SingletonDemo createInstance(){
        if(instance == null)
            instance = new  SingletonDemo();
        return instance;
    }
    public void increase(){
        count++;
    }
    public void pritnInfo(){
        System.out.println("Count: "+ count);
    }
}
