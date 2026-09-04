package practicejava;
import java.util.*;

public class switchcase{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String weekday = sc.nextLine();

        switch(weekday){
            case "Monday" -> System.out.println("it is a weekday");
            case "Tuesday" -> System.out.println("it is not a weekday");
        }
        System.out.println("the day of the week we predicted is ~ "+ weekday );

        sc.close();
    }
}
