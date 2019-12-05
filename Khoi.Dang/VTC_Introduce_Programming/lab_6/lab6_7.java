package VTC_Introduce_Programming.lab_6;

import java.util.Scanner;

public class lab6_7 {
    public static void Menu(int n) {

        if (n == 5) {
            System.out.println("exit Programm");
        }
        if (n < 5 && n > 0) {
            System.out.println("Doing menu ........" + n);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int NumMenu;
        System.out.println("+-------------------------------------------+");
        System.out.println("|                   Menu                    |");
        System.out.println("+-------------------------------------------+");
        System.out.println("|   1.  Menu  1                             | ");
        System.out.println("|   2.  Menu  2                             | ");
        System.out.println("|   3.  Menu  3                             | ");
        System.out.println("|   4.  Menu  4                             | ");
        System.out.println("|   5.  Exit                                | ");
        System.out.println("+-------------------------------------------+");
        System.out.print("              Please choose: ");
        NumMenu = sc.nextInt();

        while (NumMenu < 0 || NumMenu > 5) {
            System.out.print("Entered Incorrectly. re-enter: ");
            NumMenu = sc.nextInt();

        }
        lab6_7.Menu(NumMenu);
    }
}
