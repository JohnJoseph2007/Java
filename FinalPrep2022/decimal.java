import java.util.*;
class decimal{
    public static void main(String args[]){
        //WAP to input a binary binaryber convert and print its decimal equivalent.[eg-101 output 5]
        Scanner br=new Scanner(System.in);
        int binary,decimal=0,a=0,b=0;
        System.out.println("Enter a no.");
        binary=br.nextInt();
        while(binary!=0){
            a=binary%10;
            decimal+=a*(int)Math.pow(2,b);
            b++;
            binary=binary/10;
        }
        System.out.println("Decimal equivalent = "+decimal);
        br.close();
    }
}
