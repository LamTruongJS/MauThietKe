/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OnThi.observer.BT07;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Administrator
 */
//stream là thành phần subject, vì khi nó thay đổi, làm ảnh hưởng đến các thằng còn lại
public class Stream {
    //stream là thành phần chứa danh sách các chuỗi
    List<String> chuois = new ArrayList<>();
    List<IConsumer> listeners = new ArrayList<>();

    // thay đổi thành phần
    public void add(String chuoi){
        chuois.add(chuoi);
        notifier();
    }
    public void capNhatChuoi(String chuoiCu, String chuoiMoi){
        if(chuois.contains(chuoiCu)){
            //sử dụng phương thức indexOf để tìm ra vị trí chuỗi cũ
            int index = chuois.indexOf(chuoiCu);
            //sau khi tìm kiếm được chuỗi cũ, ta tiến thành thay thế bằng hàm set
            chuois.set(index, chuoiMoi);
            //thông báo chuỗi đã được cập nhật lại
            notifier();
        }
    }

    public void dangKy(IConsumer listener){
        if(!listeners.contains(listener)){
            listeners.add(listener);
        }
    }
    public void huyDangKy(IConsumer listener){
        listeners.remove(listener);
    }
    public void notifier(){
        for(IConsumer i : listeners){
            //duyệt qua từng thành phần trong Iconsumer
            // và gọi phương thức cập nhật trong đó
            // để consumer thực hiện việc thông báo lên màn hình
           //chuois ==  data
            i.update(chuois);
        }
    }
    public interface IConsumer {
        //nhận vào 1 danh sách chuỗi được kí hiệu là data
        void update(List<String> data);
        
    }
}
