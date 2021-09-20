package Opgave1;

public class Test {

    public static void main(String[] args) {
        // make new Kunde
        Kunde kunde1 = new Kunde("001", "47388810");

        // print attributes
        System.out.println("kundeID: " + kunde1.getKundeID());
        System.out.println("mobilnummer: " + kunde1.getMobilnummer());
        System.out.println();

        // change kundeID and print
        kunde1.setKundeID("002");
        System.out.println("kundeID: " + kunde1.getKundeID());

        // change mobilnummer and print
        kunde1.setMobilnummer("28578810");
        System.out.println("mobilnummer: " + kunde1.getMobilnummer());

    }
}
