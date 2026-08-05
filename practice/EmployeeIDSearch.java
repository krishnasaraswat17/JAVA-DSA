// Program-6: Search an Employee ID in a List Using Linear Search
import java.util.Scanner;
public class EmployeeIDSearch {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int n ,key ;
        boolean found = false;
        System.out.println("Enter The number of Employees : ");
        n = input.nextInt();
        

        int [] employeeId = new int[n];

        System.out.println("ENTER EMPLOYEE ID'S : ");

        for( int i = 0 ; i<n ; i++ ){
            employeeId[i] = input.nextInt();
        }
        System.out.println("ENTER EMPLOYEE ID TO SEARCH : ");
        key = input.nextInt();

        for(int i = 0; i<n ; i++){
            if(employeeId[i] == key){
                System.out.print("FOUND SEARCH EMPLOYEE ID AT POSITION : " +(i+1));
                found = true;
                break;
            }
        }
        if( !found ){
            System.out.print("WE DONT FIND EMPLOYEE ID AT DATABASE : ( ");
        }

    }
}
