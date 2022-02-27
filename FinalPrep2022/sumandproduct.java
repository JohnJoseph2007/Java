package FinalPrep2022;
import java.util.*;
public class sumandproduct {
    public static void main(String[] args) {
        // WAP to input 10 numbers print their sum and product.
        Scanner obj = new Scanner(System.in);
        int a = 1;
        int sum = 0;
        int product = 1;
        for(int i=1; i<=10; i++){
            System.out.println("Enter a number: ");
            a = obj.nextInt();
            sum+=a;
            product*=a;
        }
        System.out.println("sum: "+sum);
        System.out.println("product: "+product);
        obj.close();
    }
}
