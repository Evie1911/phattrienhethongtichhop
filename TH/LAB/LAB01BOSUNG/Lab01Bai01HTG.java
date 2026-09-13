public class Lab01Bai01HTG {
    double canhA;
    double canhB;
    double canhC;

    public Lab01Bai01HTG() {
        this.canhA = 0;
        this.canhB = 0;
        this.canhC = 0;
    }

    public Lab01Bai01HTG(double canhA, double canhB, double canhC) {
        this.canhA = canhA;
        this.canhB = canhB;
        this.canhC = canhC;
    }

    public double getCanhA() {
        return canhA;
    }

    public void setCanhA(double canhA) {
        this.canhA = canhA;
    }

    public double getCanhB() {
        return canhB;
    }

    public void setCanhB(double canhB) {
        this.canhB = canhB;
    }

    public double getCanhC() {
        return canhC;
    }

    public void setCanhC(double canhC) {
        this.canhC = canhC;
    }

    private boolean laTamGiacHopLe() {
        return (canhA + canhB > canhC) && (canhA + canhC > canhB) && (canhB + canhC > canhA);
    }

    public double tinhChuViHTG() {
        if (!laTamGiacHopLe()) {
            return 0;
        }
        return this.canhA + this.canhB + this.canhC;
    }

    public double tinhDienTichHTG() {
        if (!laTamGiacHopLe()) {
            return 0;
        }
        double p = tinhChuViHTG() / 2;
        return Math.sqrt(p * (p - this.canhA) * (p - this.canhB) * (p - this.canhC));
    }

    public void xuatThongTinHTG() {
        System.out.println("--- HINH TAM GIAC ---");
        if (laTamGiacHopLe()) {
            System.out.println("3 Canh: " + this.canhA + ", " + this.canhB + ", " + this.canhC);
            System.out.println("Chu vi: " + tinhChuViHTG());
            System.out.println("Dien tich: " + tinhDienTichHTG());
        } else {
            System.out.println("Loi: 3 canh " + canhA + ", " + canhB + ", " + canhC);
        }

    }
}
