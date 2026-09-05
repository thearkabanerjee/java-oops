package methodoverriding.question3;

public class Puppy extends Dog{
    String name;
    Puppy(String type, String breed, String name){
        super(type, breed);
        this.name= name;
    }

    @Override 
    void show(){
        super.show();
        System.out.println("Name: "+ name);
    }
}
