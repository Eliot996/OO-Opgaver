package KageOpgaveV2;

public class Ingredient {
    private final String name;
    private final double kcalPerGram;

    private boolean hasAlternativeType;
    private String alternativeType;
    private double ratioToGram;

    public Ingredient(String name, double kcalPerGram){
        this.name = name;
        this.kcalPerGram = kcalPerGram;
    }

    public Ingredient(String name, double kcalPerGram, String alternativeType,double ratioToGram){
        this.name = name;
        this.kcalPerGram = kcalPerGram;
        this.hasAlternativeType = true;
        this.alternativeType = alternativeType;
        this.ratioToGram = ratioToGram;
    }

    public String getName() {
        return name;
    }

    public double getKcal(double amount) {
        if(hasAlternativeType){
            return kcalPerGram * getGrams(amount);
        }
        return kcalPerGram * amount;
    }

    public boolean getHasAlternativeType(){
        return hasAlternativeType;
    }

    public String getAlternativeType() {
        return alternativeType;
    }

    public double getGrams(double amount) {
        return ratioToGram * amount;
    }
}
