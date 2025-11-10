/**
 * Check vowels and consonants
 *
 * @author leo
 * */

package programming_challenge;
import java.util.Scanner;

class VowelConsonantsClass{
    String input;

    VowelConsonantsClass(String i){
        this.input = i;
    }

    public void determineVowelConsonant(){
        if(input.equalsIgnoreCase("a") ||
                input.equalsIgnoreCase("e") ||
                input.equalsIgnoreCase("i") ||
                input.equalsIgnoreCase("o") ||
                input.equalsIgnoreCase("u"))
            System.out.println("Your input is a VOWEL");
        else
            System.out.println("Your input is a CONSONANT");;
    }

}

public class VowelConsonants {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input, repeat;

        while(true){
            System.out.print("Vowels or Consonants? ");
            input = scan.next();

            VowelConsonantsClass vowelConsonantsClass = new VowelConsonantsClass(input);
            vowelConsonantsClass.determineVowelConsonant();

            System.out.print("Enter another (y/n)? ");
            repeat = scan.next();
            System.out.println();

            if(repeat.equalsIgnoreCase("n") || !repeat.equalsIgnoreCase("y")){
                System.out.println("----- Program Terminated -----");
                break;
            }
        }
            scan.close();
    }
}
