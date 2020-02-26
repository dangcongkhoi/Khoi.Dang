package VTC_JavaOOP.BTLTHDT_2019.KhaiNiemCoBanLapTrinh;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Bai9 {
    public static void main(String[] args) {
        CongNhan Cn1 = new CongNhan(1, " Le ", "Tri", 100);
        CongNhan Cn2 = new CongNhan(2, " Le 2", "Tri 2", 300);
        CongNhan Cn3 = new CongNhan(3, " Le 3", "Tri 3", 50);
        CongNhan Cn4 = new CongNhan(4, " Le 4", "Tri 4", 600);
        CongNhan Cn5 = new CongNhan(5, " Le 5", "Tri 5", 150);
        CongNhan Cn6 = new CongNhan(6, " Le 6", "Tri 6", 250);
        CongNhan Cn7 = new CongNhan(7, " Le 7", "Tri 7", 1000);
        DanhSachCongNhan To1 = new DanhSachCongNhan();
        To1.add(Cn1);
        To1.add(Cn2);
        To1.add(Cn3);
        To1.add(Cn4);
        To1.add(Cn5);
        To1.add(Cn6);
        To1.add(Cn7);
        To1.disPlay();
        System.out.println("So Cong Nhan");
        To1.soLuongCN();
        System.out.println(" Cong Nhan co tren 200 Sp");
        To1.CNmSP_above200();
        System.out.println("DS Sp giam dan");
        To1.sortmSPASC();
        To1.disPlay();
    }
}

class CongNhan {
    private int maCN;
    private String mHo;
    private String mTen;
    private int SoSP;

    public int getMaCN() {
        return maCN;
    }

    public void setMaCN(int maCN) {
        this.maCN = maCN;
    }

    public String getmHo() {
        return mHo;
    }

    public void setmHo(String mHo) {
        this.mHo = mHo;
    }

    public String getmTen() {
        return mTen;
    }

    public void setmTen(String mTen) {
        this.mTen = mTen;
    }

    public int getSoSP() {
        return SoSP;
    }

    public void setSoSP(int soSP) {
        if (soSP < 0) {
            System.out.println("error");
        }
        SoSP = soSP;
    }

    public CongNhan(int maCN, String mHo, String mTen, int soSP) {
        this.maCN = maCN;
        this.mHo = mHo;
        this.mTen = mTen;
        SoSP = soSP;
    }

    public double tingLuong() {
        if (getSoSP() < 0) {
            return getSoSP() * 0.5;
        }
        if (getSoSP() < 399) {
            return getSoSP() * 0.55;
        }
        if (getSoSP() < 599) {
            return getSoSP() * 0.6;
        }
        if (getSoSP() > 599) {
            return getSoSP() * 0.65;
        }
        return tingLuong();
    }

    @Override
    public String toString() {
        return "CongNhan{" +
                "maCN=" + maCN +
                ", mHo='" + mHo + '\'' +
                ", mTen='" + mTen + '\'' +
                ", SoSP=" + SoSP + ", Luong =" + tingLuong() +
                '}';
    }
}

class DanhSachCongNhan {
    //CongNhan[] DScongNhanarr = new CongNhan[7];
    ArrayList<CongNhan> congNhanArrayList = new ArrayList<>();

    public void add(CongNhan CN) {
        congNhanArrayList.add(CN);
    }

    public void disPlay() {
        for (int i = 0; i < congNhanArrayList.size(); i++) {
            System.out.println(congNhanArrayList.get(i).toString());
        }
    }

    public void soLuongCN() {
        System.out.println("soLuongCN = " + congNhanArrayList.size());
    }

    public void CNmSP_above200() {
        for (int i = 0; i < congNhanArrayList.size(); i++) {
            if (congNhanArrayList.get(i).getSoSP() >= 200) {
                System.out.println(congNhanArrayList.get(i).toString());
            }

        }
    }

    public void sortmSPASC() {
        Collections.sort(congNhanArrayList, new Comparator<CongNhan>() {
            @Override
            public int compare(CongNhan congNhan, CongNhan t1) {
                return Integer.compare(t1.getSoSP(),congNhan.getSoSP() );
            }
        });
    }

}
