import java.util.*;
public class Power {
    public int power(int m, int n){
        int res = 1;
        for(int i=1; i<=n; i++){
            res*=m;
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Base and Power");
        int a, b;
        a = sc.nextInt();
        b = sc.nextInt();
        sc.close();
        Power obj = new Power();
        int result = obj.power(a, b);
        System.out.println(result);
    }
}
