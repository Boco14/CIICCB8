/**
 * Sum of All integer Inputs
 *
 * @author leo
 * */
package programming_challenge;
import java.util.ArrayList;
import java.util.Scanner;
import output.ProgramTerminated;

public class SumOfInteger {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> arrayList= new ArrayList<>();

        // Create an infinite loop
        for ( ; ; ){
            System.out.print("Number: " );
            int input = scan.nextInt();
            arrayList.add(input);

            // Initialize the variable sum
            int sum = 0;
            // Add the value of sum to every iteration
            for(int x : arrayList){
                // sum = sum + x(element)
                sum += x;
            }
            // Repeat action
                System.out.print("Add another number (y/n)?: ");
                String repeat = scan.next();

                System.out.println();

                if(repeat.equalsIgnoreCase("n") || !repeat.equalsIgnoreCase("y")){
                    System.out.println("Input: ");
                    for(int y : arrayList){
                        System.out.print(y + ", ");
                    }
                    System.out.println();

                    System.out.println("Sum of All integer Inputs is " + sum);
                    ProgramTerminated.print();
                    break;
                }
        }
        scan.close();
    }
}
