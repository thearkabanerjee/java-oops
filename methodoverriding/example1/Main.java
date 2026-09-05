package methodoverriding.example1;

public class Main {
    public static void main(String[] args){
        Puppy puppy = new Puppy("dog", "retriver");
        puppy.show();
        // puppy.super.show();
    }
}
