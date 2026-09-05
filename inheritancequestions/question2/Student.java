package inheritancequestions.question2;

public class Student extends Person{
    int rollNo;
    public Student(String name, int rollNo){
        this.rollNo = rollNo;
        this.name = name;
    }

    public void printName(){
        System.out.println("Name: "+ name);
        System.out.println("Roll No: "+ rollNo);
    }
    
}
