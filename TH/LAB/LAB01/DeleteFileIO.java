import java.io.File;

public class DeleteFileIO {
    private void deleteFile(String source){
        File file = new File(source);

        if (file.exists()) {
            System.out.println("File ton tai");
            file.delete();
            System.out.println("Xoa file thanh cong");
        } else {
            System.out.println("File khong ton tai");
        }
    }
    public static void main(String[] args) {
        DeleteFileIO deleteFileIO = new DeleteFileIO();
        deleteFileIO.deleteFile("D:/IUH/HK3/PTHTTH - LT T2 TH CN/TH/LAB/LAB01/demo.txt");
    }
}
