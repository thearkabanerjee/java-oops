
package practicejava;
import java.util.*;

public class maxtimesprinter{

  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the max number of times you want it to loop : ");

    int max = sc.nextInt();

    for (int i = 0; i <max; i++){
      System.out.println(i);
    }
    
    sc.close();

  }
}
