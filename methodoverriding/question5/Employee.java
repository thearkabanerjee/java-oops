package methodoverriding.question5;

public class Employee {
    String name;
    Employee(String name){
        this.name = name;
    }
    void show(){
        System.out.println("Employee: "+name);
    }
}
