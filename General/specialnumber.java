package General;
import java.util.*;
class SpecialNumber {
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        int n = 0, x=0;
        int factorial = 1;
        int sums = 0;
        System.out.println("Enter a number: ");
        n = obj.nextInt();
        int number = n;
        while(number>0){
            x = number%10;
            for(int i = 1; i<=x; i++){
                factorial*=i;
            }
            sums+=factorial;
            number/=10;
            factorial=1;
        }
        if(sums==n){
            System.out.println(n + " is a special number.");
        } else {
         
         
            System.out.println(n + " is not a special number.");
        }
        obj.close();
    }
}