import java.util.*;
class SpecialNumber {
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        int n = 0;
        int factorial = 1;
        int sums = 0;
        System.out.println("Enter a number: ");
        n = obj.nextInt();
        for(int i = n; i!=0; i%=10){
            for(int j = i; j!=0; j--){
                factorial*=j;
            }
            sums+=factorial;
        }
        if(sums==n){
            System.out.println(n + " is a special number.");
        } else {
            System.out.println(n + " is not a special number.");
        }
    }
}