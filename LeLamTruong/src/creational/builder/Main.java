/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creational.builder;

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
        Computer.Builder builder= new Computer.Builder();
        Computer computer = builder.addCPU("Intel Core I9 12900")
                                    .addMemory("32GB DDR5 3200 MHz")
                                    .addHd("2 TB SSD SamSung Evo Plus")
                                    .addScreen("21 Inches LG 4K")
                                    .build();
        System.out.println(computer.toString());
    }    
}
