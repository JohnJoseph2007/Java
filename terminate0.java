import java.util.Scanner;
class terminate0 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int so=0, se=0, nn = 0;
        int N;
        System.out.println("Enter a number");
        N = obj.nextInt();
        while(N!=0){
            if(N%2==0){
                se+=N;
            } else if(N%2==1){
                so+=N;
            } else {
                nn+=N;
            }
            System.out.println("Enter a number");
            N = obj.nextInt();
        }
        System.out.println("Sum of odd numbers = "+so);
        System.out.println("Sum of even numbers = "+se);
        System.out.println("Sum of negative numbers = "+nn);
        obj.close();
    }
}
