package VTC_Introduce_Programming.Lab_7;

import java.util.Scanner;

public class lab7_3_1MARK {
    static class ThongTinMonHoc {
        String monhoc1, monhoc2, monhoc3, monhoc4, monhoc5, monhoc6, monhoc7, monhoc8;
        double DiemMon1, DiemMon2, DiemMon3, DiemMon4, DiemMon5, DiemMon6, DiemMon7, DiemMon8;

        //Nhap Thong Tin mon Hoc va Diem
        public void MenuNhapDSmonhoc() {
            Scanner sc = new Scanner(System.in);

            System.out.println("Nhập thông tin môn học");

            System.out.println("Nhap Mon thu 1: ");
            monhoc1 = sc.nextLine();
            System.out.println("Nhap Diem: ");
            DiemMon1 = sc.nextDouble();
            sc.nextLine();

            System.out.println("Nhap Mon thu 2: ");
            monhoc2 = sc.nextLine();
            System.out.println("Nhap Diem: ");
            DiemMon2 = sc.nextDouble();
            sc.nextLine();

            System.out.println("Nhap Mon thu 3: ");
            monhoc3 = sc.nextLine();
            System.out.println("Nhap Diem: ");
            DiemMon3 = sc.nextDouble();
            sc.nextLine();

            System.out.println("Nhap Mon thu 4: ");
            monhoc4 = sc.nextLine();
            System.out.println("Nhap Diem: ");
            DiemMon4 = sc.nextDouble();
            sc.nextLine();

            System.out.println("Nhap Mon thu 5: ");
            monhoc5 = sc.nextLine();
            System.out.println("Nhap Diem: ");
            DiemMon5 = sc.nextDouble();
            sc.nextLine();

            System.out.println("Nhap Mon thu 6: ");
            monhoc6 = sc.nextLine();
            System.out.println("Nhap Diem: ");
            DiemMon6 = sc.nextDouble();
            sc.nextLine();

            System.out.println("Nhap Mon thu 7: ");
            monhoc7 = sc.nextLine();
            System.out.println("Nhap Diem: ");
            DiemMon7 = sc.nextDouble();
            sc.nextLine();

            System.out.println("Nhap Mon thu 8: ");
            monhoc8 = sc.nextLine();
            System.out.println("Nhap Diem: ");
            DiemMon8 = sc.nextDouble();
            System.out.println("=============================");


        }

        //Hien Thi Danh Sach Da Nhap
        public void MenuHienThiDS() {
            System.out.printf("%-12s%-12s%-12s%-12s%-12s%-12s%-12s%-12s\n", monhoc1, monhoc2, monhoc3, monhoc4, monhoc5, monhoc6, monhoc7, monhoc8);
            System.out.println("=======================================================================================");
            System.out.printf("%-12s%-12s%-12s%-12s%-12s%-12s%-12s%-12s", DiemMon1, DiemMon2, DiemMon3, DiemMon4, DiemMon5, DiemMon6, DiemMon7, DiemMon8);
            System.out.println();
            System.out.println("=======================================================================================");
        }

        //Hien thi Mon hoc co diem cao Nhat
        public void DiemTBCaoNhat() {
            String[] MangMonHoc = new String[8];


            MangMonHoc[0] = this.monhoc1;
            MangMonHoc[1] = this.monhoc2;
            MangMonHoc[2] = this.monhoc3;
            MangMonHoc[3] = this.monhoc4;
            MangMonHoc[4] = this.monhoc5;
            MangMonHoc[5] = this.monhoc6;
            MangMonHoc[6] = this.monhoc7;
            MangMonHoc[7] = this.monhoc8;

            Double[] MangDiem = new Double[8];

            {
                MangDiem[0] = DiemMon1;
                MangDiem[1] = DiemMon2;
                MangDiem[2] = DiemMon3;
                MangDiem[3] = DiemMon4;
                MangDiem[4] = DiemMon5;
                MangDiem[5] = DiemMon6;
                MangDiem[6] = DiemMon7;
                MangDiem[7] = DiemMon8;
            }
            double max = MangDiem[0];
            String MonHocDiemCaoNhat = " ";

            for (int i = 1; i < MangDiem.length; i++) {
                if (max < MangDiem[i]) {
                    max = MangDiem[i];
                    MonHocDiemCaoNhat = MangMonHoc[i];
                }
            }
            System.out.println("Diem Mon Hoc Cao nhat");
            System.out.println("=========================");
            System.out.println(MonHocDiemCaoNhat + ": " + max);
            System.out.println("=========================");
        }
    }


    public static void main(String[] args) {
        Scanner NumChose = new Scanner(System.in);
        ThongTinMonHoc HS1 = new ThongTinMonHoc();
        int NumChose1;
        //Menu Kiem tra thong tin Hoc SInh
        do {

            System.out.println("=========================");
            System.out.println(":         Menu          :");
            System.out.println("=========================");
            System.out.println("1- Nhap danh sach mon hoc");
            System.out.println("2- Hien thi danh sach");
            System.out.println("3- Diem trung binh cao nhat");
            System.out.println("4- Thoat");
            System.out.println("=========================");
            System.out.print("Nhap so trong Menu: ");
            NumChose1 = NumChose.nextInt();

            //Nhap so Ngoai menu se Nhap lai
            while (NumChose1 <= 0 || NumChose1 >= 5) {
                System.out.print("Entered Incorrectly. re-enter: ");
                NumChose1 = NumChose.nextInt();

            }
            // Cach Dong
            System.out.println("=========================");
            System.out.println();
            System.out.println();
            //chon menu
            switch (NumChose1) {
                case 1:
                    HS1.MenuNhapDSmonhoc();
                    break;
                case 2:
                    HS1.MenuHienThiDS();
                    break;
                case 3:
                    HS1.DiemTBCaoNhat();
                    break;
                case 4:
                    System.out.println("Da thoat chuong trinh");
                    break;
            }

        } while (NumChose1 > 0 && NumChose1 < 4);


    }
}
