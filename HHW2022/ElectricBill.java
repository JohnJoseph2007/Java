import java.util.*;
public class ElectricBill {
    String n = " ";
    int units = 0;
    double bill = 0.0;

    public void accept(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Name and No. of Units");
        n = sc.nextLine();
        units = sc.nextInt();
        sc.close();
    }

    public void calculate(){
        if(units<=100){
            bill=2*units;
        } else if(units>100 && units<=300){
            bill=(2*100)+(3*(units-100));
        } else if(units>300){
            bill=(2*100)+(3*200)+(5*(units-300));
            bill+=(2.5/100)*bill;
        }
    }

    public void print(){
        System.out.println("Name of customer: "+n);
        System.out.println("Number of units consumed: "+units);
        System.out.println("Bill Amount: "+bill);
    }

    public static void main(String[] args) {
        ElectricBill obj = new ElectricBill();
        obj.accept();
        obj.calculate();
        obj.print();
    }
}
