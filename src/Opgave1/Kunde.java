package Opgave1;

public class Kunde {

    private String kundeID;
    private String mobilnummer;

    public Kunde(String kundeID, String mobilnummer){
        this.kundeID = kundeID;
        this.mobilnummer = mobilnummer;
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
}
