package methodoverriding.example1;

public class Puppy extends Animal {
    String breed;
    Puppy(String type ,String breed){
        super(type);
        this.breed = breed;
    }

    @Override 
    void show(){
        
        System.out.println(breed);
    }
}
