/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package behavioral.observer.BT1On;

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
          QuanLy quanLy = new QuanLy();

        NhanVien nhanVien1 = new NhanVien("Trường", quanLy);
        NhanVien nhanVien2 = new NhanVien("Sơn", quanLy);
        NhanVien nhanVien3 = new NhanVien("Tùng", quanLy);

        CongViec congViec1 = new CongViec("Bán công ty",
                "Công ty thiếu nợ, mọi người tranh thủ tìm kiếm người mua công ty",
                "20-10-2021");
        CongViec congViec2 = new CongViec("Xù lương",
                "Phá sản",
                "18-10-2021");

        nhanVien1.dangKy();
        nhanVien2.dangKy();

        quanLy.giaoViec(congViec1);

        nhanVien3.dangKy();
        quanLy.giaoViec(congViec2);

        BaoCao baoCao1 = new BaoCao(congViec1, nhanVien1, "Quá khó");
        BaoCao baoCao2 = new BaoCao(congViec1, nhanVien2, "Quá dễ");

        nhanVien1.guiBaoCao(baoCao1);
        nhanVien2.guiBaoCao(baoCao2);

        System.out.println("Danh sách công việc của nhân viên 1");
        nhanVien1.danhSachCongViec();
        System.out.println("\nDanh sách công việc của nhân viên 3");
        nhanVien3.danhSachCongViec();

        System.out.println("Các báo cáo");
        quanLy.danhSachBaoCao();
    }
    
}
