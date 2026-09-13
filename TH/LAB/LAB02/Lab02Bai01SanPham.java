public class Lab02Bai01SanPham {
    private String maSanPham;
    private String tenSanPham;
    private double donGia;
    private int soLuong;

    public Lab02Bai01SanPham(String maSanPham, String tenSanPham, double donGia, int soLuong) {
        this.maSanPham = maSanPham;
        this.tenSanPham = tenSanPham;
        this.donGia = donGia;
        this.soLuong = soLuong;
    }

    public double tinhThanhTien() {
        return this.donGia * this.soLuong;
    }

    public void nhapHang(int soLuongNhap) {
        if (soLuongNhap > 0) {
            this.soLuong += soLuongNhap;
            System.out.println("Da nhap them " + soLuongNhap + " san pham");
        } else {
            System.out.println("So luong nhap phai lon hon 0");
        }
    }

    public boolean banHang(int soLuongBan) {
        if (soLuongBan <= 0) {
            System.out.println("So luong ban phai lon hon 0 ");
            return false;
        }
        if (soLuongBan > this.soLuong) {
            System.out.println("So luong trong kho khong du");
            return false;
        }
        this.soLuong -= soLuongBan;
        System.out.println("Da ban thanh cong " + soLuongBan + " san pham");
        return true;
    }

    public void hienThiThongTin() {
        System.out.println("Ma san pham: " + maSanPham);
        System.out.println("Ten san pham: " + tenSanPham);
        System.out.printf("Don gia: %,.0f\n", donGia);
        System.out.println("So luong: " + soLuong);
        System.out.printf("Thanh tien: %,.0f\n", tinhThanhTien());

    }

    public String getMaSanPham() {
        return maSanPham;
    }

    public void setMaSanPham(String maSanPham) {
        this.maSanPham = maSanPham;
    }

    public String getTenSanPham() {
        return tenSanPham;
    }

    public void setTenSanPham(String tenSanPham) {
        this.tenSanPham = tenSanPham;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }
}
