package VTC_Introduce_Programming.lab_3;

import java.util.Scanner;

public class bai_6_KiemTraPhanTuCoThuocMang {
    public static void main(String[] args) {
        char Chu_cai;
        Scanner Chu_cai_Can_Nhap = new Scanner(System.in);
        System.out.println("Nhap ky tu bat ki");
        Chu_cai=Chu_cai_Can_Nhap.next().charAt(0);
        switch (Chu_cai){
            case 'q':
            case 'w':
            case 'r':
            case 't':
            case 'p':
            case 's':
            case 'd':
            case 'f':
            case 'g':
            case 'h':
            case 'j':
            case 'k':
            case 'l':
            case 'z':
            case 'x':
            case 'c':
            case 'v':
            case 'b':
            case 'n':
            case 'm':
                System.out.println(Chu_cai+" La phu am Thuoc bang Chu cai");
                //System.out.println(Chu_cai+" La phu am");
break;
            case 'e':
            case 'y':
            case 'u':
            case 'i':
            case 'o':
            case 'a':
                System.out.println(Chu_cai+" La nguyen am Thuoc bang Chu cai");
                //System.out.println(Chu_cai+" La nguyen am");
                break;
            default:
                System.out.println(Chu_cai+" Khong thuoc bang chu cai");

        }
    }
}
