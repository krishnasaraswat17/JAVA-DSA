import java.util.Scanner;

public class basic {
    // public static void main(String[] args) {
    //     System.out.println("Enter a Number");

    //     Scanner input = new Scanner(System.in);
    //     int num = input.nextInt();
    //     System.out.println("Your Enter Number: " + num);
    //     input.close();

    public static void main (String[] args) {
        System.out.print("Enter Frist Number :");
        Scanner input =new Scanner(System.in);

        int num1 = input.nextInt();
        System.out.print("Enter Second Number :");

        int num2 = input.nextInt();

        int sum = num1+num2;
        System.out.println("Sum of those numbers is = " +sum );
        input.close();
    }

    }
