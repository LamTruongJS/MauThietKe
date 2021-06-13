/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package behavioral.chain.BT2On;

/**
 *
 * @author Administrator
 */
public class XepLoai implements IXepLoai{
    IXepLoai successor;
    int diemtl;
    String xloai;

    public XepLoai(int diemtl, String xl) {
        this.diemtl = diemtl;
        this.xloai = xl;
    }
  
    @Override
    public IXepLoai setSuccessor(IXepLoai xl) {
        this.successor = xl;
        return xl;
    }

    @Override
    public void XL(int diem) {
        if(diem<diemtl){
            System.out.println("Khách hàng "+this.xloai);
        }
        else if(successor!=null)
            successor.XL(diem);
        else System.out.println("Khách hàng không thể phân loại");
    }   

}

