package VTC_JavaOOP.BTLTHDT_2019.KeThua_DaHinh;

import java.util.ArrayList;
import java.util.Date;

public class Bai3 {
    public static void main(String[] args) {

Gold goldHistory = new Gold();
goldHistory.addGold(120, new Date(), 42000000, 10, 1);
        goldHistory.addGold(121, new Date(), 42000000, 10, 1);
        goldHistory.addGold(122, new Date(), 42000000, 1000, 1);

        Forex ForexHistory = new Forex();
        ForexHistory.addForex(310,new Date(),500000,100,0);
        ForexHistory.addForex(310,new Date(),500000,100,1);
        ForexHistory.addForex(310,new Date(),500000,10000,2);
        QuanLyGiaoDich a1 = new QuanLyGiaoDich();
        System.out.print("Volume Gold = ");
        a1.disPlaySumGold(goldHistory);
        System.out.println(" Danh Sach Giao dich tren 1 ty");
        a1.contract_above_1bil(goldHistory,ForexHistory);
    }
}

class QuanLyGiaoDich {
    private int contractID;
    private Date NgayGiaoDich;
    private double donGia;
    private double soLuong;

    public QuanLyGiaoDich() {

    }

    public int getContractID() {
        return contractID;
    }

    public void setContractID(int contractID) {
        this.contractID = contractID;
    }

    public Date getNgayGiaoDich() {
        return NgayGiaoDich;
    }

    public void setNgayGiaoDich(Date ngayGiaoDich) {
        NgayGiaoDich = ngayGiaoDich;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public double getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(double soLuong) {
        this.soLuong = soLuong;
    }

    public QuanLyGiaoDich(int contractID, Date ngayGiaoDich, double donGia, double soLuong) {
        this.contractID = contractID;
        NgayGiaoDich = ngayGiaoDich;
        this.donGia = donGia;
        this.soLuong = soLuong;
    }

    public void disPlaySumGold(Gold a) {
        System.out.println("Tong Volume Gold= " +a.sumSoLuongGold());
    }

    public void disPlayForex(Forex a) {
        System.out.println(a.thanhTien());
    }

    @Override
    public String toString() {
        return "QuanLyGiaoDich{" +
                "contractID=" + contractID +
                ", NgayGiaoDich=" + NgayGiaoDich +
                ", donGia=" + donGia +
                ", soLuong=" + soLuong +
                '}';
    }

    public void contract_above_1bil(Gold a, Forex b) {
        System.out.println("Giao Dich Vang tren 1 ty:");
        for (int i = 0; i < a.History.size(); i++) {
            if (a.History.get(i).thanhTien() > 1000000000) {
                System.out.println(a.History.get(i).toString());
            }
        }
        System.out.println("Giao Dich Forex tren 1 ty:");
        for (int i = 0; i < b.History.size(); i++) {
            if (b.History.get(i).thanhTien() > 1000000000) {
                System.out.println(b.History.get(i).toString());
            }
        }
    }
}

class Gold extends QuanLyGiaoDich {
    private int loaiVang;
    ArrayList<Gold> History = new ArrayList<>();

    public Gold() {

    }

    public void addGold(int contractID, Date ngayGiaoDich, double donGia, double soLuong, int loaiVang) {
        History.add(new Gold(contractID, ngayGiaoDich, donGia, soLuong, loaiVang));
    }



    public int getLoaiVang() {
        return loaiVang;
    }

    public void setLoaiVang(int loaiVang) {
        this.loaiVang = loaiVang;
    }

    public Gold(int contractID, Date ngayGiaoDich, double donGia, double soLuong, int loaiVang) {
        super(contractID, ngayGiaoDich, donGia, soLuong);
        this.loaiVang = loaiVang;
    }
    public double sumSoLuongGold() {
        double sum = 0;
        for (int i = 0; i < History.size(); i++) {
            sum += History.get(i).thanhTien();
        }
        return sum;
    }

    public double thanhTien() {
        double sum;
        sum = getDonGia() * getSoLuong();
        return sum;
    }

    @Override
    public String toString() {
        return "Gold{" + getContractID()+" "+ getNgayGiaoDich()+" "+ getDonGia()+" "+getSoLuong()+
                "loaiVang=" + loaiVang +
                '}';
    }
}

class Forex extends QuanLyGiaoDich {
    private double tyGia;
    /*
    loaiTien = 0 -> VND
    loaiTien = 1 -> USD
    loaiTien = 2 -> EUR
     */
    private int loaiTien;
    final double USDVND = 23000;
    final double EURVND = 32000;

    public Forex(int contractID, Date ngayGiaoDich, double donGia, double soLuong, int loaiTien) {
        super(contractID, ngayGiaoDich, donGia, soLuong);
        this.loaiTien = loaiTien;
    }

    public Forex() {

    }

    public double getTyGia() {
        return tyGia;
    }

    public void setTyGia(double tyGia) {
        this.tyGia = tyGia;
    }

    public int getLoaiTien() {
        return loaiTien;
    }

    public void setLoaiTien(int loaiTien) {
        this.loaiTien = loaiTien;
    }


    public double thanhTien() {
        double sum = 0;
        if (loaiTien == 0) {
            sum = getSoLuong() * getDonGia();
        }
        if (loaiTien == 1) {
            sum = getSoLuong() * getDonGia() * USDVND;
        }
        if (loaiTien == 2) {
            sum = getSoLuong() * getDonGia() * EURVND;
        }
        return sum;
    }

    ArrayList<Forex> History = new ArrayList<>();

    public void addForex(int contractID, Date ngayGiaoDich, double donGia, double soLuong, int loaiTien) {
        History.add(new Forex(contractID, ngayGiaoDich, donGia, soLuong, loaiTien));
    }

    public double sumSoLuongForex() {
        double sum = 0;
        for (int i = 0; i < History.size(); i++) {
            sum += History.get(i).thanhTien();
        }
        return sum;
    }

    public double trungBinhVolumeForex() {
        return sumSoLuongForex() / History.size();
    }

    @Override
    public String toString() {
        return "Forex{" + getContractID()+" "+ getNgayGiaoDich()+" "+ getDonGia()+" "+getSoLuong()+
                "tyGia=" + tyGia +
                ", loaiTien=" + loaiTien +
                ", USDVND=" + USDVND +
                ", EURVND=" + EURVND +
                '}';
    }

}