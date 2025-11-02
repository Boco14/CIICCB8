/**
 * Combine the Java arithmetic operators with the simple assignment operator
 *
 * Performance Objective: Given a java file ArithmeticTask.java, you should be able to
 * create the ource code of a java executable application,
 * and compile it to run in a java virtual machine without errors following
 * Java Standard Edition specification.
 * */
package task_sheet;

public class tasksheet_1_1_2 {
    public static void main(String[] args) {
        int result = 1 + 2; // result is now 3
        System.out.println(result);

        result -= 1; // result is now 2
        System.out.println(result);

        result *= 2; // result is now 4
        System.out.println(result);

        result /= 2; // result is now 2
        System.out.println(result);

        result += 8; // result is now 10
        result %= 7; // result is now 3
        System.out.println(result);
    }
}
