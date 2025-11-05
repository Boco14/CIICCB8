package programming_challenge;

public class MultiplicationTable {
    public static void main(String[] args) {
        int y = 10;
        for (int x = 1; x <= 10; x++){
            int result = x * y;
            System.out.println(x + " * " + y + " = " + result);
        }
    }
}
