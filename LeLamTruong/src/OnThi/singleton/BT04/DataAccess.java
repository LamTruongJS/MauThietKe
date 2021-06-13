/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OnThi.singleton.BT04;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Administrator
 */
public abstract class DataAccess {
    // phần khai báo singleton
    private static List<DataAccess> instances = new ArrayList<>();
    private static List<String> typesDataAccess = new ArrayList<>();
    protected List<SanPham> sanPhams = new ArrayList<>();
    protected DataAccess(){}
    public static DataAccess getInstance(String type){
        if(!typesDataAccess.contains(type)){
            typesDataAccess.add(type);
            DataAccess newInstance = DataAccessFactory.createDataAccess(type);
            instances.add(newInstance);
            return newInstance;
        }
        else{
            int index = typesDataAccess.indexOf(type);
            return instances.get(index);
        }
    }
    // các phương thức
    public abstract void them(SanPham sanPham);
    public abstract void xoa(SanPham sanPham);
    public abstract void capNhat(SanPham sanPhamCu, SanPham sanPhamMoi);

    public void thongTin(){
        for(SanPham i : sanPhams){
            System.out.println(i.toString());
        }
    }
}
