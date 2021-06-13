/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package template.BT2;

/**
 *
 * @author Administrator
 */
public class Product {
    String name;
    int price;
    int quantify;

    public Product(String name, int price, int quantify) {
        this.name = name;
        this.price = price;
        this.quantify = quantify;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getQuantify() {
        return quantify;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setQuantify(int quantify) {
        this.quantify = quantify;
    }
    
}
