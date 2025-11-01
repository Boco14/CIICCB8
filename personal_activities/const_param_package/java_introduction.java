/*
OBJECT-ORIENTED PROGRAMMING (OOP)
is a programming paradigm based on the concept of "objects", 
which can contain data and code: data in the form of fields (often known as attributes or properties), 
and code, in the form of procedures (often known as methods). A feature of objects is that an object's 
procedures can access and often modify the data fields of the object with which 
they are associated (objects have a notion of "this" or "self").
*/
import java.util.Scanner;

class number{
    //These lines are properties/attributes of the object number
    int first_number, second_number;

    //This line is a method the action/behavior that the object does.
    void add(){
        int addend = first_number + second_number;
        System.out.print(first_number + " + " + second_number + " = " + addend);
    }

    void subtract(){
        int difference = first_number - second_number;
        System.out.println(first_number + " - " + second_number + " = " + difference);
    }

    void multiply(){
        int product = first_number * second_number;
        System.out.println(first_number + " * " + second_number + " = " + product);
    }

    void divide(){
        if (second_number != 0){
            int qoutient = first_number / second_number;
            System.out.println(first_number + " / " + second_number + " = " + qoutient);
        }
        else{
            System.out.println("Second number is not devisible by zero");
        }
    }
}

public class java_introduction{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        number num1 = new number();
        char choice = 'y';

        //This line creates an object num1
        while (choice != 'n' || choice != 'N') {
            //This line sets properties of the object num1
            System.out.print("Enter first number: ");
            num1.first_number = sc.nextInt();

            //This line sets properties of the object num2
            System.out.print("Enter second number: ");
            num1.second_number = sc.nextInt();
            
            System.out.println("Select and operator: +, -, *, /");
            char operator = sc.next().charAt(0);
            
            switch (operator){
                case '+':
                    num1.add();
                    break;
                case '-':
                    num1.subtract();
                    break;
                case '*':
                    num1.multiply();
                    break;
                case '/':
                    num1.divide();
                    break;
                default:
                    System.out.println("Invalid operator");
                    return;
            }
            System.out.println("Do you want to continue? (y/n): ");
            choice = sc.next().charAt(0);
            if (choice == 'n' || choice == 'N'){
                break;

            }
        }

        
    }
}