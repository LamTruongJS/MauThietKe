/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OnThi.BT02.F1;

/**
 *
 * @author Administrator
 */
public interface IRutTien {
    //định nghĩa ra 1 interface để xử lý các yêu cầu
    //gán giá trị cho đối tượng successor
   IRutTien setSuccessor(IRutTien successor);
   void soTo(int soTien);  
}
