package VTC_Introduce_Programming.lab_6;

import java.util.Scanner;

public class Lab6_1 {
    public static void GiaiPT2(float a, float b, float c) {
        double kq1;
        double kq2;
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

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số a: ");
        float a = sc.nextFloat();
        System.out.print("Nhập số b: ");
        float b = sc.nextFloat();
        System.out.print("Nhập số c: ");
        float c = sc.nextFloat();
        Lab6_1.GiaiPT2(a, b, c);
    }
}