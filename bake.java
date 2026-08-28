
public class bake{
    public static void main(String[] args){
        String bread = "flat bread";
        String cheese = "mozarella";
        String topping= "pepperoni";
        System.out.println(bakepizza(bread, cheese, topping));
    }

    static String bakepizza(String bread){
        return (bread + " pizza");
    }

    static String bakepizza(String bread, String cheese){
        return (cheese + " " + bread + " pizza");
    }

    static String bakepizza(String bread, String cheese, String topping){
        return (cheese + " "+ topping +" "+ bread  + " pizza");
    }

}