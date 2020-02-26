package VTC_JavaOOP.lab3;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        GiangVien gv1 = new GvThinhGiang("lhoi", "Giao Su", "Tien Si", new Date("12/12/1995"), new Date("01/02/2000"), "HCM");
        GiangVien gv2 = new GvCoHuu("Khoi", "Giao Su", "Tien Si", new Date("12/12/1995"), new Date("01/02/2000"), 5000000, 2);
        GiangVien gv3 = new GvThinhGiang("lhoi 3", "Giao Su", "Tien Si", new Date("12/12/1995"), new Date("01/02/2000"), "HCM");
        QLGiangVien a1 = new QLGiangVien();
        a1.add(gv1);
        a1.add(gv2);
        a1.add(gv3);
        a1.tinhTienLuong();
        a1.disPlay();
        a1.sortZ_A();
        System.out.println("afersort");
        a1.disPlay();
        Scanner sc = new Scanner(System.in);
        int i;
        /*
        1. Them Giang Vien
        2. Xoa Giang Vien
        3. Tra cuu thong tin theo ten, hoc ham,hoc vi
        4. Tinh Tien Luong
        5. sap xep giam dan theo luong
        Nhap:
         */
        do {
            System.out.println("\n" +
                    "        1. Them Giang Vien\n" +
                    "        2. Xoa Giang Vien\n" +
                    "        3. Tra cuu thong tin theo ten, hoc ham,hoc vi\n" +
                    "        4. Tinh Tien Luong\n" +
                    "        5. sap xep giam dan theo luong ( coming soon :))) ");//updating;
            System.out.print("Nhap: ");
            i = sc.nextInt();
            switch (i) {
                case 1:
                    a1.add();
                    break;
                case 2:
                    System.out.print("Nhap index can xoa: ");
                    int a = sc.nextInt();
                    a1.remove(a);
                    break;
                case 3:
                    /*
                    1. tim theo ten
                    2. tim theo hoc ham
                    3. tim theo hoc vi
                     */
                    System.out.println("\n" +
                            "                    1. tim theo ten\n" +
                            "                    2. tim theo hoc ham\n" +
                            "                    3. tim theo hoc vi");
                    System.out.print("Nhap: ");
                    int search = sc.nextInt();
                    a1.search(search);
                    break;
                case 4:
                    a1.tinhTienLuong();
                    break;
                case 5:
                    a1.disPlay();
                    break;
                case 6:
                    System.out.println("Thoat CHuong trinh");
                    break;
            }
        } while (i != 6);
    }
}

class GiangVien {
    private String hoTen, hocHam, hocVi;
    private Date ngaySing, ngayBatDau;
    private double luong=0;

    public double getLuong() {
        return luong;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }

    public double tinhTienLuong(float soGio) {

        return luong;
    }

    @Override
    public String toString() {
        SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy");
        return "GiangVien{" +
                "hoTen='" + hoTen + '\'' +
                ", hocHam='" + hocHam + '\'' +
                ", hocVi='" + hocVi + '\'' +
                ", ngaySing=" + f.format(ngaySing) +
                ", ngayBatDau=" + f.format(ngayBatDau) +
                '}';
    }

    public GiangVien(String hoTen, String hocHam, String hocVi, Date ngaySing, Date ngayBatDau) {
        this.hoTen = hoTen;
        this.hocHam = hocHam;
        this.hocVi = hocVi;
        this.ngaySing = ngaySing;
        this.ngayBatDau = ngayBatDau;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getHocHam() {
        return hocHam;
    }

    public void setHocHam(String hocHam) {
        this.hocHam = hocHam;
    }

    public String getHocVi() {
        return hocVi;
    }

    public void setHocVi(String hocVi) {
        this.hocVi = hocVi;
    }

    public Date getNgaySing() {
        return ngaySing;
    }

    public void setNgaySing(Date ngaySing) {
        this.ngaySing = ngaySing;
    }

    public Date getNgayBatDau() {
        return ngayBatDau;
    }

    public void setNgayBatDau(Date ngayBatDau) {
        this.ngayBatDau = ngayBatDau;
    }
}

class GvThinhGiang extends GiangVien {
    private int ID = 2;
    private String noiCongTac;
    private double luognTHucNhan;

    public double getLuognTHucNhan() {
        return luognTHucNhan;
    }

    public void setLuognTHucNhan(double luognTHucNhan) {
        this.luognTHucNhan = luognTHucNhan;
    }

    public GvThinhGiang(String hoTen, String hocHam, String hocVi, Date ngaySing, Date ngayBatDau, String noiCongTac) {
        super("[GVTG]" + hoTen, hocHam, hocVi, ngaySing, ngayBatDau);
        this.noiCongTac = noiCongTac;
    }

    @Override
    public double tinhTienLuong(float soGio) {
        return luognTHucNhan = super.tinhTienLuong(soGio) + soGio * 90000;
    }

    @Override
    public String toString() {
        return "GvThinhGiang{" + super.toString() +
                "noiCongTac= '" + noiCongTac + '\'' +
                "Luong= '" + luognTHucNhan + '\'' +
                '}';
    }
}

class GvCoHuu extends GiangVien {
    private int ID = 1;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    private double luongCb;
    private float heSo;

    public double getLuongThucNhan() {
        return luongThucNhan;
    }

    public void setLuongThucNhan(double luongThucNhan) {
        this.luongThucNhan = luongThucNhan;
    }

