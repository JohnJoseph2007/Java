import java.util.*;
class binary{
    public static void main(String args[]){
        Scanner br=new Scanner(System.in);
        int decimal,binary=0,a=0,b=0;
        System.out.println("Enter a no.");
        decimal=br.nextInt();
        while(decimal!=0){
            a=decimal%2;
            binary+=a*(int)Math.pow(10,b);
            b++;
            decimal=decimal/2;
        }
        System.out.println("Binary equivalent="+binary);
        br.close();
    }
}