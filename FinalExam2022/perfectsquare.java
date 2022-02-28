package FinalExam2022;

public class perfectsquare {
    public static void main(String[] args) {
        //WAP to print all perfect squares between 1 to 1000.
        for(int i=1;i<=1000;i++){
            if(Math.sqrt(i)==(int)Math.sqrt(i)){
                System.out.println(i);
            }
        }
    }
}
