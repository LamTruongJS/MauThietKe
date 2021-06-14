/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OnThi.singleton.BT04.F2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Administrator
 */
public abstract class DataAccess {
    protected List<SanPham> listSp = new ArrayList<>();
    private static List<DataAccess> instances = new ArrayList<>();
    private static List<String> typesDataAccess = new ArrayList<>();
    // phần khai báo singleton
    private static DataAccess instance;
    protected DataAccess(){}
    //phương thức khởi tạo
    public static DataAccess getInstance(String type){
        //nếu không thì nó sẽ tạo một instance mới vào thêm tên loại instance và instance đó vô từng list
        if(!typesDataAccess.contains(type)){
            typesDataAccess.add(type);
            DataAccess newInstance = DataAccessFactory.createDataAccess(type);
            instances.add(newInstance);
            System.out.println("aaaaaaaa");
            return newInstance;
            
        }
        else{
            int index = typesDataAccess.indexOf(type);
            // dựa vào index để có thể lấy ra được instance nào được khởi tạo
            return instances.get(index);
        }
    }
    //them
    public abstract void themSP(SanPham sp);
    //xoa
    public abstract void XoaSP(SanPham sp);
    //Cap nhat
    public abstract void capNhat(SanPham sanPhamCu, SanPham sanPhamMoi);
    //In Danh Sachs
    public void inDS() {
        listSp.forEach((t) -> {
            System.out.println(t.toString());
        });
    }
}
