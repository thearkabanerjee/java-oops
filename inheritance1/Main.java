package inheritance1;
public class Main {
    public static void main(String[] args){
        Dog dog = new Dog();
        Cat cat = new Cat();
        cat.eat();
        dog.eat();

        System.out.println(dog.lives);
        System.out.println(cat.lives);


        dog.speak();cat.speak();
    }
}
