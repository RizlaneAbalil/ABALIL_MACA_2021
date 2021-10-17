package main.java.td1.original.refractor.api.general;

public class Sauce implements FoodProduct {

    private static double BASE_PRICE = 1;
    private SauceType type;
    private double weight;

    public Sauce(SauceType type, double weight) {
        this.type = type;
        this.weight = weight;
    }

    @Override
    public double price() {
        return BASE_PRICE;
    }

    @Override
    public double weight() {
        return weight;
    }

    @Override
    public String toString() {
        return String.format("%s sauce (%.0fg) -- %.2f€", type, weight(), price());
    }


    @Override
    public double calories_per_100g() {
        return type.calories_per_100g();
    }
}
