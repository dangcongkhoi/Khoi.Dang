package VTC_JavaOOP.BTLTHDT_2019.KhaiNiemCoBanLapTrinh;

public class Bai3 {
    public static void main(String[] args) {
        TamGiac a1 = new TamGiac(7, 5, 6);
        a1.dienTich();
        a1.chuVi();


        System.out.println(a1.toString());
    }
}

class TamGiac {
    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        if (ma <= 0) {
            ma = 0;
        }
        this.ma = ma;
    }

    public int getMb() {
        return mb;
    }

    public void setMb(int mb) {
        if (mb <= 0) {
            mb = 0;
        }
        this.mb = mb;
    }

    public int getMc() {
        return mc;
    }

    public void setMc(int mc) {
        if (mc <= 0) {
            mc = 0;
        }
        this.mc = mc;
    }

    public TamGiac(int ma, int mb, int mc) {
        this.ma = ma;
        this.mb = mb;
        this.mc = mc;
    }

    public TamGiac() {
    }

    private int ma, mb, mc;


    @Override
    public String toString() {
        triangleType();
        return "TamGiac{" +
                "ma= " + ma +
                ", mb= " + mb +
                ", mc= " + mc +
                ", chuVi= " + chuVi() +
                ", dienTich= " + dienTich() +
                '}';
    }

    public int chuVi() {
        int chuVi;
        chuVi = ma + mb + mc;
        return chuVi;
    }

    public double dienTich() {
        double p = chuVi() / 2;
        double s = Math.sqrt(p * (p - ma) * (p - mb) * (p - mc));
        return s;
    }

    public void triangleType() {

        if ((ma + mb <= mc) || (mb + mc) <= ma || (mc + ma) <= mb)// điều kiện ko thoả của 1 tam giác
        {
            System.out.println("Day khong phai la 1 tam giac!!!");
        } else // tam giác thường, vuông, cân, vuông cân, đều ta sẽ sắp xếp : Đều->vuông cân->cân->vuông->thường
        {
            if (ma == mb && mb == mc) //đk tam giác đều
            {
                System.out.println("Day la tam giac deu !!");
            } else if (ma == mb || mb == mc || mc == ma) // đk tam giác cân ! *notice : trong tam giác cân có vuông cân, cân
            {
                if (ma * ma + mb * mb == mc * mc || mb * mb + mc * mc == ma * ma || mc * mc + ma * ma == mb * mb)//tam giác vuông cân
                {
                    System.out.println("Day la tam giac vuong can!!!");
                } else {
                    System.out.println("Day la tam giac can !!!");
                }
            } else if (ma * ma + mb * mb == mc * mc || mb * mb + mc * mc == ma * ma || mc * mc + ma * ma == mb * mb)// điều kiên tam giác vuông
            {
                System.out.println("Day la tam giac vuong!!!");
            } else {
                System.out.println("Day la tam giac thuong!!!");
            }
        }

    }
}