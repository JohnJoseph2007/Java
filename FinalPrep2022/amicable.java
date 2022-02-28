package FinalPrep2022;
import java.util.*;
public class amicable {
    public static void main(String[] args) {
        //WAP to input a number and print if they form amicable pairs.
        //[EG 220 and 284-sum of factors of 220 excluding 220=284 and sum of factors of 284 excluding 284=220]
        Scanner obj = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        int fac1 = 0;
        int fac2 = 0;
        System.out.println("Enter two numbers");
        num1 = obj.nextInt();
        num2 = obj.nextInt();
        for(int i=1; i<=num1; i++){
            if(num1%i==0){
                fac1+=i;
            }
        }
        for(int j=1; j<=num2; j++){
            if(num2%j==0){
                fac2+=j;
            }
        }
        fac1-=num1;
        fac2-=num2;
        if(fac2==num1 && fac1==num2){
            System.out.println("The pair of numbers is amicable.");
        } else {
            System.out.println("The pair of numbers is not amicable.");
        }
        obj.close();
    }
}
