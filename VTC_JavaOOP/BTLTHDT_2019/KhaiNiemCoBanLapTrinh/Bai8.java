package VTC_JavaOOP.BTLTHDT_2019.KhaiNiemCoBanLapTrinh;

import java.util.Arrays;
import java.util.Comparator;

public class Bai8 {
    public static void main(String[] args) {
        CD cd1 = new CD(123, "Taylor Swift", 5, 50000);
        CD cd2 = new CD(871, "Maroon5", 5, 70000);
        CD cd3 = new CD(472, "snoopdog", 5, 30000);
        CD cd4 = new CD(943, "A Taylor", 5, 60000);
        CD cd5 = new CD(538, "Drifter", 5, 10000);
        CD cd6 = new CD(472, "A Taylor", 5, 60000);

        CDlist album1 = new CDlist();
        album1.addCD(cd1);
        album1.addCD(cd2);
        album1.addCD(cd3);
        album1.addCD(cd4);
        album1.addCD(cd5);
        album1.addCD(cd6);
        album1.disPlay();

        //System.out.println("So luong CD trong DS = " + album1.size);

        System.out.println("Tong Gia Thanh CD = " +
                album1.sumPrice());

       System.out.println("sort big to small");
       album1.sortPriceBigToSmall();
       album1.disPlay();
        System.out.println();
        System.out.println("sort A-Z");
        album1.sortNameA_Z();
        album1.disPlay();
    }
}

class CD {
    private int ID_CD;
    private String name_CD;
    private int list;
    private double price;

    public int getID_CD() {
        return ID_CD;
    }

    public void setID_CD(int ID_CD) {
        if (ID_CD <= 0) {
            ID_CD = 999999;
        }
        this.ID_CD = ID_CD;
    }

    public String getName_CD() {
        return name_CD;
    }

    public void setName_CD(String name_CD) {
        if (name_CD == null) {
            name_CD = "chua xac dinh";
        }
        this.name_CD = name_CD;
    }

    public int getList() {
        return list;
    }

    public void setList(int list) {
        if (list < 0) {
            System.out.println("error");
        }
        this.list = list;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price < 0) {
            System.out.println("error");
        }
        this.price = price;
    }

    public CD(int ID_CD, String name_CD, int list, double price) {
        this.ID_CD = ID_CD;
        this.name_CD = name_CD;
        this.list = list;
        this.price = price;
    }

    @Override
    public String toString() {
        return "CD{" +
                "ID_CD=" + ID_CD +
                ", name_CD='" + name_CD + '\'' +
                ", list=" + list +
                ", price=" + price +
                '}';
    }
}

class CDlist {


    //    Scanner sc =new Scanner(System.in);
//    int size=sc.nextInt();
//    private CD[] cd= new CD[size];
    private CD[] cd = new CD[6];
    static int icount = 1;

    public CD[] getCd() {
        return cd;
    }

    public void setCd(CD[] cd) {
        this.cd = cd;
    }

    public void addCD(CD cd1) {
        CD trung = new CD(999999,"%^$#trung ID",999999,0);
        int flag = 0;
        for (int i = 0; i < icount; i++) {
            if (cd[0]==null){
                cd[0]=cd1;
                return;
            }
            if (cd1.getID_CD() != cd[i].getID_CD()) {
                //flag = 0;
            } else flag = 1;
        }
        if (flag == 0) {
            cd[icount] = cd1;
            icount++;
        } else {cd[icount] = trung;
        icount++;}
    }
    public void countCD(){
        int count;
        for (int j = 0; j < icount ; j++) {

        }
    }
    public double sumPrice() {
        double sum = 0;
        for (int j = 0; j < icount; j++) {
            sum += cd[j].getPrice();
        }
        return sum;
    }

    public void disPlay() {
        for (int j = 0; j < icount; j++) {
            System.out.println(cd[j].toString());
        }
    }

    public void sortPriceBigToSmall() {
        Arrays.sort(cd, new Comparator<CD>() {
            @Override
            public int compare(CD cd, CD t1) {
                return Double.compare(t1.getPrice(), cd.getPrice());
            }
        });
    }

    public void sortNameA_Z() {
        Arrays.sort(cd, new Comparator<CD>() {
            @Override
            public int compare(CD cd1, CD t1) {
                return cd1.getName_CD().compareTo(t1.getName_CD());
            }
        });
    }
}