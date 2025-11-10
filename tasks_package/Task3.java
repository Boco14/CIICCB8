/** 
 * Task 3:
 * Change the variables in the first section, so that each if statements resolves as true.
 *
 * @author: Leo
 * */

package tasks_package;
import output.ProgramTerminated;

public class Task3{
    public static void main(String[] args) {
        String a = new String("Wow");
        String b = a;
        String c = "Wow!";
        String d = b + "!";
        
        boolean b1 = (a == b); // True =  Wow && Wow;
        boolean b2 = d.equals(b + "!"); // True = Wow! && Wow!;
        boolean b3 = !c.equals(a); // True = Wow! && Wow;
        
        if(b1 && b2 && b3){
            System.out.println("Success!");
            ProgramTerminated.print();
        }
    }
}
