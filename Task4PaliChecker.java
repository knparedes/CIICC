import java.util.Scanner;

public class Task4PaliChecker {
    public static void main(String[] args) {
        Scanner pali = new Scanner(System.in);

        System.out.print("Enter a Word: ");
        String input = pali.nextLine();

        String reversed = new StringBuilder(input).reverse().toString();

        if (input.equals(reversed)) {
            System.out.println("The input string is a palindrome.");
        } else {
            System.out.println("The input string is not a palindrome.");
        }

        pali.close();
    }
}