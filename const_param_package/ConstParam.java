class MyClass{
    double Leo, Marc;

    MyClass(double l, double m){
        this.Leo = l;
        this.Marc = m;
    }
    
    void _method(){
        double sum = Leo + Marc;
        System.out.println("The sum of Leo and Marc is: " + sum);
    }
}

public class ConstParam{
    public static void main(String[] args){
        MyClass sc = new MyClass(10.0, 11.0);
        sc._method();
    }
}