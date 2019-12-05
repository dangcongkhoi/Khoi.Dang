package VTC_Introduce_Programming.lab_2;

import java.util.Scanner;

public class Lab2_1 {
    public static void main(String[] args) {
        double c = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap A: ");
        int a = sc.nextInt();
        System.out.println("Nhap B");
        int b = sc.nextInt();
        while (b == 0)
        {
            System.out.println(" Error divide by Zero");
            break;
        }
        System.out.println(c= a/b);

    }
}
