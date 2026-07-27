import java.util.Scanner;

public class AlphabetCaseCheck {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter an alphabet: ");

        char ch = input.next().trim().charAt(0);

        if (ch >= 'a' && ch <= 'z') {
            System.out.println(ch + " is LOWERCASE");
        } else {
            System.out.println(ch + " is UPPERCASE");
        }

        input.close();
    }
}