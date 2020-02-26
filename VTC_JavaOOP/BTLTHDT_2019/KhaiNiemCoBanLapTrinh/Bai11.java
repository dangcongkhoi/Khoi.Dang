package VTC_JavaOOP.BTLTHDT_2019.KhaiNiemCoBanLapTrinh;

import java.util.Date;

public class Bai11 {
}
class HocVien{
    private String ten,diachi;
    private int phone;

    public HocVien(String ten, String diachi, int phone) {
        this.ten = ten;
        this.diachi = diachi;
        this.phone = phone;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }
}
class ThongTinKhoaHoc{
    String tenKhoaHoc;
    Date ngayMoKhoahoc;
    int soBuoiThamGiaTrongKhoa;
        }