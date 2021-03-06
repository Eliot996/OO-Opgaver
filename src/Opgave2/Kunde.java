package Opgave2;

public class Kunde {

    private String kundeID;
    private String mobilnummer;
    private boolean VIP;
    private int bonusPoint = 0;

    public Kunde(String kundeID, String mobilnummer, boolean VIP){
        this.kundeID = kundeID;
        this.mobilnummer = mobilnummer;
        this.VIP = VIP;
    }

    public String getKundeID() {
        return kundeID;
    }

    public void setKundeID(String kundeID) {
        this.kundeID = kundeID;
    }

    public String getMobilnummer() {
        return mobilnummer;
    }

    public void setMobilnummer(String mobilnummer) {
        this.mobilnummer = mobilnummer;
    }

    public Boolean getVIP(){
        return VIP;
    }

    public void setVIP(boolean VIP) {
        this.VIP = VIP;
    }

    public int getBonusPoint() {
        return bonusPoint;
    }

    public void setBonusPoint(int bonusPoint) {
        this.bonusPoint = bonusPoint;
    }

    public void addBonusPoints(int points){
        bonusPoint += points;
    }
}
