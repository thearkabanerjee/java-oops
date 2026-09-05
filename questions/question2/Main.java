package questions.question2;

public class Main {
    public static void main(String args[]){
        Car car1 = new Car();
        Car car2 = new Car();


        car1.brand ="Toyota";
        car1.year = 2025;
        car1.model = "GR GT";

        car2.brand = "Porshe";
        car2.model = "911 gt3rs";
        car2.year = 2003;

        System.out.println(car1.brand + "," + car1.model + "," + car1.year);
        System.out.println(car2.brand + "," + car2.model + "," + car2.year);

        
    }
}
