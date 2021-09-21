package LampeOpgave;

public class Lamp {
    private boolean isLampOn;

    public Lamp(){
        isLampOn = false;
    }

    public Lamp(boolean state){
        isLampOn = state;
    }

    //toggles isLampOn
    public void pushButton(){
        isLampOn = !isLampOn;
    }

    public boolean getIsLampOn() {
        return isLampOn;
    }
}