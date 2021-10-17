package main.java.td1.original.refractor.api.general;

public interface FoodProduct extends FoodConstituent, Product{

    public default double calories()
    {
        return weight() / 100 * calories_per_100g();
    }
}
