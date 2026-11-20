import java.util.Scanner;

class Faculty {
  private String name;
  private double salary;

  public Faculty(String name, double salary) {
    this.name = name;
    this.salary = salary;
  }

  public double bonus(float percent) {
    return (percent / 100.0) * salary;
  }

  // define method getDetails
  public String getDetails() {
    return (this.name + ", " + this.salary);
  }

  // override method getDetails(float percent)
  public String getDetails(float percent) {
    return (this.name + ", " + this.salary + ", " + "bonus = " + bonus(percent));
  }

}

class Hod extends Faculty {
  private String personalAssistant;

  public Hod(String name, double salary, String pa) {
    super(name, salary);
    this.personalAssistant = pa;
  }

  // override method bonus(float percent)
  public double bonus (float percent){
    return super(bonus) / 2;
  }

  // override method getDetails
  public String getDetails(){
    return (this.name , this.salary, this.personalAssistant);
  }

  // override method getDetails(float percent)
  public String getDetails(float percent){
    return (this.name, this.salary, this.personalAssistant, bonus(percent));
  }
}

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Faculty obj1 = new Faculty(sc.next(), sc.nextDouble());
    Faculty obj2 = new Hod(sc.next(), sc.nextDouble(), sc.next());
    System.out.println(obj1.getDetails());
    System.out.println(obj1.getDetails(10));
    System.out.println(obj2.getDetails());
    System.out.println(obj2.getDetails(10));
  }
}
