package VTC_Introduce_Programming.lab_4;

import java.awt.event.KeyEvent;
import java.util.Scanner;

public class Basi2_kiemtraChar {

    public static void main(String[] args) {
        char Chu_cai;
        char Chu_cai1 = KeyEvent.VK_SPACE;
        Scanner Chu_cai_Can_Nhap = new Scanner(System.in);
        System.out.println("Nhap ky tu bat ki");
        do {
            Chu_cai = Chu_cai_Can_Nhap.nextLine().charAt(0);
            switch (Chu_cai) {
                case '~':
                case '!':
                case '@':
                case '#':
                case '$':
                case '%':
                case '^':
                case '&':
                case '*':
                case ')':
                case '<':
                case '>':
                case '?':
                case '/':
                case '|':
                case '-':
                case '=':
                    System.out.println(Chu_cai + "Ki tu dac biet");
                    System.out.println("De thoat chuong trinh vui long Nhap chu Space voi S viet Hoa ");
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                case '8':
                case '9':
                    System.out.println(Chu_cai + " la chu so");
                    System.out.println("De thoat chuong trinh vui long Nhap chu Space voi S viet Hoa ");
                case 'q':
                case 'w':
                case 'r':
                case 't':
                case 'p':
                case 's':
                case 'd':
                case 'f':
                case 'g':
                case 'h':
                case 'j':
                case 'k':
                case 'l':
                case 'z':
                case 'x':
                case 'c':
                case 'v':
                case 'b':
                case 'n':
                case 'm':
                case 'e':
                case 'y':
                case 'u':
                case 'i':
                case 'o':
                case 'a':
                    System.out.println(Chu_cai + " Thuoc bang Chu cai");
                    System.out.println("De thoat chuong trinh vui long Nhap phim Space và enter");

                default:

                    System.out.println("Da Thoat Chuong Trinh ");
                    System.exit(0);
                    break;

            }
        }while (Chu_cai != Chu_cai1);


    }
    }

