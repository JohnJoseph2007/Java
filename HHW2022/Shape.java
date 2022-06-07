public class Shape {
    public double area1(double a, double b, double c) {
        double s = (a+b+c)/2;
        double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
        return area;
    }

    public double area2(int a, int b, int height) {
        double area = 0.5*height*(a+b);
        return area;
    }

    public double area3(double diagonal1, double diagonal2) {
        double area = 0.5*(diagonal1*diagonal2);
        return area;
    }

    public static void main(String[] args) {
        Shape obj = new Shape();
        double scalene = obj.area1(3.0, 5.0, 7.0);
        double trapezium = obj.area2(2, 4, 7);
        double rhombus = obj.area3(5.0, 10.0);
        System.out.println(scalene);
        System.out.println(trapezium);
        System.out.println(rhombus);
    }
}
