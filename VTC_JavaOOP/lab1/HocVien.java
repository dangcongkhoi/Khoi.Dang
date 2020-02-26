package VTC_JavaOOP.lab1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class HocVien {
    public static double[] diem=new double[7];

    public static double getDiem(int i) {

        return diem[i];
    }

    public static void setDiem(double[] diem) {
        HocVien.diem = diem;

    }

    private static int dem = 0;
    private int maHV;
    {
        dem++;
        this.maHV = dem;
    }
    private String hoTen;
    private boolean gender;
    private Date ngaySinh;
    public String getQueQuan() {
        return queQuan;
    }
    public void setQueQuan(String queQuan) {
        this.queQuan = queQuan;
    }
    private String queQuan;
    public Date getNgaySinh() {
        return ngaySinh;
    }
    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;

    }
    public HocVien(String hoTen, Date ngaySinh, boolean gender, String queQuan) {
        this.hoTen = hoTen;
        this.gender = gender;
        this.ngaySinh = ngaySinh;
        this.queQuan=queQuan;
    }

    public int getMaHV() {
        return maHV;
    }
    public void setMaHV(int maHV) {this.maHV = maHV;}
    public String getHoTen() {
        return hoTen;
    }
    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }
    public boolean getGender() {
        return gender;
    }
    public void setGender(boolean gender) {
        this.gender = gender;
    }
    public void nhapThongTin() throws ParseException {
        Scanner sc = new Scanner(System.in);
        //HocVien a = new HocVien(hoTen,ngaySinh,gender);
        System.out.print("Name: ");
        hoTen = sc.nextLine();
        System.out.print("Birth day: ");
        SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy");
        ngaySinh = f.parse(sc.next());
        System.out.println();
        System.out.print("Gender: ");
        gender = sc.hasNextBoolean();
        System.out.println("Nhap Que Quan");
        queQuan=sc.nextLine();
    }



    int i =0;

    public void nhapDiem(int a){

        Scanner sc = new Scanner(System.in);
        //System.out.println(QLHocVien.hocVienArrayList.size());
            //diem[i] = sc.nextDouble();
        diem[i]=a;
            i++;
        //System.out.println(diem[i]);
        }

    public void hienThi(){
        SimpleDateFormat f = new SimpleDateFormat("dd/mm/yyyy");
        System.out.println(maHV+hoTen+f.format(ngaySinh)+gender+queQuan);
    }
    public void hienThiDiem(int j){

            System.out.println(diem[j]);

    }

    public static void main(String[] args) {
HocVien a =new HocVien(null,null,true,null);
a.nhapDiem(3);
a.nhapDiem(3);
        for (int i = 0; i < 3 ; i++) {
            a.hienThiDiem(i);
        }



    }

    }

