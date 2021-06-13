/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package template.BT2_2_BT4On;

/**
 *
 * @author Administrator
 */
public class CTHoaDon {
    private MatHang matHang;
    private int soLuongMua;

    public CTHoaDon(MatHang matHang, int soLuongMua) {
        this.matHang = matHang;
        this.soLuongMua = soLuongMua;
    }

    public MatHang getMatHang() {
        return matHang;
    }

    public int getSoLuongMua() {
        return soLuongMua;
    }

    public void setMatHang(MatHang matHang) {
        this.matHang = matHang;
    }

    public void setSoLuongMua(int soLuongMua) {
        this.soLuongMua = soLuongMua;
    }
    public double thanhTien(){
        return matHang.getDonGia()*soLuongMua;
    }
}
