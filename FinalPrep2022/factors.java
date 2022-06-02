import java.util.*;
public class factors {
    public static void main(String[] args) {
        //WAP to input a number and print its factors.
        Scanner obj = new Scanner(System.in);
        int num = 0;
        System.out.println("Enter a number");
        num = obj.nextInt();
        for(int i=1;i<=num;i++){
            if(num%i==0){
                System.out.println(i+" is a factor of "+num);
            }
        }
        obj.close();
    }
}
