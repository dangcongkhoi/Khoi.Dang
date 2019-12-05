package VTC_Introduce_Programming.Lab_4;

import java.util.Scanner;

public class bai3_SoChiaHetCho7 {
    public static void main(String[] args) {
        int n;
        int m;
        //int R=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập N");
        n = sc.nextInt();

        System.out.println("Nhập M");
        m = sc.nextInt();
        int R = n % 7;
        if (n > 0 || m > 0) {
            if (n < m) {
                System.out.println("Day So nguyen to: ");
                for (int i = n; n < m; n++) {
                    if (n % 7 != 0)
                        continue;
                    System.out.print(n + " ");
                }

            } else if (n > m) {
                System.out.println("Day So nguyen to: ");
                for (int i = m; m < n; m++) {
                    if (m % 7 != 0)
                        continue;
                    System.out.println(m+ " ");
                }
            } else {
                System.out.println("Khong tim ra duoc so nguyen to");
            }n%7=

        }
    }
}
