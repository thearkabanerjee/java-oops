package questions.superfive;

public class Student extends Person {
    int rollNo;
    Student(String name,int rollNo){
        super (name);
        this.rollNo = rollNo;
    }

    void showStudent(){
        System.out.println("Roll no: "+ rollNo);
    }
}
