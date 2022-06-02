package General;
import java.util.*;
class Laptop {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        String fullname = "";
        double price = 0.0;
        double discount = 0.0;
        double amount = 0.0;
        System.out.println("Enter Price and Model");
        price = obj.nextDouble();
        fullname = obj.nextLine();
        char model = fullname.charAt(0);
        if(model=='p') {
            if(price<=100000) {
                discount=5.0;
            } else if(price>100000&&price<=200000){
                discount=7.5;
            } else if(price>200000&&price<=300000){
                discount=9.0;
            } else if(price>300000){
                discount=10.0;
            }
        } else if(model=='d'){
            if(price<=100000) {
                discount=2.0;
            } else if(price>100000&&price<=200000){
                discount=5.0;
            } else if(price>200000&&price<=300000){
                discount=6.5;
            } else if(price>300000){
                discount=7.5;
            }
        }
        amount = (discount/100)*price;
        System.out.println("Price : " + price);
        System.out.println("Model : " + model);
        System.out.println("Discount : " + discount);
        System.out.println("Amount : "+ amount);
        obj.close();
    }
}