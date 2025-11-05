package my_activities.constructors;

import java.util.Scanner;

class loops{
    Scanner input = new Scanner(System.in);

    void level_one(){
//      1. Print numbers from  1 to 10  using a `for` loop.
        for(int forward = 1; forward <= 10; forward++){
            System.out.println("Number: " + forward);
        }
        System.out.println();

//        2. Print numbers from  10 down to 1  (backwards).
        for(int reverse = 10; reverse >= 1; reverse--){
            System.out.println("Number: " + reverse);
        }
        System.out.println();

//        3. Print only  even numbers  from 1 to 20.
        for(int even_numbers = 1; even_numbers <=20; even_numbers++){
            if (even_numbers % 2 == 0){
                System.out.println(even_numbers);
            }
        }
        System.out.println();

//        4. Print the  multiplication table of 5  (from 5 × 1 up to 5 × 10).
        int multiplicand = 5;
        for(int multiplier = 1; multiplier <= 10; multiplier++){
            int product = multiplicand * multiplier;
            System.out.println(multiplicand + "x" + multiplier + " = " + product);
        }
    }

    void level_two(){
//        5. Write a program that prints the  sum of numbers from 1 to 100 .
        int addend = 0;
        for(int numbers_sum = 1; numbers_sum <= 100; numbers_sum++){
            addend = addend + numbers_sum;
        }
        System.out.println("The total my_activities.constructors.number is " + addend);

//        6. Print a  square of stars  like this (for `n = 5`):
//        *****
//        *****
//        *****
//        *****
//        *****
        for(int outer = 1; outer <= 5; outer++){
            for(int inner = 1; inner <= 5; inner++){
                System.out.print(" * ");
            }
            System.out.println();
        }
        System.out.println();
//        7. Print a triangle of stars (for `n = 5`):
//        *
//        **
//        ***
//        ****
//        *****
        int n = 5;
        for(int i = 1; i <= n; i++){
            for(int x = 1; x <= i; x++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    void level_three(){
//        8. Write a program to find the  factorial  of a my_activities.constructors.number (e.g., `5! = 5×4×3×2×1 = 120`).
        System.out.print("5! = = 5×4×3×2×1 = ");
        int factorial = 1;
        for(int y = 5; y >= 1; y--){
            factorial = factorial * y;
            // System.out.println(y);
        }
        System.out.println(factorial);

//         9. Print the  Fibonacci sequence  up to 10 terms: 
//         0 1 1 2 3 5 8 13 21 34
        int n = 10; // my_activities.constructors.number of terms
        int first = 0, second = 1; // first two numbers

        System.out.print("Fibonacci up to " + n + " terms: ");

        // print first two numbers
        System.out.print(first + " " + second);

        // loop to print the rest
        for (int i = 3; i <= n; i++) {
            int next = first + second; // sum of last two numbers
            System.out.print(" " + next);

            // move forward in the sequence
            first = second;
            second = next;
        }

    }

    void while_loops(){
        char yes = 'Y';
        while(yes == 'Y' || yes == 'y'){
            System.out.print("Do you wish to continue this while loop(Y/N)? ");
            yes = input.next().charAt(0);
            if (yes == 'N' || yes == 'n'){
                break;
            }
        }
    }
}

public class java_loop{
    public static void main(String[] args){
        loops about_loops = new loops();
        
        // about_loops.level_one();
        // about_loops.level_two();
        about_loops.level_three();

        // about_loops.while_loops();

    }
}