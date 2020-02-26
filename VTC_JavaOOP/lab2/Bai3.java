package VTC_JavaOOP.lab2;

import java.util.*;

public class Bai3 {
    public static void main(String[] args) {
//        Sach a = new Sach("11", "sex", "18+", new Date("11/11/2019"), 50000, 200);
//        BangDia b = new BangDia("22", "GOW", "phim bo USA", new Date("11/2/2011"), 30000, 150);
//        SanPham c = new BangDia("223", "GOW43", "phim bo USA", new Date("11/2/2011"), 30000, 150);
//        DsSanPham a1 = new DsSanPham();
//        a1.themSanPham(a);
//        a1.themSanPham(b);
//        a1.dispLAy();
//
//        //xoa san pham theo ten\
//        String name = "khoi";
//        String name1 = "223";
//
//        if (a1.xoaSanPham(b)) {
//            System.out.println(" Have been deleted");
//            System.out.println(b.toString());
//        } else System.out.println(c.toString() + " not in list");
//
//        if (a1.xoaSanPham_maSP(name1)) {
//            //a1.sanPhamArrayList.remove(name1);
//            System.out.println(name + " Have been deleted");
//        } else System.out.println("khong co trong danh sach");
//        //a1.xoaSanPham(b);
//        a1.dispLAy();
////
////
//
////// doi thong tin san pham thong qua ma Sp
////        if (a1.capNhatSanPham("11", "GOW_12315", "phim bo USA 18+", 30000)) {
////            System.out.println("ok");
////        } else System.out.println("khong co");
////        a1.dispLAy();
////    }
//
//        //sort z-a
//        a1.sapxep();
//        System.out.println();
//        System.out.println("after sort");
//        a1.dispLAy();

        Scanner sc = new Scanner(System.in);
        int i;
        DsSanPham a1 = new DsSanPham();
        do {
            System.out.println("menu");
            System.out.println("1: them san Pham");
            System.out.println("2: xoa San Pham");
            System.out.println("3: Cap Nhat San Pham");
            System.out.println("4: tim Kiem");
            System.out.println("5: sap Xep");
            System.out.println("6: danh Sach");
            System.out.println("7: exit");
            System.out.print("Nhap: ");
            i = sc.nextInt();
            switch (i) {
                case 1:
                    System.out.println("Chon loai san phma muon nhap");
                    System.out.println("Sach = 0");
                    System.out.println("bang dia = 1");
                    int type1 =sc.nextInt();
                    a1.themSanPham(type1);
                    break;
                case 2:
                    System.out.println("xoaSanPham = 0");
                    System.out.println("xoaSanPham_maSP = 1");
                    int n = sc.nextInt();
                    if (n == 0) {
                        System.out.println("Nhap loai San Pham Can Xoa");
                        System.out.println("xoa Sach = 0");
                        System.out.println("Xoa Bang Dia = 1");
                        int type = sc.nextInt();
                        if (type == 0) {
                            System.out.println("Nhap Thong tin Sach");
                            Sach a = new Sach();
                            System.out.println("Nhap MaSP");
                            a.setMaSp(sc.next());
                            System.out.println("Nhap tenSP");
                            a.setTenSp(sc.next());
                            System.out.println("Nhap Mo ta");
                            a.setMoTa(sc.next());
                            System.out.println("Nhap NSX");
                            a.setNSX(new Date(sc.next()));
                            System.out.println("Nhap So TRang");
                            a.setSoTrang(sc.nextInt());
                            if (a1.xoaSanPham(a)){
                                System.out.println("da xoa thanh cong");
                            }else System.out.println(" xoa that bai");
                        }
                        if (type == 0) {
                            System.out.println("Nhap Thong tin Bang Dia");
                            BangDia b = new BangDia();
                            System.out.println("Nhap MaSP");
                            b.setMaSp(sc.next());
                            System.out.println("Nhap tenSP");
                            b.setTenSp(sc.next());
                            System.out.println("Nhap Mo ta");
                            b.setMoTa(sc.next());
                            System.out.println("Nhap NSX");
                            b.setNSX(new Date(sc.next()));
                            System.out.println("Nhap thoi luong phat");
                            b.setThoiGianPHat(sc.nextFloat());
                            if (a1.xoaSanPham(b)){
                                System.out.println("da xoa thanh cong");
                            }else System.out.println(" xoa that bai");
                        }
                    }if (n == 0) {
                        System.out.println("Nhap MA San Pham");
                        String maSP = sc.next();
                        if (a1.xoaSanPham_maSP(maSP)){
                            System.out.println("Xoa thanh Cong");
                        }else System.out.println("Xoa that bai");
                    }
                    break;
                case 3:
                    String mSP, ten, moTa;
                    double gia;
                    System.out.println("Nhap maSP");
                    mSP = sc.next();
                    System.out.println("Nhap ten");
                    ten = sc.next();
                    System.out.println("nhap Mo ta");
                    moTa = sc.next();
                    System.out.println("Nhap gia");
                    gia = sc.nextDouble();
                    if (a1.capNhatSanPham(mSP, ten, moTa, gia)) {
                        System.out.println("cap nhat Thanh Cong");
                    } else System.out.println("Vui Long thu Lai");
                case 4:
                    System.out.println("Chon Loai TIm Kiem");
                    System.out.println("tim kiem KQ co lien quan den tu khoa  = 1");
                    System.out.println("tim kiem KQ theo khoang Gia = 2");
                    System.out.print("Nhap kieu tim kiem: ");
                    int type = sc.nextInt();
                    if (type == 1) {
                        System.out.println("nhap Tu Khoa can Tim");
                        String keyWord = sc.next();
                        a1.timKiem(keyWord);
                    }
                    if (type == 2) {
                        System.out.println("Nhap khoang gia can tim");
                        System.out.println("gia 1");
                        double giaA = sc.nextDouble();
                        System.out.println("gia 2");
                        double giaB = sc.nextDouble();
                        a1.timkiem(giaA, giaB);
                    }
                    break;
                case 5:
                    a1.sapxep();
                    a1.dispLAy();
                    break;
                case 6:
                    a1.dispLAy();
                    break;
            }

        } while (i != 7);

    }
}

