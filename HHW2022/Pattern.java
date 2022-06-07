public class Pattern {
    public void series1(int x, int n) {
        int i;
        int sum = 0;
        for(i = 0; i<=n; i++){
            sum += Math.pow(x, i);
        }
        System.out.println(sum);
    }

    public void series2(int p) {
        for(int i=1; i<=p; i++) {
            int cubed = (i*i*i)-1;
            System.out.print(cubed+", ");
        }
        System.out.println();
    }

    public void series3() {
        double sum=0.0;
        for(int i=2;i<=10;i++){
            double j = i;
            sum+=(1/j);
        }
        System.out.println(sum);
    }

    public static void main(String[] args){
        Pattern obj = new Pattern();
        obj.series1(2, 4);
        obj.series2(4);
        obj.series3();
    }
}
