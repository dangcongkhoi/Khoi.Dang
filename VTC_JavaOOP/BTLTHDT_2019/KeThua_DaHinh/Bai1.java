package VTC_JavaOOP.BTLTHDT_2019.KeThua_DaHinh;

import java.util.ArrayList;

public class Bai1 {
    public static void main(String[] args) {

        XeNoiTHanh XNTNgay1 =new XeNoiTHanh();
        XNTNgay1.add(123,"Dang COng KHoi",1234,10,200);
        XNTNgay1.add(123,"Dang COng KHoi2",1334,10,200);
        XNTNgay1.add(123,"Dang COng KHoi3",1534,10,200);

        System.out.println("DANh chuyen xe Noi Thanh");
        for (int i = 0; i < XNTNgay1.xeNoiTHanhArrayList.size() ; i++) {
            System.out.println(XNTNgay1.xeNoiTHanhArrayList.get(i).toString());
        }
        System.out.println("Tong Doanh Thu xe Noi THanh: "+XNTNgay1.Tong());
        XeNgoaiThanh XNTxBNgay1 = new XeNgoaiThanh();
        XNTxBNgay1.add(123,"Dang COng KHoi",1234,"HCM",2);
        XNTxBNgay1.add(123,"Dang COng KHoi",1234,"MYThu",2);
        XNTxBNgay1.add(123,"Dang COng KHoi",1234,"HNA",2);
        System.out.println("DANh chuyen xe Ngoai  Thanh");
        for (int i = 0; i < XNTxBNgay1.xeNgoaiThanhArrayList.size() ; i++) {
            System.out.println(XNTxBNgay1.xeNgoaiThanhArrayList.get(i).toString());
        }
        System.out.println("Tong Doanh Thu xe Ngoai  THanh: "+XNTxBNgay1.Tong());

        ThongTinChuyenXe Ngay1=new ThongTinChuyenXe();
        System.out.println("TOng Doanh Thu 2 Chuyen: "+Ngay1.TongDoanhThu(XNTNgay1,XNTxBNgay1));

    }
}

class ThongTinChuyenXe {
    private int ID;
    private String name;
    private int BKS;
    private double doanhThu;
    public ThongTinChuyenXe(int ID, String name, int BKS) {
        this.ID = ID;
        this.name = name;
        this.BKS = BKS;
    }

    public ThongTinChuyenXe() {

    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBKS() {
        return BKS;
    }

    public void setBKS(int BKS) {
        this.BKS = BKS;
    }

    public double getDoanhThu() {
        return doanhThu;
    }

    public void setDoanhThu(double doanhThu) {
        this.doanhThu = doanhThu;
    }

    public double doanhThu() {
        double doanhTHu = 0;
        return doanhTHu;

    }

    @Override
    public String toString() {
        return "ThongTinChuyenXe{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                ", BKS=" + BKS +
                ", doanhThu=" + doanhThu +
                '}';
    }

    public double TongDoanhThu(XeNoiTHanh o1, XeNgoaiThanh o2) {
        return o1.Tong()+o2.Tong();
    }
}

class XeNoiTHanh extends ThongTinChuyenXe {
ThongTinChuyenXe a ;
    private int soTuyen;
    private double soKmDiDuoc;
    ArrayList<XeNoiTHanh> xeNoiTHanhArrayList = new ArrayList<>();

    public XeNoiTHanh() {

    }

    @Override
    public String toString() {
        return "XeNoiTHanh{" + getID()+" " +getName()+" " +getBKS()+" " +
                "soTuyen=" + soTuyen +
                ", soKmDiDuoc=" + soKmDiDuoc +" Doanh Thu: " +doanhThu()+" " +

                '}';
    }

    public double Tong() {
        double Tong = 0;
        for (int i = 0; i < xeNoiTHanhArrayList.size(); i++) {
            Tong += xeNoiTHanhArrayList.get(i).doanhThu();
        }

        return Tong;
    }



    public void add(int ID, String name, int BKS, int soTuyen, double soKmDiDuoc) {
        xeNoiTHanhArrayList.add(new XeNoiTHanh(ID,name,BKS,soTuyen,soKmDiDuoc));
    }

    public XeNoiTHanh(int ID, String name, int BKS, int soTuyen, double soKmDiDuoc) {
        super(ID, name, BKS);
        this.soTuyen = soTuyen;
        this.soKmDiDuoc = soKmDiDuoc;
    }

    public int getSoTuyen() {
        return soTuyen;
    }

    public void setSoTuyen(int soTuyen) {
        this.soTuyen = soTuyen;
    }

    public double getSoKmDiDuoc() {
        return soKmDiDuoc;
    }

    public void setSoKmDiDuoc(double soKmDiDuoc) {
        this.soKmDiDuoc = soKmDiDuoc;
    }

    @Override
    public double doanhThu() {
        return soTuyen * soKmDiDuoc;
    }


}

class XeNgoaiThanh extends ThongTinChuyenXe {
    private String noiDen;
    private int soNgaydiDuoc;
    private final int TiendiTrong1Ngay = 1000000;
    ArrayList<XeNgoaiThanh> xeNgoaiThanhArrayList =new ArrayList<>();

    public double Tong() {
        double Tong = 0;
        for (int i = 0; i < xeNgoaiThanhArrayList.size(); i++) {
            Tong += xeNgoaiThanhArrayList.get(i).doanhThu();
        }return Tong;
    }

    @Override
    public String toString() {
        return "XeNgoaiThanh{" + getID()+" " +getName()+" " +getBKS()+" " +
                "noiDen='" + noiDen + '\'' +
                ", soNgaydiDuoc=" + soNgaydiDuoc + "Doanh Thu = "+ doanhThu()+
                '}';
    }

    @Override
    public double doanhThu() {
        return soNgaydiDuoc * TiendiTrong1Ngay;
    }

    public XeNgoaiThanh() {
    }

    public void add(int ID, String name, int BKS, String noiDen, int soNgaydiDuoc) {
        xeNgoaiThanhArrayList.add(new XeNgoaiThanh(ID,name,BKS,noiDen,soNgaydiDuoc));
    }

    public XeNgoaiThanh(int ID, String name, int BKS, String noiDen, int soNgaydiDuoc) {
        super(ID, name, BKS);
        this.noiDen = noiDen;
        this.soNgaydiDuoc = soNgaydiDuoc;
    }

    public String getNoiDen() {
        return noiDen;
    }

    public void setNoiDen(String noiDen) {
        this.noiDen = noiDen;
    }

    public int getSoNgaydiDuoc() {
        return soNgaydiDuoc;
    }

    public void setSoNgaydiDuoc(int soNgaydiDuoc) {
        this.soNgaydiDuoc = soNgaydiDuoc;
    }

    public int getTiendiTrong1Ngay() {
        return TiendiTrong1Ngay;
    }
}