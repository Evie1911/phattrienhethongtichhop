import java.util.Scanner;

public class Lab01Bai02DemoArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Lab01Bai02Array mang = new Lab01Bai02Array(20);

        System.out.println("=== 1. KHOI TAO VA NHAP MANG ===");
        mang.nhapGiaTri(sc, 5);
        mang.xuatThongTin();

        System.out.println("\n=== 2. THEM PHAN TU ===");
        mang.themVaoDau(24);
        mang.themVaoCuoi(2);
        mang.themVaoViTri(66, 3);
        mang.xuatThongTin();

        System.out.println("\n=== 3.TIM KIEM (CHUA SAP XEP) ===");
        int B1 = 66;
        int vitriB1 = mang.timKiemChuaSapXep(B1);
        System.out.println("Tim "+B1+" bang Linear Search: Vi tri "+vitriB1);

        System.out.println("\n=== 4. XOA PHAN TU ===");
        mang.xoaTaiViTri(1);
        mang.xuatThongTin();
        mang.xoaPhanTuX(24);
        mang.xuatThongTin();

        System.out.println("\n=== 5. SAP XEP RADIX SORT ===");
        mang.radixSort(true);
        mang.xuatThongTin();

        System.out.println("\n=== 6. TIM KIEM (DA SAP XEP) ===");
        int B2 = 90;
        int vitriB2 = mang.timKiemDaSapXep(B2);
        System.out.println("Tim "+B2+ " bang Binary Search: vi tri "+vitriB2);

        sc.close();
    }    
}
