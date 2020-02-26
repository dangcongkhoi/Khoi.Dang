package VTC_JavaOOP.lab1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Bai6 {
    public static void main(String[] args) throws ParseException {
        QLHocVien QLHV = new QLHocVien();
        //QLHocVien diemGV=new QLHocVien();
        Scanner sc = new Scanner(System.in);
        Date a = new Date();
        SimpleDateFormat f = new SimpleDateFormat("dd/mm/yyyy");
        QLHV.themHocVien(new HocVien("Ho Chi Minh 3", a, true, "Ho Chi Minh"));
        QLHV.themHocVien(new HocVien("Dang COng Khoi", a, true, "Ha Noi"));
        QLHV.themHocVien(new HocVien("Kieu Ngoc Hoa", a, true, "Da Nang"));
        QLHV.themHocVien(new HocVien("Vu Hoang Duc", a, true, "Quang Ngai"));
        QLHV.themHocVien(new HocVien("Ho Hieu Ming", a, true, "Japan"));
        QLHV.themHocVien(new HocVien("Dang COng Khoi 2", a, true, "Ha Noi"));
        QLHV.themHocVien(new HocVien("Dang COng Khoi 3", a, true, "Ha Noi"));
//funtion Timkiem
        //HocVien t = new HocVien("Kieu Ngoc Hoa", a, true, "Da Nang");
//        if ((QLHV.timKiem(3,t))) {
//            System.out.println("->>Ereka");
//        } else System.out.println("DS KQ gan Dung");
//        QLHV.nhapDiem1();
//        QLHV.nhapDiem1();
//        QLHV.nhapDiem1();
//        QLHV.nhapDiem1();
//        QLHV.nhapDiem1();
//        QLHV.nhapDiem1();
//        QLHV.nhapDiem1();
//        //QLHV.disPlay();
        HocVien b =new HocVien(null,null,true,null);
        b.nhapDiem(1);
        b.nhapDiem(9);
        b.nhapDiem(6);
        b.nhapDiem(5);b.nhapDiem(3);
        b.nhapDiem(5);b.nhapDiem(8);
        QLHV.disPlay(b);
        System.out.println("after sỏt");
        QLHV.sortASC();
        QLHV.disPlay(b);

//        int num;
//        do {
//            num =sc.nextInt();
//            switch (num){
//                case 1:
//                    HocVien a = new HocVien();
//                    a.nhapThongTin();
//                    QLHV.themHocVien(a);
//                    break;
//                case 2:
//                    String ten;
//                    System.out.println("Nhap ten SV");
//                    ten =sc.nextLine();
//                    QLHV.timKiem(ten);
//                case 3:
//                    QLHV.disPlay();
//                    break;
//                default:
//            }
//        }while (num!=0);
//        }
    }
}

