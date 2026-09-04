public class overloadedmethods {
   // overloaded methods = methods that share the same name, but different parameters 
   // signature = name +parameters
   public static void main(String[] args){
    System.out.println(add(1, 2, 3));

   }

   static double add(double a, double b){
    return a+b; // different signature
   }
   static double add(double a, double b, double c){
    return a+b+c; // different signature
   }
}
