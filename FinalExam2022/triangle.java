package FinalExam2022;
import java.util.Scanner;
public class triangle {
    public static void main(String[] args) {
        //Question 7a:
        Scanner obj = new Scanner(System.in);
        double a, b, c;
        System.out.println("Enter 3 angles of a triangle");
        a = obj.nextDouble();
        b = obj.nextDouble();
        c = obj.nextDouble();
        if(a+b+c==180){
            System.out.println("They form a valid triangle.");
        } else {
            System.out.println("They don't form a valid triangle.");
        }
        if(a==b&&b==c&&a==c){
            System.out.println("It is an equilateral triangle");
        } else if(a==b||b==c||a==c){
            System.out.println("It is an isosceles triangle");
        } else {
            System.out.println("It is a scalene triangle");
        }
        obj.close();
    }
}
