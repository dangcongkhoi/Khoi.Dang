package VTC_JavaOOP.lab1;

public class Bai4 {
    public static void main(String[] args) {
        PhanSo a = new PhanSo(1, 2);
        a.RutgonPS();
        a.UCLN();
        PhanSo b = new PhanSo(1, 3);
        a.CongPS(b);
        a.truPhanSo(b);
        a.nhanPhanSo(b);
        a.chiaPhanSo(b);
        System.out.println();
        a.SoSanh(b);
    }
}
