package KageOpgaveV2;

public class Cake {
    private final double BUTTER_PER_PORTION_GRAMS = 17.5;
    private final double KCAL_PER_GRAM_OF_BUTTER = 7.47;
    private final double SUGAR_PER_PORTION_GRAMS = 15;
    private final double KCAL_PER_GRAM_OF_SUGAR = 4;
    private final double VANILLA_SUGAR_PER_PORTION_TEASPOONS = 0.2;
    private final double GRAMS_PER_TEASPOON_VANILLA_SUGAR = 3.5;
    private final double KCAL_PER_GRAM_OF_VANILLA_SUGAR = 4.02;
    private final double EGGS_PER_PORTION = 0.3;
    private final double GRAMS_PER_EGG = 54;
    private final double KCAL_PER_GRAM_OF_EGG = 1.55;
    private final double WHEAT_FLOUR_PER_PORTION_GRAMS = 15;
    private final double KCAL_PER_GRAM_OF_WHEAT_FLOUR = 3.5;
    private final double BAKING_POWDER_PER_PORTION_TEASPOONS = 0.15;
    private final double GRAMS_PER_BAKING_POWDER = 5;
    private final double KCAL_PER_GRAM_OF_BAKING_POWDER = 1.72;
    private final double MILK_PER_PORTION_GRAMS = 5;
    private final double KCAL_PER_GRAM_OF_MILK = 3.5; //Skummetmælk
    private final double ESSENCE_OF_ALMOND_PER_PORTION_TEASPOONS = 0.2;
    private final double GRAMS_PER_TEASPOON_ESSENCE_OF_ALMOND = 5;
    private final double KCAL_PER_GRAM_OF_ESSENCE_OF_ALMOND = 4.9;
    private final double GREEN_FOOD_COLORING_PER_PORTION_TEASPOONS = 0.4;
    private final double GRAMS_PER_TEASPOON_GREEN_FOOD_COLORING = 5;
    private final double KCAL_PER_GRAM_OF_GREEN_FOOD_COLORING = 0.01;
    private final double BAKING_FACTOR = 0.9;

    private int portions;

    private double butter, sugar, vanillaSugar, vanillaSugarGrams, eggs, eggsGrams, wheatFlour, bakingPowder,
            bakingPowderGrams, milk, essenceOfAlmond, essenceOfAlmondGrams, greenFoodColoring,
            greenFoodColoringGrams, totalWeightOfIngredients, estimatedFinishedWeight, totalCalories,
            caloriesPerPortion;

    public Cake(){

    }

    public void calculateindgridientAmounts(int portions){
        this.portions = portions;
        butter = BUTTER_PER_PORTION_GRAMS * portions;
        sugar = SUGAR_PER_PORTION_GRAMS * portions;
        vanillaSugar = VANILLA_SUGAR_PER_PORTION_TEASPOONS * portions;
        vanillaSugarGrams = vanillaSugar * GRAMS_PER_TEASPOON_VANILLA_SUGAR;
        eggs = Math.round(EGGS_PER_PORTION * portions);
        eggsGrams = eggs * GRAMS_PER_EGG;
        wheatFlour = WHEAT_FLOUR_PER_PORTION_GRAMS * portions;
        bakingPowder = BAKING_POWDER_PER_PORTION_TEASPOONS * portions;
        bakingPowderGrams = bakingPowder * GRAMS_PER_BAKING_POWDER;
        milk = MILK_PER_PORTION_GRAMS * portions;
        essenceOfAlmond = ESSENCE_OF_ALMOND_PER_PORTION_TEASPOONS * portions;
        essenceOfAlmondGrams = essenceOfAlmond * GRAMS_PER_TEASPOON_ESSENCE_OF_ALMOND;
        greenFoodColoring = GREEN_FOOD_COLORING_PER_PORTION_TEASPOONS * portions;
        greenFoodColoringGrams = greenFoodColoring * GRAMS_PER_TEASPOON_GREEN_FOOD_COLORING;
    }

