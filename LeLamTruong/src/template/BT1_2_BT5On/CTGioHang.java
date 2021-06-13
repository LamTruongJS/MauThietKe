/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package template.BT1_2_BT5On;

/**
 *
 * @author Administrator
 */
public class CTGioHang {
    private MatHang matHang;
    private int soLuongMua;

    public CTGioHang(MatHang mh, int soLuongMua) {
        this.matHang = mh;
        this.soLuongMua = soLuongMua;
    }

    public MatHang getMatHang() {
        return matHang;
    }

    public void setMatHang(MatHang matHang) {
        this.matHang = matHang;
    }

    public int getSoLuongMua() {
        return soLuongMua;
    }

    public void setSoLuongMua(int soLuongMua) {
        this.soLuongMua = soLuongMua;
    }
    public double thanhTien(){
        return matHang.getDonGia() * soLuongMua;
    }
}
