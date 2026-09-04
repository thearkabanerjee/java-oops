package practicejava;


import java.util.*;

public class username {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // username must be between 4-12 characters
        // username must not contain any spaces or underscores
        
        System.out.print("enter your username: ");

        String name = sc.nextLine();
        boolean result = false;

        for (int i = 0; i < name.length(); i++){
            if (name.charAt(i) != ' '  &&  name.length() >= 4 && name.length() <= 12 ){
                // System.out.println("you can use this username");
                result = true;
            }
        }
        if (result) {
            System.out.println("you can use this username");
        }
        else{
            System.out.println("you cannot use this username");
        }

        sc.close();
    }
}
