package VTC_Introduce_Programming.lab_7;

import java.util.Scanner;

public class lab7_1 {

    static class MARK {
        String TenMonHoc;//tên môn học
        float DiemLT;//điểm lý thuyết
        float DiemTH;//điểm thực hành

        public void NhapMonHoc() {
            Scanner sc = new Scanner(System.in);

            System.out.println("Nhập Tên Môn Học");
            this.TenMonHoc = sc.nextLine();
            System.out.println("Nhập Điểm Lý Thuyết");
            this.DiemLT = sc.nextFloat();
            System.out.println("Nhập Điểm Thực hành");
            this.DiemTH = sc.nextFloat();
        }

        public float TinhDTB() {
            return (this.DiemLT + this.DiemTH) / 2;
        }


        public float XuatMonHoc() {
            System.out.println("thông tin môn học");
            System.out.println("=================");
            System.out.println("Tên Môn học: " + this.TenMonHoc);
            System.out.println("Điểm Lý thuyết" + this.DiemLT);
            System.out.println("Điểm Thực hành: " + this.DiemTH);
            System.out.println("Điểm trung bình: " + this.TinhDTB());
            return 1;
        }


        public static void main(String[] args) {
            MARK XuatThongTin = new MARK();
            XuatThongTin.NhapMonHoc();
            XuatThongTin.XuatMonHoc();

        }
    }
}
