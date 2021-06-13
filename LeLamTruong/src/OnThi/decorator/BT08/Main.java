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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Tokienize t = new TachChuoi("Tokenize là quá trình tách một chuỗi thành các từ.");    
        System.out.println("------Tách chuỗi bình thường----------");
        t.tachChuoi();
        
       
        t= new Punctuation(t,t.chuoi);
        System.out.println("------Tách chuỗi bỏ dấu câu-----------");
        t.tachChuoi();
        
        
        t= new StopWord(t,t.chuoi);
        System.out.println("------Tách chuỗi bỏ từ dừng-----------");
        t.tachChuoi();
        
    }
    
}
