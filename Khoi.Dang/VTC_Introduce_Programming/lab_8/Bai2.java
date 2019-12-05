package VTC_Introduce_Programming.lab_8;

import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        String Chuoi;
        int DoĐai;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chuỗi tùy ý:");
        Chuoi = scanner.nextLine();
        DoĐai = Chuoi.length();
        System.out.println("Chuỗi " + Chuoi + " có độ dài là: " + DoĐai);


        char ch[] = Chuoi.toCharArray(); //add Kieu String thanh Char[]array

        //dem ki tư nguyen am va phu am
        int i;
        int vowelCount = 0;
        int not_vowelCount=0;
        for (i = 0; i <ch.length;++i)
        {
            switch (ch[i]) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                case 'y':
                    vowelCount++;
                    break;
                default:
                    not_vowelCount++;
            }
        }
        System.out.println("Số Kí tự Nguyen âm xuất hiện trong chuỗi:  "+ Chuoi +" là "+vowelCount);
        System.out.println("Số Kí tự Phụ âm xuất hiện trong chuỗi: "+ Chuoi +" là "+not_vowelCount);
//So tu trong chuoi
        int countword=1;
        for ( i =0; i<ch.length;++i){
            switch (ch[i]){
                case ' ':
                    countword++;
                    break;
                default:
            }
        }
        System.out.print("Số từ có trong chuỗi: ");
        System.out.print(countword);
    }
}
