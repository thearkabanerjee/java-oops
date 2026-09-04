public class twodarrays {
    public static void main(String[] args){
        String[] fruits = {"apple", "orange", "banana"};
        String[] vegetables = {"potato", "onion", "carrot"};
        String[][] groceries = { fruits, vegetables};

        for (String[] foods: groceries){
            System.out.println(foods);
        }
    }
}
