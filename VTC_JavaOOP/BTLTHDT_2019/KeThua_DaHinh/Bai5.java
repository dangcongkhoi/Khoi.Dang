package VTC_JavaOOP.BTLTHDT_2019.KeThua_DaHinh;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Bai5 {
    public static void main(String[] args) {
        SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy");
        Bill a1 = new HourBill("12",new Date("02/12/1995"),"khoi","D13",60000,10);
        Bill a2 = new HourBill("14",new Date("03/12/1995"),"khoi","D13",60000,10);
        Bill a3 = new HourBill("12",new Date("23/05/1995"),"khoi","D13",60000,10);
        Bill a4 = new HourBill("15",new Date("05/12/1995"),"khoi","D13",60000,10);
        Bill a5 = new HourBill("16",new Date("05/24/1995"),"khoi","D13",60000,10);
        DanhSachHoaDon data = new DanhSachHoaDon();
        Bill emty= new Bill();
        data.billArrayList.add(emty);
        if (data.addob(a1)){
            data.billArrayList.add(a1);
        }if (data.addob(a2)){
            data.billArrayList.add(a2);
        }if (data.addob(a3)){
            data.billArrayList.add(a3);
        }if (data.addob(a4)){
            data.billArrayList.add(a4);
        }if (data.addob(a5)){
            data.billArrayList.add(a5);
        }
        data.disPlay();
        System.out.println("HD hour: "+data.thongKeSoLuongHDTheoGio());
        System.out.println("HD Day: "+data.thongKeSoLuongHDTheoNgay());
        System.out.println(" tong thanh tien: "+ data.tinhTongThanhTien(05,1995));
    }
}

class DanhSachHoaDon {
    ArrayList<Bill> billArrayList = new ArrayList<>();

    public boolean addob(Bill a) {
        for (int i = 0; i < billArrayList.size(); i++) {
            if (!a.getiD().equals(billArrayList.get(i).getiD())) {

            }else return false;
        }
        return true;
    }
    public void disPlay(){
        for (int i = 1; i <billArrayList.size() ; i++) {
            System.out.println(billArrayList.get(i).toString());
        }
    }
    public int thongKeSoLuongHDTheoGio(){
        int count=0;
        for (int i = 1; i < billArrayList.size() ; i++) {
            if (billArrayList.get(i).getiD().startsWith("HourBill|")){
              count++;
            }
        }
        return count;
    }
    public int thongKeSoLuongHDTheoNgay(){
        int count=0;
        for (int i = 1; i < billArrayList.size() ; i++) {
            if (billArrayList.get(i).getiD().startsWith("DayBill")){
                count++;
            }
        }
        return count;
    }
    public double tinhTongThanhTien(int Month,int Year){
        double tinhTongThanhTien=0;
        String sMonth =String.valueOf(Month);
        String sYear = String.valueOf(Year);
        String date1 = sMonth+"/"+"01/"+sYear;
        String date2 = sMonth+"/"+"31/"+sYear;
        Date ngayDau = new Date(date1);
        Date ngayCuoi = new Date(date2);
SimpleDateFormat f = new SimpleDateFormat();
        for (int i = 1; i < billArrayList.size() ; i++) {
            if (billArrayList.get(i).getCheckIn().after(ngayDau)&&billArrayList.get(i).getCheckIn().before(ngayCuoi)){
                tinhTongThanhTien+=billArrayList.get(i).thanhTienbill();
            }
        }
        return tinhTongThanhTien;
    }
}

class Bill {
    private String iD;
    private Date checkIn;
    private String name;
    private String maPhong;
    private double dongia;

    public Bill() {

    }

    public double thanhTienbill() {
        double thanhtien = 0;
        return thanhtien;
    }

    @Override
    public String toString() {
        SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy");
        return
                "iD=" + iD +
                        ", checkIn=" + f.format(checkIn) +
                        ", name='" + name + '\'' +
                        ", maPhong='" + maPhong + '\'' +
                        ", dongia=" + dongia +
                        '}';
    }

    public Bill(String iD, Date checkIn, String name, String maPhong, double dongia) {
        this.iD = iD;
        this.checkIn = checkIn;
        this.name = name;
        this.maPhong = maPhong;
        this.dongia = dongia;
    }

    public double thanhTien() {
        double dongia = 0;
        return dongia;
    }

    public String getiD() {
        return iD;
    }

    public void setiD(String iD) {
        this.iD = iD;
    }

    public Date getCheckIn() {
        return checkIn;
    }

    public void setCheckIn(Date checkIn) {
        this.checkIn = checkIn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMaPhong() {
        return maPhong;
    }

    public void setMaPhong(String maPhong) {
        this.maPhong = maPhong;
    }

    public double getDongia() {
        return dongia;
    }

    public void setDongia(double dongia) {
        this.dongia = dongia;
    }
}

class HourBill extends Bill {
    private int hour;

    @Override
    public double thanhTienbill() {
        double thanhTien = 0;
        if (hour < 24) {
            thanhTien = getDongia() * hour;
        }
        if (hour>24&&hour < 30) {
            thanhTien = getDongia() * 24;
        }
        if (hour > 30) {
            System.out.println("Phat sinh Ngoai le");
        }
        return super.thanhTienbill() + thanhTien;
    }

    @Override
    public String toString() {
        return "HourBill{" + super.toString() +
                "hour=" + hour +
                '}';
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public HourBill(String iD, Date checkIn, String name, String maPhong, double dongia, int hour) {
        super("HourBill|" + iD, checkIn, name, maPhong, dongia);
        this.hour = hour;
    }
}

class DayBill extends Bill {
    private int ngaythue;

    @Override
    public double thanhTienbill() {
        double thanhTien = 0;
        if (ngaythue < 7) {
            thanhTien = ngaythue * getDongia();
        }
        if (ngaythue > 7) {
            thanhTien = 7 * getDongia() + (ngaythue - 7) * getDongia() * 0.2;
        }
        return super.thanhTienbill() + thanhTien;
    }

    @Override
    public String toString() {
        return "DayBill{" + super.toString() +
                "ngaythue=" + ngaythue +
                '}';
    }

    public int getNgaythue() {
        return ngaythue;
    }

    public void setNgaythue(int ngaythue) {
        this.ngaythue = ngaythue;
    }

    public DayBill(String iD, Date checkIn, String name, String maPhong, double dongia, int ngaythue) {
        super("DayBill|" + iD, checkIn, name, maPhong, dongia);
        this.ngaythue = ngaythue;
    }
}
