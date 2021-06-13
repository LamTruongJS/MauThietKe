/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OnThi.observer.BT07;

import java.util.List;

/**
 *
 * @author Administrator
 */
public class Consumer implements Stream.IConsumer{
    //khai báo subject
    Stream stream;

    public Consumer(Stream stream) {
        this.stream = stream;
    }
    public void add(String chuoi)
    {
        stream.add(chuoi);
    }
    public void capNhatChuoi(String chuoiCu, String chuoiMoi)
    {
        stream.capNhatChuoi(chuoiCu, chuoiMoi);
    }
    //không cần thiết phải có
    public void dangKy(){
        stream.dangKy(this);
    }
    //không cần thiết phải có
    public void huyDangKy(){
        stream.huyDangKy(this);
    }

    @Override
    public void update(List<String> data) {
        System.out.println("----Hiển thị chuỗi----");
        for (String i : data){
            System.out.println(i);
        }
        System.out.println();
    }
    
}
