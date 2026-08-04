// Define two methods to find the maximum and minimum number among three numbers.

import java.util.Scanner;

public class MaxMin {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("ENTER THE VALUE OF A : ");
        int A = input.nextInt();

        System.out.print("ENTER THE VALUE OF B : ");
        int B = input.nextInt();

        System.out.print("ENTER THE VALUE OF C : ");
        int C = input.nextInt();

        int MAX = Max(A, B, C);
        int MIN = Min(A, B, C);

        System.out.println("Maximum Number = " + MAX);
        System.out.println("Minimum Number = " + MIN);

        input.close();
    }

    static int Max(int A, int B, int C) {

        int max = A;

        if (B > max) {
            max = B;
        }

        if (C > max) {
            max = C;
        }

        return max;
    }

    static int Min(int A, int B, int C) {

        int min = A;

        if (B < min) {
            min = B;
        }

        if (C < min) {
            min = C;
        }

        return min;
    }
}