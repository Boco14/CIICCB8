package programming_challenge;
import output.ProgramTerminated;

import java.util.ArrayList;
import java.util.Scanner;

public class NumberOfWords {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // prompt for a sentence
        System.out.println("Write a sentence:");
        String sentence = scan.nextLine().trim();

        StringBuilder sb = new StringBuilder(sentence);
        ArrayList<String> listWords = new ArrayList<>();

        int space = 0,
                start = 0,
                end = 0;

        for(int x = 1; x <= sb.length(); x++){
            if(sb.charAt(x-1) == ' '){
                end += x;
                String sub = sb.substring(start, end);
                listWords.add(sub.trim());
                sb.delete(start, end);
                end = 0;
                x=1;
            }
        }
        if (!sb.isEmpty()) listWords.add(sb.toString().trim());
        System.out.println("Number or words: " + listWords.size());
        ProgramTerminated.print();
    }

    static void code1(){
        Scanner scan = new Scanner(System.in);
        // prompt for a sentence
        System.out.println("Write a sentence:");
        String sentence = scan.nextLine().trim();

        StringBuilder sb = new StringBuilder(sentence);

        int l = sb.length(),
                count = 0, count2 = 0;

        switch(l){
            case 0:
                System.out.println("You have yet to input");
                ProgramTerminated.print();
            default:
                int first=l/2,
                        duplicate = 0,
                        duplicate2 = 0;
                // ab  e-fghij

                if(l%2==0 || l%2!=0){
                    for (int x = 1; x <= first; x++){
                        System.out.println(sb.charAt(x - 1) + " - " + x);
                        if(sb.charAt(x) == ' ' ){
                            count++;
                            if (sb.charAt(x) == ' ' && sb.charAt(x+1) == ' '){
                                duplicate++;
                            }
                        }
                    }
                }
                System.out.print("Duplicate space "+duplicate+"\n");
                int left = count - duplicate;
                System.out.println("Spaces = " + left);
                System.out.println();

                for (int y = first + 1; y <= l; y++){ // y=6, l=10
                    System.out.println(sb.charAt(y - 1) + " - " + y); // (y-1) = 5, y = 6
                    if (sb.charAt(y-1) == ' '){
                        count2++;
                        if(sb.charAt(y-1) == ' ' && sb.charAt(y) == ' ' || sb.indexOf(" ") > 3){ // (y-1) = 5, y = 6
                            duplicate2++;
                        }
                    }
                }

                System.out.print("Duplicate space "+duplicate+"\n");
                int right = count2 - duplicate2;
                System.out.println("Spaces = " + right);
                System.out.println("Total count of words " + (left + right));
        }
    }}


