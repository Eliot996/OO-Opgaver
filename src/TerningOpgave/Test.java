package TerningOpgave;

public class Test {
    public static void main(String[] args) {

        /*Dice dice = new Dice();
        for (int i = 0; i < 100; i++) {
            dice.roll();
            System.out.println(dice.getFaceValue());
        }
        System.out.printf("%n%n%n%n");
         */

        int total = 0;

        // make array of Dice and populate
        Die[] dice = new Die[5];

        for (int i = 0; i < dice.length; i++) {
            dice[i] = new Die();
        }

        System.out.println("Rolling dice....");
        for (Die die : dice) {
            die.roll();
        }

        System.out.println("Calculating total....");
        for (Die die : dice) {
            total += die.getFaceValue();
        }

        System.out.println("The total of the dice faces: " + total);
    }

}
