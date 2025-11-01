import java.util.Scanner;
import java.text.DecimalFormat;
// STRAT CALCULATOR

class entry{
    int multiplier;
    double margin_size;
    char new_margin = 'n', repeat ;
    String dollar_baby = " $";
    Scanner entry_position = new Scanner(System.in);

    void entry_margin_method(){
            System.out.print("Set margin size: ");
            margin_size = entry_position.nextDouble();
            
            System.out.print("Set multiplier: ");
            multiplier = entry_position.nextInt();
            
            System.out.println();

            for(int x = 1; x <=5; x++){
                System.out.print((x == 1) ? "Entry " + x + ": " + margin_size + dollar_baby + "\n": "");
                if(x >= 2 ){
                    margin_size = margin_size * multiplier;
                    System.out.print("Entry " + x + ": " + margin_size + dollar_baby);
                    System.out.println((x == 5) ? " Depende sayo " : "");
            }
    }

    double new_, position;

    void entry_position_method(){
            System.out.print("Enter position: ");
            position = entry_position.nextDouble();

            double[] percentages = {0.83, 2.48, 7.44, 22.31, 66.90};

            DecimalFormat df = new DecimalFormat("0.0");

            for (int y = 0; y < percentages.length; y++) {
                new_ = (percentages[y] / 100) * position;
                System.out.println("Entry " + (y + 1) + ": " + df.format(new_));
            }
    }
}

public class Skalera_ni_dads{
    public static void main(String[] args){
        char method_input, repeat_ = 'y';
        Scanner method_type = new Scanner(System.in);

        entry entry_object = new entry();
        
        while(repeat_ == 'y' || repeat_ == 'Y'){
            System.out.println("Choose a method: ");
            System.out.println("(a) Margin based entry");
            System.out.println("(b) Position based entry");
            method_input = method_type.next().charAt(0);
            if (method_input == 'a' || method_input == 'A'){
                entry_object.entry_margin_method();
            }else{
                entry_object.entry_position_method();
            }
                System.out.println("Wrong answer wrong");
                System.out.println("Do you wish to continue?");
                repeat_ = method_type.next().charAt(0);
                if ((repeat_ == 'n' || repeat_ == 'N'))break;
        }
    }
}