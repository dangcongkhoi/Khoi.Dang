package VTC_Introduce_Programming.lab_5;

import java.util.Scanner;
import java.util.Random;
public class Bai6_NumRandomDevide2EquapO {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        int arr[]=new int[20];

        for (int i =0;i<arr.length;i++){
            arr[i]= rd.nextInt();
        }

        System.out.println("Mảng 20 phần tử: ");

        for (int i =0;i<arr.length;i++){
            System.out.println(arr[i]+" | ");
        }
        //sc.nextLine();
        System.out.print("Nhập Số nguyên x cần chia: ");
        int x = sc.nextInt();
        System.out.println("Những số chia hết cho "+ x );
        for (int i =0 ; i<arr.length;i++){
            if (arr[i]%x==0){
                //System.out.println("Những số chiaw hết cho "+ x );
                System.out.print(arr[i]+" | ");
                return;
            }else break;

        }
        System.out.println("không có vui lòng thử lại");
    }
}
