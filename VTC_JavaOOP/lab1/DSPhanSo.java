package VTC_JavaOOP.lab1;

import java.util.ArrayList;

class DSPhanSo {
    ArrayList<PhanSo> ArrDSPS;
    //double KQ = ArrDSPS.get(0).getTuSo()/ArrDSPS.get(0).getMauSo();

    public DSPhanSo(ArrayList<PhanSo> ds) {
        this.ArrDSPS = ds;
    }

    public void add(PhanSo moi) {
        this.ArrDSPS.add(moi);
    }

    public void Display() {
        for (int i = 0; i < ArrDSPS.size(); i++) {
            System.out.println(((PhanSo) ArrDSPS.get(i)));//Cast, Boxing
/*
            double a = 5.0;
            int b = (int)a;//cast, boxing, autoboxing
 */
        }
    }
    public PhanSo TongPS() {

        PhanSo b = (PhanSo) ArrDSPS.get(0);
        for (int i = 1; i < ArrDSPS.size(); i++) {
            b = b.CongPS((PhanSo) ArrDSPS.get(i));
        }
        return b;
    }
}