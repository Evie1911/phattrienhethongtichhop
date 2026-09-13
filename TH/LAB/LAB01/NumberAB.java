import java.util.Scanner;

/**
 * NumberAB
 */
public class NumberAB {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vui long nhap so hang thu nhat: ");
        int soA = scanner.nextInt();
        System.out.println("Vui long nhap so hang thu hai: ");
        int soB = scanner.nextInt();
        int kq = soA + soB;
        System.out.println("Tinh tong [ " + soA + " + " + soB + " ] = " + kq);
    scanner.close();
    }
}