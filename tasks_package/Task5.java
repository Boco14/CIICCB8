/**
 * Task 5
 * Check whose largest number in 3 inputs
 * Write a program that takes in three numbers from the user and outputs the largest number.
 * if all numbers are equal it will print All numbers are equal
 *
 * @author Leo
 * */

package tasks_package;

import java.util.ArrayList;
import java.util.Scanner;
import output.ProgramTerminated;

public class Task5 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        Scanner scan = new Scanner(System.in);

        // Resizable-array implementation
        for (int x = 1; x <= 3; x++ ){
            System.out.print("Input " + x + ": ");
            int input = scan.nextInt();

            arrayList.add(input);
        }

        // print each user input
        System.out.print("User input: ");
        for (int y : arrayList){
            System.out.print(y + ", ");
        }

        System.out.println();

        // checks if all numbers are equal
        if (arrayList.get(0).equals(arrayList.get(1)) && arrayList.get(1).equals(arrayList.get(2))) {
            System.out.println("All numbers are equal");
            ProgramTerminated.print();
        }else{
            if(arrayList.get(0) > arrayList.get(1) && arrayList.get(0) > arrayList.get(2)) {// checks if 0 > 1 and if 0 > 2
                System.out.println(arrayList.get(0) + " is the largest number");// says that o is the greater
                ProgramTerminated.print();
            }
            else if(arrayList.get(1) > arrayList.get(0) && arrayList.get(1) > arrayList.get(2)) {// checks if 1 > 0 and if 1 > 2
                System.out.println(arrayList.get(1) + " is the largest number");// says that 1 is the greater
                ProgramTerminated.print();
            }else {
                System.out.println(arrayList.get(2) + " is the largest number"); // says that 2 is the largest number
                ProgramTerminated.print();
            }
        }
    }
}
