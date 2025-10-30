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

package programming_challenge;
import java.util.Scanner;
import java.time.YearMonth;

class Month{
    /**
     * 1,3,5,7,8,10,12 - 31 days
     * 4, 6, 9, 11 - 30 days
     * 2 - 28/29 days on leap year
     * 
     * @param year 2025(final) and month(user)
     * @return days of the month selected
     * */ 
    final int year = 2025;
    final int month;

    Month(int m){
        this.month = m;
    }

    void numberOfDays(){
        YearMonth yearMonth = YearMonth.of(year, month);
        int daysOfMonth = yearMonth.lengthOfMonth();
        
        switch (month){
            default:
                System.out.println("Not in the calendar");
                break;

            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12: 
                System.out.println("Month of " + yearMonth.getMonth().toString().toLowerCase() + " " + daysOfMonth);
                break;
        }
    }
}

class DisplayMonth{
    String[] monthArray = {
        "1 - January",
        "2 - February",
        "3 - March",
        "4 - April",
        "5 - May",
        "6 - June",
        "7 - July",
        "8 - August",
        "9 - September",
        "10 - October",
        "11 - November",
        "12 - December"
    };

    void printMonth(){
        System.out.println("OPTIONS");
        for(int m = 0; m < monthArray.length; m++){
            System.out.println(monthArray[m]);
        }
    }
}

public class NumberDays{
    public static void main(String[] args) {
        // Create Scanner object in memory
        Scanner scan = new Scanner(System.in);

        // Display month options(Optional)
        DisplayMonth displayObject = new DisplayMonth();
        displayObject.printMonth();

        // Accepts user input( number of months )
        System.out.print("Enter number of month: ");
        int monthInput = scan.nextInt();

        Month monthObject = new Month(monthInput);
        monthObject.numberOfDays();

        scan.close();
    }
}