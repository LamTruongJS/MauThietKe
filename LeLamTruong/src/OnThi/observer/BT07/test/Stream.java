/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OnThi.observer.BT07.test;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Administrator
 */
//stream là thành phần subject, vì khi nó thay đổi, làm ảnh hưởng đến các thằng còn lại
public class Stream {
    //stream là thành phần chứa danh sách các chuỗi
    List<String> chuois= new ArrayList<>();
    List<Iconsumer> listeners = new ArrayList<>();

    public void them(String chuoi){
       if(!chuois.contains(chuoi))
           chuois.add(chuoi);
       thongBao();
    }
    
    public void capNhatchuoi(String chuoiCu, String chuoiMoi)
    {
        int index = chuois.indexOf(chuoiCu);
        if(index >=0)
        {
            chuois.set(index,chuoiMoi);
        }
        thongBao();
    }
    public void dangKy(Iconsumer listener)
    {
        if(!listeners.contains(listener))
            listeners.add(listener);
    }
    
    public void huyDK(Iconsumer listener){
        if(listeners.contains(listener))
            listeners.remove(listener);
    }
    
    public void thongBao()
    {
        //duyệt qua từng thành phần trong Iconsumer
        // và gọi phương thức cập nhật trong đó
        // để consumer thực hiện việc thông báo lên màn hình
        //chuois ==  data
        for(Iconsumer i: listeners)
        {
            i.update(chuois);
        }
    }
    
    public interface Iconsumer{
        public void update(List<String> data);
    }
}
