/**
 * Odd or even? positive or negative? or zero?
 *
 * @author leo
 */

package programming_challenge;
import java.util.Scanner;

class NumberClassifier{
    int number;
    String[] evenOdd = {
        "Even", // divisible by 2
        "odd"   // not divisible by 2
    };

    String[] posNeg = {
        "Positive",
        "Negative"
    };

    NumberClassifier(int n){
        this.number = n;
    }

    void determineEvenOdd(){
        switch (number){
            // Checks first if the number = 0.
            case 0:
            System.out.println("The number " + number + " has no quantity, \nTherefore it is neither positive nor negative");
            break;

            // This executes if number != 0, then determines if number is even/odd or positive/negative.
        default:
            if(number % 2 == 0){
                System.out.println("The number " + number + " is " + evenOdd[0]);
                if(number > 0){
                    System.out.println("The number " + number + " is " + posNeg[0]);
                }else{
                    System.out.println("The number " + number + " is " + posNeg[1]);
                }
            }else{
                System.out.println("The number " + number + " is " + evenOdd[1]);
                if(number > 0){
                    System.out.println("The number " + number + " is " + posNeg[0]);
                }else{
                    System.out.println("The number " + number + " is " + posNeg[1]);
                }
            }
        }
    }
}

public class OddOrEven {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        char repeat = 'y';
        
        while (repeat == 'y' || repeat == 'Y'){
            System.out.print("Enter number: ");
            int number = scan.nextInt();
            System.out.println();

            NumberClassifier numberClassifier = new NumberClassifier(number);
            numberClassifier.determineEvenOdd();
            
            System.out.println();
            System.out.print("Enter another number(y/n)?: ");
            repeat = scan.next().charAt(0);

            if (repeat == 'y' || repeat == 'Y'){
                continue;
            }else if(repeat == 'n' || repeat == 'N'){
                break;
            }else{
                break;
            }

        }
        scan.close();
    }
}
