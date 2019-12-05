package VTC_Introduce_Programming.lab_5;

import java.util.Scanner;

public class Bai7_Array_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ArrayPrime[] = new int[5];

        int i;
        int m = 0;
        int n;
        int Arr = 0;

        System.out.println("Nhập số Nguyên N:");
        do {
            int flag = 0;
            n = sc.nextInt();
            m = n / 2;
            if (n == 0 || n == 1) {
                System.out.println(n + " is not a prime number");
            }
            if (n % 2 == 0) {
                System.out.println(n + " is not a prime number");
            } else {
                for (i = 2; i <= m; i++) {
                    if (n % i == 0) {
                        System.out.println(n + " is not a Prime number");
                        flag = 1;
                        break;
                    }
                }
                if (flag == 0) {
                    ArrayPrime[Arr] = n;
                    System.out.println("Prime number");
                    Arr++;
                }
            }
        }

        while (Arr < ArrayPrime.length);
        System.out.println("Tập hợp số Nguyên tố: ");
        for (int a = 0; a < ArrayPrime.length; a++) {

            System.out.print(ArrayPrime[a]+" | ");

        }
    }
}
