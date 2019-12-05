package VTC_Introduce_Programming.lab_6;

import java.util.Scanner;

public class lab6_4 {
    public static void XepHangHocSinh(double n) {
        String a = "A";
        String b = "B";
        String c = "D";
        String e = "E";
        String d = "D";
        if (n <= 3.9) {
            System.out.println("Học sinh xếp hạng "+e);
        } else if (n <= 5.4) {
            System.out.println("Học sinh xếp hạng "+d);
        } else if (n <= 6.9) {
            System.out.println("Học sinh xếp hạng "+c);
        } else if (n <= 8.4) {
            System.out.println("Học sinh xếp hạng "+b);
        } else if (n <= 10) {
            System.out.println("Học sinh xếp hạng "+a);
        } else System.out.println("Error");
    }

    public static void main(String[] args) {
        int diemHS;
        Scanner scanner = new Scanner(System.in);
        diemHS = scanner.nextInt();
        lab6_4.XepHangHocSinh(diemHS);
    }

}
