package VTC_JavaOOP.lab1;

public class DoanThang {

    private Diem Dau;
    private Diem Cuoi;

    public DoanThang(Diem dau, Diem cuoi) {
        Dau = dau;
        Cuoi = cuoi;

    }

    public double Distance() {
        double r;
        int xdau = this.Dau.getX();
        int xcuoi = this.Cuoi.getX();
        int ydau = this.Dau.getY();
        int yCuoi = this.Cuoi.getY();
        r = Math.sqrt(Math.pow(xdau - xcuoi, 2) + Math.pow(ydau - yCuoi, 2));
        System.out.println(r);
        return r;
    }

    public void Trungdiem() {
        int xdau = this.Dau.getX();
        int xcuoi = this.Cuoi.getX();
        int ydau = this.Dau.getY();
        int yCuoi = this.Cuoi.getY();
        Diem I = new Diem((xdau - xcuoi) / 2, (ydau - yCuoi) / 2);
        System.out.println(I.getX() + "," + I.getY());
    }

    public void SongSong(DoanThang b) {
        int xdau = this.Dau.getX();
        int xcuoi = this.Cuoi.getX();
        int ydau = this.Dau.getY();
        int yCuoi = this.Cuoi.getY();

        int Bxdau = b.Dau.getX();
        int Bxcuoi = b.Cuoi.getX();
        int Bydau = b.Dau.getY();
        int ByCuoi = b.Cuoi.getY();

        if (((xdau - xcuoi) / (ydau - yCuoi) == (Bxdau-Bxcuoi) / (Bydau- ByCuoi))) {
            System.out.println("Song Song");
        }else System.out.println("Khong Song Song");;
    }

    public Diem getDau() {

        return Dau;
    }

    public void setDau(Diem dau) {
        Dau = dau;


    }

    public Diem getCuoi() {

        return Cuoi;
    }

    public void setCuoi(Diem cuoi) {
        Cuoi = cuoi;

    }


    public void display() {
        System.out.println("[(" + Dau.getX() + "," + Dau.getY() + ")" + ",(" + Cuoi.getX() + "," + Cuoi.getY() + ")]");
    }

    public void Distance(Diem Cuoi) {
        double distacne1;
        distacne1 = Math.sqrt(Math.pow(Dau.getX() - Cuoi.getX(), 2) + Math.pow(Dau.getY() - Cuoi.getY(), 2));
        System.out.println(distacne1);
    }
}
