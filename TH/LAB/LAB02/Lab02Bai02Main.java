public class Lab02Bai02Main {
    public static void main(String[] args) {
        Lab02Bai02SinhVien sv1 = new Lab02Bai02SinhVien("Thai Le Minh Hieu", 2002, "Quang Binh", "SV001",
                "Cong nghe thong tin", 9.0);
        Lab02Bai02SinhVien sv2 = new Lab02Bai02SinhVien("Nguyen Thanh Phuc Nguyen", 2005, "Da Lat", "SV002",
                "Kinh te", 6.5);

        Lab02Bai02GiangVien gv1 = new Lab02Bai02GiangVien("Tran Dai Nghia", 1978, "Ho Chi Minh", "GV001",
                "Khoa hoc may tinh", 15000000, 2.5);
        Lab02Bai02GiangVien gv2 = new Lab02Bai02GiangVien("Ngo Thai Minh", 1983, "My", "GV002",
                "Tai chinh", 13500000, 2.0);
        
        sv1.hienThiThongTin();
        System.out.println();

        sv2.hienThiThongTin();
        System.out.println();

        gv1.hienThiThongTin();
        System.out.println();

        gv2.hienThiThongTin();
        System.out.println();

    }
}
