package question1A;

public class Main {
    public static void main(String[] args){
        Student s = new Student("Arka", 85);

        System.out.println(s.getName());
        System.out.println(s.getMarks());

        s.setMarks(95);
        System.out.println(s.getMarks());
    }
}

