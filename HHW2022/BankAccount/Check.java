package BankAccount;
public class Check {
    public static void main(String[] args) {
        Account obj = new Account();
        obj.start();
        obj.deposit();
        obj.withdraw();
        obj.currentbalance();
    }
}
