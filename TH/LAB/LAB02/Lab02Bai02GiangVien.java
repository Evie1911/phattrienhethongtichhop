public class Lab02Bai02GiangVien extends Lab02Bai02Nguoi {
    private String maGiangVien;
    private String chuyenMon;
    private double luongCoBan;
    private double heSoLuong;

    public Lab02Bai02GiangVien(String hoTen, int namSinh, String diaChi, String maGiangVien, String chuyenMon,
            double luongCoBan, double heSoLuong) {
        super(hoTen, namSinh, diaChi);
        this.maGiangVien = maGiangVien;
        this.chuyenMon = chuyenMon;
        this.luongCoBan = luongCoBan;
        this.heSoLuong = heSoLuong;
    }

    public double tinhLuong() {
        return luongCoBan * heSoLuong;
    }

    @Override
    public void hienThiThongTin() {
        // TODO Auto-generated method stub
        System.out.println("---THONG TIN GIANG VIEN---");
        super.hienThiThongTin();
        System.out.println("Ma GV: " + maGiangVien);
        System.out.println("Chuyen mon: " + chuyenMon);
        System.out.println("Luong co ban: " + String.format("%,.0f", luongCoBan) + " VND");
        System.out.println("He so luong: " + heSoLuong);
        System.out.println("Tong luong: " + String.format("%,.0f", tinhLuong()) + " VND");

    }
}
