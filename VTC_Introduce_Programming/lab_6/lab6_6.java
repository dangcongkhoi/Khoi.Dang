package VTC_Introduce_Programming.lab_6;

import java.util.Scanner;

public class lab6_6 {
    public static boolean CheckPerfectNumber(int n){

            int sum = 0;//khai bao biem sum
            for(int i=1;i<=n/2;i++){
                if(n%i==0)
                    sum+=i;
            }
            if(sum==n){ return true;}
            else
            return false;
        }

    public static void main(String[] args) {
        int CheckNum;
        Scanner sc = new Scanner(System.in);
        CheckNum=sc.nextInt();
        if(lab6_6.CheckPerfectNumber(CheckNum)) {
            System.out.println(CheckNum + " là số hoàn hảo.");
        }
        else System.out.println("không phải số hoàn hảo");
    }
    }

