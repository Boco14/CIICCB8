package tasks_package;
/**
 * Task 8
* Write a program featuring an integer variable arguments method.
* The method should return the sum of all parameters and,
* for each parameter, the cumulative sum up to that point.
* For instance, given parameters (4, 5, 10),
* the program should compute the total for the first parameter,
* such as 4 = (1+2+3+4), and repeat this process for subsequent parameters.
*
* @author Leo
* */
import java.util.Scanner;

public class Task8 {
    private static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        Task8 task8 = new Task8();
        System.out.println(task8.cumulativeSum(1,2,3,4));
    }

    public int cumulativeSum(int... s){
        int sum = 0;
        for(int num:s)
            sum+=num;
        return sum;
    }

}
