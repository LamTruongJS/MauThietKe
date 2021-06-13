/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OnThi.observer.BT05.C2;

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
        Button button = new Button();
        Activity activity = new Activity();
        activity.themButton(button);
        button.click();
        button.click();
        button.click();
        button.click();
        button.click();
        activity.xoaButton();
        
        button.click();
        
    }
    
}