    public void calculateTotalWeigth(){
        totalWeightOfIngredients = butter +
                sugar +
                vanillaSugarGrams +
                eggsGrams +
                wheatFlour +
                bakingPowderGrams +
                milk +
                essenceOfAlmondGrams +
                greenFoodColoringGrams;
    }

    public void calculateEstimatedFinishedWeight(){
        estimatedFinishedWeight = totalWeightOfIngredients * BAKING_FACTOR;
    }

    public void calculateTotalKCAL() {
        totalCalories = (butter * KCAL_PER_GRAM_OF_BUTTER) +
                (sugar * KCAL_PER_GRAM_OF_SUGAR) +
                (vanillaSugarGrams * KCAL_PER_GRAM_OF_VANILLA_SUGAR) +
                (eggsGrams * KCAL_PER_GRAM_OF_EGG) +
                (wheatFlour * KCAL_PER_GRAM_OF_WHEAT_FLOUR) +
                (bakingPowderGrams * KCAL_PER_GRAM_OF_BAKING_POWDER) +
                (milk * KCAL_PER_GRAM_OF_MILK) +
                (essenceOfAlmondGrams * KCAL_PER_GRAM_OF_ESSENCE_OF_ALMOND) +
                (greenFoodColoringGrams * KCAL_PER_GRAM_OF_GREEN_FOOD_COLORING);
    }

    public void calculateKCALPerPortions(){
        caloriesPerPortion = totalCalories / portions;
    }

    public void printAmounts(){
        System.out.printf("You need the following to make %d portions %n", portions);
        System.out.printf("Butter:              %.0f grams%n", butter);
        System.out.printf("Sugar:               %.0f grams%n", sugar);
        System.out.printf("vanilla sugar:       %.0f teaspoons%n", vanillaSugar);
        System.out.printf("Eggs:                %.0f whole eggs%n", eggs);
        System.out.printf("WheatFlour:          %.0f grams%n", wheatFlour);
        System.out.printf("Baking Powder:       %.0f teaspoons%n", bakingPowder);
        System.out.printf("Milk:                %.0f grams%n", milk);
        System.out.printf("Essence of Almond:   %.0f teaspoons%n", essenceOfAlmond);
        System.out.printf("Green food coloring: %.0f teaspoons%n%n", greenFoodColoring);
    }

    public void printInfo(){
        System.out.printf("Total weight of ingredients: %.1f grams %n", totalWeightOfIngredients);
        System.out.printf("The estimated weight of the finished cake is: %.1f grams %n", estimatedFinishedWeight);
        System.out.printf("The cake has a total of %.1f Kcal or %.1f per portion %n", totalCalories, caloriesPerPortion);
    }

