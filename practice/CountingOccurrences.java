import java.util.Scanner;
public class CountingOccurrences{
    public static void main (String[] agrs){

        Scanner input = new Scanner(System.in);
        System.out.print("ENTER THE N NUMBER : ");

        int n = input.nextInt();
        int count = 0;

        while(n > 0){
           int rem = n% 10;
           if(rem == 3){
            count++;
           }
           n = n / 10;
        }

        System.out.print("Number of Occurences of 3 : " + count);
    }
}