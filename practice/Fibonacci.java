import java.util.Scanner;
public class Fibonacci{
    public static void main(String[] agrs){

        Scanner input = new Scanner(System.in);
        System.out.print("ENTER A NUMBER :");

        int n = input.nextInt();

        int a = 0;

        int b = 1;

        int count = 2;
 
        while(count <= n){
            int temp = b ;
            b = b + a ;
            a = temp ;
            count++;        
        }
        System.out.println(b);
    }
} 