package practicejava;

public class variablescope {
    static int x = 3; // class

    public static void main(String[] args){
        int x = 1; // local variable
        System.out.println(x); // prints the value 1 
        dosomething(); // prints the value 2
        printValue(); // prints the global variable 
    }

    static void dosomething(){
        int x = 2; // local variable
        System.out.println(x);
    }

    static void printValue(){
        System.out.println(x);
    }
}
