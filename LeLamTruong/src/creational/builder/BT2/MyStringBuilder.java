/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creational.builder.BT2;

/**
 *
 * @author Administrator
 */
public class MyStringBuilder {
   String str;
    public MyStringBuilder addString(String s){
        if(str == null)
            str = s;
        else
            str+=s;
        return this;
    }
    public MyStringBuilder addFloat(float f){
        if(str == null)
            str = f + "";
        else
            str+=f;
        return this;
    }
    public MyStringBuilder addBoolea(boolean b){
        if(str == null)
            str = b + "";
        else
            str+=b;
        return this;
    }
    public String build(){
        return this.str;
    }

    @Override
    public String toString() {
        return this.str;
    }

    
}
