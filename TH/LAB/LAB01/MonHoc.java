public class MonHoc {
    String TenMonHoc;
    Integer TinChi;
    Double Diem;
    public String getTenMonHoc() {
        return TenMonHoc;
    }
    public Integer getTinChi() {
        return TinChi;
    }
    public Double getDiem() {
        return Diem;
    }
    public MonHoc(String tenMonHoc, Integer tinChi, Double diem) {
        this.TenMonHoc = tenMonHoc;
        this.TinChi = tinChi;
        this.Diem = diem;
    }
    
}
