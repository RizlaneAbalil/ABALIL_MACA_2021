package main.java.td1.original.refractor.api.general;

import java.util.List;

public abstract class Burger implements FoodProduct {

    String name;
    List<Product> items;

    public Burger(String name, List<FoodProduct> items) {
        this.name = name;
        this.items = items;
    }

    @Override
    public double weight() {
        return items.stream().map(Product::weight).reduce(0.0, Double::sum);
    }

    @Override
    public double price() {
        return items.stream().map(Product::price).reduce(0.0, Double::sum);
    }

    @Override
    public double calories() {
        return items.stream().map(Product::calories).reduce(0.0, Double::sum);
    }

    @Override
    public String toString() {
        final String DELIM = "--------------------\n";
        StringBuilder buffer = new StringBuilder();
        buffer.append(String.format("*** Menu %s ***\n", name));
        for (Object item : items) {
            buffer.append(String.format("- %s\n", item));
        }
        buffer.append(DELIM);
        buffer.append(String.format("price:         %.2f\n", price()));
        buffer.append(DELIM);
        return buffer.toString();
    }

    public double calories_per_100()
    {
        return calories() / 100 * weight();
    }
}
