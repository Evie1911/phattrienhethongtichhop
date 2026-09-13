import java.util.Scanner;

public class TheZoo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isrun = true;
        while (isrun) {
            System.out.print("Vui long nhap con vat: ");
            String animal = scanner.nextLine();
            String name;
            int weight;
            switch (animal) {
                case "Lion":
                    name = "Leo";
                    weight = 300;
                    System.out.println("Su tu " + name + " nang " + weight + " can va an 5 can thit moi ngay");
                    break;
                case "Snake":
                    name = "Boa";
                    weight = 50;
                    System.out.println("Con ran " + name + " nang " + weight + " can va dai 5 met");
                    break;
                case "Monkey":
                    name = "George";
                    weight = 150;
                    System.out.println("Su tu " + name + " nang " + weight + " can va thich an chuoi");
                    break;
                default:
                    isrun = false;
                    scanner.close();
                    System.out.println("STOP");
                    break;
            }
        }
    }
}
