package tasks_package;

import java.util.Scanner;

public class Task4 {
    static void main() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input string: ");
        String input = scan.next();

        StringBuilder sb = new StringBuilder(input);
        String string = sb.reverse().toString();

        System.out.println((input.equals(string)) ? "The input string is a palindrome." : "The input string is not a palindrome.");
    }
}
