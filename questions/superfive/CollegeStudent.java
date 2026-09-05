package questions.superfive;

public class CollegeStudent extends Student{
    String college;
    CollegeStudent(String name, int rollNo, String college){
        super(name, rollNo);
        this.college = college;
    }

    void showCollege(){
        System.out.println("college: "+ college);
    }
}
