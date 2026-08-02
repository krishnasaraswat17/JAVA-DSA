import java.util.Scanner;
public class Weekend {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);   
        
        System.out.print("ENTER THE VALUE ");

         String Days = input.next();

         switch(Days){
            case "Monday":
                System.out.println("WOW ITS MONDAY ! ");
                break;

            case "TUESDAY":
                System.out.println( " WOW ITS TUESDAY ! "); 
                break;
                
            case "WEDNESDAY":
                System.out.println("WOW ITS WEDNESDAY ! ");
                break;
             
            case "THURSDAY":
                System.out.println("WOW ITS THURSDAY ! ");
                break;
                
            case "FRIDAY":
                System.out.println("WOW ITS FRIDAY ! ");
                break;
                
            case "SATURDAY":
                System.out.println("WOW ITS SATURDAY ! ");
                break;
                
            case "SUNDAY":
                System.out.println("WOW ITS SUNDAY ! ");
                break; 
                
            default:
                System.out.println("NO WOW AND GOOD MORNING FOR U ! ");
                    
         }
    }
}

