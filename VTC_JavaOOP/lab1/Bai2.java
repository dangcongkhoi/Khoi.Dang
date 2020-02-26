package VTC_JavaOOP.lab1;

public class Bai2 {
    public static void main(String[] args) {

        DoanThang AB = new DoanThang(new Diem(100, 100), new Diem(20, 78));
        AB.display();
        AB.Distance();
        AB.Trungdiem();
        DoanThang CD = new DoanThang(new Diem(1, 1), new Diem(2, 3));
        CD.display();
        AB.SongSong(CD);


    }
}
