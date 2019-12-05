package VTC_Introduce_Programming.lab_5;

import java.util.Scanner;

public class Bai8_OutputAZ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int flag = 0;
        char c;

        do {
            flag = 0;
            c = sc.nextLine().charAt(0);
            if (((int) c >= 97 && (int) c <= 122)) {
                System.out.println(c + " is an alphabet.");
                flag = 0;
                break;
            }
            if (flag == 1) ;
            System.out.println(c + " is not an alphabet.");
        } while (flag == 0);

        do {
            switch (c) {
                case 'q':
                    System.out.println("convert to UppCase");
                    System.out.println("Q");
                    break;
                case 'w':
                    System.out.println("convert to UppCase");
                    System.out.println("W");
                    break;
                case 'r':
                    System.out.println("convert to UppCase");
                    System.out.println("R");
                    break;
                case 't':
                    System.out.println("convert to UppCase");
                    System.out.println("T");
                    break;
                case 'p':
                    System.out.println("convert to UppCase");
                    System.out.println("P");
                    break;
                case 's':
                    System.out.println("convert to UppCase");
                    System.out.println("S");
                    break;
                case 'd':
                    System.out.println("convert to UppCase");
                    System.out.println("D");
                    break;
                case 'f':
                    System.out.println("convert to UppCase");
                    System.out.println("F");
                    break;
                case 'g':
                    System.out.println("convert to UppCase");
                    System.out.println("G");
                    break;
                case 'h':
                    System.out.println("convert to UppCase");
                    System.out.println("H");
                    break;
                case 'j':
                    System.out.println("convert to UppCase");
                    System.out.println("J");
                    break;
                case 'k':
                    System.out.println("convert to UppCase");
                    System.out.println("K");
                    break;
                case 'l':
                    System.out.println("convert to UppCase");
                    System.out.println("L");
                    break;
                case 'z':
                    System.out.println("convert to UppCase");
                    System.out.println("Z");
                    break;
                case 'x':
                    System.out.println("convert to UppCase");
                    System.out.println("X");
                    break;
                case 'c':
                    System.out.println("convert to UppCase");
                    System.out.println("C");
                    break;
                case 'v':
                    System.out.println("convert to UppCase");
                    System.out.println("V");
                    break;
                case 'b':
                    System.out.println("convert to UppCase");
                    System.out.println("B");
                    break;
                case 'n':
                    System.out.println("convert to UppCase");
                    System.out.println("N");
                    break;
                case 'm':
                    System.out.println("convert to UppCase");
                    System.out.println("M");
                    break;
                case 'e':
                    System.out.println("convert to UppCase");
                    System.out.println("E");
                    break;
                case 'u':
                    System.out.println("convert to UppCase");
                    System.out.println("U");
                    break;
                case 'i':
                    System.out.println("convert to UppCase");
                    System.out.println("I");
                    break;
                case 'o':
                    System.out.println("convert to UppCase");
                    System.out.println("O");
                    break;
                case 'a':
                    System.out.println("convert to UppCase");
                    System.out.println("A");
                    break;
                default:
                    break;
            }
        } while ((c <= 'a' && c >= 'z') || (c <= 'A' && c >= 'Z'));


    }
}