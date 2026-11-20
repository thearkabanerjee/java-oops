class Animal {
  protected String name;

  public Animal(String name) {
    this.name = name;
  }

  public String makeSound() {
    return "Some sound";
  }
}

class Dog extends Animal {
  private String breed;

  // TODO: Write Dog constructor here. Call super(name) and set breed.
  public Dog(String name, String breed) {
    // WRITE YOUR CODE HERE
    super(name);
    this.breed = breed;

  }

  // TODO: Override makeSound() to return "Bark"
  // WRITE YOUR CODE HERE
  @Override
  public String makeSound() {
    return "Bark";
  }

}

public class Main {

  public static void main(String[] args) {
    Dog d = new Dog("Rex", "Labrador");
    System.out.println(d.makeSound()); // Bark
  }
}
