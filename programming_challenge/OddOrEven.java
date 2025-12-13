/**
 * Odd or even? positive or negative? or zero?
 *
 * @author leo
 */

package programming_challenge;
import java.util.Scanner;
import output.ProgramTerminated;

public class OddOrEven {
    private static Scanner scan = new Scanner(System.in);
    public static void main(String[] args){
        System.out.print("Enter a number: ");
        int input = scan.nextInt();
        switch(input){
            case 0: System.out.println("User input is zero"); break;
            default:
                if(input < 0) System.out.println("User input is negative");
                else System.out.println("User input is positive");
        }
        scan.close();
        ProgramTerminated.print();
    }
}
