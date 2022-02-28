package FinalPrep2022;
import java.util.*;
public class prime {
    public static void main(String[] args) {
        //WAP to input a number and print if it’s a prime number or not.
        Scanner obj = new Scanner(System.in);
        int num = 0;
        int count = 0;
        System.out.println("Enter a number");
        num = obj.nextInt();
        for(int i=1;i<=num;i++){
            if(num%i==0){
                count++;
            }
        }
        if(count==2){
            System.out.println(num+" is a prime number");
        } else {
            System.out.println(num+" isn't a prime number");
        }
        obj.close();
    }
}
