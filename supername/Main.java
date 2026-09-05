package supername;

public class Main {
    public static void main(String[] args){
        Person person = new Person("Arka", "Banerjee");
        Student student = new Student("Harry", "Potter", 3.5);
        
        student.showName();
        
        person.showName();
        // System.out.println(student.gpa);
        System.out.println("gpa: "+student.displayGpa());
    }
}
