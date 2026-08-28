public class arraysearch {
    public static void main(String[] args){
        int[] numbers = {1, 9, 3, 4, 2, 8, 5, 42};
        int target = 42;
        boolean found = false;


        for (int i = 0; i < numbers.length; i++){
            if (numbers[i] == target){
                found =true;
            }
        }

        if (found){
            System.out.println("found in the array");
        }else{
            System.out.println("not in the array");
        }
    }
}
