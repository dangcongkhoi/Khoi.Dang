package VTC_JavaOOP.BTLTHDT_2019.KeThua_DaHinh;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Bai4 {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy");
        Date a = new Date();
        a = f.parse("09/12/2012");

        Date a1 = new Date();
        a1 = f.parse("03/02/2000");

        Date a2 = new Date();
        a2 = f.parse("01/12/2019");
        real_estaste gd1 = new real_estaste(1, a, 10000, 200, 0);
        real_estaste gd2 = new real_estaste(2, a1, 30000, 100, 1);
        Home homegd1 = new Home(1, a2, 5000, 100, "195 Dien Bien Phu", 0);

        DanhSachGiaoDichNhaDat data = new DanhSachGiaoDichNhaDat();
        data.add_realestaste(gd1);
        data.add_realestaste(gd2);
        data.addHome(homegd1);

        data.DisplayReal();

        data.trungBinhThanhTienDat();

//ngay can tim
        Date before = new Date();
        before = f.parse("30/09/2013");
        data.XuatDsGiaoDich(before);
    }
}

class DanhSachGiaoDichNhaDat {
    private int iD;
    private Date ngayGiaoDich;
    private double DonGia;
    private double dienTich;
    ArrayList<real_estaste> real_estasteArrayList = new ArrayList<>();
    ArrayList<Home> homeArrayList = new ArrayList<>();

    public void XuatDsGiaoDich(Date a) {
        for (int i = 0; i < real_estasteArrayList.size(); i++) {
            if (real_estasteArrayList.get(i).getNgayGiaoDich().before(a) == true) {
                System.out.println(real_estasteArrayList.get(i).toString());
            }
        }


        for (int i = 0; i < homeArrayList.size(); i++) {
            if (homeArrayList.get(i).getNgayGiaoDich().before(a) == true) {
                System.out.println(homeArrayList.get(i).toString());
            }
        }
    }

    public DanhSachGiaoDichNhaDat() {

    }

    public void add_realestaste(real_estaste a) {
        real_estasteArrayList.add(a);
    }

    public void addHome(Home a) {
        homeArrayList.add(a);
    }

    public void DisplayReal() {
        System.out.println("Luong giao dich Dat: " + real_estasteArrayList.size());
        System.out.println("luong giao dich Nha: " + homeArrayList.size());
    }

    public void trungBinhThanhTienDat() {
        double ThanhTiendat = 0;

        for (int i = 0; i < real_estasteArrayList.size(); i++) {
            ThanhTiendat += real_estasteArrayList.get(i).thanhTien();
        }

        System.out.println("gia Dat Trung BInh: " + ThanhTiendat / (real_estasteArrayList.size()));
    }

    @Override
    public String toString() {
        return "DanhSachGiaoDichNhaDat{" +
                "iD=" + iD +
                ", ngayGiaoDich=" + ngayGiaoDich +
                ", DonGia=" + DonGia +
                ", dienTich=" + dienTich +
                '}';
    }

    public int getiD() {
        return iD;
    }

    public void setiD(int iD) {
        this.iD = iD;
    }

    public Date getNgayGiaoDich() {
        return ngayGiaoDich;
    }

    public void setNgayGiaoDich(Date ngayGiaoDich) {
        this.ngayGiaoDich = ngayGiaoDich;
    }

    public double getDonGia() {
        return DonGia;
    }

    public void setDonGia(double donGia) {
        DonGia = donGia;
    }

    public double getDienTich() {
        return dienTich;
    }

    public void setDienTich(double dienTich) {
        this.dienTich = dienTich;
    }

    public DanhSachGiaoDichNhaDat(int iD, Date ngayGiaoDich, double donGia, double dienTich) {
        this.iD = iD;
        this.ngayGiaoDich = ngayGiaoDich;
        DonGia = donGia;
        this.dienTich = dienTich;
    }
}

class real_estaste extends DanhSachGiaoDichNhaDat {
    // type = 0 <=> Loai A
    // type = 1 <=> Loai B
    // type = 2 <=> Loai C
    private int type;

    public double thanhTien() {
        double ThanhTien = 0;
        if (type == 1 || type == 2) {
            ThanhTien = getDienTich() * getDonGia();
        }
        if (type == 0) {
            ThanhTien = getDienTich() * getDonGia() * 1.5;
        }
        if (type < 0 || type > 2) {
            System.out.println("unknow");
        }
        return ThanhTien;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public real_estaste(int iD, Date ngayGiaoDich, double donGia, double dienTich, int type) {
        super(iD, ngayGiaoDich, donGia, dienTich);
        this.type = type;
    }

    @Override
    public String toString() {
        return "DanhSachGiaoDichNhaDat{" +
                "iD=" + getiD() +
                ", ngayGiaoDich=" + getNgayGiaoDich() +
                ", DonGia=" + getDonGia() +
                ", dienTich=" + getDienTich() +
                '}' +
                "type=" + type +
                '}';
    }
}

class Home extends DanhSachGiaoDichNhaDat {
    private String address;
    // type = 0 <=> Loai Cao Cap
    // type = 1 <=> Loai Thuong
    private int type;

    public Home(int iD, Date ngayGiaoDich, double donGia, double dienTich, String address, int type) {
        super(iD, ngayGiaoDich, donGia, dienTich);
        this.address = address;
        this.type = type;
    }

    public double ThanhTien() {
        double ThanhTien = getDienTich() * getDonGia();
        if (type == 0) {
            return ThanhTien;
        }
        if (type == 1) {
            ThanhTien = ThanhTien * 0.9;
        }
        return ThanhTien;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }
}