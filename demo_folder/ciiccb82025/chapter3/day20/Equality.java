package demo_folder.ciiccb82025.chapter3.day20;

public class Equality {
    public static void main(String[] args) {
        StringBuilder one = new StringBuilder();
        StringBuilder two = new StringBuilder();
        StringBuilder three = one.append("a");
        System.out.println(one == two); // false
        System.out.println(one == three); // true

        System.out.println();
        String w = "Hello World";
        String x = "Hello World";
        String y = new String("Hello World");
        String z = " Hello World".trim();
        System.out.println(x == w); // true
        System.out.println(x == z); // false
        System.out.println(x == y); // false
        System.out.println(x.equals(z)); // true

        System.out.println();
        Tiger.tigerMethod();
    }
}
class Tiger{
    String name;
    static void tigerMethod(){
        Tiger t1 = new  Tiger();
        Tiger t2 = new Tiger();
        Tiger t3 = t1;

        System.out.println(t1 == t1); // true
        System.out.println(t1 == t2); // false
        System.out.println(t1.equals(t2)); // false - both different objects (new)
    }
}