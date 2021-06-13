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
public class MonHoc extends MonHocAbstract{
    int tc;
    double hocPhi;

    public MonHoc(String name, int tc, double hocPhi) {
        super(name);
        this.tc = tc;
        this.hocPhi = hocPhi;
    }

    @Override
    public void add(MonHocAbstract item) {
        return;
        // không làm vì nó là nút lá
    }

    @Override
    public void remove(MonHocAbstract item) {
        return;
        // không làm vì nó là nút lá
    }

    @Override
    public int tongTC() {
        return tc;
    }

    @Override
    public double tongHocPhi() {
        return hocPhi * tc;
    }

    @Override
    public String hienThiCay() {
        return pre + name;
    }
}
