/**
 * Writing Control flow statements using Loops
 *
 * Performance Objective: Given a function of  (i%2==0) ? 'even' : 'odd'; ,
 * you should be able to write a program that will check each number
 * if the given numbers are odd or even numbers, print them,
 * and compile it to run in a java virtual machine without errors
 * following Java Standard Edition specification.
 *
 * @author leo
 * */

package task_sheet;

public class tasksheet_1_1_3 {
    public static void main(String[] args) {
        int check_number = 10;
        String message;

        for(int i = 1; i <= check_number; i++){
            message = (i % 2 == 0) ? i + " is even number" : i + " is odd number";
            System.out.print(message);
        }
    }
}
