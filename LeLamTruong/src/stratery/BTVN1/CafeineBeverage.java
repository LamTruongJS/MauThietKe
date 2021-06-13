/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stratery.BTVN1;

/**
 *
 * @author Administrator
 */
public abstract class  CafeineBeverage {
    
    public String prepareRecipe(){
        return "Danh sach can chuan bi";
    }
    public String boidWater(){
       return "Nuoc Soi";
    }
    public String pourlnCup(){
        return "Cho vao coc";
    }
    public abstract String brew();
    public abstract String addCondiments();
}
