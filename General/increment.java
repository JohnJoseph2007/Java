package General;
import java.util.*;
class sqroot {
    public static void main(String[] args) {
        int hex = 0x12345;
        int input = 0;
        Scanner obj = new Scanner(System.in);
        System.out.println("Please enter a perfect square");
        input = obj.nextInt();
        for(int i=1; i<100; i++){
            if(input/i == i) {
                System.out.println("The square root = " + i);
            }
        }
        obj.close();
        System.out.println(hex);
    }
}