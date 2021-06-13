/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package template.BT1;

import java.util.Date;

/**
 *
 * @author Administrator
 */
public class SinhVienDB extends EntityDB<SinhVien>{  
//    @Override
//    protected SinhVien findById(int id) {
//        for(SinhVien t : list){
//            if(t.id == id)
//            {
//                return t;
//            }
//        }
//        return null;
//    }

    @Override
    protected int getID(SinhVien t) {
       return t.id;
    }

    

    
    
}
