package algorithms;
import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] arrayL = {10,5,8,2,9,1,6,3,7,4};
        Arrays.sort(arrayL);
        System.out.println(Arrays.toString(arrayL));

        System.out.print("Find number: ");
        int find = scan.nextInt();
        int start=arrayL[0],mid=0,end=0,
            length = arrayL.length;
        inputInfo(arrayL, start, length, mid, end);
    }
    static void inputInfo(int[] arrayL, int start, int length, int mid, int end){
        System.out.println("length is " + length + " and divisible by 2");
        mid = length / 2;
        end = length;
        System.out.println("Start " + arrayL[start-1] + "\nMiddle " + mid + "\nEnd " + end);
    }
}
