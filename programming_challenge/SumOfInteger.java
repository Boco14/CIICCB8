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
    private static Scanner scan = new Scanner(System.in);
    private static ArrayList<Integer> arrayList= new ArrayList<>();
    public static void main(String[] args) {
        while(true){
            try{
                System.out.print("Number: " );
                int input = scan.nextInt();
                arrayList.add(input);
            }catch (Exception InputMismatchException){
                System.out.println("--- Only accepting numbers!!! ---");
                System.out.println();
            }

            // get the total
            int sum = arrayList.stream().mapToInt(Integer::intValue).sum();
                System.out.print("Add another number (y/n)?: ");
                String repeat = scan.next();
                System.out.println();

                if(!repeat.equalsIgnoreCase("y")){
                    System.out.print("Input: ");
                    arrayList.forEach(i-> System.out.print(i + " "));
                    System.out.println();

                    System.out.println("Sum of All integer Inputs is: " + sum);
                    ProgramTerminated.print();
                    break;
                }
        }
        scan.close();
    }
}
