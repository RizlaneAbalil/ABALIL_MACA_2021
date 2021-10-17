package main.java.td1.original.refractor.api.general;

public class Meat implements FoodProduct {

    // BEEF : 200 kcal / 100g
    // WHITEFISH : 170 kcal / 100g
    private double weight;
    private MeatType type;

    public Meat(MeatType type, double weight)
    {
        this.type = type;
        this.weight = weight;
    }

    @Override
    public double price() {
        return type.price() * weight / 100;
    }

    @Override
    public double weight() {
        return weight;
    }

    @Override
    public String toString() {
        return String.format("%s (%.0fg) -- %.2f€", type, weight(), price());
    }

    @java.lang.Override
    public double calories_per_100g() {
        return type.calories_per_100g();
    }
}
