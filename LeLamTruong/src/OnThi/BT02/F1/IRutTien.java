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
   IRutTien setSuccessor(IRutTien successor);
   void soTo(int soTien);  
}
