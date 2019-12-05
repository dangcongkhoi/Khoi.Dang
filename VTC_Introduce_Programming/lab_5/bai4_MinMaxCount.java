package VTC_Introduce_Programming.lab_5;

import java.util.Scanner;

public class bai4_MinMaxCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int []number1 = new int[10];
        System.out.println("Nhap 10 so Ngau nhien: ");
        for (int i = 0; i < 10; i++) {
            System.out.print("Nhập phần tử thứ [" + i + "}: ");
            number1[i] = sc.nextInt();
        }
        int min = number1[0];
        int max = number1[0];
        int countMin = 0;
        int countMax = 0;
        System.out.println("Mảng 10 Phần tử");
        for (int i = 0; i < 10; i++) {
            System.out.print(number1[i] + " ");
        }

        for(int i = 1; i < number1.length; i++) {
            if (max < number1[i]) max = number1[i];
            if (min > number1[i])
                min = number1[i];
        }
        System.out.println(min);
        System.out.println(max);
            for (int i = 0; i < 10; i++) {
            if (number1[i] == min) {
                countMin++;
            }
        }
        for (int i = 0; i < 10; i++) {
            if (number1[i] == max) {
                countMax++;
            }
        }
        System.out.println("KQ");
        System.out.println("Số lớn nhất trong mảng: "+max + " |"+"Số lần xuất hiện Trong mảng: " + countMax);
        System.out.println("Số lớn nhất trong mảng: "+min + " |"+"Số lần xuất hiện Trong mảng: " + countMin);
    }
}
