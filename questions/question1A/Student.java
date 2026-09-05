package questions.question1A;

public class Student {
    private String name;
    private int marks;

    public Student(String name, int marks){
        this.name = name;
        this.marks = marks;
    }

    public String getName(){
        return name;
    }

    public int getMarks(){
        return marks;
    }

    public void setMarks(int score){
        if (marks >=0 && marks <= 100){
            marks = score;
        }
        else {
            System.out.println("invalid marks");
        }
    }
}


