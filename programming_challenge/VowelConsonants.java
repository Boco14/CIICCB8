/**
 * Check vowels and consonants
 *
 * @author leo
 * */

package programming_challenge;
import java.util.Scanner;
import output.ProgramTerminated;

class VowelConsonantsClass{
    private static String input;
    VowelConsonantsClass(String i){input = i;}
    public void determineVowelConsonant(){
        if(input.equalsIgnoreCase("a") ||
                input.equalsIgnoreCase("e") ||
                input.equalsIgnoreCase("i") ||
                input.equalsIgnoreCase("o") ||
                input.equalsIgnoreCase("u"))
            System.out.println("Your input is a VOWEL");
        else System.out.println("Your input is a CONSONANT");
    }
}

public class VowelConsonants {
    private static final Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        while(true){
            System.out.print("Vowels or Consonants?: ");
            String input = scan.next();

            VowelConsonantsClass vowelConsonantsClass = new VowelConsonantsClass(input);
            vowelConsonantsClass.determineVowelConsonant();

            System.out.print("Enter another (y/n)?: ");
            String repeat = scan.next();
            System.out.println();

            if(!repeat.equalsIgnoreCase("y")){
                ProgramTerminated.print();
                break;
            }
        }
        scan.close();
    }
}