    @Override
    public String toString() {
        return "Cake{" +
                "BUTTER_PER_PORTION_GRAMS=" + BUTTER_PER_PORTION_GRAMS +
                ", KCAL_PER_GRAM_OF_BUTTER=" + KCAL_PER_GRAM_OF_BUTTER +
                ", SUGAR_PER_PORTION_GRAMS=" + SUGAR_PER_PORTION_GRAMS +
                ", KCAL_PER_GRAM_OF_SUGAR=" + KCAL_PER_GRAM_OF_SUGAR +
                ", VANILLA_SUGAR_PER_PORTION_TEASPOONS=" + VANILLA_SUGAR_PER_PORTION_TEASPOONS +
                ", GRAMS_PER_TEASPOON_VANILLA_SUGAR=" + GRAMS_PER_TEASPOON_VANILLA_SUGAR +
                ", KCAL_PER_GRAM_OF_VANILLA_SUGAR=" + KCAL_PER_GRAM_OF_VANILLA_SUGAR +
                ", EGGS_PER_PORTION=" + EGGS_PER_PORTION +
                ", GRAMS_PER_EGG=" + GRAMS_PER_EGG +
                ", KCAL_PER_GRAM_OF_EGG=" + KCAL_PER_GRAM_OF_EGG +
                ", WHEAT_FLOUR_PER_PORTION_GRAMS=" + WHEAT_FLOUR_PER_PORTION_GRAMS +
                ", KCAL_PER_GRAM_OF_WHEAT_FLOUR=" + KCAL_PER_GRAM_OF_WHEAT_FLOUR +
                ", BAKING_POWDER_PER_PORTION_TEASPOONS=" + BAKING_POWDER_PER_PORTION_TEASPOONS +
                ", GRAMS_PER_BAKING_POWDER=" + GRAMS_PER_BAKING_POWDER +
                ", KCAL_PER_GRAM_OF_BAKING_POWDER=" + KCAL_PER_GRAM_OF_BAKING_POWDER +
                ", MILK_PER_PORTION_GRAMS=" + MILK_PER_PORTION_GRAMS +
                ", KCAL_PER_GRAM_OF_MILK=" + KCAL_PER_GRAM_OF_MILK +
                ", ESSENCE_OF_ALMOND_PER_PORTION_TEASPOONS=" + ESSENCE_OF_ALMOND_PER_PORTION_TEASPOONS +
                ", GRAMS_PER_TEASPOON_ESSENCE_OF_ALMOND=" + GRAMS_PER_TEASPOON_ESSENCE_OF_ALMOND +
                ", KCAL_PER_GRAM_OF_ESSENCE_OF_ALMOND=" + KCAL_PER_GRAM_OF_ESSENCE_OF_ALMOND +
                ", GREEN_FOOD_COLORING_PER_PORTION_TEASPOONS=" + GREEN_FOOD_COLORING_PER_PORTION_TEASPOONS +
                ", GRAMS_PER_TEASPOON_GREEN_FOOD_COLORING=" + GRAMS_PER_TEASPOON_GREEN_FOOD_COLORING +
                ", KCAL_PER_GRAM_OF_GREEN_FOOD_COLORING=" + KCAL_PER_GRAM_OF_GREEN_FOOD_COLORING +
                ", BAKING_FACTOR=" + BAKING_FACTOR +
                ", portions=" + portions +
                ", butter=" + butter +
                ", sugar=" + sugar +
                ", vanillaSugar=" + vanillaSugar +
                ", vanillaSugarGrams=" + vanillaSugarGrams +
                ", eggs=" + eggs +
                ", eggsGrams=" + eggsGrams +
                ", wheatFlour=" + wheatFlour +
                ", bakingPowder=" + bakingPowder +
                ", bakingPowderGrams=" + bakingPowderGrams +
                ", milk=" + milk +
                ", essenceOfAlmond=" + essenceOfAlmond +
                ", essenceOfAlmondGrams=" + essenceOfAlmondGrams +
                ", greenFoodColoring=" + greenFoodColoring +
                ", greenFoodColoringGrams=" + greenFoodColoringGrams +
                ", totalWeightOfIngredients=" + totalWeightOfIngredients +
                ", estimatedFinishedWeight=" + estimatedFinishedWeight +
                ", totalCalories=" + totalCalories +
                ", caloriesPerPortion=" + caloriesPerPortion +
                '}';
    }
}
/*
    Skriv en ny klasse der hedder Cake. Klassen skal som attributter indeholde ingredienser og hvor mange personer kagen er beregnet til.

    Klassen skal have passende konstruktør, get og set metoder, samt toString metode.

    Test i særskilt klasse (main metode) at I kan oprette et Cake objekt, inden I går videre med opgaven.

    Lav en metode, der kan beregne den samlede vægt af alle ingredienser. Metoden skal returnere resultatet.

    Test i main at metoden virker, før I går videre med opgaven.

    Lav en metode, der kan angive den samlede vægt af den færdige kage. Metoden skal returnere resultatet.

    Test i main at metoden virker, før I går videre med opgaven.

    Lav en metode, der kan angive den samlede energi-mængde af den færdige kage. Metoden skal returnere resultatet.

    Test i main at metoden virker, før I går videre med opgaven.

    Diskutér i studiegruppen, hvilke fordele der er ved at lave Kage opgaven objektorienteret.

 */