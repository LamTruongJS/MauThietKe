/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package template.BT2;

import java.util.ArrayList;
import java.util.List;

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
        List<Product> listPd = new ArrayList<Product>();
        listPd.add(new Product("Qua chanh",1000,100));
        listPd.add(new Product("Qua buoi",4000,500));
        listPd.add(new Product("Qua man",2000,200));
        listPd.add(new Product("Qua cam",1400,300));
        listPd.add(new Product("Qua mit",6000,500));
        SortCollection<Product> Pd= new SortProductByPrice();
        Pd.sort(listPd);
        listPd.forEach((t)->{
            System.out.println(t.getName() +" "+t.getPrice()+" "+t.getQuantify());
        });
        
    }
    
}
