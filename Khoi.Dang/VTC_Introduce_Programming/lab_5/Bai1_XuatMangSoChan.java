package VTC_Introduce_Programming.lab_5;

import java.util.Scanner;

public class Bai1_XuatMangSoChan {
    public static void main(String[] args) {
        int n = 10;
        int c;
        Scanner scanner = new Scanner(System.in);

        /*do {
            System.out.println("Nhập vào số phần tử của mảng: ");
            n = scanner.nextInt();
        } while (n <= 0);
         */
        int A[] = new int[n];
        int chan[] = new int[n];
        System.out.print("Nhập Phàn tử cho mảng");
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập phần tử thứ " + i + ":");
            A[i] = scanner.nextInt();
        }
        c = 0;
        for (int i = 0; i < n; i++) {
            if (A[i] % 2 == 0) {
                chan[c] = A[i];
                c++;
            }
        }
        System.out.print("các phần tử trong mảng Chẵn: ");
        for (int i = 0; i < c; i++) {
            System.out.print(chan[i] + " ");
        }
    }
}



