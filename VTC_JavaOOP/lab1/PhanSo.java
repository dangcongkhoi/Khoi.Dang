package VTC_JavaOOP.lab1;

public class PhanSo {
    private double TuSo;
    private double MauSo;

    public double getTuSo() {
        return TuSo;
    }

    public void setTuSo(double tuSo) {
        TuSo = tuSo;
    }

    public double getMauSo() {
        return MauSo;
    }

    public void setMauSo(double mauSo) {
        MauSo = mauSo;
    }

    public PhanSo() {
        TuSo = 0;
        MauSo = 1;
    }

    public PhanSo(double tu, double mau) {
        this.TuSo = tu;
        this.MauSo = mau;

    }

    public double UCLN() {
        double temp1, temp2;
        double uscln;
        temp1 = TuSo;
        temp2 = MauSo;
        while (temp1 != temp2) {
            if (temp1 > temp2) {
                temp1 -= temp2;
            } else {
                temp2 -= temp1;
            }
        }
        uscln = temp1;

        System.out.println("Ước số chung lớn nhất của " + TuSo + " và " + MauSo + " = " + uscln);
        return uscln;
    }

    public double UCLN2() {
        double temp1, temp2;
        double uscln;
        temp1 = TuSo;
        temp2 = MauSo;
        while (temp1 != temp2) {
            if (temp1 > temp2) {
                temp1 -= temp2;
            } else {
                temp2 -= temp1;
            }
        }
        uscln = temp1;

        //System.out.println("Ước số chung lớn nhất của " + TuSo + " và " + MauSo + " = " + uscln);
        return uscln;
    }

    public void RutgonPS() {
        PhanSo rutgonPS = new PhanSo(this.getTuSo() / UCLN2(), this.getMauSo() / UCLN2());
        System.out.println(rutgonPS.getTuSo() + "/" + rutgonPS.getMauSo());
    }

    public PhanSo CongPS(PhanSo a) {
        double ts = this.getTuSo() * a.getMauSo() + a.getTuSo() * this.getMauSo();
        double ms = this.getMauSo() * a.getMauSo();
        PhanSo phanSoTong = new PhanSo(ts, ms);
        phanSoTong.RutgonPS();
        System.out.println("Tổng hai phân số = " + phanSoTong.TuSo + "/" + phanSoTong.MauSo);
        return phanSoTong;
    }

    public void truPhanSo(PhanSo ps) {
        double ts = this.getTuSo() * ps.getMauSo() - ps.getTuSo() * this.getMauSo();
        double ms = this.getMauSo() * ps.getMauSo();
        PhanSo phanSoHieu = new PhanSo(ts, ms);
        phanSoHieu.RutgonPS();
        System.out.println("Hiệu hai phân số = " + phanSoHieu.TuSo + "/" + phanSoHieu.MauSo);
    }

    public void nhanPhanSo(PhanSo ps) {
        double ts = this.getTuSo() * ps.getTuSo();
        double ms = this.getMauSo() * ps.getMauSo();
        PhanSo phanSoTich = new PhanSo(ts, ms);
        phanSoTich.RutgonPS();
        System.out.println("Tích hai phân số = " + phanSoTich.TuSo + "/" + phanSoTich.MauSo);
    }

    public void chiaPhanSo(PhanSo ps) {
        double ts = this.getTuSo() * ps.getMauSo();
        double ms = this.getMauSo() * ps.getTuSo();
        PhanSo phanSoThuong = new PhanSo(ts, ms);
        phanSoThuong.RutgonPS();
        System.out.println("Thương hai phân số = " + phanSoThuong.TuSo + "/" + phanSoThuong.MauSo);
    }

    public void Display() {
        System.out.println(TuSo + "/" + MauSo);
    }

    public void Display2() {
        System.out.print(TuSo + "/" + MauSo);
    }

    public void SoSanh(PhanSo ps) {
        double PhanSoA;
        double PhanSoB;
        PhanSoA = this.TuSo / this.MauSo;
        PhanSoB = ps.TuSo / ps.MauSo;
        if ((PhanSoA == PhanSoB)) {
            //System.out.println("Phan So bang");
            //System.out.print("");
            this.Display2();
            System.out.print(" = ");
            ps.Display2();

        } else if (PhanSoA > PhanSoB) {
            this.Display2();
            System.out.print(" > ");
            ps.Display2();
        } else if (PhanSoA < PhanSoB) {
            this.Display2();
            System.out.print(" < ");
            ps.Display2();

        }
    }


    @Override
    public String toString() {
        return "{" +
                "TuSo=" + TuSo +
                ", MauSo=" + MauSo +
                '}';
    }

    public int compareTo(PhanSo o) {
        double me = this.TuSo / this.MauSo;
        double         other = o.TuSo / o.MauSo;
        if (me < other) {
            return -1;
        }
        if (me > other) {
            return 1;
        }
        return 0;
    }
}

