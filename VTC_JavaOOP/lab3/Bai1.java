package VTC_JavaOOP.lab3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
/*
        HinhHoc a = new HinhChuNhat(12, 13);
        HinhHoc b = new HinhTron(12);
        HinhHoc c = new Ellipse(12, 12);
        HinhHoc d = new HinhVuong(12);
        HinhHoc f = new TamGiac(24, 23, 10);
        HinhHoc g = new TamGiacCan(12, 10);
        HinhHoc n = new TamGiacDieu(12);
        HinhHoc e = new Ellipse(12, 12);
        QLHinhHoc a1 = new QLHinhHoc();
        a1.add(d);
        a1.add(c);
        a1.add(e);
        a1.add(d);
        a1.add(f);
        a1.add(g);
        a1.add(n);
        a1.add(b);
        System.out.println("chuvi");
        a1.sortGiamDanTheoChuVi();
        a1.display(8);
        System.out.println("DienTich");
        a1.sortTangDanTheoDienTich();
        a1.display(8);
        /*
        display = 1 -> Hinh Chu Nhat
        display = 2 -> Ellipse
        display = 3 -> HinhVuong
        display = 4 -> Hinh Tron
        display = 5 -> Hinh Tam Giac
        display = 6 -> Hinh Tam Giac Can
        display = 7 -> Hinh Tam Giac Dieu
        display = 8 -> all
         */

        Scanner sc = new Scanner(System.in);
        QLHinhHoc QlHH = new QLHinhHoc();
        int i;
        do {
            System.out.println("menu");
            System.out.println("1: them san Pham");
            System.out.println("2: xoa San Pham");
            System.out.println("3: Hien Thi");
            System.out.println("4: Xuat Danh Sach chi dinh");
            System.out.println("5: sap xep tang dan theo dien tich");
            System.out.println("6: sap xep gia dan theo chu vi");
            System.out.println("7: exit");
            System.out.print("Nhap: ");
            i = sc.nextInt();
            switch (i) {
                case 1:
                    QlHH.add();
                    break;
                case 2:
                    QlHH.remove();
                    break;
                case 3:
                    QlHH.display(8);
                    break;
                case 4:
                    System.out.println("Nhap kie can hien thi");
                    System.out.println(
                            "        display = 1 -> Hinh Chu Nhat\n" +
                            "        num = 2 -> Ellipse\n" +
                            "        num = 3 -> HinhVuong\n" +
                            "        num = 4 -> Hinh Tron\n" +
                            "        num = 5 -> Hinh Tam Giac\n" +
                            "        num = 6 -> Hinh Tam Giac Can\n" +
                            "        num = 7 -> Hinh Tam Giac Dieu\n" +
                            "        num = 8 -> all");
                    int a = sc.nextInt();
                    QlHH.display(a);
                    break;
                case 5:
                    QlHH.sortTangDanTheoDienTich();
                    break;
                case 6:
                    QlHH.sortGiamDanTheoChuVi();
                    break;
                case 7:
                    System.out.println("Cam on quy khach da ung ho, hen quy khach vao lan sau");
                    break;
            }
        } while (i != 7);
    }
}

class QLHinhHoc {
    ArrayList<HinhHoc> hinhHocArrayList = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public void add(HinhHoc a) {
        hinhHocArrayList.add(a);
    }

