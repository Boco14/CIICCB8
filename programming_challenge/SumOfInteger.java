/**
 * Sum of All integer Inputs
 *
 * @author leo
 * */
package programming_challenge;
import java.util.ArrayList;
import java.util.Scanner;

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

                if(repeat.equalsIgnoreCase("y"))continue;
                else break;
        }
                scan.close();
    }
}
