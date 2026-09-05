package methodoverriding.question5;

public class Manager extends Employee {
    String department;
    Manager(String name, String department){
        super(name);
        this.department = department;
    }

    @Override 
    void show(){
        super.show();
        System.out.println("Department: " + department);
    }
}
