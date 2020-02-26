package VTC_JavaOOP.BTLTHDT_2019.KhaiNiemCoBanLapTrinh;

import java.text.NumberFormat;
import java.util.Locale;

public class Bai6 {
    public static void main(String[] args) {

        Account account1 = new Account(72354, "Ted Murphy", 102.56);
        Account account2 = new Account(69713, "Jane Smith", 40.00);
        Account account3 = new Account(93757, "Edward Demsey", 759.32);
        System.out.println(account1.toString());
        System.out.println(account2.toString());
        System.out.println(account3.toString());
        System.out.println();
        System.out.println("gui tien acc1, acc2");
        account1.deposit(25.85);
        account2.deposit(500);
        System.out.println(account1.toString());
        System.out.println(account2.toString());

        System.out.println();
        System.out.println("Rút khỏi acc2 số tiền là 430.75, mức phí 1.50.");
        account2.withdraw(430.75, 1.5);
        System.out.println(account2.toString());

        System.out.println();
        System.out.println("Tính tiền lãi cho acc3.");
        account3.toString();
        account3.addInterest();

        System.out.println();
        System.out.println("Chuyển tiền từ acc2 sang cho acc1 số tiền là 100.00.");
        System.out.println("before");
        System.out.println(account2.toString());
        System.out.println(account1.toString());

        System.out.println();
        account2.transfer(account1, 100);
        System.out.println("after");
        System.out.println(account2.toString());
        System.out.println(account1.toString());

    }
}

class Account {
    private long accountNumber;
    private String name;
    private double balance;

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getRate() {
        return rate;
    }

    private final double rate = 0.035;

    public Account(long accountNumber, String name, double balance) {
        this.accountNumber = accountNumber;
        this.name = name;
        this.balance = balance;
    }

    public Account(long accountNumber, String name) {
        this.accountNumber = accountNumber;
        this.name = name;
    }

    public Account() {
        accountNumber = 999999;
        name = "no Identity";
        balance = 50000;
    }

    public boolean deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;
            return true;
        } else return false;
    }

    public boolean withdraw(double amount, double fee) {
        if (amount > 0) {
            balance = balance - amount - fee;
            return true;
        } else return false;
    }

    public void addInterest() {
        System.out.println("balance = " + balance + balance * rate);
    }

    public boolean transfer(Account acc2, double amount) {
        if (amount > 0) {
            acc2.deposit(amount);
            balance = balance - amount;
            return true;
        } else return false;
    }

    @Override
    public String toString() {
        Locale locale = new Locale("vi,", "vn");
        //NumberFormat formater = new NumberFormat.getInstance();
        NumberFormat nf = NumberFormat.getInstance();
        NumberFormat en = NumberFormat.getInstance(locale);
        //System.out.println(en.format(324234.23));
        return "Account{" +
                "accountNumber = " + accountNumber +
                ", name = '" + name + '\'' +
                ", balance = " + en.format(balance) + " VND" +
                ", rate = " + rate +
                '}';
    }
}