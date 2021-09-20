package Opgave1;

public class Test {

    public static void main(String[] args) {
        Kunde kunde1 = new Kunde("001", "47388810");
        System.out.println("kundeID: " + kunde1.getKundeID());
        System.out.println("mobilnummer: " + kunde1.getMobilnummer());
        System.out.println();

        kunde1.setKundeID("002");
        System.out.println("kundeID: " + kunde1.getKundeID());

        kunde1.setMobilnummer("28578810");
        System.out.println("mobilnummer: " + kunde1.getMobilnummer());

    }
}
