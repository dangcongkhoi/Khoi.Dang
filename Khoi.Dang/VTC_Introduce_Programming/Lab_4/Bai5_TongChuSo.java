package VTC_Introduce_Programming.Lab_4;

import java.util.Scanner;

public class Bai5_TongChuSo {
    public static void main(String[] args) {
        int number, balance;
        int sum = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập vào 1 số nguyên dương: ");
        number = scanner.nextInt();

        while (number <= 0) {
            System.out.println("Số nhập vào phải lớn hơn 0. Mời bạn nhập lại: ");
            number = scanner.nextInt();
        }

        if (number > 0) {
            do {


                balance = number % 10;
                sum += balance;
                number /= 10;
            }
            while (number > 0);
        }
        System.out.println("Tổng các chữ số = " + sum);
    }
}
