import java.io.File;

public class DeleteFolder {
    public boolean deleteEmptyFolder(String source){
        File folder = new File(source);
        if (folder.exists()) {
            folder.delete();
            System.out.println("Folder ton tai\n xoa folder thanh cong");
            return true;
        } else {
            System.out.println("Folder khong ton tai");
        }
        return false;
    }
    public boolean deleteListFileInFolder(String source){
        File folder = new File(source);
        if (folder.exists()) {
            File[] listFile = folder.listFiles();
            if (listFile.length != 0) {
                for(File f : listFile){
                    if (f.isFile()) {
                        f.delete();
                    }
                    if (f.isDirectory()) {
                        deleteListFileInFolder(f.getAbsolutePath());
                    }
                }
            }
            folder.delete();
            System.out.println("Delete folder thanh cong");
            return true;
        } else {
            System.out.println("Folder khong ton tai");
            return false;
        }
        
    }
    public static void main(String[] args) {
        DeleteFolder deleteFolder = new DeleteFolder();
        deleteFolder.deleteListFileInFolder("D:/IUH/HK3/PTHTTH - LT T2 TH CN/TH/LAB/LAB01/test");
    }
}
