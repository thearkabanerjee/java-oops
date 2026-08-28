public class array {
    public static void main(String[] args){


        String[] fruits = {"apple", "orange", "banana", "coconut"};
        fruits[0] = "new-apple";

        for (int i = 0; i < fruits.length; i++){
            System.out.print(fruits[i]+ " ");
            
        }
        System.out.println();
    }
}