    public void add() {
        /*
        display = 1 -> Hinh Chu Nhat
        display = 2 -> Ellipse
        display = 3 -> HinhVuong
        display = 4 -> Hinh Tron
        display = 5 -> Hinh Tam Giac
        display = 6 -> Hinh Tam Giac Can
        display = 7 -> Hinh Tam Giac Dieu
        display = 8 -> all
         */
        System.out.println("Nhập loại hình cần thêm");
        System.out.println(
                "        num = 1 -> Hinh Chu Nhat\n" +
                "        num = 2 -> Ellipse\n" +
                "        num = 3 -> HinhVuong\n" +
                "        num = 4 -> Hinh Tron\n" +
                "        num = 5 -> Hinh Tam Giac\n" +
                "        num = 6 -> Hinh Tam Giac Can\n" +
                "        num = 7 -> Hinh Tam Giac Dieu\n" +
                "        num = 8 -> all");
        System.out.print("Nhap so tuong ung voi hinh: ");
        int i = sc.nextInt();
        if (i == 1) {
            HinhChuNhat a = new HinhChuNhat();
            System.out.println("Nhap chieu dai");
            a.setChieuDai(sc.nextDouble());
            System.out.println("Nhap chieu rong");
            a.setChieuRong(sc.nextDouble());
            hinhHocArrayList.add(a);
        }
        if (i == 2) {
            Ellipse a = new Ellipse();
            System.out.println("Nhap truc lon");
            a.setTrucLon(sc.nextDouble());
            System.out.println("Nhap truc nho");
            a.setTrucNho(sc.nextDouble());
            hinhHocArrayList.add(a);
        }
        if (i == 3) {
            HinhVuong a = new HinhVuong();
            System.out.println("Nhap canh hinh vuong");
            a.setCanh(sc.nextDouble());
            hinhHocArrayList.add(a);
        }
        if (i == 4) {
            HinhTron a = new HinhTron();
            System.out.println("Nhap ban kinh");
            a.setBanKinh(sc.nextDouble());
            hinhHocArrayList.add(a);
        }
        if (i == 5) {
            TamGiac a = new TamGiac();
            System.out.println("Nhap 3 canh tam giac (dk a>a+b )");
            System.out.println("Nhap canh a");
            a.setA(sc.nextDouble());
            System.out.println("Nhap canh b");
            a.setB(sc.nextDouble());
            System.out.println("Nhap canh b");
            a.setC(sc.nextDouble());
            hinhHocArrayList.add(a);
        }
        if (i == 6) {
            TamGiacCan a = new TamGiacCan();
            System.out.println("Nhap canh ab va c");
            System.out.println("Nhap canh AB");
            a.setAb(sc.nextDouble());
            System.out.println("Nhap canh C");
            a.setC(sc.nextDouble());
            hinhHocArrayList.add(a);
        }
        if (i == 7) {
            TamGiacDieu a = new TamGiacDieu();
            System.out.println("Nhap canh tam giac dieu");
            a.setAbc(sc.nextDouble());
            hinhHocArrayList.add(a);
        }


    }

    public void remove() {

        System.out.println("Nhap index can xoa");
        int i = sc.nextInt();
        hinhHocArrayList.remove(i);
    }

    public void sortTangDanTheoDienTich() {
        hinhHocArrayList.sort(new Comparator<HinhHoc>() {
            @Override
            public int compare(HinhHoc hinhHoc, HinhHoc t1) {
                if (hinhHoc.dienTich() > t1.dienTich())
                    return 1;
                if (hinhHoc.dienTich() < t1.dienTich())
                    return -1;
                return 0;
            }
        });
    }

    public void sortGiamDanTheoChuVi() {
        hinhHocArrayList.sort(new Comparator<HinhHoc>() {
            @Override
            public int compare(HinhHoc hinhHoc, HinhHoc t1) {
                if (hinhHoc.chuVI() < t1.chuVI())
                    return 1;
                if (hinhHoc.chuVI() > t1.chuVI())
                    return -1;
                return 0;
            }
        });
    }

