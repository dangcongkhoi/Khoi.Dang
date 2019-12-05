package VTC_Introduce_Programming.lab_6;

import java.util.Scanner;

public class lab6_5 {
    public static boolean CheckNumber(int n) {

        //int num = 779;
        boolean r = false;

        for (int m = 2; m <= n - 1; ++m) {
            // condition for nonprime number
            if (n % m == 0) {
                r = true;
                break;
            }
        }
        if (!r) {
            System.out.println(n + " is a prime number.");
            return true;
        } else
            System.out.println(n + " is not a prime number.");
        return false;
    }

    public static void main(String[] args) {
int checkNumber;
        Scanner scanner=new Scanner(System.in);
        checkNumber=scanner.nextInt();
        lab6_5.CheckNumber(checkNumber);
    }
}