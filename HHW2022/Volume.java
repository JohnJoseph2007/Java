import java.util.*;
public class Volume {
    public void vc(double s){
        double vol = s*s*s;
        System.out.println("Volume of cube = "+vol);
    }

    public void vs(double r){
        double vol = (4/3)*(22/7)*r*r;
        System.out.println("Volume of sphere = "+vol);
    }

    public void vcd(double b, double h, double l){
        double vol = l*b*h;
        System.out.println("Volume of cuboid = "+vol);
    }

    public static void main(String[] args) {
        Volume obj = new Volume();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter s");
        double s = sc.nextDouble();
        System.out.println("Enter r");
        double r = sc.nextDouble();
        System.out.println("Enter b");
        double b = sc.nextDouble();
        System.out.println("Enter h");
        double h = sc.nextDouble();
        System.out.println("Enter l");
        double l = sc.nextDouble();
        obj.vc(s);
        obj.vs(r);
        obj.vcd(b, h, l);
        sc.close();
    }
}
