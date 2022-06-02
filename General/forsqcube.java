//WAP to input a number and display the sum of all odd numbers (which should be squared) and the sum all even numbers (which should be cubed).
import java.util.Scanner;
public class forsqcube {
    public static void main(String args[]){
        int n;
        int temp= 0;
        int sum = 0;
        int r = 0;
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter a number: ");
        temp = obj.nextInt();
        while(temp>0){
            n=temp%10;
            if(n%2==0){
                r = n*n*n;
                sum+=r;
            } else {
                r = n*n;
                sum+=r;
            }
            temp=temp/10;
        }
        System.out.println(sum);
        obj.close();
    }
}