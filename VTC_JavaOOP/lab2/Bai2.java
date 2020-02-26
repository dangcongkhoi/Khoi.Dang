package VTC_JavaOOP.lab2;

public class Bai2 {
    public static void main(String[] args) {
        TamGiacCan tg1=new TamGiacCan(1,2);
        System.out.println(tg1.toString());
        System.out.println("Dien Tich = "+tg1.tinhDienTich());
        System.out.println("Chu Vi = "+tg1.tinhChuVi());

        HinhVuong h1= new HinhVuong(3);
        System.out.println(h1.toString());
        System.out.println("chuVi: "+h1.tinhChuVi());
        System.out.println("Dien Tich: "+h1.tinhDienTich());

    }
}
class TamGiac{
    private double a,b,c;
    public TamGiac() {

    }
    public double tinhDienTich(){
        double dienTich=0;

        return  dienTich;
    }
    public double tinhChuVi(){
        double chuVi = 0;

        return chuVi;
    }

    public TamGiac(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        if (a>0) {
            this.a = a;
        }
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        if (b>0) {

            this.b = b;
        }

    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        if (c>0) {
            this.c = c;
        }
    }
}
class TamGiacCan extends TamGiac{
    private double ab,c;

    public double getAb() {

        return ab;
    }

    public void setAb(double ab) {
        if (ab>c) {
            this.ab = ab;
        }else System.out.println("ab phai lon hon c");
    }

    @Override
    public double getC() {
        return c;
    }

    @Override
    public void setC(double c) {
        this.c = c;
    }

    public TamGiacCan(double a, double b, double c, double ab, double c1) {
        super(a, b, c);
        this.ab = ab;
        this.c = c1;
    }
    public TamGiacCan(double ab, double c1) {
        super();
        if (ab>c1) {
            this.ab = ab;
        }
        this.c = c1;
    }

    @Override
    public double tinhChuVi() {
        double chuVi;
        chuVi= ab*2+c;
        return super.tinhChuVi()+chuVi;
    }

    @Override
    public double tinhDienTich() {
        double dienTich;
        double p = tinhChuVi()/2;
        dienTich=Math.sqrt(p*(p-ab)*(p-ab)*(p-c));
        return super.tinhDienTich()+dienTich;
    }

    @Override
    public String toString() {
        return "TamGiacCan{" +
                "ab=" + ab +
                ", c=" + c +
                '}';
    }
}
class HinhChuNhat{
    private double chieuDai,chieuRong;

    public HinhChuNhat() {

    }

    public double tinhChuVi(){
    return (chieuRong+chieuDai)*2;
}
public double tinhDienTich(){
    return chieuDai*chieuRong;
}
    public double getChieuDai() {
        return chieuDai;
    }

    public void setChieuDai(double chieuDai) {
        this.chieuDai = chieuDai;
    }

    public double getChieuRong() {
        return chieuRong;
    }

    public void setChieuRong(double chieuRong) {
        this.chieuRong = chieuRong;
    }

    public HinhChuNhat(double chieuDai, double chieuRong) {
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }

    @Override
    public String toString() {
        return "HinhChuNhat{" +
                "chieuDai=" + chieuDai +
                ", chieuRong=" + chieuRong +
                '}';
    }
}
class HinhVuong extends HinhChuNhat{
    private  double canh;

    public HinhVuong(double canh) {
        super();
        this.canh = canh;
    }

    public double getCanh() {
        return canh;
    }

    public void setCanh(double canh) {
        this.canh = canh;
    }

    @Override
    public double tinhDienTich() {
        return canh*canh;
    }

    @Override
    public double tinhChuVi() {
        return canh*4;
    }

    @Override
    public String toString() {
        return "HinhVuong{" +
                "canh=" + canh +
                '}';
    }
}