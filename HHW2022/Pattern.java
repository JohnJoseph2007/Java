import java.math.*;
import java.util.*;
public class Pattern {
    int s1;
    public void series1(int x, int n) {
        int i;
        int sum = 0;
        for(i = 0; i<=n; i++){
            sum += Math.pow(x, i);
        }
        s1 = sum;
    }

    public void series2(int p) {
        
    }

    public static void main(String[] args){

    }
}
