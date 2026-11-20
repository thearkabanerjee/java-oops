class Employee {
  protected double salary;

  public Employee(double salary) {
    this.salary = salary;
  }

  public double calcBonus(double percent) {
    return (percent / 100.0) * salary;
  }

  public void printDetails() {
    System.out.println("Salary: " + salary);
  }
}

class Manager extends Employee {
  private double allowance;

  // TODO: Constructor calling super(salary) and setting allowance
  public Manager(double salary, double allowance) {
    // WRITE YOUR CODE HERE
    super(salary);
    this.allowance = allowance;

  }

  // TODO: Overload printDetails to take a String title
  // It should print the title, then call super.printDetails(), then print
  // allowance
  public void printDetails(String title) {
    // WRITE YOUR CODE HERE
    //
    System.out.println(title);
    super.printDetails();
    System.out.println(allowance);

  }
}

public class Main {
  public static void main(String[] args) {

  }
}
