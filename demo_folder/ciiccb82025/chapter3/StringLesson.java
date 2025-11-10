package demo_folder.ciiccb82025.chapter3;

public class StringLesson {
    public static void main(String[] args) {
        String name = "fluffy";
        String a = "1"; // a = "1"
        a = "0";
        a += "2"; // a = "12"
        a += "3"; // a = "123"
        String b = "1";
        String name2 = "fluffy"; // creates a new string "name2" with the same address as "name"
        name = null;
        name2 = null;
        String name3 = new String("fluffy");
        System.out.println(a);

        String s1, s2;
        s1 = "1";
        s2 = s1.concat("2");
        s2.concat("3");
        System.out.println(s2);

        System.out.println();

        String string = "animals";
        char[] chars = new char[7]; // make space

        System.out.println(string.length()); // 7
        string.getChars(0, 7, chars, 0);
        // 0 - srcBegin
        // 3 - srcEnd
        // char - assign to the char[]
        System.out.println(chars);

//      String string = "animals"
        // chartAt() gets the character at specific index
        System.out.print(string.charAt(0) + ", "); // a
        System.out.println(string.charAt(6)); // s

        System.out.println();

        // indexOf() gets the index of the specified char
        System.out.println(string.indexOf('a')); // 0
        System.out.println(string.indexOf("al")); // 4
        System.out.println(string.indexOf('a', 4)); // 4
        System.out.println(string.indexOf("al", 5)); // -1 does not throw an exception but now match was found -(-1)
        System.out.println(string.indexOf("al", 5 - 1)); // 4

        System.out.println();

        // substring() returns parts of the string
        System.out.println(string.substring(3)); // mals
        System.out.println(string.substring(string.indexOf('m'))); // mals
        System.out.println(string.substring(3,4)); // m
        System.out.println(string.substring(3,7)); // mals
        /*  System.out.println(string.substring(3,2));
            throws an exception endIndex should be larger than start */

        System.out.println();

        // toLowerCase() returns the string as lowercased
        System.out.println(string.toLowerCase());

        // toUpperCase() returns the string to uppercase
        System.out.println(string.toUpperCase());
        System.out.println("AbcdEf123".toUpperCase());

        System.out.println();

        // equals() checks if the Two String Objects contain the same characters in the same order
        System.out.println("abc".equals("ABC")); // false
        System.out.println("ABC".equals("ABC")); // true

        // equalsIgnoreCase() always true whether both of the string is lower or uppercase - converts the character case when needed
        System.out.println("abc".equalsIgnoreCase("ABC")); // true

        System.out.println();

        // startsWith() and endsWith() looks at value if it matches a part of string
        System.out.println("abc".startsWith("a")); // true
        System.out.println("abc".startsWith("A")); // false
        System.out.println("abc".endsWith("c")); // true
        System.out.println("abc".endsWith("C")); // false

        // contains() looks matches anywhere in a string
        System.out.println("abc".contains("b")); //true
        System.out.println("abc".contains("B")); //false

        // replace() does a simple search and replace on the string
        System.out.println("abcabc".replace('a', 'A')); // AbcAbc
        System.out.println("abcabc".replace("a", "A")); // AbcAbc

        // trim() removes white space trims the string before & after
        System.out.println("abc".trim()); // abc
        System.out.println("\t    a b c \n".trim()); // a b c


    }
}
