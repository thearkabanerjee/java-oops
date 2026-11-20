

class Vehicle {
  protected int speed;

  public Vehicle(int speed) {
    this.speed = speed;
  }

  public void display() {
    System.out.println("Speed: " + speed);
  }
}

class Car extends Vehicle {
  private String model;

  // TODO: Constructor calling super(speed) and setting model
  public Car(int speed, String model) {
    // WRITE YOUR CODE HERE
    super(speed); 
    this.model = model;
  }

  // TODO: Override display() to print "Model: [model]" and then call
  // super.display()
  // WRITE YOUR CODE HERE
  //
  @Override
  public void display() {
    System.out.println("Model: [" + model + "]");
    super.display();
  }

}

public class Main{
  public static void main(String[] args){
    Car car = new Car(29, "porshe");
    car.display();
  } 
}