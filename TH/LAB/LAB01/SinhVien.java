import java.util.ArrayList;

public class SinhVien {
    String MSSV;
    String Ten;
    Integer Tuoi;
    private ArrayList<MonHoc> ListMH;
    public String getMSSV() {
        return MSSV;
    }
    public String getTen() {
        return Ten;
    }
    public Integer getTuoi() {
        return Tuoi;
    }
    public ArrayList<MonHoc> getListMH() {
        return ListMH;
    }
    public SinhVien(String mSSV, String ten, Integer tuoi, ArrayList<MonHoc> listMH) {
        this.MSSV = mSSV;
        this.Ten = ten;
        this.Tuoi = tuoi;
        this.ListMH = listMH;
    }
    
   
}
