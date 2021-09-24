package LampeOpgave;

public class Lamp {
    // class variables
    private static int lampsMade;

    // attributes
    private boolean isLampOn;
    private int stateChanges;

    // constructor
    public Lamp(){
        isLampOn = false;
        lampsMade++;
    }

    // functions
    public Lamp(boolean state){
        isLampOn = state;
        lampsMade++;
    }

    //toggles isLampOn
    public void pushButton(){
        isLampOn = !isLampOn;
        stateChanges++;
    }

    // get functions
    public static int getLampsMade() {
        return lampsMade;
    }

    public int getStateChanges() {
        return stateChanges;
    }

    public boolean isLampOn() {
        return isLampOn;
    }
}