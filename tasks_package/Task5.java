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
import java.util.stream.IntStream;

import output.ProgramTerminated;

public class Task5 {
    public static void main(String[] args) {
        System.out.println("TASK 5");
        ArrayList<Integer> arrayList = new ArrayList<>();
        Scanner scan = new Scanner(System.in);

        // Resizable-array implementation
        IntStream.rangeClosed(1, 3)
                .forEach(x -> {
                    System.out.print("Input " + x + ": ");
                    int input = scan.nextInt();
                    arrayList.add(input);
                });

        arrayList.forEach(a -> System.out.print(a + ", "));
        System.out.println();

        // checks if all numbers are equal
        boolean allEqual = arrayList.stream().distinct().count() == 1;

        if (allEqual) {
            System.out.println("All numbers are equal");
            ProgramTerminated.print();
        } else {
            // Find the largest number using streams
            int max = arrayList.stream()
                    .max(Integer::compareTo)
                    .get();

            System.out.println(max + " is the largest number");
            ProgramTerminated.print();
        }
    }
}
