package VTC_Introduce_Programming.lab_5;

import java.util.Scanner;

public class bai2_XuatGiaTri2Mang {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int Nguyen[] = new int[10];
        double Thuc[] = new double[5];
        double Ghep[] = new double[10];
        System.out.println("Nhập các phần tử cho mảng 10 Số Nguyên");
        for (int i = 0; i < 10; i++) {
            System.out.print("Nhập phần tử thứ " + i + ": ");
            Nguyen[i] = scanner.nextInt();

        }
        System.out.println("Nhập các phần tử cho mảng 5 Số Thực");
        for (int i = 0; i < 5; i++) {
            System.out.print("Nhập phần tử thứ " + i + ": ");
            Thuc[i] = scanner.nextDouble();
        }

        System.out.print("Dãy Nguyên ");
        for (int i = 0; i < 10; i++) {
            System.out.print(Nguyen[i] + " | ");
        }
        System.out.println();
        System.out.print("Dãy Thực: ");
        for (int i = 0; i < 5; i++) {
            System.out.print(Thuc[i] + " | ");
        }
        System.out.println();
        int MangGhep = 0;
        int MangThuc = 0;
        for (int i = 0; i < 10; i++) {
            if (Nguyen[i] % 2 != 0) {
        Ghep[MangGhep]=Thuc[MangThuc];
        MangGhep++;
        MangThuc++;
                                    }
            else {
                Ghep[MangGhep] = 0;
                MangGhep++;
            }
        }
        System.out.print("Cac phan tu sau khi ghép: ");
        for (int i=0; i<10;i++){
            System.out.print(Ghep[i]+ " | ");
        }
    }
}