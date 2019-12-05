package VTC_Introduce_Programming.lab_3;

import java.util.Random;

public class Bai3 {
    public static void main(String[] args) {
        Random SoNgauNhien = new Random();
        double so1, so2, so3, so4, SoLonNhat, SoNhoNhat;
        so1 = SoNgauNhien.nextDouble();
        so2 = SoNgauNhien.nextDouble();
        so3 = SoNgauNhien.nextDouble();
        so4 = SoNgauNhien.nextDouble();
        System.out.println(
                "4 Số Ngẫu Nhiên: " +
                        so1 + "\t"
                        + so2 + "\t" +
                        so3 + "\t" +
                        so4 + "\t");
        SoLonNhat = so1;
        if (SoLonNhat < so2){
            SoLonNhat = so2;
        }
        if (SoLonNhat < so3){
            SoLonNhat = so3;
        }
        if (SoLonNhat < so4){
            SoLonNhat = so4;
        }
        System.out.println("Số lớn nhất: "+ SoLonNhat);

        SoNhoNhat = so1;
        if (SoLonNhat < so2){
            SoLonNhat = so2;
        }if (SoLonNhat < so3){
            SoLonNhat = so3;
        }
        if (SoLonNhat < so4){
            SoLonNhat = so4;
        }
        System.out.println("Số Nhỏ nhất " + SoNhoNhat);
    }
}
