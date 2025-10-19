class print_String{
    String this_string = "Hello world";
    void print_method(){
        System.out.println(this_string);
    }
}

public class Main{
   public static void main(String[] args) {
    print_String string_ = new print_String();
    string_.print_method();
   }
}
