import java.util.Scanner;
public class AreaOfTriangle {
    public static void main(String[] arrgs){
        Scanner input = new Scanner(System.in);

        System.out.print("  ENTER B : ");
        float B = input.nextFloat();

        System.out.print("ENTER H : ");
        Float H = input.nextFloat();

        double area = (B*H)/2;

        System.out.print("AREA OF TRIANGLE : " + area);

    }
}
