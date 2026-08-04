import java.util.Scanner;
public class TwoNoSumFunction {
    public static void main(String[] agrs){

        Scanner input = new Scanner(System.in);
        System.out.print("ENTER THE VALUE OF A : ");

        int a = input.nextInt();

        System.out.print("ENTER THE VALUE OF B : ");
        int b = input.nextInt();

        int ans = sum(a,b);
        System.out.println("SUM OF TWO NUMBER IS  : " + ans);

    }
    static int sum(int a,int b){
        int sum =  a + b;
        return sum; 

    }
}
