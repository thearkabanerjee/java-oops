public class vargs {
    public static void main(String[] args){
        // varargs = allow a method to accept a varying number of arguments
        System.out.println(add(1, 2,3, 4));
    }
    static int add(int... numbers){
        int sum = 0;
        for (int i = 0; i < numbers.length; i++){
            sum += numbers[i]; // even a normal loop works , no advanced loops only needed 
        }
        return sum; 
    }
}


// varargs is very important , used incase one needs to change up the number of arguments they want to put in
// better than overloaded methods