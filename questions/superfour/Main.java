package questions.superfour;

public class Main {
    public static void main(String[] args){
        Puppy puppy = new Puppy("Animal", "Golden Retriever", "Bruno");

        System.out.println("type: "+ puppy.type);
        System.out.println("breed: "+ puppy.breed);
        System.out.println("name: " + puppy.name);
    }
}

