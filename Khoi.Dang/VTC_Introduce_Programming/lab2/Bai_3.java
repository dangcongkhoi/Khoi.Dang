package VTC_Introduce_Programming.lab2;

import java.util.Scanner;

public class Bai_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        //int num = 779;
        boolean r = false;
        System.out.println("Nhập số bất kì > 1");
        System.out.println("nhập không đúng bạn sẽ nhập lại đén khi đúng điều kiện");
        do {
            num = scanner.nextInt();
        }
        while (num <1);

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
