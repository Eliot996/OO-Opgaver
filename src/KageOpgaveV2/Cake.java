package KageOpgaveV2;

public class Cake {

    private final Ingredient[] ingredients;
    private final double[] baseAmounts;
    private final double[] adjustedAmounts;

    private int portions;

    private double  totalWeightOfIngredients, estimatedFinishedWeight, totalCalories, caloriesPerPortion;

    public Cake(){
        ingredients = new Ingredient[9];
        baseAmounts = new double[9];
        adjustedAmounts = new double[9];

        ingredients[0] = new Ingredient("Butter", 7.47);
        baseAmounts[0] = 17.5;

        ingredients[1] = new Ingredient("Sugar", 4);
        baseAmounts[1] = 15;

        ingredients[2] = new Ingredient("Vanilla Sugar", 4.02, "teaspoon",3.5);
        baseAmounts[2] = 0.2;

        ingredients[3] = new Ingredient("Egg", 1.55,"egg(s)", 54);
        baseAmounts[3] = 0.3;

        ingredients[4] = new Ingredient("Wheat flour", 3.5);
        baseAmounts[4] = 15;

        ingredients[5] = new Ingredient("Baking powder", 1.72, "teaspoon", 5);
        baseAmounts[5] = 0.15;

        ingredients[6] = new Ingredient("Milk", 3.5); // skummetmælk
        baseAmounts[6] = 5;

        ingredients[7] = new Ingredient("Essence of almond", 4.9,"teaspoon", 5);
        baseAmounts[7] = 0.2;

        ingredients[8] = new Ingredient("Green food coloring", 0.01, "teaspoon", 5);
        baseAmounts[8] = 0.4;
    }

    public void calculateingredientAmounts(int portions){
        this.portions = portions;

        for (int i = 0; i < ingredients.length; i++) {
            if(ingredients[i].getName().equals("Egg")){
                adjustedAmounts[i] = Math.round(baseAmounts[i] * portions);
            }else{
                adjustedAmounts[i] = baseAmounts[i] * portions;
            }
        }
    }

    public void calculateTotalWeigth(){
        for (int i = 0; i < ingredients.length; i++) {
            if(ingredients[i].getHasAlternativeType()){
                totalWeightOfIngredients += ingredients[i].getGrams(adjustedAmounts[i]);
            } else {
                totalWeightOfIngredients += adjustedAmounts[i];
            }
        }
    }

    public void calculateEstimatedFinishedWeight(){
        double BAKING_FACTOR = 0.9;
        estimatedFinishedWeight = totalWeightOfIngredients * BAKING_FACTOR;
    }

    public void calculateTotalKCAL() {

        for (int i = 0; i < ingredients.length; i++) {
            totalCalories += ingredients[i].getKcal(adjustedAmounts[i]);
        }
    }

    public void calculateKCALPerPortions(){
        caloriesPerPortion = totalCalories / portions;
    }

    // creates a string with StringBuilder, and adds each item in ingredients to the string, with name, weight and type
    public String getFormattedAmounts(){
        StringBuilder string = new StringBuilder("You need the following to make " + portions + " portions \n");

        for (int i = 0; i < ingredients.length; i++) {
            if (ingredients[i].getHasAlternativeType()){
                string.append(ingredients[i].getName()).append(": ").append(String.format("%.0f ", adjustedAmounts[i])).
                        append(ingredients[i].getAlternativeType()).append("\n");
            } else {
                string.append(ingredients[i].getName()).append(": ").append(String.format("%.1f ", adjustedAmounts[i])).
                        append("grams\n");
            }
        }

        return string.toString();
    }

    public String getFormattedInfo(){
        return String.format("Total weight of ingredients: %.1f grams %n", totalWeightOfIngredients) +
                String.format("The estimated weight of the finished cake is: %.1f grams %n", estimatedFinishedWeight) +
                String.format("The cake has a total of %.1f Kcal or %.1f per portion %n", totalCalories, caloriesPerPortion);
    }


}