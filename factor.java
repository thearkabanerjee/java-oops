import java.util.Scanner;

public class factor{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(factorial(a));
        sc.close();

    }
    public static int factorial(int a){
        int multiple = 1;
        int i = 1;
        while (i <= a){
            multiple *= i;
            i += 1;
        }
        return multiple;
    }
}