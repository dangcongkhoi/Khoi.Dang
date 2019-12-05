package VTC_Introduce_Programming.lab_9;

import java.util.Scanner;
import java.util.Stack;

public class Bai3_XaydungQueue {public static class DemoArraylist {
    //public static SmartList<Integer> SoNguyen;
    //ArrayList SoNguyen = new ArrayList();
    //static List<Integer> SoNguyen = new ArrayList<>();
    static Stack<Integer> SoNguyen = new Stack<>();

    public DemoArraylist() {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Nhập độ lớn arraylist");
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập phần thử thứ " + (i + 1) + ": ");
            Bai2_XayDungStack.DemoArraylist.SoNguyen.push(sc.nextInt());
        }
        for (int i = 0; i < Bai2_XayDungStack.DemoArraylist.SoNguyen.size(); i++) {
            System.out.print(Bai2_XayDungStack.DemoArraylist.SoNguyen.get(i) + " | ");

        }
        System.out.println();
    }


}

    public static void main(String[] args) {
        int Numchose;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("================================================");
            System.out.println("Demo cac thao tac tren Stack so nguyen java");
            System.out.println("================================================");
            System.out.println("1- khoi tao stack");
            System.out.println("2- Them 1 phan tu Stack");
            System.out.println("3- Lay 1 phan tử ra khỏi stack");
            System.out.println("4- Xem phan tu dau stack");
            System.out.println("5- duyet Stack");
            System.out.println("0- Thoat chuong trinh");
            System.out.println("================================================");
            System.out.print("Chọn số: ");
            Numchose = scanner.nextInt();
            System.out.println("================================================");


            switch (Numchose) {
                case 1:
                    new Bai2_XayDungStack.DemoArraylist();
                    break;
                case 2:
                    System.out.println(" Nhap so Nguyen can them");
                    Bai2_XayDungStack.DemoArraylist.SoNguyen.push(scanner.nextInt());
                    break;
                case 3:
                    System.out.println("Xoa phan tử đầu trong Stack");
                    Bai2_XayDungStack.DemoArraylist.SoNguyen.pop();
                    break;
                case 4:
                    int n = 0;
                    System.out.println("Xem Phan tử đầu Stack");
                    System.out.println(Bai2_XayDungStack.DemoArraylist.SoNguyen.get(Bai2_XayDungStack.DemoArraylist.SoNguyen.size()-1));
                    break;
                case 5:
                    System.out.println(" Duyet danh sach");
                    for (int i = 0; i < Bai2_XayDungStack.DemoArraylist.SoNguyen.size(); i++) {
                        System.out.print(Bai2_XayDungStack.DemoArraylist.SoNguyen.get(i) + " | ");
                    }
                    break;

                default:
                    System.out.println("Nhập sai vui lòng nhập lại");
            }

        } while (Numchose != 0);
        System.out.println("Thoat chuong trinh");
    }
}
