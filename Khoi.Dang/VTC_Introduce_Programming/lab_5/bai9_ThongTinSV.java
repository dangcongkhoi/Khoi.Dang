package VTC_Introduce_Programming.lab_5;

import java.util.Scanner;

public class bai9_ThongTinSV {
    public static void main(String[] args) {

        double HV[][] = new double[5][6];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.println("Diem HV "+ (i+1)+ ": ");
            for (int j = 0; j < 6; j++) {
                HV[i][j] = sc.nextDouble();
            }
        }
        double revenue[][] = new double[1][5];
        {
            revenue[0][0] = (HV[0][0] + HV[0][1] + HV[0][2] + HV[0][3] + HV[0][4] + HV[0][5]) / 6;
            revenue[0][1] = (HV[1][0] + HV[1][1] + HV[1][2] + HV[1][3] + HV[1][4] + HV[1][5]) / 6;
            revenue[0][2] = (HV[2][0] + HV[2][1] + HV[2][2] + HV[2][3] + HV[2][4] + HV[2][5]) / 6;
            revenue[0][3] = (HV[3][0] + HV[3][1] + HV[3][2] + HV[3][3] + HV[3][4] + HV[3][5]) / 6;
            revenue[0][4] = (HV[4][0] + HV[4][1] + HV[4][2] + HV[4][3] + HV[4][4] + HV[4][5]) / 6;
        }
        System.out.println();
        System.out.println("Học Vien" + " : " + "CF   :" + "   C  :" + " HDJ  :" + " D47J :" + " RBDMS:" + " JAVA :" + " TB   ");
        System.out.println("HV 1    " + " : " + HV[0][0] + " : " + HV[0][1] + " : " + HV[0][2] + " : " + HV[0][3] + " : " + HV[0][4] + " : " + HV[0][5] + " : " + revenue[0][0]);
        System.out.println("HV 2    " + " : " + HV[1][0] + " : " + HV[1][1] + " : " + HV[1][2] + " : " + HV[1][3] + " : " + HV[1][4] + " : " + HV[1][5] + " : " + revenue[0][1]);
        System.out.println("HV 3    " + " : " + HV[2][0] + " : " + HV[2][1] + " : " + HV[2][2] + " : " + HV[2][3] + " : " + HV[2][4] + " : " + HV[2][5] + " : " + revenue[0][2]);
        System.out.println("HV 4    " + " : " + HV[3][0] + " : " + HV[3][1] + " : " + HV[3][2] + " : " + HV[3][3] + " : " + HV[3][4] + " : " + HV[3][5] + " : " + revenue[0][3]);
        System.out.println("HV 5    " + " : " + HV[4][0] + " : " + HV[4][1] + " : " + HV[4][2] + " : " + HV[4][3] + " : " + HV[4][4] + " : " + HV[4][5] + " : " + revenue[0][4]);
    }
}





