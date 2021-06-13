/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package structural.decorator.vidu;

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
        Beverage beverage = new DarkRoast("Cafe");
        beverage= new Milk(beverage,"thêm sữa bò"); 
        System.out.println("Cafe DarkRoast");
        System.out.println(beverage.getDescription()+" "+ beverage.cost());       
        beverage= new Mocha(beverage,"thêm trà xanh");       
        System.out.println(beverage.getDescription()+" "+ beverage.cost());       
        beverage= new Soy(beverage,"thêm đậu nành");        
        System.out.println(beverage.getDescription()+" "+ beverage.cost());      
        beverage= new Whip(beverage,"thêm Whip");        
        System.out.println(beverage.getDescription()+" "+ beverage.cost());
        System.out.println("------------------------------");
        Beverage beverage1 = new Decaf("Cafe");
        beverage1= new Milk(beverage1,"thêm sữa bò"); 
        System.out.println("Cafe Decaf");
        System.out.println(beverage1.getDescription()+" "+ beverage1.cost());       
        beverage1= new Mocha(beverage1,"thêm trà xanh");       
        System.out.println(beverage1.getDescription()+" "+ beverage1.cost());       
        beverage1= new Soy(beverage1,"thêm đậu nành");        
        System.out.println(beverage1.getDescription()+" "+ beverage1.cost());      
        beverage1= new Whip(beverage1,"thêm Whip");        
        System.out.println(beverage1.getDescription()+" "+ beverage1.cost());
        System.out.println("------------------------------");
        Beverage beverage2 = new Espresso("Cafe");
        beverage2= new Milk(beverage2,"thêm sữa bò");
        System.out.println("Cafe Espresso");
        System.out.println(beverage2.getDescription()+" "+ beverage2.cost());       
        beverage2= new Mocha(beverage2,"thêm trà xanh");       
        System.out.println(beverage2.getDescription()+" "+ beverage2.cost());       
        beverage2= new Soy(beverage2,"thêm đậu nành");        
        System.out.println(beverage2.getDescription()+" "+ beverage2.cost());      
        beverage2= new Whip(beverage2,"thêm Whip");        
        System.out.println(beverage2.getDescription()+" "+ beverage2.cost());
        System.out.println("------------------------------");
        Beverage beverage3 = new HouseBlend("Cafe");
        beverage3= new Milk(beverage3,"thêm sữa bò");
        System.out.println("Cafe HouseBlend");
        System.out.println(beverage3.getDescription()+" "+ beverage3.cost());       
        beverage3= new Mocha(beverage3,"thêm trà xanh");       
        System.out.println(beverage3.getDescription()+" "+ beverage3.cost());       
        beverage3= new Soy(beverage3,"thêm đậu nành");        
        System.out.println(beverage3.getDescription()+" "+ beverage3.cost());      
        beverage3= new Whip(beverage3,"thêm Whip");        
        System.out.println(beverage3.getDescription()+" "+ beverage3.cost());
        
    }
    
}
