import java.util.Scanner;

public class LinearSearch_prb3 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int n ,key;

        System.out.print("ENTER THE ELEMENTS in ARRAY : ");
        n = input.nextInt();

        int[] arr = new int[n];

        for( int i =0 ; i<n ; i++ ){
            System.out.print("Element " + (i + 1) + ": ");
            arr[i] = input.nextInt();
        }

        System.out.print("ENTER THE VALUE YOU WANT TO SEARCH : ");
        key = input.nextInt();

        int count =0;

        for( int i =0 ; i<n ; i++){
            if(arr[i] == key){
            count++;
        }
        }
        if( count>0 ){
        System.out.println("FREQUENCY OF " + key + " IS: " + count);
        }
        else{
        System.out.print("sorry we dont find the value");
    }
}
}