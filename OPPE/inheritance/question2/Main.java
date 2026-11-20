class Shape {
  protected double area;

  public Shape(double area) {
    this.area = area;
  }

  public double getArea() {
    return area;
  }
}

class Circle extends Shape {
  private double radius;

  // TODO: Write Circle constructor. Pass area to super, set radius.
  public Circle(double radius) {
    // WRITE YOUR CODE HERE (remember super takes area: 3.14 * r * r)
    super(3.14 * radius * radius);
    this.radius = radius;
  }

  // TODO: Override getArea() to call super.getArea() and multiply by 2
  // WRITE YOUR CODE HERE
  //
  @Override
  public double getArea() {
    return super.getArea() * 2;
  }

}

public class Main {
  public static void main(String[] args) {
    Circle c = new Circle(2); // radius = 2
    // super(3.14 * 2 * 2) → Shape.area = 12.56
    // c.radius = 2
    System.out.println(c.getArea()); // super.getArea() = 12.56 → * 2 = 25.12
  }
}
