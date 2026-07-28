import java.util.Scanner;
public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        final double PI = 3.14159;
        System.out.print("ENTER RADIUS : "); 
        float R = input.nextFloat();

        double area = PI*(R*R);

        System.out.print("AREA OF CIRCLE = "+ area);
    }
}
