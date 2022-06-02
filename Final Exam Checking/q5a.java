import java.util.*;
public class q5a {
    public static void main(String[] args) {
        int s1, s2, s3;
        Scanner obj = new Scanner(System.in);
        s1=obj.nextInt();
        s2=obj.nextInt();
        s3=obj.nextInt();
        double sp=(s1+s2+s3)/2;
        double a=Math.sqrt(sp*(sp-s1)*(sp-s2)*(sp-s3));
        System.out.println(a);
        obj.close();
    }
}
