package VTC_Introduce_Programming.lab_3;

import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        double a, b, c;
        double kq1, kq2;

        Scanner sc = new Scanner(System.in);
        System.out.println("Giai Phuong trinh bac 2");
        System.out.println("Nhap a");
        a = sc.nextInt();
        System.out.println("nhap b");
        b = sc.nextInt();
        System.out.println("nhap c");
        c = sc.nextInt();
        double delta = b * b - 4 * a * c;
        //DecimalFormat df = new DecimalFormat("#.000");
        if (delta < 0) {
            System.out.println("PT trinh vo nghiem");
        } else if (delta == 0) {
            kq1 = -b / (2 * a);
            System.out.println("chỉ có 1 nghiệm x1 =  " + kq1);
        } else {
            kq1 = (-b + Math.sqrt(delta)) / 2 * a;
            kq2 = (-b - Math.sqrt(delta)) / 2 * a;
            System.out.println("Phương trinh có 2 Nghiệm");
            System.out.println("x1 = " + kq1);
            System.out.println("x2 = " + kq2);
        }
    }
}