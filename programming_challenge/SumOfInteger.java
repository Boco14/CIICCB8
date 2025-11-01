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
        ArrayList<Integer> numberArray = new ArrayList<>();
        System.out.print("Enter number: ");
        System.out.println();

        while(true){
            int newInput = scan.nextInt();
            if(newInput < 0){
                break;
            }
            numberArray.add(newInput);
        }
        int sum = 0;
        for(int x : numberArray){
            sum += x;
        }

        System.out.println("Sum of all the number is " + sum);
    }
}
