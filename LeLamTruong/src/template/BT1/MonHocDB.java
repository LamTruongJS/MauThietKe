/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package template.BT1;

/**
 *
 * @author Administrator
 */
public class MonHocDB extends EntityDB<MonHoc>{

    @Override
    protected int getID(MonHoc t) {
       return t.getMaMH();
    }
   
    
}
