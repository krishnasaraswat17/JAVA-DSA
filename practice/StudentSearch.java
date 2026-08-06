// // Program 7: Search a Student Roll Number and Display Student Details if Found.
import java.util.Scanner;
public class StudentSearch {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int n , key ;
        boolean found = false;

        System.out.print("ENTER THE NUMBER OF STUDENTS : ");
        n = input.nextInt();
        input.nextLine();

        String [] StudentName = new String[n];
        int [] RollNo = new int[n];
        int [] Marks = new int[n];

        System.out.println("ENETR STUDENT DETAILS : ");

        for( int i = 0 ; i<n ; i++){
            System.out.println("\nEnter details of Student " + (i + 1));;

            System.out.println("ENTER THE STUDENT NAME : ");
            StudentName[i] = input.nextLine(); 

            System.out.println("ENTER THE STUDENT ROLL NUMBER : ");
            RollNo [i] = input.nextInt();


            System.out.println("ENTER STUDENT MARKS : ");
            Marks[i] = input.nextInt();

            input.nextLine();
        }

        System.out.println("ENTER THE ROLL NUMBER YOU WANT TO SEARCH : ");
        key = input.nextInt();

        for( int i =0 ; i<n ; i++){
            if(RollNo[i] == key){
            System.out.println("STUDENT FOUND "+"\n");
            System.out.println("STUDENT roll number : " + RollNo[i]+"\n");
            System.out.println("STUDENT NAME : "+ StudentName[i]+"\n");
            System.out.println("STUDENT MARKS :  " + Marks[i]);

            found = true;
            break;
        }
    }
    if( !found ){
        System.out.println("SORRY ROLL NUMBER NOT FOUND ");
    }
}
}
