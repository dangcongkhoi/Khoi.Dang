package VTC_Introduce_Programming.lab_4;

import java.util.Scanner;

public class Bai8_Binary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap vao so nguyen can doi: ");

        int a = input.nextInt();
        int n = a;
        System.out.println("SỐ BẠN NHẬP: " + a);
        System.out.println ("Mã Nhị Phân: " + Integer.toBinaryString(n));
    }
}
