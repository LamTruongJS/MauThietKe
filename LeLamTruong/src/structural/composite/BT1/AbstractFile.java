/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package structural.composite.BT1;



/**
 *
 * @author Administrator
 */
public abstract class AbstractFile {
    String ten;
    String ngayTao;
    String pre = "";
    String duongDan;

    public AbstractFile(String ten, String ngayTao) {
        this.ten = ten;
        this.ngayTao = ngayTao;
        duongDan = ten;
    }

    
   public abstract void add(AbstractFile f);
   public abstract void remove(AbstractFile f);
   public abstract String getStringTreeFolder();

    public String getDuongDan() {
        return duongDan;
    }
   
}
