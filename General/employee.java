import java.util.*;
class Employee {
    public static void main(String[] args) {
        Scanner obj = new Scanner (System.in);
        double bp = 0.0;
        String name = "";
        int age = 0;
        System.out.println("Enter name : ");
        name = obj.nextLine();
        System.out.println("Enter age : ");
        age = obj.nextInt();
        System.out.println("Enter Basic Pay : ");
        bp = obj.nextDouble();
        double da = (60/100) * bp;
        double hra = (20/100) * bp;
        double pf = (12/100) * bp;
        double gp = bp + hra + da - pf;
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("Basic Pay : " + bp);
        System.out.println("Gross Pay : " + gp);
        obj.close();
    }
}