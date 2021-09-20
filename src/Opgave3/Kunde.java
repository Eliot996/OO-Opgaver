package Opgave3;

import java.util.Arrays;

public class Kunde {

    private String kundeID;
    private String mobilnummer;
    private boolean VIP;
    private int bonusPoints = 0;
    private int[] ordrenumre;

    public Kunde(String kundeID, String mobilnummer, boolean VIP){
        this.kundeID = kundeID;
        this.mobilnummer = mobilnummer;
        this.VIP = VIP;
    }

    @Override
    public String toString() {
        return "Kunde {" +
                "kundeID='" + kundeID + '\'' +
                ", mobilnummer='" + mobilnummer + '\'' +
                ", VIP=" + VIP +
                ", ordrenumre=" + Arrays.toString(ordrenumre) +
                ", bounspoints=" + bonusPoints +
                '}';
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

    public int[] getOrdrenumre() {
        return ordrenumre;
    }

    public int getBonusPoints() {
        return bonusPoints;
    }

    public void setBonusPoints(int bonusPoints) {
        this.bonusPoints = bonusPoints;
    }

    public void addBonusPoints(int points){
        bonusPoints += points;
    }

    public void addToOdrenumre(int ordre){
        if (ordrenumre == null) {
            ordrenumre = new int[1];
            ordrenumre[0] = ordre;
        }else{
            int[] placeholder = new int[ordrenumre.length + 1];
            System.arraycopy(ordrenumre, 0, placeholder, 0, ordrenumre.length);
            placeholder[ordrenumre.length] = ordre;

            ordrenumre = placeholder;
        }
    }
}
