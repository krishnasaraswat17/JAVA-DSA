// import java.util.Scanner;
public class Typecasting {
    public static void main(String[] args) {
        // System.out.print("Enter a Number = ");
        // Scanner input = new Scanner(System.in);

        // float num =input.nextFloat();
        // System.out.print("number is = "+num);

        // Type Casting 
        //int num =(int)(666.66f);
        //System.out.println(num);

        // Automatic type promotion in expressions
        //int a = 257;
        //byte b = (byte)(a); // 257%256 = 1 %256 becasue byte size is 256
        //System.out.println(b);

        //1. Implicit Type Casting (Automatic)Java automatically converts a smaller data type to a larger data type.

        // float num =input.nextFloat();
        // System.out.print("number is = "+num);
       //2. Explicit Type Casting (Manual)When converting a larger data type to a smaller data type, you must do it manually. 
       double number = 10.99;
       int numb = (int)(number);
       System.out.println(numb);
        // input.close();
    }
}
