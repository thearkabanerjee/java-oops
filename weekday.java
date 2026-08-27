import java.util.*;

public class weekday{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String weekday = sc.nextLine();
        

        switch(weekday){
            case "Monday", "Tuesday", "Wednesday", "Thursday" -> System.out.println("it is a weekday");
            case "Friday" -> System.out.println("weekend is almost here");
            case "Saturday", "Sunday" -> System.out.println("it is weekend");
            default -> System.out.println(weekday + "? this is not a day");
        }
        sc.close();
    }
}