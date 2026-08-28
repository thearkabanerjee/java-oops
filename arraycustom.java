import java.util.*;

public class arraycustom {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("what is the length of the array you want ? : ");
        int a = sc.nextInt();
        sc.nextLine();
        String[] foods = new String[a];

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
