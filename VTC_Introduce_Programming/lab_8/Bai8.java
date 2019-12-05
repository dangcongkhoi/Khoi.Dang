package VTC_Introduce_Programming.lab_8;

import java.util.Locale;
import java.util.Scanner;

public class Bai8 {
    static class MenuHV {
        private static int[] ID = new int[5];

        private static String[] TenHV = new String[5];


        //int ID []=new int[5];
        //String[] TenHV =new String[5];


        public static void NhapThongTinHV() {
            Scanner sc = new Scanner(System.in);
            for (int i = 0; i < 5; i++) {
                System.out.println("Nhap ID HV thu " + i);
                ID[i] = sc.nextInt();

                System.out.println("Nhap ten HV thu " + i);
                sc.nextLine();
                TenHV[i] = sc.nextLine();
            }
            return;
        }

        public static void TimKiemHocVien() {

            int x = 0;
            Scanner scannames1 = new Scanner(System.in);

            System.out.println("Enter name of student you want to search for: ");
            System.out.println();
            String search = scannames1.nextLine();
            String searchName = search.toLowerCase();

            for (int p = 0; p < TenHV.length; p++) {
                if (searchName.equals(TenHV[p])) {
                    System.out.println("STT: " + ID[p] + " | " + "Ho va Ten: " + TenHV[p]);
                    x = 1;
                    break;
                } else {
                    x = 0;
                }
            }
            if (x == 1) {
                System.out.println("We have a match in our database for " + searchName);
            } else if (x == 0) {
                System.out.println("No match for " + searchName);
            }
        }

        public static void ChuanHoaTenHocVien() {


            //Viet Hoa chữ cái đầu tiên
            String char_prev = "", char_current = "", key = " ,.";
            for (int i = 0; i < TenHV.length; i++) {
                TenHV[i].toLowerCase(Locale.forLanguageTag(String.valueOf(MenuHV.TenHV[i].charAt(0)).toUpperCase()));
            }
            for (int i = 1; i < 5; i++) {
                char_prev = String.valueOf(MenuHV.TenHV[i].charAt(i - 1));
                char_current = String.valueOf(MenuHV.TenHV[i].charAt(i));
                if (key.contains(char_prev)) {
                    char_current = char_current.toUpperCase();
                }
                TenHV[i].toUpperCase(Locale.forLanguageTag(char_current));
            }
            for (int i = 0; i < TenHV.length; i++) {
                System.out.println(TenHV[i]);
            }
        }

        public static void ChuanHoaTenHocVien2() {
            //Loai bo ki tu dac biet
            for (int i = 0; i < TenHV.length; i++) {
                MenuHV.TenHV[i] = MenuHV.TenHV[i].replaceAll("[!@#$%^&*]", "");
            }
            //cat bo Khoang trang o dau va o cuoi
            for (int i = 0; i < TenHV.length; i++) {
                MenuHV.TenHV[i] = TenHV[i].trim();
            }
            //cat bo KHoang trang thừa ở giữa
            for (int i = 0; i < TenHV.length; i++) {
                while (MenuHV.TenHV[i].contains("  "))
                    MenuHV.TenHV[i] = MenuHV.TenHV[i].replaceAll("  ", " ");
            }

            for (int i = 0; i < TenHV.length; i++) {
                TenHV[i] = TenHV[i].substring(0, 1).toUpperCase() + TenHV[i].substring(1).toLowerCase();
            }
            for (int i = 0; i < TenHV.length; i++) {
                System.out.println(TenHV[i]);
            }
        }

        public static void HienThiDanhSachHocVien() {
            System.out.printf("%-7s%-14s\n", ": STT :", "   Ten HV       :");
            System.out.println("---------------------------------------------------------------");
            for (int i = 0; i < ID.length; i++) {
                System.out.println(":  " + ID[i] + "  : " + TenHV[i]);
            }
            System.out.println(":-------------------------------------------------------------:");

        }
    }

    public static void main(String[] args) {
        Scanner NumChose = new Scanner(System.in);
        int NumChose1;
        //Menu Kiem tra thong tin Hoc SInh
        do {

            System.out.println("=========================");
            System.out.println(":         Menu          :");
            System.out.println("=========================");
            System.out.println("1- Nhập thêm một học viên mới");
            System.out.println("2- Tim Kiem Hoc Vien");
            System.out.println("3- Chuẩn hóa tên HV");
            System.out.println("4- Hiển thị danh sách họi viên");
            System.out.println("0- Thoát chương trình");
            System.out.println("=========================");
            System.out.print("Nhap so trong Menu: ");
            NumChose1 = NumChose.nextInt();

            //Nhap so Ngoai menu se Nhap lai
            while (NumChose1 < 0 || NumChose1 >= 5) {
                System.out.print("Entered Incorrectly. re-enter: ");
                NumChose1 = NumChose.nextInt();

            }
            // Cach Dong
            System.out.println("=========================");
            System.out.println();
            System.out.println();
            //chon menu
            switch (NumChose1) {
                case 1:
                    MenuHV.NhapThongTinHV();
                    break;
                case 2:
                    MenuHV.TimKiemHocVien();
                    break;
                case 3:
                    MenuHV.ChuanHoaTenHocVien2();
                    break;
                case 4:
                    MenuHV.HienThiDanhSachHocVien();
                    break;
                default:
                    System.out.println("Thoát Chương trình");

            }

        } while (NumChose1!=0);
    }


}
