package tasks_package;
import output.ProgramTerminated;
import java.util.ArrayList;
import java.util.Scanner;

public class Task4 {
    private static Scanner scan = new Scanner(System.in);
    private static String input;

    static void main() {
        System.out.print("Input string: ");
        String input = scan.next();

        withStringBuilder(input);
        ProgramTerminated.print();
    }

    static void withStringBuilder(String input){
        StringBuilder sb = new StringBuilder(input);
        System.out.println((input.equals(String.valueOf(sb.reverse()))) ? "The input string is a palindrome." : "The input string is not a palindrome.");
    }

    static void palindromeNoStringBuilder(String input){
        ArrayList<String> reversed = new ArrayList<>();
        int start = input.length();
        String reversedString = "";

        System.out.print("Reversed string: ");
        for(int x=start; x >= 1; x--){
            char c = input.charAt(x-1);
            System.out.print(c);
            reversed.add(String.valueOf(c));
            reversedString += c;
        }

        System.out.println();
        System.out.println(input.equals(reversedString) ? "Palindrome" : "Not a palindrome");
    }
}
