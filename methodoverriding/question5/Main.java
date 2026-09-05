package methodoverriding.question5;

public class Main {
    public static void main(String[] args){
        Director d = new Director("Rahul", "Engineering", 3);
        d.show();

        Employee e = new Director("Priya", "Marketing", 5);
        e.show();

    }
}
