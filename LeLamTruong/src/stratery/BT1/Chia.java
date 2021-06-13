/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stratery.BT1;

/**
 *
 * @author Administrator
 */
public class Chia implements ITinh{

    @Override
    public float tinh(float a, float b) {
        if(b==0)
            return -1;
        else 
            return a/b;
    }
    
    
}
