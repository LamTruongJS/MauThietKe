/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stratery.BT3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Administrator
 */
public class QLSV {
    ISoSanh<SinhVien> soSanh;//so sanh tren kdl sinh vien
    Comparable<SinhVien> comparator;
   List<SinhVien> ListSV= new ArrayList<>();
    public QLSV(){
        ListSV.add(new SinhVien("Truong", new Date(2000,10,28), (float) 9.9));
        ListSV.add(new SinhVien("Nam", new Date(2000,2,29), (float) 8.0));
        ListSV.add(new SinhVien("An", new Date(2000,1,2), (float) 4.3));
        ListSV.add(new SinhVien("Bao", new Date(2000,5,10), (float) 6.5));
        ListSV.add(new SinhVien("Khanh", new Date(2000,8,14), (float) 7.3));
    }

    public void setSoSanh(ISoSanh<SinhVien> soSanh) {
        this.soSanh = soSanh;
    }

    public void setComparator(Comparable<SinhVien> comparator) {
        this.comparator = comparator;
    }
    
    public void sapXep2()
    {
        ListSV.sort( new Comparator<SinhVien>(){
            @Override
            public int compare(SinhVien o1, SinhVien o2) {
                return soSanh.soSanh(o1, o2);
            }   
        });
    }
    
    public void sapXep()
    {
        for(int i=0; i < ListSV.size()-1;i++)
            for(int j = i + 1; j < ListSV.size();j++)
                if(soSanh.soSanh(ListSV.get(i) ,ListSV.get(j))>0)
                {
                    //doi cho vi tri i,j
                    SinhVien t= ListSV.get(i);
                    ListSV.set(i, ListSV.get(j));
                    ListSV.set(j,t);
                    // Collections.swap(ListSV, i, j);// doi cho vi tri i,j
                }
    }
    public void inDS()
    {
        ListSV.forEach((t) -> {
            System.out.println(t.hoTen +" "+ t.ngaySinh +" "+ t.dtb);
        });
        
    }
}
