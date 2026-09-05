package methodoverriding.question1;

public class Animal {
    String type;
    
    Animal(String type){
        this.type = type;
    }

    void show(){
        System.out.println("Animal:" + type);
    }
}
