package questions.superitwo;

public class Manager extends Employee{
    String department;

    Manager(String name, int salary, String department){
        super(name, salary);
        this.department = department;
    }
}