class SanPham {
    private String maSp, tenSp, moTa;
    private Date NSX;
    private double giaBan;

    public SanPham(String maSp, String tenSp, String moTa, Date NSX, double giaBan) {
        this.maSp = maSp;
        this.tenSp = tenSp;
        this.moTa = moTa;
        this.NSX = NSX;
        this.giaBan = giaBan;
    }

    public SanPham() {

    }

    public String getMaSp() {
        return maSp;
    }

    public void setMaSp(String maSp) {
        this.maSp = maSp;
    }

    public String getTenSp() {
        return tenSp;
    }

    public void setTenSp(String tenSp) {
        this.tenSp = tenSp;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public Date getNSX() {
        return NSX;
    }

    public void setNSX(Date NSX) {
        this.NSX = NSX;
    }

    public double getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(double giaBan) {
        this.giaBan = giaBan;
    }

    void nhap() {

    }

    @Override
    public String toString() {
        return "maSp='" + maSp + '\'' +
                ", tenSp='" + tenSp + '\'' +
                ", moTa='" + moTa + '\'' +
                ", NSX=" + NSX +
                ", giaBan=" + giaBan;
    }
}

class Sach extends SanPham {
    private int soTrang;

    public Sach() {
        super();
    }

    public Sach(String maSp, String tenSp, String moTa, Date NSX, double giaBan, int soTrang) {
        super(maSp, tenSp, moTa, NSX, giaBan);
        this.soTrang = soTrang;
    }

    public int getSoTrang() {
        return soTrang;
    }

    public void setSoTrang(int soTrang) {
        this.soTrang = soTrang;
    }

    @Override
    public String toString() {
        return "Sach  {" + super.toString() +
                " soTrang=" + soTrang +
                '}';
    }
}

class BangDia extends SanPham {
    private float thoiGianPHat;

    public BangDia(String maSp, String tenSp, String moTa, Date NSX, double giaBan, float thoiGianPHat) {
        super(maSp, tenSp, moTa, NSX, giaBan);
        this.thoiGianPHat = thoiGianPHat;
    }

    public float getThoiGianPHat() {
        return thoiGianPHat;
    }

    public void setThoiGianPHat(float thoiGianPHat) {
        this.thoiGianPHat = thoiGianPHat;
    }

    public BangDia() {
        super();
    }

    @Override
    public String toString() {
        return "banDia{" + super.toString() +
                "thoiGianPHat=" + thoiGianPHat +
                '}';
    }
}

class DsSanPham {

    ArrayList<SanPham> sanPhamArrayList = new ArrayList<>();

    public void themSanPham(SanPham a) {
        sanPhamArrayList.add(a);
    }


