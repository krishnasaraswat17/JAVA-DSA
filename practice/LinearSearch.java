import java.util.Scanner;
public class LinearSearch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n , key;
        boolean found = false;

        System.out.println("ENTER THE NUMBER OF ELEMENT : ");
        n = input.nextInt();
        
        int [] arr = new int[n];
        System.out.println("ENTER " + n + " ELEMENTS :");
        for(int i =0 ; i<n ; i++){
                arr[i] = input.nextInt();
        }
        
        System.out.print("ENTER THE NUMBER YOU WANT TO SEARCH : ");
        key = input.nextInt();
        for(int i =0 ; i<n ; i++){
                if(arr[i]==key){
                        System.out.print("SEARCHED ELEMENT IS ON THIS POSITION : " + (i+1));
                        found = true;
                        break;
                }
        }
        if( !found ){
                System.out.print("SEARCHED ELEMENT IS NOT IN THE ARRAY :( ");
        }
}
}