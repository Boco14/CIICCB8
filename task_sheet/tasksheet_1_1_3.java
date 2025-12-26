/**
 * Writing Control flow statements using Loops
 * Performance Objective: Given a function of  (i%2==0) ? 'even' : 'odd'; ,
 * you should be able to write a program that will check each number
 * if the given numbers are odd or even numbers, print them,
 * and compile it to run in a java virtual machine without errors
 * following Java Standard Edition specification.
 *
 * @author leo
 * */
package task_sheet;
import output.ProgramTerminated;
import java.util.Scanner;

public class tasksheet_1_1_3 {
    private static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        while(true){
            CheckNumber check = x -> {
                switch (x){
                    case 0 -> System.out.println("Zero is neither positive nor negative.");
                    default ->  System.out.println((x % 2 == 0) ? x + " is even number" : x + " is odd number");
                }
                return x;
            };
            System.out.print("Enter a number: ");
            try {
                int input = scan.nextInt();
                check.check_number(input);
            } catch (Exception InputMismatchException){
                System.out.println("-- Wrong input --");
            }
            System.out.print("Would you like to continue? ");
            String repeat = scan.next();
            if(!repeat.equalsIgnoreCase("y"))break;
            System.out.println();
        }
    }
}
interface CheckNumber {
    int check_number(int num);
}

