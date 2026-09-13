import java.util.Scanner;

/**
 * Lab01Bai03Person
 */
public class Lab01Bai03Person {
    String ten;
    String gioiTinh;
    String ngaySinh;
    String diaChi;

    public Lab01Bai03Person() {
    }

    public Lab01Bai03Person(String ten, String gioiTinh, String ngaySinh, String diaChi) {
        this.ten = ten;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public void inputinfo() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập tên: ");
        this.ten = sc.nextLine();

        System.out.print("Nhập giới tính: ");
        this.gioiTinh = sc.nextLine();

        System.out.print("Nhập ngày sinh: ");
        this.ngaySinh = sc.nextLine();

        System.out.print("Nhập địa chỉ: ");
        this.diaChi = sc.nextLine();
        
    }

    public void printinfo() {
        System.out.println("----------------");
        System.out.println("THÔNG TIN CÁ NHÂN");
        System.out.println("Tên: "+ this.ten);
        System.out.println("Giới tính: " +this.gioiTinh);
        System.out.println("Ngày sinh: "+ this.ngaySinh);
        System.out.println("Địa chỉ: "+ this.diaChi);
        System.out.println("----------------");

    }
    public static void main(String[] args) {
        Lab01Bai03Person person = new Lab01Bai03Person();
        person.inputinfo();
        person.printinfo();
    }
}