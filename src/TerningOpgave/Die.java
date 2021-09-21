package TerningOpgave;

public class Die {
    private int faceValue;

    public Die(){
        this.roll();
    }

    public void roll(){
        faceValue = (int) Math.ceil(Math.random()*6);
    }

    public int getFaceValue() {
        return faceValue;
    }

}
