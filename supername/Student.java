package supername;

public class Student extends Person {
    double gpa;

    Student(String first, String last, double gpa){
        super(first, last);
        this.first = first;
        this.last = last;

        this.gpa = gpa;
    }

    double displayGpa(){
        return (gpa);
    }
}
