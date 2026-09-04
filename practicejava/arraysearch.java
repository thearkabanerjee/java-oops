package practicejava;
public class arraysearch {
    public static void main(String[] args){
        int[] numbers = {1, 9, 3, 4, 2, 8, 5, 42};
        int target = 42;
        boolean found = false;
        int index = 0;


        for (int i = 0; i < numbers.length; i++){
            if (numbers[i] == target){
                found =true;
                index = i;
            }
        }

        if (found){
            System.out.println("found in the array");
            System.out.println("the index is "+ index);
        }else{
            System.out.println("not in the array");
        }
    }
}
