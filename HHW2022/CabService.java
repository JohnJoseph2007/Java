import java.util.*;
public class CabService {
    String car_type = " ";
    double km=0.0;
    double bill=0.0;

    public void accept(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Car Type (AC or Non-AC)");
        car_type = sc.nextLine();
        System.out.println("Enter distance driven in km");
        km = sc.nextDouble();
        sc.close();
    }

    public void calculate(){
        double dis = km;
        if(car_type=="AC"){
            if(dis<=5.0){
                bill=150.0;
            } else if(dis>5.0){
                bill=150.0+(10.0*(dis-5.0));
            }
        } else if(car_type=="Non-AC"){
            if(dis<=5.0){
                bill=120.0;
            } else if(dis>5.0){
                bill=120.0+(8.0*(dis-5.0));
            }
        }
    }

    public void display(){
        System.out.println("Car Type: "+car_type);
        System.out.println("Kilometers Traveled: "+km);
        System.out.println("Total Bill: "+bill);
    }

    public static void main(String[] args) {
        CabService obj = new CabService();
        obj.accept();
        obj.calculate();
        obj.display();
    }
}
