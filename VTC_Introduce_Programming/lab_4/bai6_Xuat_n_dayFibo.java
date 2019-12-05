package VTC_Introduce_Programming.lab_4;

import java.util.Scanner;

public class bai6_Xuat_n_dayFibo {
    public static void main(String[] args) {
        double n;
        double Xn=0;
        int i;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
for (i=0;i<n;i++){
    Xn=(1/Math.sqrt(5))*(Math.pow((1+Math.sqrt(5))/2,i)-Math.pow((1-Math.sqrt(5))/2,i));
    System.out.println("Dãy số fibo");
    System.out.println(Xn);
}
    }
}
