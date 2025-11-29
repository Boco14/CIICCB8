package tasks_package;
import java.util.Scanner;

public class Task7 {
    public static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        Shapes.displayObjects();
    }
}
class Shapes{
    public static void displayObjects(){
        Input input = new Input();
        input.acceptInput();
        Add add = new Add(input.getInput1(), input.getInput2());
        Sub sub = new Sub(input.getInput1(), input.getInput2());
        Mul mul = new Mul(input.getInput1(), input.getInput2());
        Div div = new Div(input.getInput1(), input.getInput2());
        Operation[] operation= {add, sub, mul, div};

        for(Operation operations: operation){
            operations.text();
            operations.mathOperation();
        }
    }
}
class Input extends Task7{
    private static int input1;
    private static int input2;
    public static int total;
    void acceptInput(){
        System.out.print("First input: ");
        input1 = scan.nextInt();
        System.out.print("Second input: ");
        input2 = scan.nextInt();
    }
    int getInput1(){
        return input1;
    }
    int getInput2(){
        return input2;
    }
}
interface Operation{
    int mathOperation();
    void text();
}
class Add extends Task7 implements Operation{
    private int input1;
    private int input2;
    Add(int input1, int input2){
        this.input1 = input1;
        this.input2 = input2;
    }
    @Override
    public void text(){
        int total = input1 + input2;
        System.out.println("Add operation: " + input1 + " + " + input2 + " = " + total);
    }
    @Override
    public int mathOperation(){
        return input1 + input2;
    }
}
class Sub extends Task7 implements Operation{
    private final int input1;
    private final int input2;
    Sub(int input1, int input2){
        this.input1 = input1;
        this.input2 = input2;
    }
    @Override
    public void text(){
        int total = input1 - input2;
        System.out.println("Sub operation: " + input1 + " - " + input2 + " = " + total);
    }
    @Override
    public int mathOperation(){
        return input1 - input2;
    }
}
class Mul extends Task7 implements Operation{
    private final int input1;
    private final int input2;
    Mul(int input1, int input2){
        this.input1 = input1;
        this.input2 = input2;
    }
    @Override
    public void text(){
        int total = input1 * input2;
        System.out.println("Mul operation: " + input1 + " * " + input2 + " = " + total);
    }
    @Override
    public int mathOperation(){
        return input1 * input2;
    }
}
class Div extends Task7 implements Operation{
    private final int input1;
    private final int input2;
    Div(int input1, int input2){
        this.input1 = input1;
        this.input2 = input2;
    }
    @Override
    public void text(){
            try{
                int total = input1 / input2;
                System.out.println("Div operation: " + input1 + " / " + input2 + " = " + (double)total);
            }catch (ArithmeticException e){
                System.out.println("Div operation: has stopped");
            }
    }
    @Override
    public int mathOperation(){
        if(input1 == 0 || input2 == 0)return 0;
        return 0;
    }
}

