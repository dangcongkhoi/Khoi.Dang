package VTC_Introduce_Programming.lab_6;

import java.util.Scanner;

public class Lab6_3 {
    public static long Fibo(long n){
        double Xn;
        Xn=(1/Math.sqrt(5))*(Math.pow((1+Math.sqrt(5))/2,n)-Math.pow((1-Math.sqrt(5))/2,n));
        System.out.println("số fibo của n: "+ n);
        System.out.println("Fibo: "+ Xn);
        return 1;
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Nhập n: ");
        long n = scanner.nextLong();
        Lab6_3.Fibo(n);
    }
}
