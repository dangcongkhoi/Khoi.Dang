package VTC_Introduce_Programming.Lab_7;

public class lab7_4 {
    public static class Account {
        private int ID;
        private String Name;
        private double Balance;


        public Account(String name, int ID, int balance) {
            this.ID = ID;
            this.Balance = balance;
            this.Name = name;
        }

        public void display() {
            System.out.println("=============================");
            System.out.println("Thông tin tài khoản");
            System.out.println("Tên: " + this.Name);
            System.out.println("ID: " + this.ID);
            System.out.println("So Du Tài khoản: " + this.Balance);
            System.out.println("=============================");
        }

        public void GoiTien(int TienGui) {

            if (Balance > 0) {
                System.out.println("bạn đã gửi " + TienGui + " vào tài khoản.");
                Balance = Balance + TienGui;
            } else {
                System.out.println("Error:So tien gui khong hop le" + ID);
                System.out.println("=============================");
            }
            System.out.println("So Du trong tai khoan của ban là: " + Balance);
            System.out.println("=============================");
        }

        public void RutTien(int Withdrawal) {

            Balance = Balance - Withdrawal;
            if (Balance > 0) {
                System.out.println("bạn đã rút " + Withdrawal + " khỏi tài khoản.");
            } else {
                System.out.println("bạn đã rút quá số tiền trong tài khoản - " + ID);
                Balance = Balance + Withdrawal;
            }
            System.out.println("So Du trong tai khoản của ban là: " + Balance);
            System.out.println("=============================");
        }
        public void LaiSuat1Nam(){
            //LS khong kì han 1 nam
            Balance = Balance*0.045+Balance;
            System.out.println("So du bạn sẽ nhận được sau một năm(4.5%): "+ Balance);
            System.out.println("=============================");
        }
        public void Get_SotaiKhoan(){
            System.out.println("ID Tai khoan: " + this.ID);
            System.out.println("=============================");
        }
        public void Get_SoDu(){
            System.out.println("So Du Tài Khoan: "+this.Balance);
            System.out.println("=============================");
        }
    }


    public static void main(String[] args) {
        Account accbill = new Account("Billgate", 12345, 100000);
        accbill.display();

        accbill.GoiTien(50000);
        accbill.RutTien(4200);
        accbill.RutTien(200000);
        accbill.LaiSuat1Nam();
        accbill.Get_SotaiKhoan();
        accbill.Get_SoDu();
    }
}