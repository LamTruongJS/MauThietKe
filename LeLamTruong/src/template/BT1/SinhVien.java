/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package template.BT1;

/**
 *
 * @author Administrator
 */
public class SinhVien {
    int id;
    String name;
    String lop;

    public SinhVien(int id, String name, String lop) {
        this.id = id;
        this.name = name;
        this.lop = lop;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLop() {
        return lop;
    }

    @Override
    public String toString() {
        return "id: " + id +" "
                + "name:" + name +" "
                +"lop:" + lop;
    }
    
}
