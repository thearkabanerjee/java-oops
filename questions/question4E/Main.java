package questions.question4E;

public class Main {
    public static void main(String[] args){
        Product product1 = new Product("Laptop", 60000, 2);
        Product product2 = new Product("mobile", 30000, 1);

        System.out.println(product1.getName());
        System.out.println(product2.getName());
        System.out.println(product1.getTotalPrice());
    }
}
