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

        String string = "animals";
        char[] chars = new char[4]; // make space

        System.out.println(string.length()); // 7
        string.getChars(0, 3, chars, 0);
        // 0 - srcBegin
        // 3 - srcEnd
        // char - assign to the char[]
        System.out.println(chars);
        /*
        int[] array = {1,2,3,4,5};

        for(int x : array){
            for(int y : array){
                System.out.print(y + "c ");
            }
            System.out.println(x + "r ");
        }
        */
    }
}
