package Opgave2;

public class Test {

    public static void main(String[] args) {
        // make new Kunder
        Kunde kunde1 = new Kunde("001", "47388810", true);
        Kunde kunde2 = new Kunde("003", "44332211", false);


        // print attributes for kunde 1
        System.out.println("Kunde 1");
        System.out.println("kundeID: " + kunde1.getKundeID());
        System.out.println("mobilnummer: " + kunde1.getMobilnummer());
        System.out.println("VIP: " + kunde1.getVIP());
        System.out.println();

        // print attributes for kunde 2
        System.out.println("Kunde 2");
        System.out.println("kundeID: " + kunde2.getKundeID());
        System.out.println("mobilnummer: " + kunde2.getMobilnummer());
        System.out.println("VIP: " + kunde2.getVIP());
        System.out.println();

        // change kunde1 VIP status
        kunde1.setVIP(false);

        // change kunde2 VIP status
        kunde2.setVIP(true);

        // print attributes for kunde 1
        System.out.println("Kunde 1");
        System.out.println("VIP: " + kunde1.getVIP());
        System.out.println();

        // print attributes for kunde 2
        System.out.println("Kunde 2");
        System.out.println("VIP: " + kunde2.getVIP());
        System.out.println();

    }
}
