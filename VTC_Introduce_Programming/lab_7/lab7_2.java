package VTC_Introduce_Programming.lab_7;
import java.util.Scanner;
public class lab7_2 {
    static class PRODUCT {
        int STT;
        String TenSanPham;
        int SoLuong;
        int DonGia;
        public void NhapThongTin() {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Nhập Thông Tin Sản Phẩm");
            System.out.print("Nhập STT: ");
            STT = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Nhập Tên Sản Phẩm: ");
            TenSanPham = scanner.nextLine();
            System.out.print("Nhập Số lượng: ");
            SoLuong = scanner.nextInt();
            System.out.print("Nhập Đơn giá: ");
            DonGia = scanner.nextInt();
            System.out.println("----------------------------------------------------------------");
        }
        public  int TongTien() {
            return (SoLuong * DonGia);
        }
        void XuatThongTinSP() {
            System.out.printf("%-3s%-3s%-2s%-17s%-7s%4d%-4s%7d%-6s%9d%-4s\n",":",STT,":",TenSanPham,":",SoLuong,":",DonGia,":",TongTien(),":");
        }

    }
    public static void main(String[] args) {
        //Khai 5 object
        PRODUCT SP1 = new PRODUCT();
        PRODUCT SP2 = new PRODUCT();
        PRODUCT SP3 = new PRODUCT();
        PRODUCT SP4 = new PRODUCT();
        PRODUCT SP5 = new PRODUCT();
//Nhap 5 object
        SP1.NhapThongTin();
        SP2.NhapThongTin();
        SP3.NhapThongTin();
        SP4.NhapThongTin();
        SP5.NhapThongTin();
//xuat KQ
        System.out.println("DANG MUC SAN PHAM");
        System.out.println("---------------------------------------------------------------");
        System.out.printf("%-7s%-14s%-3s%-3s%-3s\n",": STT :","   Ten San Pham   :"," So Luong :"," Dong Gia :"," Tong tien($) :");
        System.out.println("---------------------------------------------------------------");
        SP1.XuatThongTinSP();
        SP2.XuatThongTinSP();
        SP3.XuatThongTinSP();
        SP4.XuatThongTinSP();
        SP5.XuatThongTinSP();
        System.out.println(":-------------------------------------------------------------:");
        System.out.printf("%62d%-4s\n",SP1.TongTien()+SP2.TongTien()+SP3.TongTien()+SP4.TongTien()+SP5.TongTien(),":");
        System.out.println(":-------------------------------------------------------------:");
    }
}
