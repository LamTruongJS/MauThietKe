/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OnThi.observer.BT05.C2;

/**
 *
 * @author Administrator
 */
public class Activity implements Button.IClick{
    int soLanClick;
    //khai bao subject
    Button button;

    public Activity(){
        soLanClick = 0;
    }
    
    public void themButton(Button button){
        this.button = button;
        button.themVaoActivity(this);
    }
    
    public void xoaButton(){
        // nếu muốn xóa mà reset lại số lần bấm thì thêm câu lệnh
        // soLanClick = 0;
        button.xoaButton();
    }

    
    @Override
    public void listenClick() {
        soLanClick++;
        System.out.println("Click lần thứ " + soLanClick);
    }
}
