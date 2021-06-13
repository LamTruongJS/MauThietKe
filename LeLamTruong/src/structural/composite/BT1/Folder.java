/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package structural.composite.BT1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Administrator
 */
//la composite(nut trong) vi ben trong co chua file va folder khac
public class Folder extends AbstractFile{

    private List<AbstractFile> list = new ArrayList<>();

    public Folder(String ten, String ngayTao) {
        super(ten, ngayTao);
    }
    @Override
    public void add(AbstractFile f) {
     if(!list.contains(f))
         list.add(f);
         f.duongDan= this.duongDan+ "\\"+f.ten;
    }

    @Override
    public void remove(AbstractFile f) {
       if(list.contains(f))
       {
           list.remove(f);
           return;
       }
       for(AbstractFile folder: list)
           folder.remove(f);
    }

    @Override
    public String getStringTreeFolder() {
      StringBuilder builder = new StringBuilder();
      builder.append(pre)// thụt dòng
              .append(ten);
      for(AbstractFile f : list)
      {
          f.pre = this.pre +"..";
          builder.append("\n") // xuống hàng
                  .append(f.getStringTreeFolder());
          f.pre ="";
      }
      return builder.toString();
    }

}
