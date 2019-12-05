package VTC_Introduce_Programming.lab_5;

import java.util.Scanner;

public class Bai5_FindXinArray {
    public static void main(String[] args) {
        //int arr[] = {12, 8, 23, 8, 25, 8, 90, 21, 11, 90};
        //int x = 8;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập mảng 10 phần tử");
        int arr[] = new int[10];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("arr[" + i + "}: ");
            arr[i] = sc.nextInt();
        }
        System.out.print("Nhập x cần tìm: ");
        int x = sc.nextInt();
        int countX = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                countX++;

            }
        }
        System.out.println("số lần xuất hiện của " + x + " là " + countX + " lần");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                System.out.println("Vị trí đàu tiên xuất hiện của " + x + " là Vị trí:" + i);
                return;
            }else break;
        }
        System.out.println(x+" không có trong mảng");


    }
}