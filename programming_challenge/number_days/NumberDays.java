package programming_challenge.number_days;
import java.util.Scanner;

class NumberDays {
    void enterMonth(){
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter number of month: ");
        int monthInput = scan.nextInt();

        NumberDaysMonthInput monthObject = new NumberDaysMonthInput(monthInput);
        monthObject.numberOfDays();

        scan.close();
    }
}
