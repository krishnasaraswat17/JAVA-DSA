import java.util.Scanner;
public class Reverse {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print(" ENTER A NUMBER : ");

        int num = input.nextInt();
        int count = 0;

        while(num > 0){
            int rem = num % 10;
            num /= 10;
            count = count * 10 + rem;
        }

        System.out.print(count);

    }
}
