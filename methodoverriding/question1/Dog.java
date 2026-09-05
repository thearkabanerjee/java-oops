package methodoverriding.question1;

public class Dog extends Animal{
    String breed;
    Dog(String type , String breed){
        super(type);
        this.breed = breed;
    }
    @Override 
    void show(){
        super.show();
        System.out.println("Breed: "+ breed);
    }
}
