/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package structural.decorator.BT3On;

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
        MayTinh mayTinh = new MayTinh("Dell 2021");
        mayTinh = new SSD(mayTinh, "Intel core i9");
        mayTinh = new Ram(mayTinh,"Ram 8GB");

        System.out.println(mayTinh.cauHinh());
        System.out.println(mayTinh.gia());
    }
    
}
