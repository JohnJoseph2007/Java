package BankAccount;
public class Account {
    double balance = 0.0;

    public void start(int a){
        balance=a;
    }

    public void deposit(int a){
        balance+=a;
    }

    public void withdraw(int a){
        balance-=a;
    }

    public void currentbalance(){
        System.out.println("Current balance is "+balance);
    }
}
