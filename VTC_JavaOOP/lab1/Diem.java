package VTC_JavaOOP.lab1;

public class Diem {
    private int x;
    private int y;
    // getter của thuộc tính x
    public int getX() {
        return x;
    }

    // setter của thuộc tính x
    public void setX(int x) {
        this.x = x;
    }


    // getter của thuộc tính y
    public int getY() {
        return y;
    }

    // setter của thuộc tính y
    public void setY(int y) {
        this.y = y;
    }
    public Diem(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public Diem(){

    }



    public void Display(){
        System.out.println("("+x+","+y+")");
    }
    public void distance(Diem b){
        double distacne1;
        distacne1 = Math.sqrt(Math.pow(x-b.x,2)+Math.pow(y-b.y,2));
        System.out.println(distacne1);


    }


}
