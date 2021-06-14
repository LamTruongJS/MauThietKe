/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OnThi.observer.BT05;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Administrator
 */
public class Button {
    //nếu nhiều màn hình có 1 button thì ta phải khai báo danh sách giao diện IObserver
    //vì mỗi màn hình chỉ có 1 button nên ta chỉ cần khai báo như sau:
    IObserver listeners;

  
    //dang ki
    //hàm này tương đương với hàm đăng kí trong observer
    public void themVaoActivity(IObserver listeners)
    {
        this.listeners = listeners;
    }
    //hàm này tương đương với hàm hủy đăng kí trong observer
    public void xoaKhoiActivity()
    {
        if(listeners != null)
            listeners = null;
    }
    public void Click()
    {   
        if(listeners != null)
        listeners.listenClick();
    }
    
    //Giao diện này có chức năng cập nhật cho các đối tượng
    //Sẽ được gửi thông báo đến khi có sự thay đổi trạng thái.
   public interface IObserver{
       public void listenClick();
   } 
}
