//Write a program to print the sum of two numbers entered by user by defining your own method.
import java.util.Scanner;
public class sumoftwono {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("ENTER A : ");
        int A = input.nextInt();
        System.out.print("ENTER B : ");
        int B = input.nextInt();
        int sum = sum(A,B);
        System.out.println("THE SUM OF TWO NUMBER : " + sum);
    }
    static int sum(int A, int B){
        return A + B ;
    }
}
