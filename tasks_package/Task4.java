package tasks_package;
import output.ProgramTerminated;
import java.util.Scanner;

public class Task4 {
    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Input string: ");
        String input = scan.next();

        ReversedString rs = i -> i;
        StringBuilder sb = new StringBuilder(rs.userInput(input));

        // Check palindrome
        if (input.equals(sb.reverse().toString())) {
            System.out.println("The input string is a palindrome.");
        } else {
            System.out.println("The input string is not a palindrome.");
        }

        ProgramTerminated.print();
    }
}

interface ReversedString {
    String userInput(String input);
}
