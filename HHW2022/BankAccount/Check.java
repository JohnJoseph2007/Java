package BankAccount;
public class Check {
    public static void main(String[] args) {
        Account obj = new Account();
        int a=10000;
        obj.start(a);
        obj.deposit(a);
        obj.withdraw(a);
        obj.currentbalance();
    }
}
