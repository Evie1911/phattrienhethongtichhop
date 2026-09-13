import java.util.Scanner;

public class Lab01Bai05StudentDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số lượng sinh viên: ");
        int n = Integer.parseInt(sc.nextLine());

        Lab01Bai04Student[] students = new Lab01Bai04Student[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\n- Nhập thông tin sinh viên thứ " + (i + 1) + " : ");
            students[i] = new Lab01Bai04Student();
            students[i].inputinfo();
        }

        for (int i = 0; i < n; i++) {
            students[i].printinfo();
        }

        if (n > 0) {
            double maxDiem = students[0].getDiemTrungBinh();
            double minDiem = students[0].getDiemTrungBinh();

            for (int i = 1; i < n; i++) {
                if (students[i].getDiemTrungBinh() > maxDiem) {
                    maxDiem = students[i].getDiemTrungBinh();
                }
                if (students[i].getDiemTrungBinh() < minDiem) {
                    minDiem = students[i].getDiemTrungBinh();
                }

            }
            System.out.println("\n==SINH VIEN CO DIEM TRUNG BINH CAO NHAT: " + maxDiem);
            for (int i = 0; i < n; i++) {
                if (students[i].getDiemTrungBinh() == maxDiem) {
                    students[i].printinfo();
                }
            }

            System.out.println("\n==SINH VIEN CO DIEM TRUNG BINH THAP NHAT: " + minDiem);
            for (int i = 0; i < n; i++) {
                if (students[i].getDiemTrungBinh() == minDiem) {
                    students[i].printinfo();
                }
            }

            System.out.println("\n== DANH SACH SINH VIEN DAT HOC BONG");
            boolean coHocBong = false;
            for (int i = 0; i < n; i++) {
                if (students[i].kiemTraHocBong()) {
                    students[i].printinfo();
                    coHocBong = true;
                }
            }
            if (!coHocBong) {
                System.out.println("Khong co sinh vien dat hoc bong");
            }
            sc.close();
        }
    }
}
