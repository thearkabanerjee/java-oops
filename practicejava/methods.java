package practicejava;
import java.util.Scanner;


public class methods {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int age = sc.nextInt();
        sc.nextLine();
        String firstname = sc.nextLine();
        String lastname = sc.nextLine();
        for (int i = 3; i > 0; i--){
            happybirthday(name, age);
            System.out.println(fullname(firstname, lastname));
        }
        sc.close();
    }
    public static void happybirthday(String name, int age){
        System.out.println("happy birthday to you");
        System.out.println("happy birthday dear "+ name);
        System.out.printf("you are %d years old\n", age);
        System.out.println("happy birthday to you");
    }
    public static String fullname (String first, String last){
        return ("your fullname is " + first + " " + last);
    }


}
