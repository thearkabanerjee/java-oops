import java.util.Scanner;


public class methods {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        for (int i = 3; i > 0; i--){
            happybirthday(name);
        }
        sc.close();
    }
    public static void happybirthday(String name){
        System.out.println("happy birthday to you");
        System.out.println("happy birthday to you");
        System.out.println("happy birthday dear "+ name);
        System.out.println("happy birthday to you");
    }
}
