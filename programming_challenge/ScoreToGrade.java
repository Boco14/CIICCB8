/**
 * Score to Grade F - A
 * Write a program that takes in the score of a student in a test and outputs their grade based on the following criteria:
 * A score of 90 or above gets an A grade
 * A score between 80 and 89 gets a B grade
 * A score between 70 and 79 gets a C grade
 * A score between 60 and 69 gets a D grade
 * A score below 60 gets an F grade
 *
 * @author Leo
 */

package programming_challenge;
import java.util.Scanner;

class Grade{
    int inputGrade;

    Grade(int i){
        this.inputGrade = i;
    }
    
    void method_grade(){
        if (inputGrade >= 90 && inputGrade <= 100){
            System.out.println("Student grade: A");
        }else if (inputGrade >= 80 && inputGrade <= 89){
            System.out.println("Student grade: B");
        }else if (inputGrade >= 70 && inputGrade <= 79){
            System.out.println("Student grade: C");
        }else if (inputGrade >= 60 && inputGrade <= 69){
            System.out.println("Student grade: D");
        }else{
            System.out.println("Student grade: Failed");
        }
    }
}

public class ScoreToGrade {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int grade;
        
        while(true){
            System.out.print("Enter grade: ");
            grade = scan.nextInt();
            Grade objectGrade = new Grade(grade);
            objectGrade.method_grade();

            System.out.print("Enter another grade(Y/N)?");
            String repeat = scan.next();

            System.out.println();

            if(repeat.equalsIgnoreCase("y"))continue;
            else { break; }

        }
        scan.close();
    }
}
