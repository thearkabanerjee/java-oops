import java.util.*;

public class calculator{
  public static void main(String[] args){
    Scanner sc = new Scanner (System.in);
    

    
    double num1, num2;
    double result = 0;
    char operator;
    boolean validOperator = true;

    System.out.println("Enter the first number: ");
    num1 = sc.nextDouble();
   

    System.out.println("enter the operator (+, -, * , /, ^): ");

    operator = sc.next().charAt(0);
    
    System.out.println("Enter the second number: ");
    num2 = sc.nextDouble();

    switch(operator){
      case '+' -> result = (num1+ num2);
      case '-' -> result = (num1 - num2);
      case '*' -> result = (num1 * num2);
      case '/' -> {
        if (num2 == 0){
          System.out.println("cannot divide by 0");
          validOperator = false;
        }else{
          result = num1 / num2;
        }
      }
      case '^' -> result = (Math.pow(num1, num2));
      default -> {
        System.out.println("Invalid operator ! ");
        validOperator = false;
      }
    }


    if (validOperator){
      System.out.println(result);
    }

    
    sc.close(); 
  }
}
