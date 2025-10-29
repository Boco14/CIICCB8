package const_param1;
import java.util.Scanner;

class SimpleMathClass{
    String name;
    int order;
    
    SimpleMathClass(String n, int o){
        this.name = n;
        this.order = o;
    }
    void _method(){
        System.out.println("Order of " + name + "\nOrder number: " + order);
    }
}

public class Simple_Math{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter name: ");
        String name_text = sc.nextLine();
        
        System.out.print("Please enter order: ");
        int grade_number = sc.nextInt();

        SimpleMathClass _real_instance = new SimpleMathClass(name_text, grade_number);
        _real_instance._method();

        sc.close();
    }
}