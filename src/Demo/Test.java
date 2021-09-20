package Demo;

public class Test {

    public static void main(String[] args) {

        Kunde testKunde = new Kunde("mathias", "GBG 17");
        String adr = testKunde.getAdresse();
        System.out.println(adr);

    }
}
