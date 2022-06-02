package General;
import java.util.*;
class maxmin{
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n1 = 0;
        int n2 = 0;
        int o1 = 0;
        int o2 = 0;
        int max = 0; 
        int min = 0;
        System.out.println("Enter a number: ");
        int a = obj.nextInt();
        n1 = a;
        o1 = a;
        for(int i=1; i<20; i++){
            System.out.println("Enter a number: ");
            int b = obj.nextInt();
            n2 = b;
            o2 = b;
            if(n1>=n2){
                max = n1;
            } else {
                max = n2;
                n1 = n2;
            }
            if(o1<=o2){
                min = o1;
            } else {
                min = o2;
                o1 = o2;
            }
        }
        System.out.println("Maximum:" + max);
        System.out.println("Minimum:" + min);
        obj.close();
    }
}