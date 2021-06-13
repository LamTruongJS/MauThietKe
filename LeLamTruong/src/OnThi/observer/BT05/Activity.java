/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OnThi.observer.BT05;

/**
 *
 * @author Administrator
 */
public class Activity implements Button.IObserver{
    //khai bao subject
    Button button;
    int soLanClick;

    public Activity( Button button) {
        this.soLanClick = 0;
        this.button = button;
    }

    
    public void themButton(){
        button.themVaoActivity(this);
    }
      // nếu muốn xóa mà reset lại số lần bấm thì thêm câu lệnh
        // soLanClick = 0;
    public void xoaButton(){
        button.xoaKhoiActivity();
    }
    @Override
    public void listenClick() {
      soLanClick++;
        System.out.println("Số lần nhấn: "+soLanClick);
    }
    
   
}
