package VTC_Introduce_Programming.lab_3;

import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        double Km_Trip;
        double Giatien;
        Scanner scanner = new Scanner(System.in);
        Km_Trip = scanner.nextDouble();
        if (Km_Trip <= 1) {
            Giatien = Km_Trip * 15000;
        }
        if (Km_Trip <= 5) {
            Giatien = 15000 + 13500 * (Km_Trip - 1);
        }
        if (Km_Trip < 120) {
            Giatien = 15000 + 13500 * 4 + 11000 * (Km_Trip - 5);
        } else {
            Giatien = (15000 + 13500 * 4 + 11000 * 129 + 11000 * (Km_Trip - 120)) * 0.9;
        }
        System.out.println("Đơn Giá: " + Giatien + " VND");
    }
}
