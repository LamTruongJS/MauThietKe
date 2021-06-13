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
public class RutTien implements IRutTien{

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
        if(soTien < menhGia)
            successor.soTo(soTien);
        else{

            // tính số tờ tiền cần chi bằng cách lấy số nguyên phần chia của số tiền cho mệnh giá
            int soToTien = soTien / menhGia;

            // số tiền còn lại sau khi tính được số tờ cần chi, là lấy dư của số tiền cho mệnh giá
            int soTienDu = soTien % menhGia;

            // in ra kết quả tính được
            System.out.println("Mệnh giá " + menhGia + " chi " + soToTien + " tờ");

            // nếu số tiền dư nó khác 0, tức là vẫn có thể chi bằng số tiền nhỏ hơn thì chuyển nó xuống mệnh giá thấp hơn
            if(soTienDu > 0 && successor!=null)
                successor.soTo(soTienDu);
            else
                return; // nếu số tiền dư bằng 0, tức là chi đã đủ số tờ cần thiết thì dừng chương trình
        }
    }
}
