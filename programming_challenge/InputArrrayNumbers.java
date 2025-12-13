/**
 * Sum and average of input array numbers
 *
 * @author leo
 * */

package programming_challenge;
import output.ProgramTerminated;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class InputArrrayNumbers {
    static Scanner scan = new Scanner(System.in);
    static ArrayList<Integer> arrayList = new ArrayList<>();
    public static void main(String[] args) {
        inputArray();
    }
    static int inputValidator(){
        try{
            System.out.print("Enter number: ");
            int input = scan.nextInt();
            return input;
        }catch (Exception e){
            System.out.println("Something went wrong"+e);
            return 0;
        }
    }
    static void inputArray(){
        while(true){
            arrayList.add(inputValidator());
            AtomicInteger sum = new AtomicInteger();
            arrayList.stream().forEach(n-> sum.addAndGet(n));

            double average = sum.get() / (double)arrayList.size();
            System.out.print("Add more number(y/n)? ");
            String repeat = scan.next();

            System.out.println();
            if(!repeat.equalsIgnoreCase("y")){
                System.out.print("Numbers you input ");
                arrayList.stream().forEach(n-> System.out.print(n+" "));
                System.out.println();
                System.out.printf("Sum is " + sum +", \nWhile the average of input array numbers is %.2f", average);
                ProgramTerminated.print();
                break;
            }
        }
    }
}
