package algorithms;
import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] arrayL = {10, 5, 8, 2, 9, 1, 6, 3, 7, 4};
        Arrays.sort(arrayL);

        System.out.print("Find index of number: ");
        int input = scan.nextInt();

        int length = arrayL.length;
        int start = 1,
            mid = length / 2,
            end = length;

        for(int x : arrayL)
            System.out.print(arrayL[x-1] + " ");

        System.out.println();
        if (input >= start && input <= mid) {
            System.out.println("Input is between " + start + " and " + mid);
            index(input, start, mid, arrayL);
        }
        else if (input >= mid && input <= end) {
            System.out.println("Input is between " + mid + " and " + end);
            index(input, mid, end, arrayL);
        }
        else System.out.println("Input is not valid");
    }
    public static int index(int target, int param1, int param2, int[] arrParam){
        System.out.println("Constructor check");
        System.out.println(arrParam[param1-1] + ", " + arrParam[param2-1]);
        System.out.println(arrParam[target]);
        return 0;
    }
}