    private double luongThucNhan;

    @Override
    public String toString() {
        return "GvCoHuu{" + super.toString() +
                "luongCb=" + luongCb +
                ", heSo=" + heSo +
                ", Luong=" + luongThucNhan +

                '}';
    }

    public double getLuongCb() {
        return luongCb;
    }

    public void setLuongCb(double luongCb) {
        this.luongCb = luongCb;
    }

    public float getHeSo() {
        return heSo;
    }

    public void setHeSo(float heSo) {
        this.heSo = heSo;
    }

    public GvCoHuu(String hoTen, String hocHam, String hocVi, Date ngaySing, Date ngayBatDau, double luongCb, float heSo) {
        super("[GVCH] " + hoTen, hocHam, hocVi, ngaySing, ngayBatDau);
        this.luongCb = luongCb;
        this.heSo = heSo;
    }

    @Override
    public double tinhTienLuong(float soGio) {
        return luongThucNhan = super.tinhTienLuong(soGio) + 90000 + luongCb * heSo;
    }
}

class QLGiangVien {
    ArrayList<GiangVien> giangVienArrayList = new ArrayList<>();

    public void add(GiangVien a) {
        giangVienArrayList.add(a);

    }

    public void add() {
        /*
       Nhap Loai giao vien muon them
        1. them Giang Vien Co Huu
        2. them Giang Vien thinh giang
         */
        System.out.println("\n" +
                "       Nhap Loai giao vien muon them\n" +
                "        1. them Giang Vien Co Huu\n" +
                "        2. them Giang Vien thinh giang");
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        if (i == 1) {
            System.out.println("Nhap ten");
            String ten = sc.next();
            System.out.println("Nhap Hoc Ham");
            String hocHam = sc.next();
            System.out.println("Nhap Hoc Vi");
            String hocVi = sc.next();
            System.out.println("Ngay Sinh");
            String date = sc.next();
            Date b = new Date(date);
            System.out.println("ngay bat dau");
            String date1 = sc.next();
            Date b1 = new Date(date1);
            System.out.println();
            System.out.println("Luong Co Ban");
            double luong = sc.nextDouble();
            System.out.println("He So");
            float q = sc.nextFloat();
            GvCoHuu a = new GvCoHuu(ten, hocHam, hocVi, b, b1, luong, q);
            giangVienArrayList.add(a);
        }
        if (i == 2) {
            System.out.println("Nhap ten");
            String ten = sc.next();
            System.out.println("Nhap Hoc Ham");
            String hocHam = sc.next();
            System.out.println("Nhap Hoc Vi");
            String hocVi = sc.next();
            System.out.println("Ngay Sinh");
            String date = sc.next();
            Date b = new Date(date);
            System.out.println("ngay bat dau");
            String date1 = sc.next();
            Date b1 = new Date(date1);
            System.out.println();
            System.out.println("Noi Cong Tac");
            String noiCongTac = sc.next();
             GvThinhGiang a1 = new GvThinhGiang(ten, hocHam, hocVi, b, b1, noiCongTac);
            giangVienArrayList.add(a1);
        }
    }

    public void remove(int i) {
        giangVienArrayList.remove(i);
    }

    public void search(int i) {
        Scanner sc = new Scanner(System.in);
        String ten;
        String hocHam;
        String HocVi;
        if (i == 1) {
            System.out.println("Nhap ten can tim");
            ten = sc.next();
            for (int j = 0; j < giangVienArrayList.size(); j++) {
                if (giangVienArrayList.get(j).getHoTen().equals(ten)) {
                    System.out.println("[" + j + "] " + giangVienArrayList.get(j).toString());
                }

            }
        }
        if (i == 2) {
            System.out.println("Nhap Hoc Ham can tim");
            hocHam = sc.next();
            for (int j = 0; j < giangVienArrayList.size(); j++) {
                if (giangVienArrayList.get(j).getHocHam().equals(hocHam)) {
                    System.out.println("[" + j + "] " + giangVienArrayList.get(j).toString());
                }

            }
        }
        if (i == 3) {
            System.out.println("Nhap hoc Vi can tim");
            HocVi = sc.next();
            for (int j = 0; j < giangVienArrayList.size(); j++) {
                if (giangVienArrayList.get(j).getHoTen().equals(HocVi)) {
                    System.out.println("[" + j + "] " + giangVienArrayList.get(j).toString());
                }

            }
        }
    }

    public void tinhTienLuong() {

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < giangVienArrayList.size(); i++) {
            if (giangVienArrayList.get(i).getHoTen().startsWith("[GVCH]")) {
                System.out.println(giangVienArrayList.get(i).toString());
                System.out.println("Nhap so gio cong");
                giangVienArrayList.get(i).tinhTienLuong(sc.nextFloat());
            }
            if (giangVienArrayList.get(i).getHoTen().startsWith("[GVTG]")) {
                System.out.println(giangVienArrayList.get(i).toString());
                System.out.println("Nhap so gio cong");
                giangVienArrayList.get(i).tinhTienLuong(sc.nextFloat());
            }
        }
    }

    public void disPlay() {
        for (int i = 0; i < giangVienArrayList.size(); i++) {
            System.out.println(giangVienArrayList.get(i).toString());
            //System.out.println(giangVienArrayList.get(i).getLuong());
        }
    }

    public void sortZ_A() {
    }
}