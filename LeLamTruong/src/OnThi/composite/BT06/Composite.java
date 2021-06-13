/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OnThi.composite.BT06;

import java.util.ArrayList;
import java.util.List;



/**
 *
 * @author Administrator
 */
public class Composite extends MonHocAbstract{
   List<MonHocAbstract> childItems = new ArrayList<>();

    public Composite(String name) {
        super(name);
    }


    @Override
    public void add(MonHocAbstract item) {
        if(!childItems.contains(item)){
            childItems.add(item);
        }
    }

    @Override
    public void remove(MonHocAbstract item) {
        childItems.remove(item);
    }

    @Override
    public int tongTC() {
        int result = childItems.stream().mapToInt(value -> value.tongTC()).sum();
        return result;
    }

    @Override
    public double tongHocPhi() {
        double result = childItems.stream().mapToDouble(value -> value.tongHocPhi()).sum();
        return result;
    }

    @Override
    public String hienThiCay() {
        StringBuilder strBuilder = new StringBuilder();
        strBuilder.append(pre)
                .append(name);
        for(MonHocAbstract cf : childItems){
            cf.pre = this.pre + "-----";
            strBuilder.append("\n")
                    .append(cf.hienThiCay());
            cf.pre = "";
        }
        return strBuilder.toString();
    }
}
