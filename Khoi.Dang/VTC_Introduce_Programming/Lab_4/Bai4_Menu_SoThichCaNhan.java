package VTC_Introduce_Programming.Lab_4;

import java.util.Scanner;

public class Bai4_Menu_SoThichCaNhan {
    public static void main(String[] args) {
        int chose;
        System.out.println("SỞ THÍCH CÁ NHÂN");
        System.out.println("================");
        System.out.println("1. Đọc Sách");
        System.out.println("2. Nghe Nhạc");
        System.out.println("3. Chơi thể thao");
        System.out.println("4. Máy Tính");
        System.out.println("5. Thoat");
        System.out.println("================");
        System.out.print("Chọn: ");
        Scanner luachon= new Scanner(System.in);
        //int chose=luachon.nextInt();
        do {
            chose = luachon.nextInt();
            if (chose > 0 && chose < 5) {
                switch (chose) {
                    case 1:
                        System.out.println("Bạn chọn 1");
                        System.out.println("Bạn Thích Đọc Sách");
                        break;
                    case 2:
                        System.out.println("Bạn chọn 2");
                        System.out.println("Bạn Thích nghe nhạc");
                        break;
                    case 3:
                        System.out.println("Bạn chọn 3");
                        System.out.println("Bạn Thích Chơi thể thao");
                        break;
                    case 4:
                        System.out.println("Bạn chọn 4");
                        System.out.println("Bạn Thích May Tinh");
                        break;
                    default:
                        if (chose !=5){
                            System.out.println("vui Long nhap lai ");
                        }

                }
            }if(chose>5) {
                System.out.println("vui long Nhap lai");
            }
        }
        while (chose != 5);
        System.out.println("Hẹn Gặp lại!");
    }
}
