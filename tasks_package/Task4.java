package tasks_package;

import output.ProgramTerminated;
import java.util.Scanner;

public class Task4 {
    static void main() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input string: ");
        String input = scan.next();

        StringBuilder sb = new StringBuilder(input);

        System.out.println((input.equals(String.valueOf(sb.reverse()))) ? "The input string is a palindrome." : "The input string is not a palindrome.");
        ProgramTerminated.print();
    }
}
