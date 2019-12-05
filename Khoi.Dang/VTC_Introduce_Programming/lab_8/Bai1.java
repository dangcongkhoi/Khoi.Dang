package VTC_Introduce_Programming.lab_8;

import java.io.IOException;
import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) throws IOException {
        String chuoi;
        char kyTu = ' ';
        int count = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập vào chuỗi bất kỳ: ");
        chuoi = scanner.nextLine();
        System.out.print("Nhập kí tự cần đếm: ");
        kyTu = (char) System.in.read();

        // duyệt từ đầu đến cuối chuỗi
        for (int i = 0; i < chuoi.length(); i++) {
            // Nếu ký tự tại vị trí thứ i bằng 'a' thì tăng count lên 1
            if (chuoi.charAt(i) == kyTu) {
                count++;
            }
        }

        System.out.println("Số lần xuất hiện của ký tự " + kyTu +
                " trong chuỗi " + chuoi + " = " + count);
    }
}
