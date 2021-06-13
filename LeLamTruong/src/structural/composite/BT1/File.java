/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package structural.composite.BT1;

import java.util.Date;

/**
 *
 * @author Administrator
 */
//file laf compnent(nut la)
public class File extends AbstractFile{

    public File(String ten, String ngayTao) {
        super(ten, ngayTao);
    }
    
    
    @Override
    public void add(AbstractFile f) {
        
    }

    @Override
    public void remove(AbstractFile f) {
        
    }

    @Override
    public String getStringTreeFolder() {
      return pre + ten;
    }

   
}