public class Lab02Bai01Main {
    public static void main(String[] args) {
        Lab02Bai01SanPham sp1 = new Lab02Bai01SanPham("SP01", "Laptop Dell", 15000000, 10);
        Lab02Bai01SanPham sp2 = new Lab02Bai01SanPham("SP02", "Chuot Logitech", 500000, 50);

        sp1.hienThiThongTin();
        sp2.hienThiThongTin();

        sp1.nhapHang(5);
        System.out.println("Nhap 5 Laptop: ");
        sp1.hienThiThongTin();

        sp2.banHang(20);
        System.out.println("Ban 20 Chuot: ");
        sp2.hienThiThongTin();

        sp1.banHang(20);
        System.out.println("Ban 20 Laptop: ");
        sp1.hienThiThongTin();

    }
}
