package LampeOpgave;

public class Room {
    public static void main(String[] args) {
        // making new lamps
        Lamp skrivebordslampe = new Lamp(),
                sengelampe = new Lamp(true),
                loftlampe = new Lamp();

        System.out.println("Lamps made: " + Lamp.getLampsMade());

        // printing status
        System.out.println("Er skrivebordslampe tændt?: " + skrivebordslampe.isLampOn());
        System.out.println("Er sengelampe tændt?: " + sengelampe.isLampOn());
        System.out.println("Er loftLampe tændt?: " + loftlampe.isLampOn());

        // toggling sengelampe
        System.out.println(sengelampe.getStateChanges());
        System.out.println("Slukker sengelampe....");
        sengelampe.pushButton();
        System.out.println(sengelampe.getStateChanges());
        System.out.println("Er sengelampe tændt?: " + sengelampe.isLampOn());
    }
}