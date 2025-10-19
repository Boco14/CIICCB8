class print_String{
    String this_string = "Hello world";
    String another_string = "Hello moon";
    void print_method(){
        System.out.println(this_string + "\n" +another_string);
    }
}

public class Main{
   public static void main(String[] args) {
    print_String string_ = new print_String();
    string_.print_method();
   }
}
