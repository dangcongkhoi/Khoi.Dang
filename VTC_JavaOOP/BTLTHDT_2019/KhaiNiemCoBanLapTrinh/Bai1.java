package VTC_JavaOOP.BTLTHDT_2019.KhaiNiemCoBanLapTrinh;

public class Bai1 {
}
class ToaDo{
    int x;
    int y;

    public ToaDo() {

    }

    @Override
    public String toString() {
        return "ToaDo{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public ToaDo(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
