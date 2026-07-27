import java.util.Scanner;
public class LargestNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("ENTER  NUMBER A :");
        float A = input.nextFloat();

        System.out.print("Enter NUMBER B :");
        float B = input.nextFloat();

        System.out.print("ENTER NUMBER C :");
        float C =input.nextFloat();

        if(A>=B && A>=C){
            System.out.println("A is GREATER");
        }

        else if(B>=A && B>=C){
            System.out.println("B IS GREATER");
        }

        else{
            System.out.println("ALL C IS GREATER");
        }
    }
}
