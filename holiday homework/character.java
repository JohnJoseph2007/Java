/*
Q.2.WAP to input two numbers and a character variable ch which may have either ‘y’ or ‘n’
as its input. if ‘y’ then print the original values of the variables and interchange the values
and print the swapped values using a third variable, if ‘n’ then print the original values of the
variables and interchange the values and print the swapped values without using a third
variable.
*/

import java.util.*;
class character {
  public static void main(){
    Scanner obj = new Scanner(System.in);
    int n1, n2;
    char ch = 'k';
    System.out.println("Enter the two numbers");
    n1 = obj.nextInt();
    n2 = obj.nextInt();
    System.out.println("Enter either 'y' or 'n'");
    ch = obj.next().charAt(0);
    if(ch=='y'){
        System.out.println("First input number = " + n1);
        System.out.println("Second input number = " + n2);
    } else if(ch=='n'){
        System.out.println("First input number (opposite)" + n2);
        System.out.println("Second input number (opposite)" + n1);
    } else {
        System.out.println("Invalid character detected");
    }
    obj.close();
  }
}