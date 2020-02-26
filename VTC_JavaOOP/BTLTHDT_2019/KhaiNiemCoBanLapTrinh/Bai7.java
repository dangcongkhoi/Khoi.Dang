package VTC_JavaOOP.BTLTHDT_2019.KhaiNiemCoBanLapTrinh;

public class Bai7 {
    public static void main(String[] args) {
        ToaDo a1= new ToaDo(5,5);
        HinhTron a = new HinhTron(a1,10.5);
        System.out.println(a.toString());
    }
}
class HinhTron extends ToaDo {
    private ToaDo Tam;
    private double banKinh;
    final double pi =3.14;

    public ToaDo getTam() {
        return Tam;
    }

    public void setTam(ToaDo tam) {
        Tam = tam;
    }

    public double getBanKinh() {
        return banKinh;
    }

    public void setBanKinh(double banKinh) {
        this.banKinh = banKinh;
    }

    public HinhTron(ToaDo tam, double banKinh) {

        Tam = tam;
        this.banKinh = banKinh;
    }
    public HinhTron(){
        super();
    }

    @Override
    public String toString() {
        return "HinhTron{" +
                "Tam=[ " + Tam.getX() +" , "+ Tam.getY()+
                ", banKinh = " + banKinh + ", dienTich = "+dienTich()+", chuVi = "+ chuVi()+
                '}';
    }
    public double dienTich(){
        return Math.pow(banKinh,2)*pi;
    }
    public double chuVi(){
        return 2*banKinh*pi;
    }
}