    public void display(int i) {
        //Hinh Chu Nhat
        if (i == 1) {
            for (int j = 0; j < hinhHocArrayList.size(); j++) {
                //if (hinhHocArrayList.get(j).toString().equals("Hinh Chu Nhat")){
                if (hinhHocArrayList.get(j).getTen().equals("HinhChuNhat"))
                    System.out.println("[" + j + "]= " + hinhHocArrayList.get(j).toString());
            }
        }//Ellipse
        if (i == 2) {
            for (int j = 0; j < hinhHocArrayList.size(); j++) {
                //if (hinhHocArrayList.get(j).toString().equals("Hinh Chu Nhat")){
                if (hinhHocArrayList.get(j).getTen().equals("Ellipse"))
                    System.out.println("[" + j + "]= " + hinhHocArrayList.get(j).toString());
            }
        }//HinhVuong
        if (i == 3) {
            for (int j = 0; j < hinhHocArrayList.size(); j++) {
                //if (hinhHocArrayList.get(j).toString().equals("Hinh Chu Nhat")){
                if (hinhHocArrayList.get(j).getTen().equals("HinhVuong"))
                    System.out.println("[" + j + "]= " + hinhHocArrayList.get(j).toString());
            }//HinhTron
        }
        if (i == 4) {
            for (int j = 0; j < hinhHocArrayList.size(); j++) {
                //if (hinhHocArrayList.get(j).toString().equals("Hinh Chu Nhat")){
                if (hinhHocArrayList.get(j).getTen().equals("HinhTron"))
                    System.out.println("[" + j + "]= " + hinhHocArrayList.get(j).toString());
            }//TamGiac
        }
        if (i == 5) {
            for (int j = 0; j < hinhHocArrayList.size(); j++) {
                //if (hinhHocArrayList.get(j).toString().equals("TamGiac"))
                if (hinhHocArrayList.get(j).getTen().equals("TamGiac"))
                    System.out.println("[" + j + "]= " + hinhHocArrayList.get(j).toString());
            }//TamGiacCan
        }
        if (i == 6) {
            for (int j = 0; j < hinhHocArrayList.size(); j++) {
                //if (hinhHocArrayList.get(j).toString().equals("Hinh Chu Nhat")){
                if (hinhHocArrayList.get(j).getTen().equals("TamGiacCan"))
                    System.out.println("[" + j + "]= " + hinhHocArrayList.get(j).toString());
            }//TamGiacDieu
        }
        if (i == 7) {
            for (int j = 0; j < hinhHocArrayList.size(); j++) {
                //if (hinhHocArrayList.get(j).toString().equals("Hinh Chu Nhat")){
                if (hinhHocArrayList.get(j).getTen().equals("TamGiacDieu"))
                    System.out.println("[" + j + "]= " + hinhHocArrayList.get(j).toString());
            }//all

        }
        if (i == 8) {
            for (int j = 0; j < hinhHocArrayList.size(); j++) {
                System.out.println("[" + j + "]= " + hinhHocArrayList.get(j).toString());
            }
        }
    }
}

class HinhHoc {
    private String ten;

    public HinhHoc() {

    }

    public double dienTich() {
        double dienTich = 0;
        return dienTich;
    }

    public double chuVI() {
        double chuVi = 0;
        return chuVi;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public HinhHoc(String ten) {
        this.ten = ten;
    }

    @Override
    public String toString() {
        return "HinhHoc{" +
                "ten='" + ten + '\'' +
                '}';
    }
}

class HinhChuNhat extends HinhHoc {
    private double chieuDai, ChieuRong;

    public HinhChuNhat(double chieuDai, double chieuRong) {
        super("HinhChuNhat");
        this.chieuDai = chieuDai;
        ChieuRong = chieuRong;
    }

    public HinhChuNhat() {

    }


    public double getChieuDai() {
        return chieuDai;
    }

    public void setChieuDai(double chieuDai) {
        this.chieuDai = chieuDai;
    }

    public double getChieuRong() {
        return ChieuRong;
    }

    public void setChieuRong(double chieuRong) {
        ChieuRong = chieuRong;
    }

    @Override
    public String toString() {
        return "Hinh Chu Nhat{" +
                "chieuDai=" + chieuDai +
                ", ChieuRong=" + ChieuRong +
                ", dienTich=" + dienTich() +
                ", chuVi=" + chuVI() +
                '}';
    }

    @Override
    public double dienTich() {

        return super.dienTich() + chieuDai * ChieuRong;
    }

    @Override
    public double chuVI() {
        return super.chuVI() + (chieuDai + ChieuRong) * 2;
    }
}

class Ellipse extends HinhHoc {
    private double TrucLon, TrucNho;

    public Ellipse(String hinhTron) {
    }

    public Ellipse() {

    }

    @Override
    public double dienTich() {
        return super.dienTich() + 3.14 * TrucLon * TrucNho;
    }

    @Override
    public double chuVI() {
        return super.chuVI() + 2 * 3.14 * (TrucNho + TrucNho);
    }

    @Override
    public String toString() {
        return "Ellipse{" +
                "TrucLon=" + TrucLon +
                ", TrucNho=" + TrucNho +
                ", DienTich=" + dienTich() +
                ", chuVi=" + chuVI() +
                '}';
    }

    public double getTrucLon() {
        return TrucLon;
    }

    public void setTrucLon(double trucLon) {
        TrucLon = trucLon;
    }

    public double getTrucNho() {
        return TrucNho;
    }

    public void setTrucNho(double trucNho) {
        TrucNho = trucNho;
    }

