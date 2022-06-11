import java.util.*;
class SomScanner {
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        System.out.println("I need a number.");
        int a = obj.nextInt(); //4
        int multiplication = a*5; //20
        System.out.println(multiplication);
        obj.close();
    }
}