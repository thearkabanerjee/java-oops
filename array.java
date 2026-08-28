import java.util.Arrays;

public class array {
    public static void main(String[] args){


        String[] fruits = {"apple", "orange", "banana", "coconut"};
        fruits[0] = "new-apple";

        Arrays.sort(fruits);
        // Arrays.fill(fruits, "pineapple"); // replaces everything with pineapple

        for (String fruit : fruits){
        System.out.print(fruit + " ");
        }
        System.out.println();
    }
}

