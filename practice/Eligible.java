//A person is eligible to vote if his/her age is greater than or equal to 18. Define a method to find out if he/she is eligible to vote.
import java.util.Scanner;
public class Eligible {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("ENTER YOUR AGE : ");
        int AGE = input.nextInt();

        Eligiblity(AGE);
    }
    static void Eligiblity(int AGE){

        if( AGE >= 18 ){
            System.out.print("CONGO YOU ARE ELIGIBLE TO VOTE ");
        } 
        else{
            System.out.print("SORRY YOU ARE NOOT ELIGIBLE TO VOTE ");
        } 
    }
}
