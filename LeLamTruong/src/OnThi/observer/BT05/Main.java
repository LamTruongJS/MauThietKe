/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OnThi.observer.BT05;

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
       Button b = new  Button();
       Activity  c = new Activity(b);
       c.themButton();
       b.Click();
       b.Click();
       b.Click();
       b.Click();
       c.xoaButton();
       b.Click();
       
      
       
    } 
    
}
