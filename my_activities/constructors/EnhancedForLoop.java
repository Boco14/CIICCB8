package my_activities.constructors;

import java.util.ArrayList;
import java.util.Scanner;

public class EnhancedForLoop {
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
                // Initialize repeat
                char repeat = 'y';
                System.out.print("Add another my_activities.constructors.number (y/n)?: ");
                repeat = scan.next().charAt(0);

                System.out.println();

                if(repeat == 'y' || repeat == 'Y'){
                    continue;
                }else{
                    System.out.println("Total value: " + sum);
                    break;
                }
        }
    }
}