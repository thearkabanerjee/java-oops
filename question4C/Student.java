package question4C;

public class Student {
    private String name;
    private double marks;

    Student(String name, double marks){
        this.name = name;
        this.marks = marks;
    }

    public String getName(){
        return name;
    }

    public double getMarks(){
        return marks;
    }

    public void setMarks(double score){
        if (score >= 0  && score <= 100){
            marks = score;
        }
        else {
            System.out.println("invalid score");
        }
        
    }
}
