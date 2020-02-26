package VTC_JavaOOP.lab1;

import java.util.ArrayList;
import java.util.Collections;

public class Bai5 {
    public static void main(String[] args) {
        ArrayList<PhanSo> arrayList = new ArrayList<>();
        DSPhanSo ps = new DSPhanSo(arrayList);
        ps.add(new PhanSo(8, 2));
        ps.add(new PhanSo(3, 2));
        ps.add(new PhanSo(3, 2));
        ps.add(new PhanSo(6, 2));
        ps.add(new PhanSo(1,2));
        ps.Display();
        System.out.println();
        //System.out.println(arrayList);
        Collections.sort(arrayList,PhanSo::compareTo);
        ps.Display();
    }
}
