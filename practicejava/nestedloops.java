package practicejava;

public class nestedloops{
  public static void main(String[] args){

    int a = 3;
    
    for (int i = 0; i < a; i++){
      for (int j = 0; j < 10; j++){
        System.out.print(j + " ");
      }
      System.out.println(); // this makes it change the lines and without this the case is something different
    }
  }
}
