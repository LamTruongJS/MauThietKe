/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OnThi.BT02.F2;

/**
 *
 * @author Administrator
 */
public class RutTien implements IRutTien{
    //gọi giao diện là 1 thuộc tính của lớp
    IRutTien successor;
    int menhGia;
    

    public RutTien(int menhGia) {
        this.menhGia = menhGia;
    }

    @Override
    public IRutTien setSuccessor(IRutTien successor) {
        this.successor = successor;
        return successor;
    }

    @Override
    public void soTo(int soTien) {
        // nếu số tiền hiện có nhỏ hơn mệnh giá thì chuyển cho mệnh giá nhỏ hơn tính số tờ tiền
        if(soTien<menhGia)
            successor.soTo(soTien);
        else
        {
            //Lấy số tờ tiền
            int soToTien = soTien/menhGia;
            //Lấy số tiền dư
            int soTienDu = soTien% menhGia;
            
            System.out.println("Mệnh Giá: "+menhGia+ " ta rút "+ soToTien +" tờ");
            //Nếu chuỗi xử lí vẫn còn, và số tiền dư bé hơn mệnh giá hiện tại
            // thì chuyển xuống chuổi xử lí tiếp theo
            // Đây là 1 đặc trưng của mẫu chain
            if(successor!=null && soTienDu < menhGia)
            {
                successor.soTo(soTienDu);
            }
            else
                System.out.println("Không Thể xử lý được nữa");
        }
    }

  
    
}
