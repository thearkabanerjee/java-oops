package methodoverriding.question5;

public class Director extends Manager{
    int level;
    Director(String name, String department, int level){
        super(name, department);
        this.level = level;
    }

    @Override 
    void show(){
        super.show();
        System.out.println("Level: "+ level);
    }

}
