import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // Write your solution here
    int a = sc.nextInt();
    double positive = 0;
    double negative = 0;
    double countp = 0;
    double countn = 0;

    for (int i = 0; i < a; i++) {
      double var = sc.nextDouble();

      if (var > 0) {
        positive += var;
        countp += 1;
      } else {
        negative += var;
        countn += 1;
      }
    }

    double result1 = (positive / countp);
    double result2 = (negative / countn);

    System.out.println(result1);
    System.out.println(result2);
  }
}
