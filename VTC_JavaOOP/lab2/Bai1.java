package VTC_JavaOOP.lab2;

public class Bai1 {
    public static void main(String[] args) {
        Ellipse h1=new Circle(10);
        System.out.println(h1.toString());
        System.out.println("DienTich= "+h1.dienTich());
        System.out.println("chuVi= "+h1.chuVi());
    }
}
class Ellipse{
    private double bkTrucLon,bkTrucNho;

    public Ellipse() {

    }

    @Override
    public String toString() {
        return "Ellipse{" +
                "bkTrucLon=" + bkTrucLon +
                ", bkTrucNho=" + bkTrucNho +
                '}';
    }

    public double getBkTrucLon() {
        return bkTrucLon;
    }

    public void setBkTrucLon(double bkTrucLon) {
        this.bkTrucLon = bkTrucLon;
    }

    public double getBkTrucNho() {
        return bkTrucNho;
    }

    public void setBkTrucNho(double bkTrucNho) {
        this.bkTrucNho = bkTrucNho;
    }

    public Ellipse(double bkTrucLon, double bkTrucNho) {
        this.bkTrucLon = bkTrucLon;
        this.bkTrucNho = bkTrucNho;
    }
    public double dienTich(){
        double dienTich;
        dienTich= 3.14*bkTrucLon*bkTrucNho;
        return dienTich;
    }
    public double chuVi(){
        double chuVi;
        chuVi= 2*3.14*Math.sqrt(((bkTrucLon*bkTrucLon+bkTrucNho*bkTrucNho)/2));
        return chuVi;
    }

}
class Circle extends Ellipse{
    private double bk;

    public double getBk() {
        return bk;
    }

    public void setBk(double bk) {
        this.bk = bk;
    }

    public Circle(double bkTrucLon, double bkTrucNho) {
        super(bkTrucLon, bkTrucNho);
    }
    public Circle(double bk) {
        super();
        this.bk = bk;
    }

    @Override
    public double dienTich() {
        double dienTich;
        dienTich= 3.14*bk*bk;
        return super.dienTich()+dienTich;
    }

    @Override
    public double chuVi() {
        double chuVi;
        chuVi= 2*3.14*Math.sqrt(((bk*bk+bk*bk)/2));
        return super.chuVi()+chuVi;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "bk=" + bk +
                '}';
    }
}