/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OnThi.observer.BT07.test;

import java.util.List;

/**
 *
 * @author Administrator
 */
public class Consumer implements Stream.Iconsumer{
     Stream stream;

    public Consumer(Stream stream) {
        this.stream = stream;
    }
    public void dangKy()
    {
        stream.dangKy(this);
    }
    
    public void huyDK()
    {
        stream.huyDK(this);
    }
    
    @Override
    public void update(List<String> data) {
        System.out.println("----Hiển thị chuỗi----");
        for(String i: data)
        {
            System.out.println(i);
        }
        System.out.println();
    }
     
     
     
     
 
    
}
