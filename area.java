import java.util.*;
class area
{
    public static void main(String[] args)
    {
        double a, b;
        Scanner obj = new Scanner (System.in);
        System.out.println("Enter the numbers");
        a = obj.nextDouble();
        b = obj.nextDouble();
        if (a > b) {
            System.out.println(a*b);
        } else if (a < b) {
            System.out.println(0.5*a*b);
        } else if (a == b) {
            System.out.println(a*b);
        }
        obj.close();
    }
}