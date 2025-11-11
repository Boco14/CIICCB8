package my_activities.for_loops;

import output.ProgramTerminated;

public class ReverseString {
    public static void main(String[] args) {
        String animals = "Animals";
        System.out.print(animals + " = ");
        for (int x = animals.length()-1; x >= 0; x--)
            System.out.print(animals.charAt(x));

        System.out.println();
        StringBuilder reverseMe = new StringBuilder("Reverse");
        System.out.print(reverseMe);
        reverseMe.reverse();
        System.out.print(" = " + reverseMe);

        ProgramTerminated.print();
    }
}
