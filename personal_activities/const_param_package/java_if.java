import java.util.Scanner;

class if_class{
    int number_input;
    Scanner input = new Scanner(System.in);
    
    void input(){
        System.out.print("Enter grade: ");
        number_input = input.nextInt();
    }

    void if_method(){
        if(number_input >= 96 && number_input <= 100 ){
            System.out.println("Your grade is " + number_input);
            System.out.println("Remarks: Excellent");
        }else if(number_input >= 90 && number_input <= 95){
            System.out.println("Your grade is " + number_input);
            System.out.println("Remarks: Good");
        }else if(number_input >= 86 && number_input <= 89){
            System.out.println("Your grade is " + number_input);
            System.out.println("Remarks: Fair");
        }else if(number_input >= 81 && number_input <= 85){
            System.out.println("Your grade is " + number_input);
            System.out.println("Remarks: Good");
        }else{
            System.out.println("Your grade is " + number_input);
            System.out.println("Remarks: Failed");
        }
    }
}

public class java_if{
    public static void main(String[] args){
        if_class output = new if_class();
        Scanner repeat_input = new Scanner(System.in);
        char repeat = 'y';
        //Boolean repeat = true;

        while (repeat != 'n' || repeat != 'N') {
            output.input();
            output.if_method();
            System.out.println("Do you wish to continue? y/n.");
            repeat = repeat_input.next().charAt(0);

            if (repeat == 'n' || repeat == 'N'){
                break;
            }
        }
    }
}