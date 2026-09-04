package question4D;

public class LightBulb {
    private boolean isOn;

    public LightBulb(boolean isOn){
        this.isOn = isOn;
    }

    public void turnOn(){
        isOn = true;
    }
    public void turnOff(){
        isOn = false;
    }
    
    public boolean isOn(){
        return (this.isOn);
    }

}
