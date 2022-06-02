package General;
import java.lang.Math;
public class greater3 {
    public static void main(String[] args) {
        double n1=Math.random()*10, n2=Math.random()*10, n3=Math.random()*10, largest;
        if(n1>=n2){
            if(n1>=n3){
                largest=n1;
            } else {
                largest=n3;
            }
        } else {
            if(n2>=n3){
                largest=n2;
            } else {
                largest=n3;
            }
        }
        System.out.println("Three numbers are: "+n1+", "+n2+", "+n3);
        System.out.println("Largest number: " + largest);
    }
}
