package VTC_Introduce_Programming.lab_9;

import java.util.*;

public class Bai1 {
    public static class DemoArraylist {
        //public static SmartList<Integer> SoNguyen;
        //ArrayList SoNguyen = new ArrayList();
        static List<Integer> SoNguyen = new ArrayList<>();

        public DemoArraylist() {
            Scanner sc = new Scanner(System.in);
            int n;
            System.out.println("Nhập độ lớn arraylist");
            n = sc.nextInt();
            for (int i = 0; i < n; i++) {
                System.out.println("Nhập phần thử thứ " + (i + 1) + ": ");
                DemoArraylist.SoNguyen.add(sc.nextInt());
            }
            for (int i = 0; i < DemoArraylist.SoNguyen.size(); i++) {
                System.out.print(DemoArraylist.SoNguyen.get(i) + " | ");

            }
            System.out.println();
        }


    }

    public static void main(String[] args) {
        int Numchose;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("================================================");
            System.out.println("Demo cac thao tac tren Array list so nguyen java");
            System.out.println("================================================");
            System.out.println("1- khoi tao danh sach");
            System.out.println("2- Them 1 phan tu vao danh sach");
            System.out.println("3- xoa 1 phan tu ra khoi danh sach");
            System.out.println("4- Chen 1 phan tu vao danh sach");
            System.out.println("5- duyet danh sach");
            System.out.println("6- Tim 1 phan tu");
            System.out.println("7- Sap xep danh sach tang dan");
            System.out.println("8- Sap xep danh sach giam dan");
            System.out.println("0- Thoat chuong trinh");
            System.out.println("================================================");
            System.out.print("Chọn số: ");
            Numchose = scanner.nextInt();
            System.out.println("================================================");


            switch (Numchose) {
                case 1:
                    new DemoArraylist();
                    break;
                case 2:
                    System.out.println(" Nhap so Nguyen can them");
                    Bai1.DemoArraylist.SoNguyen.add(scanner.nextInt());
                    break;
                case 3:
                    System.out.println("Nhap vi tri trong Array list can xoa");
                    DemoArraylist.SoNguyen.remove(scanner.nextInt());
                    break;
                case 4:
                    System.out.println("chọn vị trí arraylisst can chen");
                    DemoArraylist.SoNguyen.set(scanner.nextInt(), scanner.nextInt());
                    break;
                case 5:
                    System.out.println(" Duyet danh sach");
                    for (int i = 0; i < DemoArraylist.SoNguyen.size(); i++) {
                        System.out.print(DemoArraylist.SoNguyen.get(i) + " | ");
                    }
                    break;
                case 6:
                    System.out.print("Nhập Phần tử cần tìm: ");
                    int a;
                    int status = 0;
                    Scanner scanner12 = new Scanner(System.in);
                    a = scanner12.nextInt();
                    // có trng danh sách
                    for (int i = 0; i < DemoArraylist.SoNguyen.size(); i++) {
                        if (DemoArraylist.SoNguyen.get(i).equals(a)) {
                            System.out.println("[" + DemoArraylist.SoNguyen.get(i) + "]" + " Có trong danh sách ");
                            status = 1;
                            break;
                        }
                    }if (status == 0) System.out.println("Số bạn tìm không" + " Có trong danh sách ");


                    break;
                case 7:
                    Collections.sort(DemoArraylist.SoNguyen);
                    for (int i = 0; i < DemoArraylist.SoNguyen.size(); i++) {
                        System.out.print(DemoArraylist.SoNguyen.get(i) + " | ");
                    }
                    System.out.println();
                    break;
                case 8:
                    Collections.sort(DemoArraylist.SoNguyen, Collections.reverseOrder());
                    for (int i = 0; i < DemoArraylist.SoNguyen.size(); i++) {
                        System.out.print(DemoArraylist.SoNguyen.get(i) + " | ");
                    }
                    System.out.println();
                    break;
                default:
                    System.out.println("Nhập sai vui lòng nhập lại");
            }

        } while (Numchose != 0);
        System.out.println("Thoat chuong trinh");
    }
}
