package algorithms;
import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] arrayL = {10,5,8,2,9,1,6,3,7,4};
        Arrays.sort(arrayL);
        System.out.println(Arrays.toString(arrayL));

        int start=1,
            mid=0,
            end=0,
            lenght = arrayL.length;

        if(lenght %2 == 0){
            System.out.println("Lenght is " + lenght + " and divisible by 2");
            mid = lenght / 2;
            System.out.println("Start " + Arrays[start] + "Middle " + mid) + "End ";
        }
    }

    public void numberInput(){
        return;
    }
}
