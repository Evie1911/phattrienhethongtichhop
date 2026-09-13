import java.io.IOException;

public class HelloJava{
    static String tenlop;
    public static void main(String[] args) throws IOException{
        tenlop = "cntt21avl";
        System.out.println("Hello class " + tenlop);
        int ch = 0;
        do {
            System.out.println("Nhap mot ky tu: ");
            ch = System.in.read();
            System.in.read();
            System.in.read();

            if (ch == 'K') {
               System.out.println("Ban da trung thuong");
            } else {
               System.out.println("Chuc ban may man lan sau");
            }
        } while (ch != 'Q');
            
            
    }
}