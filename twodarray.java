public class twodarray {
    public static void main(String[] args){
        String[][] groceries = {{"apple", "pinapple", "watermelon"}, {"potato", "onion", "carrot"}};
        groceries[0][1] = "banana"; // pineapple got changed to banana
        System.out.println(groceries[1][2]);
        System.out.println(groceries[0][1]);
    }
}
