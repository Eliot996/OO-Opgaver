package Opgave3;

public class Test {

    public static void main(String[] args) {
        // make new Kunder
        Kunde kunde1 = new Kunde("001", "47388810", true);


        // print attributes for kunde 1
        System.out.print("Kunde 1 = ");
        System.out.println(kunde1);
        System.out.println();

        // add to ordrenumre for kunde 1
        for (int i = 10; i > 0; i--) {
            kunde1.addToOdrenumre(i);
        }
        kunde1.addToOdrenumre(22);

        // print attributes for kunde 1
        System.out.print("Kunde 1 = ");
        System.out.println(kunde1);
        System.out.println();

    }
}
