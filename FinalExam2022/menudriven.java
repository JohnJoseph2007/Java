package FinalExam2022;
import java.util.*;
public class menudriven {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int choice = 0;
        double eqside, isoside, isobase, m, n, p, s;
        double eqarea, isoarea, scalenearea, areaequation;
        System.out.println("1. Read side and print area of equilateral triangle.");
        System.out.println("2. Read one equal side and base of isosceles triangle to give area.");
        System.out.println("3. Read three sides of scalene triangle to give area.");
        System.out.println("Make your choice (1, 2 or 3)");
        choice = obj.nextInt();
        switch(choice){
            case 1:
                System.out.println("Enter value of side: ");
                eqside = obj.nextDouble();
                eqarea = Math.sqrt(3) * Math.pow(eqside, 2);
                System.out.println("Area of equilateral traingle: " + eqarea);
                break;
            
            case 2:
                System.out.println("Enter side and base respectively: ");
                isoside = obj.nextDouble();
                isobase = obj.nextDouble();
                isoarea = 0.25 * isobase * ((Math.sqrt(4)*isoside*isoside)-Math.pow(isobase, 2));
                System.out.println("Area of isosceles traingle: " + isoarea);
                break;
            
            case 3:
                System.out.println("Enter 3 sides of scalene triangle: ");
                m = obj.nextDouble();
                n = obj.nextDouble();
                p = obj.nextDouble();
                s = (m+n+p)/4;
                areaequation = s*(s-m)*(s-n)*(s-p);
                scalenearea = Math.sqrt(areaequation);
                System.out.println("Area of scalene traingle: " + scalenearea);
                break;
        }
        obj.close();
    }
}
