package VTC_Introduce_Programming.lab_3;

import java.util.Scanner;

public class Bai7_Output_Menu {
    public static void main(String[] args) {
        int NhapSo;
        System.out.println("          Menu          ");
        System.out.println("========================");
        System.out.println("1. CF");
        System.out.println("2. C");
        System.out.println("3. HDJ");
        System.out.println("4. DreamWeaver");
        System.out.println("5. RDBMS");
        System.out.println("6. Learn java By Example");
        System.out.println("========================");

        System.out.print("chon: ");
        Scanner scanner = new Scanner(System.in);
        NhapSo = scanner.nextInt();

            switch (NhapSo) {
                case 1:
                    System.out.println("Bạn chọn CF");
                    break;

                case 2:
                    System.out.println("Bạn chọn C");
                    break;

                case 3:
                    System.out.println("Bạn chọn HDJ");
                    break;

                case 4:
                    System.out.println("Bạn chọn DreamWeaver");
                    break;

                case 5:
                    System.out.println("Bạn chọn RDBMS");
                    break;

                case 6:
                    System.out.println("Bạn chọn Learn Java by Example");
                    break;
                default:
                    System.out.println("Vui lòng Nhập lại");
                    System.out.println("từ 1-6");
                    NhapSo = scanner.nextInt();

            }
        }


}