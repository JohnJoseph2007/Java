import java.util.*;
class series{
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        int n;
        System.out.println("Enter a number");
        n=obj.nextInt();
        int blame=-1;
        int sum=0;
        for(int i=1;i<=n;i++)
        {   
            blame=-1;
            sum+=(blame*i);
        }
        System.out.println(sum);
        obj.close();
    }
}