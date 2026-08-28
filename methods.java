import java.util.Scanner;


public class methods {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int age = sc.nextInt();
        for (int i = 3; i > 0; i--){
            happybirthday(name, age);
        }
        sc.close();
    }
    public static void happybirthday(String name, int age){
        System.out.println("happy birthday to you");
        System.out.println("happy birthday dear "+ name);
        System.out.printf("you are %d years old\n", age);
        System.out.println("happy birthday to you");
    }
}
