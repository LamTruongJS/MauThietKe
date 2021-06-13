/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OnThi.composite.BT06;

/**
 *
 * @author Administrator
 */
public abstract class MonHocAbstract {
    String pre = "";
    String name;

    public MonHocAbstract(String name) {
        this.name = name;
    }

    public abstract void add(MonHocAbstract monHocAbstract );
    public abstract void remove(MonHocAbstract monHocAbstract);
    public abstract int tongTC();
    public abstract double tongHocPhi();
    public abstract String hienThiCay();
 
}
