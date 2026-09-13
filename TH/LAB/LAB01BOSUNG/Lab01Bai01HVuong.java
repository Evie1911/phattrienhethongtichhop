public class Lab01Bai01HVuong {
    double canh;

    public Lab01Bai01HVuong() {
        this.canh = 0;
    }

    public Lab01Bai01HVuong(double canh) {
        this.canh = canh;
    }

    public double getCanh() {
        return canh;
    }

    public void setCanh(double canh) {
        this.canh = canh;
    }

    public double tinhChuViHVuong() {
        return this.canh * 4;
    }

    public double tinhDienTichHVuong() {
        return this.canh * this.canh;
    }

    public void xuatThongTinHVuong() {
        System.out.println("--- HINH VUONG ---");
        System.out.println("Canh: " + this.canh);
        System.out.println("Chu vi: " + tinhChuViHVuong());
        System.out.println("Dien tich: " + tinhDienTichHVuong());
    }
}
