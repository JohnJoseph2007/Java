package General;
import java.util.Scanner;
class java_questions {
    public static void main(String[] args) {
        //Question 1
        java.util.Scanner obj = new Scanner(System.in);
        double a, b, c;
        System.out.println("Enter the values for A, B and C");
        a = obj.nextDouble();
        b = obj.nextDouble();
        c = obj.nextDouble();
        double R = (6.5*(Math.pow(a+b, 2)) - 7.3*(Math.pow(b+c, 0.5)))/(Math.pow(a+c, 0.5));
        System.out.println(R);

        //Question 2
        int p = 5000;
        int r = 5;
        int t = 2;
        float si = (p*r*t)/100;
        System.out.println ("Simple intrest = "+si);

        //Question 3
        int radius = 3;
        double area = 3.14*r*r;
        double circumference = 2*Math.PI*r;
        System.out.println ("Area of the Circle of radious "+radius+" is : "+area);
        System.out.println ("Circumference : "+circumference);

        //Question 4

        obj.close();
        
    }
}
