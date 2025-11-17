package algorithms;
import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] arrayL = {10,5,8,2,9,1,6,3,7,4};
        Arrays.sort(arrayL);
        System.out.println(Arrays.toString(arrayL));

        System.out.print("Find index of number: ");
        int find = scan.nextInt();
        FindNumber findNumber = new FindNumber(find);
        int start=0,mid=0,end=0,
            length = arrayL.length;
        inputInfo(new int[]{arrayL[0]}, start, length, mid, end);
        findNumber.displayIndex();
    }
    static void inputInfo(int[] arrayL, int start, int length, int mid, int end){
        mid = length / 2;
        end = length;
        System.out.println("Start " + arrayL[start] + ", Middle " + mid + ", End " + end);
    }
}
 class FindNumber{
    int input;
    public FindNumber(int i){
        this.input = i;
    }
    void displayIndex(){
        System.out.println();

        System.out.println("--- Output here -> " + input);
    }
 }
