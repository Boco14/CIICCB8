package demo_folder.ciiccb82025.chapter3.day20;
import java.lang.StringBuilder;

public class StringBuilders {
    public static void main(String[] args) {
        StringBuilder alpha = new StringBuilder();

        for(char current = 'a'; current <= 'z'; current++){
            alpha.append(current);
        }
        System.out.println(alpha);

        System.out.println();
        // Mutability and chaining
        StringBuilder sb = new StringBuilder("start");
        sb.append("+middle");                       // sb = "start+midle"
        StringBuilder same = sb.append("+end");     // "start+middle+end"
        System.out.println(same);

        System.out.println();
        StringBuilder a = new StringBuilder("abc");
        StringBuilder b = a.append("de");
        b = b.append("f").append("g");
        System.out.println("a="+a);
        System.out.println("b="+b);

        // Creating a StringBuilder
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder("animal");
        StringBuilder sb3 = new StringBuilder(10);

        System.out.println();
        // StringBuilder methods charAt(), indexOf(), length(), and substring()
        StringBuilder sb4 = new StringBuilder("animals");
        String sub = sb4.substring(sb4.indexOf("a"), sb4.indexOf("al"));
        int len = sb4.length();
        char ch = sb4.charAt(6);
        System.out.println(sub + " " + len + " " + ch);

        System.out.println();
        // append() means "add something to the end"
        // StringBuilder append(String str)
        StringBuilder sb5 = new StringBuilder().append(1).append('c');
        sb5.append("-").append(true);
        System.out.println(sb5);

        System.out.println();
        //insert() - adds characters on requested index
        // StringBuilder insert(int offset, String str);
        StringBuilder sb6 = new StringBuilder("animals");
        sb6.insert(7, "-");
        sb6.insert(0, "-");
        sb6.insert(4, "-");
        System.out.println(sb6);

        System.out.println();
        // delete() - removes character and returs a reference to the current StringBuilder
        // StringBuilder delete(int start, int end);
        // StringBuilder deleteCharAt(int index);
        StringBuilder sb7 = new StringBuilder("abcdef");
        sb7.delete(2, 4); // abcdef - abef
        sb7.deleteCharAt(2); // abef - abf
        System.out.println(sb7); // abf

        System.out.println();
        // reverse() - reverse the character sequence
        sb7.reverse();
        System.out.println(sb7);

        System.out.println();
        // toString() - converts StringBuilder to String, since it is an object and not a string yet
        // String toString()
        String s = sb7.toString();
        System.out.println(s);


    }
}
