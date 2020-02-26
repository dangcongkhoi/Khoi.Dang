package VTC_JavaOOP.BTLTHDT_2019.KhaiNiemCoBanLapTrinh;

import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Bai5 {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy");
        DecimalFormat decimalFormat= new DecimalFormat(("#,##0.00"));
        Date sp1 = new Date();
        sp1=f.parse("10/07/2018");
        Date sp1hethan;
        sp1hethan=f.parse("10/07/2020");
        HangThucPham a001= new HangThucPham("001","Gao",100000, sp1,sp1hethan);

        Date sp2 = new Date();
        sp2=f.parse("01/03/2018");
        Date sp2hethan;
        sp2hethan=f.parse("01/09/2020");
        HangThucPham a002= new HangThucPham("002","Mi",5000, sp2,sp2hethan);

        Date sp3 = new Date();
        sp3=f.parse("01/03/2017");
        Date sp3hethan;
        sp3hethan=f.parse("01/03/2018");
        HangThucPham a003= new HangThucPham("003","Nuoc",10000, sp3,sp3hethan);
        System.out.printf("%-8s %-30s %-20s %-30s %-30s %-30s ","Ma-Hang","Ten_hang","Don_Gia","Ngay_San_Xuat","Ngay_Het_Han","Ghi_chu");
        System.out.println();
        a001.disPlay();
        a002.disPlay();
        a003.disPlay();

    }
}
class HangThucPham{
    private String maHang;
    private String tenHang;
    private double donGia;
    private Date ngaySanXuat;
    private Date ngayHetHan;
    public HangThucPham(String maHang, String tenHang, double donGia, Date ngaySanXuat) {
        this.maHang = maHang;
        this.tenHang = tenHang;
        this.donGia = donGia;
        this.ngaySanXuat = ngaySanXuat;
    }

    public HangThucPham(String maHang, String tenHang, double donGia, Date ngaySanXuat, Date ngayHetHan) {
        this.maHang = maHang;
        this.tenHang = tenHang;
        this.donGia = donGia;
        this.ngaySanXuat = ngaySanXuat;
        this.ngayHetHan = ngayHetHan;
    }

    public Date getNgayHetHan() {
        return ngayHetHan;
    }

    public void setNgayHetHan(Date ngayHetHan) {
        this.ngayHetHan = ngayHetHan;
    }

    public String getMaHang() {
        return maHang;
    }
    private void setMaHang(String maHang) throws Exception {
        if (!maHang.trim().equals(""))
        this.maHang = maHang;
        else throw new  Exception("Ma hang Rong");
    }
    public String getTenHang() {
        return tenHang;
    }
    public void setTenHang(String tenHang) {
        this.tenHang = tenHang;
    }
    public double getDonGia() {
        return donGia;
    }
    public void setDonGia(double donGia) {
        DecimalFormat decimalFormat= new DecimalFormat(("#,##0.00"));

        this.donGia = donGia;
    }
    public Date getNgaySanXuat() {
        return ngaySanXuat;
    }
    public void setNgaySanXuat(Date ngaySanXuat) {

        this.ngaySanXuat = ngaySanXuat;
    }
    public boolean hetHan(){
       Date d =new Date();
        return ngayHetHan.before(d);
        //return ngayHetHan.before(ngayHetHan);
    }
    public String ghiChu(){
        String ghiCHu = "";
        if (hetHan()){
            ghiCHu ="Het Han";
        }
        return ghiCHu;
    }
    public void disPlay(){
        SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy");
        DecimalFormat decimalFormat= new DecimalFormat(("#,##0.00"));
        System.out.printf("%-8s %-30s %-20s %-30s %-30s %-30s ",maHang,tenHang,decimalFormat.format(donGia),f.format(ngaySanXuat),f.format(ngayHetHan),ghiChu());
        System.out.println();
    }
}