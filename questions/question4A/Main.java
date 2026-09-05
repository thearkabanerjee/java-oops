package questions.question4A;

public class Main {
    public static void main(String[] args){
        MobilePhone mobilephone = new MobilePhone("Samsung", 50000);
        
        System.out.println(mobilephone.getBrand());
        System.out.println(mobilephone.getPrice());
    }
}
