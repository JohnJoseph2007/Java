package General;
import java.util.*;
class Javas
{
    public static void main(String[] args) {

        Scanner obj = new Scanner (System.in);

        //question 2a
        int a = 15;
        int s = 16;
        int u = 2;
        double v = Math.sqrt(u*u + 2*a*s);
        System.out.println(v);

        //question 2b
        double pi = Math.PI;
        double r = 15.0;
        double h = 12.5;
        double area = (pi*r*r*h) + (2*pi*r*h);
        System.out.println(area);
        
        //question 2c
        int p = 12;
        int q = 3;
        if (a != p+q) {
            System.out.println(Math.pow(a, 3));
        } else {
            System.out.println(Math.cbrt(a));
        }

        //question 2d
        float i = 0;
        System.out.println("Enter a real floating value : ");
        i = obj.nextFloat();
        System.out.println(i);

        //question 2e
        int k = 28;
        k -= 14;
        System.out.println(k);
        obj.close();
    }
}