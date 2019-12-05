package VTC_Introduce_Programming.lab_3;

import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        Scanner CanhTamGiac = new Scanner(System.in);
        System.out.println("Nhap canh a: ");
        double Canh_a = CanhTamGiac.nextDouble();
        System.out.println("Nhap canh a: ");
        double Canh_b = CanhTamGiac.nextDouble();
        System.out.println("Nhap canh a: ");
        double Canh_c = CanhTamGiac.nextDouble();
        System.out.println("Canh a: " + Canh_a);
        System.out.println("Canh b: " + Canh_b);
        System.out.println("Canh c: " + Canh_c);

        if ((Canh_a + Canh_b > Canh_c) && (Canh_a + Canh_c > Canh_b) && (Canh_b + Canh_c > Canh_a)) {
            System.out.println("La 3 Canh cua Tam giac");
        } else {
            System.out.println("Khong phai la La 3 Canh cua Tam giac");
        }

    }
}
