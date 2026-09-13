public class Lab01Bai01DemoHinh {
    public static void main(String[] args) {
        Lab01Bai01HCN hinhChuNhat = new Lab01Bai01HCN(8.5, 4.0);
        Lab01Bai01HVuong hinhVuong = new Lab01Bai01HVuong(5.0);

        Lab01Bai01HTG tamGiac = new Lab01Bai01HTG(3.0, 4.0, 5.0);

        Lab01Bai01HTG tamGiacLoi = new Lab01Bai01HTG(1.0, 2.0, 5.0);

        System.out.println("=== THONG TIN CAC DOI TUONG HINH HOC ===");
        hinhChuNhat.xuatThongTinHCN();
        System.out.println();

        hinhVuong.xuatThongTinHVuong();
        System.out.println();

        tamGiac.xuatThongTinHTG();
        System.out.println();

        tamGiacLoi.xuatThongTinHTG();
        System.out.println();
    }
}
