import java.util.Scanner;
public class Discount {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("ENTER THE PRICE : ");
        double PRICE = input.nextDouble();

        double DISCOUNT = 500 ;

        if(PRICE >= 5000){
            System.out.println("CONGO YOU GOT DISCOUTN OF 500");
            double FinalPrice = PRICE - DISCOUNT;
            System.out.println("FINAL BILL AFTER DISCOUNT IS : "+ FinalPrice);
        }
        else {
            System.out.print("FINAL BILL IS  : "+ PRICE);
        }
        input.close();
    }
}