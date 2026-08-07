import java.util.Scanner;
public class BinarySearch {
   public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    int n , key ;
    boolean found = false;

    System.out.print("ENTER THE SIZE OF THE ARRAY : ");

    n = input.nextInt();

    int[] arr = new int[n];

    System.out.print("Enter the " + n + " Sorted elements : ");

    for(int i =0 ; i<n ; i++){
        arr[i] = input.nextInt();

    }

    System.out.print("ENTER THE ELEMENT TO SEARCH : ");
    key = input.nextInt();

    int Start =0;
    int end = n-1;

    while(Start <= end){

        int mid = (Start + end) / 2;

        if(arr[mid] == key ){
            System.out.println("Element found at position : " + (mid + 1));
            found  = true ;
            break;
        }
        else if ( key > arr[mid]) {
            Start = mid +1;
        }
        else{
            end = mid -1 ;
        }
    }

    if( ! found ){
        System.out.print("ELEMENT NOT FOUND : ( ");
    }
}
}
