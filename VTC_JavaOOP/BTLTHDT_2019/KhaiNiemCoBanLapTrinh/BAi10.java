package VTC_JavaOOP.BTLTHDT_2019.KhaiNiemCoBanLapTrinh;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class BAi10 {
    public static void main(String[] args) {
        Product sp1 = new Product("gao", "sp1", 18000);
        Product sp2 = new Product("chinsu", "sp2", 8000);
        Product sp3 = new Product("Duong", "sp3", 10000);
        Product sp4 = new Product("Nuoc tuong", "sp1", 8000);
ArrayList<Order> bill=new ArrayList<>();
        Order bill_1 = new Order(bill);
        bill_1.addLineItems(sp4, 10);
        bill_1.addLineItems(sp1, 5);
        bill_1.addLineItems(sp3, 1);
        bill_1.addLineItems(sp1, 1);

        //System.out.println(bill_1.toString());
        bill_1.disPlay();
    }

}

class Order {
    private int oderID=0 , count;{
        count++;
        this.oderID=count;

    }
    private Date oderDate =new Date();
    private int STT ;
    OderDetail bill;
    ArrayList<OderDetail> lineItems = new ArrayList<>();
    public Order(ArrayList<Order> bill) {
    }
    public int getOderID() {
        return oderID;
    }
    public void setOderID(int oderID) {
        this.oderID = oderID;
    }
    public int getCount() {
        return count;
    }
    public void setCount(int count) {
        this.count = count;
    }
    public Date getOderDate() {
        return oderDate;
    }
    public void setOderDate(Date oderDate) {
        SimpleDateFormat f = new SimpleDateFormat("dd/mm/yyyy");
        this.oderDate = oderDate;
    }
    public int getSTT() {
        return STT;
    }
    public void setSTT(int STT) {
        this.STT = STT;
    }
    public void setLineItems(ArrayList<OderDetail> lineItems) {
        this.lineItems = lineItems;
    }
    public ArrayList<OderDetail> getLineItems() {
        return lineItems;
    }
    public void addLineItems(Product a, int count) {
        lineItems.add(new OderDetail(a, count));
    }
    public double calcTotalCharge() {
        double sum = 0;
        for (int i = 0; i < lineItems.size(); i++) {
            sum += lineItems.get(i).calcTotalPrice();
        }
        return sum;
    }
public void disPlay(){
    SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy");
    System.out.println(toString());
    System.out.println("Ngay lap hoa don: "+f.format(oderDate));
    System.out.println("==============================================================================");
    System.out.printf("%-4s %-19s %-15s %14s %9s %12s","STT","Ma SP","Mo Ta","Don gia","S Luong", "Thanh Tien");
    System.out.println();
    for (int i = 0; i < lineItems.size() ; i++) {
        STT=i;
        //System.out.println(STT+"   "+lineItems.get(i).toString());
        //System.out.println();
        System.out.println(String.format("%-5s%-30s",STT,lineItems.get(i).toString()));
    }
    System.out.println("Tong = "+calcTotalCharge());
}


    @Override
    public String toString() {
        return "Ma HD:" + oderID ;
                //", oderDate=" + oderDate ;
    }
}

class OderDetail {
    private int quality;
    Product product;


    public OderDetail(Product product, int quality) {
        this.quality = quality;
        this.product = product;
    }

    public int getQuality() {
        return quality;
    }

    public void setQuality(int quality) {
        this.quality = quality;
    }

    public double calcTotalPrice() {
        return quality * product.getPrice();
    }

    @Override
    public String toString() {
        return String.format("%-30s%10s%10.1f", product.toString(),quality,calcTotalPrice());
//                 product.toString() +
//                "quality=" + quality +
//                " Thanh Tien =" + calcTotalPrice() +
//
//                '}';
    }
}

class Product {
    private String description;
    private String productID;
    private double Price;

    @Override
    public String toString() {
        //String reslt="%-8s %-30s %-20s %-30s %-30s ",productID,description,Price;
        //System.out.println("%-8s %-30s %-20s %-30s %-30s ",productID,description,Price);
//        return "Product{" + ", productID='" + productID + '\'' +
//                "description='" + description + '\'' +
//
//                ", Price=" + Price +
//                '}';
        return String.format("%-20s%-20s%10.1f", productID, description, Price);
    }

    public Product() {

    }

    public Product(String description, String productID, double price) {
        this.description = description;
        this.productID = productID;
        Price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getProductID() {
        return productID;
    }

    public void setProductID(String productID) {
        this.productID = productID;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double price) {
        Price = price;
    }
}
