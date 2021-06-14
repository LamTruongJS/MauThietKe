/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OnThi.template.BT03;

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
        
        HoaDon hd = new KhachHangThanThiet();
//        hd.themVaoHoaDon(new CTHoaDon(new MatHang(tenMH, 0), 0, 0));
        hd.inDS();
        
    }
    
}