    public void themSanPham(int i) {
        Scanner sc = new Scanner(System.in);
        System.out.println("chon loai san pham muon nhap");
        if (i == 0) {
            System.out.println("Nhap Thong tin Sach");
            System.out.println();
            Sach a = new Sach();
            System.out.println("Nhap MaSP");
            a.setMaSp(sc.next());
            System.out.println("Nhap tenSP");
            a.setTenSp(sc.next());
            System.out.println("Nhap Mo ta");
            a.setMoTa(sc.next());
            System.out.println("Nhap NSX");
            a.setNSX(new Date(sc.next()));
            System.out.println("Nhap So TRang");
            a.setSoTrang(sc.nextInt());
            sanPhamArrayList.add(a);
        }
        if (i == 1) {
            System.out.println("Nhap Thong tin Bang Dia");
            System.out.println();
            BangDia b = new BangDia();
            System.out.println("Nhap MaSP");
            b.setMaSp(sc.next());
            System.out.println("Nhap tenSP");
            b.setTenSp(sc.next());
            System.out.println("Nhap Mo ta");
            b.setMoTa(sc.next());
            System.out.println("Nhap NSX");
            b.setNSX(new Date(sc.next()));
            System.out.println("Nhap thoi luong phat");
            b.setThoiGianPHat(sc.nextFloat());
            sanPhamArrayList.add(b);
        }
    }

    public void dispLAy() {
        for (int i = 0; i < sanPhamArrayList.size(); i++) {
            System.out.println(sanPhamArrayList.get(i).toString());

        }
    }

    //    public  boolean xoaSanPham(SanPham a) {
//
//        for (int i = 0; i < sanPhamArrayList.size(); i++) {
//            if (sanPhamArrayList.get(i).getTenSp().equals(a.getTenSp()) ||
//                    sanPhamArrayList.get(i).getMaSp().equals(a.getMaSp()))
//            {
//                return true;
//
//            }
//        }
//        return false;
//    }
    public boolean xoaSanPham(SanPham a) {

        for (int i = 0; i < sanPhamArrayList.size(); i++) {
            if (sanPhamArrayList.get(i) == a) {
                sanPhamArrayList.remove(i);
                return true;
            }
        }
        return false;
    }

    public boolean xoaSanPham_maSP(String maSP) {
        for (int i = 0; i < sanPhamArrayList.size(); i++) {
            if (sanPhamArrayList.get(i).getMaSp().equals(maSP)) {
                sanPhamArrayList.remove(i);
                return true;
            }
        }
        return false;
    }

    public boolean capNhatSanPham(String mSP, String ten, String moTa, double gia) {
        //SanPham a=new SanPham(mSP,ten,moTa,null,gia);

        for (int i = 0; i < sanPhamArrayList.size(); i++) {
            if (mSP.equals(sanPhamArrayList.get(i).getMaSp())) {
                //cach 1
                /*
                SanPham a = new SanPham();
                a = sanPhamArrayList.get(i);
                a.setTenSp(ten);
                a.setMoTa(moTa);
                a.setGiaBan(gia);
                sanPhamArrayList.remove(i);
                sanPhamArrayList.add(i, a);
                 */

                //cach 2
                sanPhamArrayList.get(i).setTenSp(ten);
                sanPhamArrayList.get(i).setMoTa(moTa);
                sanPhamArrayList.get(i).setGiaBan(gia);
                return true;
            }
        }
        return false;
    }

    public void timKiem(String keyWord) {
        for (int i = 0; i < sanPhamArrayList.size(); i++) {
            if (keyWord.equals(sanPhamArrayList.get(i).getMaSp()) || keyWord.equals(sanPhamArrayList.get(i).getTenSp())) {
                System.out.println(sanPhamArrayList.get(i).toString());
            }
        }
    }

    public void timkiem(double giaA, double giaB) {
        for (int i = 0; i < sanPhamArrayList.size(); i++) {
            if (giaA < giaB) {
                if (sanPhamArrayList.get(i).getGiaBan() > giaA || sanPhamArrayList.get(i).getGiaBan() < giaB) {
                    System.out.println(sanPhamArrayList.get(i).toString());
                } else {
                    if (sanPhamArrayList.get(i).getGiaBan() < giaA || sanPhamArrayList.get(i).getGiaBan() > giaB) {
                        System.out.println(sanPhamArrayList.get(i).toString());
                    }
                }
            }
        }
    }

    public void sapxep() {
        Collections.sort(sanPhamArrayList, new Comparator<SanPham>() {
            @Override
            public int compare(SanPham sanPham, SanPham t1) {

                //return Double.compare(sanPham.getGiaBan(),t1.getGiaBan());
                if (sanPham.getGiaBan() < t1.getGiaBan())
                    return 1;
                if (sanPham.getGiaBan() > t1.getGiaBan())
                    return -1;
                return 0;
            }
        });
    }
}
