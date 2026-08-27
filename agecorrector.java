import java.util.*;

public class agecorrector {
    public static void main(String[] args){

        int age = 0;

        Scanner sc = new Scanner(System.in);

        age = sc.nextInt();
        

        while(age <= 0){
            System.out.println("your age cant be negative");
            System.out.print("reenter your age: ");
            age = sc.nextInt();
        }
        System.out.println("you are "+ age + " years old");

        sc.close();
    }
}
