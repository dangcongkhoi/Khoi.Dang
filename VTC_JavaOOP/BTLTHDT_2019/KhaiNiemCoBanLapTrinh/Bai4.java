package VTC_JavaOOP.BTLTHDT_2019.KhaiNiemCoBanLapTrinh;

public class Bai4 {
    public static void main(String[] args) {
        Vehicle xe1 = new Vehicle("Nguyen Thu Loan", "Future Neo", 35000000L, 100);
        Vehicle xe2 = new Vehicle("Le Minh Tinh", "Ford", 2500000000L, 3000);
        Vehicle xe3 =new Vehicle("Nguyen Minh Triet","Landscape",100000000000L,1500);
        System.out.println(String.format("%-30s %-20s %10s %20s %30s", "Ten Chu Xe", "Loai Xe",
                "Dung Tich", "tri Gia", "Thue Phai Nop"));
        System.out.println("==================================================================================================================");
        System.out.println(xe1.toString());
        System.out.println(xe2.toString());
        System.out.println(xe3.toString());
    }
}
class Vehicle{
    private String chuXe;
    private String loaiXe;
    private double triGiaxe;
    private double xyLanh;

    public String getChuXe() {
        return chuXe;
    }

    public void setChuXe(String chuXe) {
        this.chuXe = chuXe;
    }

    public String getLoaiXe() {
        return loaiXe;
    }

    public void setLoaiXe(String loaiXe) {
        this.loaiXe = loaiXe;
    }

    public double getTriGiaxe() {
        return triGiaxe;
    }

    public void setTriGiaxe(long triGiaxe) {
        this.triGiaxe = triGiaxe;
    }

    public double getXyLanh() {
        return xyLanh;
    }

    public Vehicle(String chuXe, String loaiXe, long triGiaxe, double xyLanh) {
        this.chuXe = chuXe;
        this.loaiXe = loaiXe;
        this.triGiaxe = triGiaxe;
        this.xyLanh = xyLanh;
    }

    public void setXyLanh(double xyLanh) {
        if (xyLanh<=0){
            xyLanh=0;
        }
        this.xyLanh = xyLanh;
    }
    public double percentageTax(){
        double Percentage;
        if (xyLanh<100){
            Percentage = 0.01;
        }else if (xyLanh<=200){
            Percentage =0.03;
        }else
            Percentage = 0.05;
        return Percentage;
    }
    public double tax(){
        return triGiaxe*percentageTax();
    }

    @Override
    public String toString() {
        return String.format("%-30s %-20s %10.3s %20.2f %30.2f", chuXe, loaiXe,
                xyLanh, triGiaxe, tax());
    }

    public void disPlay(){
        String.format("%-5s %-30s %10.2f %10.2s %10.2f", chuXe, loaiXe,
                xyLanh, triGiaxe, tax());
    }
}