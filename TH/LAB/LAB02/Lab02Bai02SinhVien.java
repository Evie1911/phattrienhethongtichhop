/**
 * Lab02Bai02SinhVien
 */
public class Lab02Bai02SinhVien extends Lab02Bai02Nguoi {
    private String maSinhVien;
    private String nganhHoc;
    private double diemTrungBinh;

    public Lab02Bai02SinhVien(String hoTen, int namSinh, String diaChi, String maSinhVien, String nganhHoc,
            double diemTrungBinh) {
        super(hoTen, namSinh, diaChi);
        this.maSinhVien = maSinhVien;
        this.nganhHoc = nganhHoc;
        this.diemTrungBinh = diemTrungBinh;
    }

    public String xepLoai() {
        if (diemTrungBinh >= 8.5) {
            return "Gioi";
        } else if (diemTrungBinh >= 7.0) {
            return "Kha";
        } else if (diemTrungBinh >= 5.0) {
            return "TrungBinh";
        } else {
            return "Yeu";
        }
    }

    @Override
    public void hienThiThongTin() {
        // TODO Auto-generated method stub
        System.out.println("---THONG TIN SINH VIEN---");
        super.hienThiThongTin();
        System.out.println("Ma SV: " + maSinhVien);
        System.out.println("Nganh hoc: " + nganhHoc);
        System.out.println("Diem TB: " + diemTrungBinh);
        System.out.println("Xep loai: " + xepLoai());
    }
}