// Define a program to find out whether a given number is even or odd.
import java.util.Scanner;
public class EvenOdd {
    
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("ENTER THE N NUMBER : ");
        int N = input.nextInt();
        oddeven(N);
    }
    static  void oddeven(int N){
        if(N % 2 == 0){
            System.out.print("N IS THE EVEN NUMBER : " +N);
        }
        else{
            System.out.print("N IS THE ODD NUMBER : "+N);
        }
    }
} 

