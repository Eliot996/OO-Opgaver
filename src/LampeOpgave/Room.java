package LampeOpgave;

public class Room {
    public static void main(String[] args) {
        // making new lamps
        Lamp skrivebordslampe = new Lamp(),
                sengelampe = new Lamp(true),
                loftlampe = new Lamp();

        // printing status
        System.out.println("Er skrivebordslampe tændt?: " + skrivebordslampe.getIsLampOn());
        System.out.println("Er sengelampe tændt?: " + sengelampe.getIsLampOn());
        System.out.println("Er sengelamloftLampepe tændt?: " + loftlampe.getIsLampOn());

        // toggling sengelampe
        System.out.println("Slukker sengelampe....");
        sengelampe.pushButton();
        System.out.println("Er sengelampe tændt?: " + sengelampe.getIsLampOn());
    }
}