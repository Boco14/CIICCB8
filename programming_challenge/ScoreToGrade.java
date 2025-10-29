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
    int input_grade;

    Grade(int i){
        this.input_grade = i;
    }
    
    void method_grade(){
        if (input_grade >= 90 && input_grade <= 100){
            System.out.println("Student grade: A");
        }else if (input_grade >= 80 && input_grade <= 89){
            System.out.println("Student grade: B");
        }else if (input_grade >= 70 && input_grade <= 79){
            System.out.println("Student grade: C");
        }else if (input_grade >= 60 && input_grade <= 69){
            System.out.println("Student grade: D");
        }else{
            System.out.println("Student grade: Failed");
        }
    }
}

public class ScoreToGrade {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int grade_;
        char repeat = 'Y';
        
        while(repeat == 'Y' || repeat == 'y'){
            System.out.print("Enter grade: ");
            grade_ = scan.nextInt();
            Grade object_grade = new Grade(grade_);
            object_grade.method_grade();

            System.out.print("Enter another grade(Y/N)?");
            repeat = scan.next().charAt(0);
            if((repeat == 'n' || repeat == 'N'))break;
        }
        scan.close();
    }
}
