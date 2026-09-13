public class Lab01Bai01HCN {
    double chieuDai;
    double chieuRong;

    public Lab01Bai01HCN(){
        this.chieuDai = 0;
        this.chieuRong = 0;
    }

    public Lab01Bai01HCN(double chieuDai, double chieuRong) {
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }

    public double getChieuDai() {
        return chieuDai;
    }

    public void setChieuDai(double chieuDai) {
        this.chieuDai = chieuDai;
    }

    public double getChieuRong() {
        return chieuRong;
    }

    public void setChieuRong(double chieuRong) {
        this.chieuRong = chieuRong;
    }
    
    public double tinhChuViHCN(){
        return (this.chieuDai + this.chieuRong) * 2;
    }

    public double tinhDienTichHCN(){
        return this.chieuDai * this.chieuRong;
    }
    public void xuatThongTinHCN(){
        System.out.println("--- HINH CHU NHAT ---");
        System.out.println("Chieu dai: " +this.chieuDai +" | Chieu rong: "+this.chieuRong);
        System.out.println("Chu vi: "+tinhChuViHCN());
        System.out.println("Dien tich: " + tinhDienTichHCN());
    }
}