    public Ellipse(double trucLon, double trucNho) {
        super("Ellipse");
        TrucLon = trucLon;
        TrucNho = trucNho;
    }
}

class HinhVuong extends HinhChuNhat {
    private double canh;

    public HinhVuong() {

    }

    @Override
    public String toString() {
        return "HinhVuong{" +
                "canh=" + canh +
                ", DienTich=" + dienTich() +
                ", chuVi=" + chuVI() +
                '}';
    }

    public double getCanh() {
        return canh;
    }

    public void setCanh(double canh) {
        this.canh = canh;
    }

    public HinhVuong(double canh) {
        super();
        super.setTen("HinhVuong");
        this.canh = canh;
    }

    @Override
    public double dienTich() {
        return super.dienTich() + Math.pow(canh, 2);
    }

    @Override
    public double chuVI() {
        return super.chuVI() + canh * 4;
    }
}

class HinhTron extends Ellipse {
    private double banKinh;

    public HinhTron() {

    }

    @Override
    public String toString() {
        return "HinhTron{" +
                "banKinh=" + banKinh +
                ", DienTich=" + dienTich() +
                ", chuVi=" + chuVI() +
                '}';
    }

    public double getBanKinh() {
        return banKinh;
    }

    public void setBanKinh(double banKinh) {
        this.banKinh = banKinh;
    }

    public HinhTron(double banKinh) {
        super();
        super.setTen("HinhTron");
        this.banKinh = banKinh;
    }

    @Override
    public double dienTich() {
        return super.dienTich() + 3.14 * banKinh * banKinh;
    }

    @Override
    public double chuVI() {
        return super.chuVI() + 2 * 3.14 * banKinh;
    }
}

class TamGiac extends HinhHoc {
    private double a, b, c;

    public TamGiac() {
        super();
    }

    public TamGiac(String tamGiacCan) {
    }

    @Override
    public double dienTich() {
        double p = chuVI() / 2;
        return super.dienTich() + Math.abs(Math.sqrt(p * (p - a) * (p - b) * (p - c)));
    }

    @Override
    public double chuVI() {
        return super.chuVI() + a + b + c;
    }

    @Override
    public String toString() {
        return "TamGiac{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                ", DienTich=" + dienTich() +
                ", chuVi=" + chuVI() +
                '}';
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public TamGiac(double a, double b, double c) {
        super("TamGiac");
        this.a = a;
        this.b = b;
        this.c = c;
    }
}

class TamGiacCan extends TamGiac {
    private double ab, c;

    public TamGiacCan(String ten) {
        super();
    }

    public TamGiacCan() {

    }

    @Override
    public String toString() {
        return "TamGiacCan{" +
                "ab=" + ab +
                ", c=" + c +
                ", DienTich=" + dienTich() +
                ", chuVi=" + chuVI() +
                '}';
    }

    public double getAb() {
        return ab;
    }

    public void setAb(double ab) {
        this.ab = ab;
    }

    @Override
    public double getC() {
        return c;
    }

    @Override
    public void setC(double c) {
        this.c = c;
    }

    public TamGiacCan(double ab, double c1) {
        super();
        super.setTen("TamGiacCan");
        this.ab = ab;
        this.c = c1;
    }

    @Override
    public double chuVI() {
        return super.chuVI() + ab * 2 + c;
    }

    @Override
    public double dienTich() {
        double p = chuVI() / 2;
        return super.dienTich() + Math.abs(Math.sqrt(p * (p - ab) * (p - ab) * (p - c)));
    }
}

class TamGiacDieu extends TamGiacCan {
    private double abc;

    public TamGiacDieu() {

    }

    @Override
    public String toString() {
        return "TamGiacDieu{" +
                "abc=" + abc +
                ", DienTich=" + dienTich() +
                ", chuVi=" + chuVI() +
                '}';
    }

    public double getAbc() {
        return abc;
    }

    public void setAbc(double abc) {
        this.abc = abc;
    }

    public TamGiacDieu(double abc) {
        super();
        super.setTen("TamGiacDieu");
        this.abc = abc;
    }

    @Override
    public double dienTich() {
        double p = chuVI() / 2;
        return super.dienTich() + Math.abs(Math.sqrt(p * (p - abc) * (p - abc) * (p - abc)));
    }

    @Override
    public double chuVI() {
        return super.chuVI() + abc * 3;
    }
}



