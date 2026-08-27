import java.util.*;

public class numberguesssing {
    public static void main(String[] args){
        Random random = new Random();
        Scanner sc = new Scanner(System.in);


        int guess;
        int attempts = 0;
        int min = 1;
        int max = 10;
        int randomNumber = random.nextInt(min, max+1);

        System.out.println("Number guessing game");
        System.out.print("Guess a number between 1-10 : ");

        do {
            System.out.print("Enter a guess: ");
            guess= sc.nextInt();
            attempts+=1;

            if (guess < randomNumber){
                System.out.println("too low try higher");
            }else if (guess > randomNumber){
                System.out.println("too high try lower");
            }else{
                System.out.println("you cracked it");
                System.out.println("# of attempts: " + attempts);
            }
        }while(guess != randomNumber);

        System.out.println("you have won !!");
        sc.close();
    }
}
