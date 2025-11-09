/**
 * Number to day of the week
 * create a program that will accept 1-7 inputs and print the day in a week that corresponds with that number
 *
 * 1 - Monday
 * 2 - Tuesday
 * 3 - Wednesday
 * 4 - Thursday
 * 5 - Friday
 * 6 - Saturday
 * 7 - Sunday
 *
 * Any other number or character must print invalid input
 *
 * @author leo
 */

package programming_challenge;
import java.util.Scanner;

class WeekDays {
    int selectDay;

    String[] daysOfWeek = {
        "Monday",
        "Tuesday",
        "Wednesday",
        "Thursday",
        "Friday",
        "Saturday",
        "Sunday"
    };

    WeekDays(int sDay){
        this.selectDay = sDay;
    }
    /**
     * @param sday
     * selected day
     */
    void displayDay(){
        if(selectDay < 1 || selectDay > 7){
            System.out.println("Not a valid answer");
        }else{
            System.out.println("Day: " + daysOfWeek[selectDay - 1]);
        }
    }
}

public class DaysOfWeek {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a number 1-7 to display day of week: ");
        int numberDay = scan.nextInt();

        WeekDays weekDay = new WeekDays(numberDay);
        weekDay.displayDay();

        scan.close();
    }
}
