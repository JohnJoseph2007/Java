import java.util.*;
public class multiples {
    public static void main(String[] args) {
        //WAP to input a number and print its first 10 multiples.
        Scanner obj = new Scanner(System.in);
        int num = 0;
        System.out.println("Enter a number: ");
        num = obj.nextInt();
        for(int i=1;i<=10;i++){
            int multiple = num*i;
            System.out.println("Multiple number "+i+": "+multiple);
        }
        obj.close();
    }
}
