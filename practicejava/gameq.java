import java.util.*;


public class gameq{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    // while the response is not Q , the game doesnt quit
    String response = "";


    while (!response.equals("Q")){
      System.out.println("game continues");
      System.out.println("press Q to quit the game");
      response = sc.next().toUpperCase();
    }

    System.out.println("MESSAGE: game is finished");

    sc.close();
  }
}
