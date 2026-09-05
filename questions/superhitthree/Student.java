package questions.superhitthree;

public class Student extends Person {
    String name = "child";
    Student(String name, String personname){
        super(personname);
        this.name = name;
    }

    void displayName(){
        System.out.println(this.name);
        System.out.println(super.name);
    }
}
