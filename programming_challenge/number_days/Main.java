/**
 * Number to month(1-12) and print number of days of that month
 * Write a program that prompts the user to enter a month number
 * (1 for January, 2 for February, etc.) and outputs the number of days in that month.
 * Assume that February has 28 days.
 *
 * In this program, we use a switch-case statement to handle different month numbers entered by the user.
 * The switch statement checks the value of the variable "month" , and executes the corresponding case block.
 * If none of the cases match, the default block is executed
 *
 * @author Leo
 */

package programming_challenge.number_days;

public class Main{
    public static void main(String[] args) {

        NumberDays repeat = new NumberDays();
        repeat.enterMonth();
    }
}
