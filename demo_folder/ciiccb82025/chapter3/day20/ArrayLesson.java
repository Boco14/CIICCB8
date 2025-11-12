package demo_folder.ciiccb82025.chapter3.day20;

public class ArrayLesson {
    public void main(String[] args){
        // Creating an Array Primitives
        int [] i = new int[2]; // default element = 0
        int[] numbers2 = new int[]{10,11,12}; // redundant
        int[] numbers3 = {13,14,15}; // anonymous array - proper array
        int[] numAnimals;       int [] numAnimals2;
        int numAnimals3[];      int numAnimals4 [];

        // Object array
        Student[] batch2 = {
                new Student(),
                new Student(),
                new Student(),
                new Student(),
        };

        ArrayType.arrayTypeMethod();
    }

    class Student{
        String fullname;
        int age;
        String address;
        String course;
        int year;
    }

    // Creating an Array with Reference Variables
    String[] strings = {"stringValue"};
    Object[] objects = strings;
    String[] againString = (String[]) objects;
    // againStrings[0] = new StringBuilder(); does not compile
    // objects[0] = new StringBuilder();

    class ArrayType{
        static void arrayTypeMethod(){
            String [] bugs = {"cricket", "beetle", "ladybug"};
            String [] alias = bugs;
            System.out.println(bugs.equals(alias));
            System.out.println(bugs.toString());
        }

    }
}



