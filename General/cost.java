package General;
import java.util.*;
class Cost {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int price = 0, quantity = 0;
        double tcost = 0, ncost = 0;
        int discount = 0;
        System.out.println("Enter price and quantity");
        price = obj.nextInt();
        quantity = obj.nextInt();
        if(price*quantity>=19999) {
            discount = 20;
        } else {
            discount = 10;
        }
        tcost = price*quantity;
        ncost = tcost-((discount/100)*tcost);
        System.out.println("Price : " + price);
        System.out.println("Quantity : " + quantity);
        System.out.println("Total Cost : " + tcost);
        System.out.println("Net Cost : " + ncost);
        System.out.println("Discount : " + discount);
        obj.close();
    }
}