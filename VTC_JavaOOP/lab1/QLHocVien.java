package VTC_JavaOOP.lab1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class QLHocVien {
    static ArrayList<HocVien> hocVienArrayList = new ArrayList<>();
    //static ArrayList<HocVien> DiemArrayList = new ArrayList<>();
    private static int dem = -1;
    private int maHV;
    {
        dem++;
        this.maHV = dem;
    }

    Scanner sc =new Scanner(System.in);

    public void themHocVien(HocVien a) throws ParseException {
        hocVienArrayList.add(a);
    }

    public void xoaHocVien(HocVien a) {
        hocVienArrayList.remove(a);
    }

     boolean timKiem(int searchMaHV,HocVien a) {
        boolean  booleanFlag= true;
         for (int i = 0; i < hocVienArrayList.size(); i++) {
             if (a.getHoTen().equals(hocVienArrayList.get(i).getHoTen())&&searchMaHV==hocVienArrayList.get(i).getMaHV()) {
                 booleanFlag= true;
                 break;
             } else {
                 booleanFlag=false;
             }
         }
         for (int i = 0; i < hocVienArrayList.size(); i++) {
             if (a.getQueQuan().equals(hocVienArrayList.get(i).getQueQuan())) {
                 SimpleDateFormat f = new SimpleDateFormat("dd/mm/yyyy");
                 System.out.println(hocVienArrayList.get(i).getMaHV() + hocVienArrayList.get(i).getHoTen() + f.format(hocVienArrayList.get(i).getNgaySinh()) + hocVienArrayList.get(i).getGender()+hocVienArrayList.get(i).getQueQuan());
             } else {
             }
         }
         return booleanFlag;
     }

     public void nhapDiem1(){
             hocVienArrayList.get(dem).nhapDiem(3);
    }
    public void sortASC() {
        double tempDiem;
        ArrayList<HocVien> a = new ArrayList<>();
HocVien temp =new HocVien(null,null,true,null);
        for (int i = 0; i < hocVienArrayList.size(); i++)
        {
            for (int j = i + 1; j < hocVienArrayList.size(); j++) {
                if (HocVien.getDiem(i)<HocVien.getDiem(j))
                {
                    tempDiem = HocVien.diem[i];
                    HocVien.diem[i] = HocVien.diem[j];
                    //num[i] = num[j];
                    HocVien.diem[j]=tempDiem;
                    //num[j] = temp;
                    HocVien tmp = hocVienArrayList.get(i);
                    //hocVienArrayList.set(i,hocVienArrayList.set(j,hocVienArrayList.get(i)));
                    hocVienArrayList.set(i,hocVienArrayList.get(j));
                    hocVienArrayList.set(j,tmp);
                }
            }
        }
    }

        public void disPlay (HocVien a) {
            SimpleDateFormat f = new SimpleDateFormat("dd/mm/yyyy");
            for (int i = 0; i < hocVienArrayList.size(); i++) {
                System.out.print(hocVienArrayList.get(i).getMaHV()
                                + hocVienArrayList.get(i).getHoTen()
                                + f.format(hocVienArrayList.get(i).getNgaySinh())
                                + hocVienArrayList.get(i).getGender()
                                +" Diem: ");
                a.hienThiDiem(i);
                }

        }
        public void display2(){

        hocVienArrayList.get(0).getDiem(5);
        }
    }

