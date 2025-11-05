package programming_challenge;

public class StringMethods {
    public static void main(String[] args) {
        String name = new String("Leo Marc Boco");

//        1. Find and print the length of the string.
        System.out.println("The length() of the String " + name + " is: " + name.length() + "\n");

//        2. Convert the string to uppercase and print it.
        System.out.println("The toUpperCase() string method \nconverts the string " + name + " to uppercase \nOutput: " + name.toUpperCase() + "\n");

//        3. Convert the string to lowercase and print it.
        System.out.println("The toLowerCase() string method \nconverts the string " + name + " to lowercase \nOutput: " + name.toLowerCase() + "\n");

//        4. Print the first character of the string.
        System.out.println("Print the first character of the string. " + name.charAt(0) + "\n");

//        5. Print the last character of the string.
        System.out.println("Print the last character of the string. " + name.charAt(name.length() - 1) + "\n");

//        6. Print the substring starting from the second character to the fifth character of the string
        System.out.println("Substring of second and fifth character are: " + name.substring(1, 4) + "\n");
    }
}
