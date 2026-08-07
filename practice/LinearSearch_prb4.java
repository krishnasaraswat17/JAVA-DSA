import java.util.Scanner;
public class LinearSearch_prb4 {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);

        int n;
        boolean found = false;
        System.out.print("ENTER THE ARRAY SIZE :");
        n =input.nextInt();

        int[] arr = new int[n];
        for( int i =0; i<n ; i++){

            System.out.print("ENTER THE ELEMENTS OF ARRAY : ");
            arr[i] = input.nextInt();

        }

        for( int i =0; i<n ; i++){
            if( arr[i]<0){
                System.out.print("THIS IS THE FIRST NEGATIVE VALUE : " +arr[i]+ " AT POSITION " + (i+1));
                found = true;
                break;
            }
        }
        if( !found ){
            System.out.print("NO NEGATIVE VALUE FOUND ");
        }
    }
}
