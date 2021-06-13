/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OnThi.decorator.BT08;

/**
 *
 * @author Administrator
 */
public class StopWord extends Decorator{

    public StopWord(Tokienize tokienize, String chuoi) {
        super(tokienize, chuoi);
    }
  
    //override method
    @Override
    public void tachChuoi() {
        String[] chuoiStopwrod ={"và","thì","mà","là","hoặc"};
        for(int i=0 ; i< chuoiStopwrod.length; i++)
        {
            chuoi =chuoi.toLowerCase();
            chuoi = chuoi.replace(chuoiStopwrod[i],"");
        }
         String[] strs = chuoi.split("\\s+");
            for (int i=0; i < strs.length; i++) {
            System.out.println("["+i+"]:"+strs[i]);
            }
    }
    
}
