import java.util.*;
public class ShowRoom {
    String name;
    long mobno;
    double cost, dis, amount;

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name, mobile number and cost of purchase");
        name = sc.nextLine();
        mobno = sc.nextLong();
        cost = sc.nextDouble();
        sc.close();
    }

    public void calculate() {
        if(cost<=10000) {
            dis = 0.05*cost;
        } else if(cost>10000 && cost <=20000) {
            dis = 0.1*cost;
        } else if(cost>20000 && cost <=35000) {
            dis = 0.15*cost;
        } else if(cost>35000) {
            dis = 0.2*cost;
        }
        amount = cost-dis;
    }

    public void display() {
        System.out.println("Customer Name: "+name);
        System.out.println("Mobile Number: "+mobno);
        System.out.println("Amount to be paid: "+amount);
    }

    public static void main(String[] args) {
        ShowRoom obj = new ShowRoom();
        obj.input();
        obj.calculate();
        obj.display();
    }
}
