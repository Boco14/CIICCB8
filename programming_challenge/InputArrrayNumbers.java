/**
 * Sum and average of input array numbers
 *
 * @author leo
 * */

package programming_challenge;
import output.ProgramTerminated;

import java.util.Scanner;
import java.util.ArrayList;

public class InputArrrayNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> arrayList = new ArrayList<>();

        while(true){
            System.out.print("Enter number: ");
            int input = scan.nextInt();
            arrayList.add(input);

            int sum = 0;
            for(int x : arrayList){
                sum += x;
            }
            double average = sum / (double)arrayList.size();
            System.out.print("Add more number(y/n)? ");
            String repeat = scan.next();

            System.out.println();
            if(repeat.equalsIgnoreCase("n") || !repeat.equalsIgnoreCase("y")){
                System.out.print("Numbers you input ");
                for(int y : arrayList)
                    System.out.print(y + ", ");

                System.out.println();
                System.out.printf("Sum is " + sum +", \nWhile the average of input array numbers is %.2f", average);
                ProgramTerminated.print();
                break;
            }

        }
    }
}
