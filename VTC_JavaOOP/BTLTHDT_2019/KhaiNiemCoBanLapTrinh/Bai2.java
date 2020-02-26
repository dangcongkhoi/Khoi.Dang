package VTC_JavaOOP.BTLTHDT_2019.KhaiNiemCoBanLapTrinh;

public class Bai2 {
    public static void main(String[] args) {
//        Scanner sc =new Scanner(System.in);
//        System.out.println("Nhap  ID ");
//        int ID=sc.nextInt();
//        sc.nextLine();
//        System.out.println("nhap ten ");
//
//        String name=sc.nextLine();
//        double pointLT=sc.nextDouble();
//        double pointTH=sc.nextDouble();
        SinhVien a1=  new SinhVien(1,"Tri",3,4);
        SinhVien a2=new SinhVien(2,"dang Cong Khoi",3,4);
        SinhVien a3=new SinhVien(3,"dang Cong Khoi",3,4);
        //SinhVien a3=  new SinhVien(ID,name,pointLT,pointTH);

        System.out.printf("%-5s %-36s %-10s %-10s %-10s", "STT","Ho Ten","DiemLT","DiemTH","DiemTB");
        System.out.println();
        System.out.println(a1.toString());
        System.out.println(a2.toString());
        System.out.println(a3.toString());
        //System.out.println(a3.toString());

    }
}
class SinhVien{



    @Override
    public String toString() {
        return String.format("%-5s %-30s %10.2f %10.2f %10.2f", maSV, name,
                pointLT, pointTH, getDiemTB());

    }
//    public void display(){
//        System.out.printf("%-5s %-36s %-10s %-10s %-10s", "STT","Ho Ten","DiemLT","DiemTH","DiemTB");
//    }
    public double getDiemTB() {
        return (pointLT + pointTH)/2;
    }


    public SinhVien(int maSV, String name, double pointLT, double pointTH) {
//        this.maSV = maSV;
//        this.name = name;
//        this.pointLT = pointLT;
     //   this.pointTH = pointTH;
        if (maSV>0){
            this.maSV = maSV;
        }else {this.maSV = 0;
        }

        if (name==null){
this.name="Wrong";
        }else {
            this.name = name;
        }

        if (pointLT>=0&&pointLT<=10){
            this.pointLT = pointLT;
        }else {
            //System.out.println("wrong point");
            this.pointLT = -1;
        }

        if (pointTH>=0&&pointTH<=10){
            this.pointTH = pointTH;
        }else //System.out.println("wrong");
        this.pointTH = -1;
    }



    private int maSV;
    private String name;
    private double pointLT;
    private double pointTH;

    public int getMaSV() {
        return maSV;
    }

    public void setMaSV(int maSV) {
        if (maSV>0){
            this.maSV = maSV;
        }else {System.out.println("Wrong ID");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name==null){
            this.name = name;
            System.out.println("Wrong name");
        }else {
            this.name = name;
        }
    }

    public double getPointLT() {
        return pointLT;
    }

    public void setPointLT(double pointLT) {
        if (pointLT>=0&&pointLT<=10){
            this.pointLT = pointLT;
        }else {
            System.out.println("wrong point");
            this.pointLT = pointLT;
        }
    }

    public double getPointTH() {
        return pointTH;
    }

    public void setPointTH(double pointTH) {
        if (pointTH>=0&&pointTH<=10){
            this.pointTH = pointTH;
        }else System.out.println("wrong");
        this.pointTH = pointTH;
    }
}
