public class logicaloperators {
    // there are a few logical operators -> && , || and !


    // these are the basic

    public static void main(String[] args){
        double temp = 20;
        boolean isSunny = true;

        if (temp <= 30 && temp >= 0 && isSunny){
            System.out.println("the weather is GOOD");
            System.out.println("it is sunny outside");
        }

        else if (temp <= 30 && temp >= 0 && !isSunny){
          System.out.println("the weather is GOOD");
          System.out.println("it is cloudy outside");
        } 

        else if (temp > 30 || temp < 0) {
          System.out.println("the weather is bad");
        }
    }
}
