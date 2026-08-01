import java.util.Scanner;
public class SwitchCase{
    public static void main(String[] agrs){
        Scanner input = new Scanner(System.in);

        System.out.print("ENTER YOUR CASE VALUE : ");
        String Fruit = input.next();

        switch(Fruit){
            case "Mango":
                System.out.print("mango kha le ");
                break;
            
            case "Apple":
                System.out.print("Apple kha le ");
                break;
            default:
                System.out.print("ENTER A VALID VALUE ");        
        }
    }
}