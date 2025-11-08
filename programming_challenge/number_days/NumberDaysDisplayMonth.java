package programming_challenge.number_days;
import java.time.YearMonth;

class NumberDaysDisplayMonth {
    int _index;
    int year = 2025;
    
    String[] monthArray = {
        "January",
        "February",
        "March",
        "April",
        "May",
        "June",
        "July",
        "August",
        "September",
        "October",
        "November",
        "December"
    };

    NumberDaysDisplayMonth(int i){
        this._index = i;
    }

    void printMonth(){
        System.out.print("Month of " + monthArray[_index - 1]);

        YearMonth yearMonth = YearMonth.of(year, _index);
        int days = yearMonth.lengthOfMonth();
        System.out.println(" has " + days + " days");
    }
}
