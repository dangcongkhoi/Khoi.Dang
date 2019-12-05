package VTC_Introduce_Programming.lab_7;

import java.util.*;

public class test {
    public static void main(String[] args) {
        String str; // phần tử của ArrayList 1
        int number; // phần tử của ArrayList 2
        Scanner scanner = new Scanner(System.in);

        // tạo 2 ArrayList mới
        ArrayList<String> arrListA = new ArrayList<>();
        ArrayList<Integer> arrListB = new ArrayList<>();

        // nhập vào 5 phần tử cho 2 ArrayList này

        for (int i = 0; i < 5; i++) {
            System.out.println("Nhập phần tử là các chuỗi cho ArrayList 1: ");
            System.out.print("Nhập phần tử thứ " + i + ": ");
            str = scanner.nextLine();
            arrListA.add(str);

        System.out.println("Nhập phần tử là các số nguyên cho ArrayList 2: ");

            System.out.print("Nhập phần tử thứ " + i + ": ");
            number = Integer.parseInt(scanner.nextLine());  // hạn chế hiện tượng trôi lệnh
            arrListB.add(number);
        }
        Iterator<String> iteratorA = arrListA.iterator();
        System.out.println("Các phần tử của arrListA là: ");
        while (iteratorA.hasNext()) {
            System.out.print(iteratorA.next() + "\t");
        }

        Iterator<Integer> iteratorB = arrListB.iterator();
        System.out.println("\nCác phần tử của arrListB là: ");
        while (iteratorB.hasNext()) {
            System.out.print(iteratorB.next() + "\t");
        }
    }
}