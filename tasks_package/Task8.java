/**
* Task 8
* Write a program featuring an integer variable argument's method.
* The method should return the sum of all parameters and,
* for each parameter, the cumulative sum up to that point.
* For instance, given parameters (4, 5, 10),
* the program should compute the total for the first parameter,
* such as 4 = (1+2+3+4), and repeat this process for subsequent parameters.
*
* @author Leo
* */
package tasks_package;
import java.util.ArrayList;
import java.util.Scanner;

public class Task8 {
    private static final Scanner SCAN = new Scanner(System.in);
    private static final ArrayList<Integer> LIST = new ArrayList<>();
    public static void main(String[] args) {
        System.out.println("TASK 8");
        addInput();

        int total = cumulativeSum(toIntArray(LIST));
        System.out.println("\nTotal sum of all parameters: " + total);

        System.out.println("Cumulative sums:");
        LIST.stream().forEach(n -> System.out.println(n + " = " + cumulativeSumUpTo(n)));
    }
    static void addInput(){
        while(true){
            System.out.print("Enter number: ");
            int input = SCAN.nextInt();
            LIST.add(input);
            System.out.print("Enter another?(y/n): ");
            String repeat = SCAN.next();
            System.out.println();
            if(!repeat.equalsIgnoreCase("y"))break;
        }
        System.out.print("Your input: ");

        LIST.stream().forEach(l -> System.out.print(l + ", "));
    }

    public static int cumulativeSum(int... s){
        int sum = 0;
        for(int num:s)
            sum+=num;
        return sum;
    }

    public static int cumulativeSumUpTo(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++)
            sum += i;
        return sum;
    }

    private static int[] toIntArray(ArrayList<Integer> list) {
        int[] arr = new int[list.size()];
        for (int i = 0; i < list.size(); i++)
            arr[i] = list.get(i);
        return arr;
    }

}
