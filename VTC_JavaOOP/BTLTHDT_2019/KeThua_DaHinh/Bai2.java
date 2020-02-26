package VTC_JavaOOP.BTLTHDT_2019.KeThua_DaHinh;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args)  {

        SimpleDateFormat f =new SimpleDateFormat("dd/mm/yyyy");
        SachThamKhao Ngay1 = new SachThamKhao();
        // date tinh theo format MM/dd/yyyy chua fix duoc;
        Ngay1.addSGK(123,new Date("12/11/2019"), 30000, "A", 100 );
        Ngay1.addSGK(121, new Date("03/02/2019"), 70000, "K", 100 );
        Ngay1.addSGK(122, new Date("11/03/2019"), 20000, "A", 100 );
        SachGiaoKHoa SGKNgay1 = new SachGiaoKHoa();
        SGKNgay1.addSGK(431, new Date("25/04/2019"), 20000, "K", 100,1);
        SGKNgay1.addSGK(434, new Date("22/02/2019"), 20000, "A", 100,0);
        SGKNgay1.addSGK(432, new Date("14/06/2019"), 20000, "K", 100,1);
        ThuVien QuanLy = new ThuVien();
        Ngay1.disPlaySTK();
        System.out.println();
        SGKNgay1.disPlaySGK();
        //search
        QuanLy.searchdisPlay(SGKNgay1,Ngay1);
        //Tong Tien Tung loai + trung binh don gia STK
        QuanLy.ThanhTienTungLoai(SGKNgay1,Ngay1);
    }
}
class ThuVien {
    private int bookID;
    private Date ngayNhap;
    private double price;
    private String NXB;
    private int soLuong;
    public ThuVien() {
    }
    public void searchdisPlay(SachGiaoKHoa a, SachThamKhao b) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap tu khoa can tim");
        String keyword = sc.next();
        a.SearchGSK(keyword);
        b.SearchTSK(keyword);

    }
    public void ThanhTienTungLoai(SachGiaoKHoa a,SachThamKhao b){
        System.out.println("Tong Gia tri SGK = " + a.ThanhTienSGK());
        System.out.println("Tong Gia tri STK = " + b.ThanhTienSGK());
        System.out.println("Gia trung binh sach TK = "+ b.TrungBinhDonGia());

    }

    public ThuVien(int bookID, Date ngayNhap, double price, String NXB, int soLuong) {
        this.bookID = bookID;
        this.ngayNhap = ngayNhap;
        this.price = price;
        this.NXB = NXB;
        this.soLuong = soLuong;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    @Override
    public String toString() {
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
            return "SachThamKhao{" +
                    "bookID=" + bookID +
                    ", ngayNhap=" + format.format(ngayNhap) +
                    ", price=" + price +
                    ", NXB='" + NXB + '\'' +
                    '}';

    }

    public double thanhTien() {
        return thanhTien();
    }

    public int getBookID() {
        return bookID;
    }

    public void setBookID(int bookID) {
        this.bookID = bookID;
    }

    public Date getNgayNhap() {
        return ngayNhap;
    }

    public void setNgayNhap(Date ngayNhap) throws ParseException {
        SimpleDateFormat f =new SimpleDateFormat("dd/mm/yyyy");
        f.parse(String.valueOf(ngayNhap));

        this.ngayNhap = ngayNhap;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getNXB() {
        return NXB;
    }

    public void setNXB(String NXB) {
        this.NXB = NXB;
    }
}

class SachGiaoKHoa extends ThuVien {
    private int status;
    /*status = 0 -> Sach moi
    status = 1 -> Sach cu
     */
    ArrayList<SachGiaoKHoa> luutru = new ArrayList<>();

    public SachGiaoKHoa() {

    }

    public void addSGK(int bookID, Date ngayNhap, double price, String NXB, int soLuong, int status) {
        luutru.add(new SachGiaoKHoa(bookID, ngayNhap, price, NXB, soLuong, status));
    }

    public void SearchGSK(String keyword) {
        for (int i = 0; i < luutru.size(); i++) {
            if (luutru.get(i).getNXB().equals(keyword)) {
                System.out.println(luutru.get(i).toString());
            }
        }

    }
public void disPlaySGK(){
    for (int i = 0; i < luutru.size() ; i++) {
        System.out.println(luutru.get(i).toString());
    }
}
    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public SachGiaoKHoa(int bookID, Date ngayNhap, double price, String NXB, int soLuong, int status) {
        super(bookID, ngayNhap, price, NXB, soLuong);
        this.status = status;
    }


    public double ThanhTienSGK() {
        double sum =0;
        for (int i = 0; i < luutru.size() ; i++) {
         sum +=luutru.get(i).thanhTien1();
        }
        return sum;
    }


    public double thanhTien1() {
        double thanhTien = 0;
        if (status == 1) {
            thanhTien = getSoLuong() * getPrice();

        }
        if (status == 0) {
            thanhTien = getSoLuong() * getPrice() * 0.5;

        }
        return thanhTien;
    }

    @Override
    public String toString() {
        String status1 = null;
        if (status == 1) {
            status1 = " Sach moi";
        }
        if (status == 0) {
            status1 = " Sach cu";
        }
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        return "SachGiaoKHoa{ " +
                "bookID=" + getBookID() +
                ", ngayNhap=" + format.format(getNgayNhap()) +
                ", price=" + getPrice() +
                ", NXB='" + getNXB() + '\'' +

                "status=" + status1 +
                '}';
    }
}

class SachThamKhao extends ThuVien {
    final private double Thue = 0.1;

    ArrayList<SachThamKhao> luutru = new ArrayList<>();

    public SachThamKhao() {

    }

    public void addSGK(int bookID, Date ngayNhap, double price, String NXB, int soLuong) {
        luutru.add(new SachThamKhao(bookID, ngayNhap, price, NXB, soLuong));
    }

    public void SearchTSK(String keyword) {
        for (int i = 0; i < luutru.size(); i++) {
            if (luutru.get(i).getNXB().equals(keyword)) {
                System.out.println(luutru.get(i).toString());
            }
        }

    }

    public double getThue() {
        return Thue;
    }

    public SachThamKhao(int bookID, Date ngayNhap, double price, String NXB, int soLuong) {
        super(bookID, ngayNhap, price, NXB, soLuong);
    }

    @Override
    public double thanhTien() {
        double thanhTien;
        thanhTien = getSoLuong() * getPrice() * getThue();
        return thanhTien;
    }
    public double ThanhTienSGK() {
        double sum =0;
        for (int i = 0; i < luutru.size() ; i++) {
            sum +=luutru.get(i).thanhTien();
        }
        return sum;
    }
    public double TrungBinhDonGia(){
        return ThanhTienSGK()/luutru.size();
    }

    public void disPlaySTK(){
        for (int i = 0; i < luutru.size() ; i++) {
            System.out.println(luutru.get(i).toString());
        }
    }
}