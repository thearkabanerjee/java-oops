package questions.superitwo;

public class Main {
    public static void main(String[] args){
        Manager manager = new Manager("Arka", 50000, "Engineering");
        System.out.println("name: " + manager.name);
        System.out.println("salary: "+ manager.salary);
        System.out.println("department: "+ manager.department);

    }
}
