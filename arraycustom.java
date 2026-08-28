import java.util.*;

public class arraycustom {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        String[] foods = new String[3];

        for (int i = 0; i< foods.length; i++){
            System.out.print("enter a food: ");
            foods[i] = sc.nextLine();
        }

        for (String food: foods){
            System.out.println(food);
        }

        sc.close();
    }
}
