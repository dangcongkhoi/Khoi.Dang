package VTC_Introduce_Programming.lab_5;

import java.util.Scanner;

public class Bai3_ArrryFibo {
    public static void main(String[] args) {
        double Xn = 0;
        double fibo[] = new double[21];
        int n = 0;
        Scanner scanner = new Scanner(System.in);
        //n = scanner.nextInt();

        do {
            for (int i = 0; i <= 20; i++) {

                Xn = (1 / Math.sqrt(5)) * (Math.pow((1 + Math.sqrt(5)) / 2, i) - Math.pow((1 - Math.sqrt(5)) / 2, i));
                fibo[n] = Xn;

                n++;

            }
            //System.out.print(fibo[n] + " | ");
        } while (n == 20);
        for (int a = 0; a <= 20; a++) {
            System.out.println(fibo[a] + " | ");
        }
    }
}

