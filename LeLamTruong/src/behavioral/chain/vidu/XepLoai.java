/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package behavioral.chain.vidu;

/**
 *
 * @author Administrator
 */
public class XepLoai implements IXepLoai{
    float max;
    String xl;
    IXepLoai successor;
    public XepLoai(float max, String xl) {
        this.max = max;
        this.xl= xl;
    }
    
    @Override
    public IXepLoai setSuccessor(IXepLoai xl) {
      this.successor = xl;
     return xl;
    }

    @Override
    public String xepLoai(float diem) {
        if(diem < max)
            return xl;
        else
            if(successor!=null)
                return successor.xepLoai(diem);
        return "Khong biet";
    }    
}
