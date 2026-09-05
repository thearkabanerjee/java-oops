package methodoverriding.question2;

public class Student extends Person{
    int roll;
    Student(String name, int roll){
        super(name);
        this.roll = roll;
    }

    @Override 
    void show(){
        super.show();
        System.out.println("Roll: "+ roll);
    }
}
