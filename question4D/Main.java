package question4D;

public class Main {
    public static void main(String[] args){
        LightBulb bulb = new LightBulb(false);
        System.out.println(bulb.isOn());
        bulb.turnOn();
        System.out.println(bulb.isOn());
        bulb.turnOff();
        System.out.println(bulb.isOn());

    }
}

