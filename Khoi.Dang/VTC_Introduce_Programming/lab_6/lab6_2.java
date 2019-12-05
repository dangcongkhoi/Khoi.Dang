package VTC_Introduce_Programming.lab_6;

import java.util.Scanner;

public class lab6_2 {
    public static int power(int a, int b) {
        //a^b=??
        System.out.println(a + "^" + b + " = " + Math.pow(a, b));
        return 1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập a: ");
        int a = scanner.nextInt();
        System.out.print("Nhập b: ");
        int b = scanner.nextInt();
        lab6_2.power(a, b);

    }
}
