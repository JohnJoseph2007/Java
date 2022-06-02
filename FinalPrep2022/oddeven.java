import java.util.*;
public class oddeven {
    public static void main(String[] args) {
        //WAP to input 10 numbers print the sum of odd and even numbers separately.
        Scanner obj = new Scanner(System.in);
        int num = 0;
        int odd = 0;
        int even = 0;
        for(int i=1;i<=10;i++){
            System.out.println("Enter a number: ");
            num = obj.nextInt();
            if(num%2==0){
                even+=num;
            } else if(num%2==1){
                odd+=num;
            }
        }
        System.out.println("Addition of all odd numbers: " + odd);
        System.out.println("Addition of all even numbers: " + even);
        obj.close();
    }
}
