package programming_challenge.number_days;

class NumberDaysMonthInput {
    /**
     * 1,3,5,7,8,10,12 - 31 days
     * 4, 6, 9, 11 - 30 days
     * 2 - 28/29 days on leap year
     * 
     * @param month
     * @return days of the month selected
     * */

    int month;

    NumberDaysMonthInput(int m){
        this.month = m;
    }

        void numberOfDays(){
            switch (month){
                case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                NumberDaysDisplayMonth displayObject1 = new NumberDaysDisplayMonth(month);
                displayObject1.printMonth();
                break;
                
            case 4: case 6: case 9: case 11:
                NumberDaysDisplayMonth displayObject2 = new NumberDaysDisplayMonth(month);
                displayObject2.printMonth();
                break;

            case 2:
                NumberDaysDisplayMonth displayObject3 = new NumberDaysDisplayMonth(month);
                displayObject3.printMonth();
                break;

            default:
                System.out.println("Not in the calendar");
                break;
        }
    }
}
