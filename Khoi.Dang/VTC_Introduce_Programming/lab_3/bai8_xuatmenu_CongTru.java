package VTC_Introduce_Programming.lab_3;

import java.util.Scanner;

public class bai8_xuatmenu_CongTru {
    public static void main(String[] args) {
        int a;
        int b;
        int NhapToanTu;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập sô thứ nhất: ");
        a = sc.nextInt();
        System.out.print("Nhập số thứ hai: ");
        b = sc.nextInt();
        System.out.println("      MENU      ");
        System.out.println("================");
        System.out.println("+");
        System.out.println("-");
        System.out.println("x");
        System.out.println(":");
        System.out.println("================");
        System.out.print("Chọn: ");
        NhapToanTu = sc.nextInt();
        switch (NhapToanTu) {
            case 1:
                System.out.println("Tong: " + a + " + " + b + " = " + (a + b));
                break;
            case 2:
                System.out.println("Tong: " + a + " - " + b + " = " + (a - b));
                break;
            case 3:
                System.out.println("Tong: " + a + " x " + b + " = " + a * b);
                break;
            case 4:
                System.out.println("Tong: " + a + " : " + b + " = " + a / b);
                break;
        }


    }
}
