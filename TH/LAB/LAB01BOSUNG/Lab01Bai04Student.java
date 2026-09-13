import java.util.Scanner;

public class Lab01Bai04Student extends Lab01Bai03Person{
    double diemTrungBinh;
    String email;

    public Lab01Bai04Student(){
        super();
    }

    public Lab01Bai04Student(String ten, String gioiTinh, String ngaySinh, String diaChi, double diemTrungBinh,
            String email) {
        super(ten, gioiTinh, ngaySinh, diaChi);
        this.diemTrungBinh = diemTrungBinh;
        this.email = email;
    }

    public double getDiemTrungBinh() {
        return diemTrungBinh;
    }

    public void setDiemTrungBinh(double diemTrungBinh) {
        this.diemTrungBinh = diemTrungBinh;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public void inputinfo() {
        // TODO Auto-generated method stub
        super.inputinfo();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Nhập điểm trung binh: ");
            try {
                this.diemTrungBinh = Double.parseDouble(sc.nextLine());
                if (this.diemTrungBinh >= 0.0 && this.diemTrungBinh <=10.0) {
                    break;
                } else {
                    System.out.println("LỖI: Điểm trung bình phải nằm trong khoảng 0.0 - 10.0");
                }
            } catch (NumberFormatException e) {
                // TODO: handle exception
                System.out.println("LỖI: Vui lòng nhập số hợp lệ");
    
            }
        }

        while (true) {
            System.out.println("Nhập email sinh viên: ");
            this.email = sc.nextLine();
            if (this.email.contains("@") && !this.email.contains(" ")) {
                break;
            } else {
                System.out.println("LỖI: Email phải chứa ký tự '@' và không được chứa khoảng trắng");

            }
        }
    }

    public boolean kiemTraHocBong(){
        return this.diemTrungBinh > 8.0;
    }

    @Override
    public void printinfo() {
        // TODO Auto-generated method stub
        System.out.println("----------------");
        System.out.println("THÔNG TIN CÁ NHÂN");
        System.out.println("Tên: "+ getTen());
        System.out.println("Giới tính: " + getGioiTinh());
        System.out.println("Ngày sinh: "+ getNgaySinh());
        System.out.println("Địa chỉ: "+ getDiaChi());
        System.out.println("Điểm trung bình: " + this.diemTrungBinh);
        System.out.println("Email: "+ this.email);

        if (kiemTraHocBong()) {
            System.out.println("Học bổng: Có");
        } else {
            System.out.println("Học bổng: Không");
        }
        System.out.println("----------------");

    }
    
    public static void main(String[] args) {
        System.out.println("NHẬP THÔNG TIN SINH VIÊN");

        Lab01Bai04Student student = new Lab01Bai04Student();

        student.inputinfo();

        student.printinfo();
        
    }
}
