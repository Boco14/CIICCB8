public class quiz {
    public static void main(String[] args) {
        /*int a = 0;
        while(a++ < 10) {}
        String message = a > 10 ? "Greater than" : "false"; // false was not string
        System.out.println(message+","+a);


        long x = 10;
        int y = (int)(2 * x); // casting
        System.out.println(y);

        java.util.List<Integer> list = new java.util.ArrayList<Integer>();
        list.add(10);
        list.add(14);
        for(int i : list) {
            System.out.println(i + ", ");
            break;
        }

        int c = 4;
        long d = x * 4 - x++;
        if(d<10) System.out.println("Too Low");
        else System.out.println("Just right");
        else System.out.println("Too High");

        int e = 5;
        System.out.println(e > 2 ? e < 4 ? 10 : 8 : 7);

        boolean x = true, z = true;
        int y = 20;
        x = (y != 10) ^ (z=false);
        System.out.println(x+", "+y+", "+z);

        for(int i=0; i<10 ; ) {
            i = i++;
            System.out.println("Hello World");
            }

        byte a = 40, b = 50;
        byte sum = (byte) a + b;
        System.out.println(sum);
        int x = 5 * 4 % 3;
        System.out.println(x);

        int x = 0;
        String s = null;
        if(x == s) System.out.println("Success");// different data types
        else System.out.println("Failure");

        int x1 = 50, x2 = 75;
        boolean b = x1 >= x2;
        if(b = true) System.out.println("Success"); // assignment(=) != comparison(==)
        else System.out.println("Failure");

        int c = 7;
        int result = 4;
        result += ++c; // add first and then use - result = result + 8;
        System.out.println(result); // result = 12;

        int x = 1, y = 15;
        while x < 10
        y––;
        x++;
        System.out.println(x+", "+y);

        do {
            int y = 1;
            System.out.print(y++ + " ");
            } while(y <= 10);

        boolean keepGoing = true;
        int result = 15, i = 10;
        do {
            i--;
            if(i==8) keepGoing = false;
            result -= 2;
            } while(keepGoing);
        System.out.println(result);

        int count = 0;
        ROW_LOOP: for(int row = 1; row <=3; row++)
            for(int col = 1; col <=2 ; col++) {
            if(row * col % 2 == 0) continue ROW_LOOP;
            count++;
            }
        System.out.println(count);

        int m = 9, n = 1, x = 0;
        while(m > n) {
            m--;
            n += 2;
            x += m + n;
            }
        System.out.println(x);

        final char a = 'A', d = 'D';
        char grade = 'B';
        switch(grade) {
            case a:
                case 'B': System.out.print("great");
                case 'C': System.out.print("good"); break;
            case d:
                case 'F': System.out.print("not good");
                }

        long x = 10;
        int y = (int)(2 * x);
        System.out.println(y);
        */

        int m = 9, n = 1, x = 0;
        while(m > n) {
            m--;
            n += 2;
            x += m + n;
        }
        System.out.println(x);


    }
}
