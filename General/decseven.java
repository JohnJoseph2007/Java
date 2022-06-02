class decseven
{
    public static void main(String args[])
    {
        //Question 1
        double len = 23.5;
        double breadth = 14.7;
        double area = len*breadth;
        double perimeter = 2*(len+breadth);
        System.out.println("Area = " + area + "cm²");
        System.out.println("Perimeter = " + perimeter + "cm");

        //Question 2
        int l = 12;
        double b = 23.5;
        double h = 47.0;
        double v = l*b*h;
        double tsa = 2*((l*b)+(b*h)+(l*h));
        System.out.println("---------------------------------------------------------------");
        System.out.println("Volume = " + v + "cm³");
        System.out.println("Total Surface Area = " + tsa + "cm²");
    }
}