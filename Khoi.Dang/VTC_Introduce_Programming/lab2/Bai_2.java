package VTC_Introduce_Programming.lab2;

import java.util.Scanner;

public class Bai_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input your Number");
        int num = scanner.nextInt();
        //int num = 779;
        boolean r = false;
        for (int m = 2; m <= num - 1; ++m) {
            // condition for nonprime number
            if (num % m == 0) {
                r = true;
                break;
            }
        }
        if (!r)
            System.out.println(num + " is a prime number.");
        else
            System.out.println(num + " is not a prime number.");
    }
}
