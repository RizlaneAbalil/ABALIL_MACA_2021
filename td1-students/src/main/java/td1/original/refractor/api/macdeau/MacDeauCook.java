package main.java.td1.original.refractor.api.macdeau;

import main.java.td1.original.refractor.api.general.*;

public class MacDeauCook implements BurgerCook {

    private String name;
    private List<FoodProduct> items;

    public MacDeauCook(String name, Size size, MeatType type)
    {
        this.name = name;
        double weight;

        switch (size)
        {
            case SMALL:
                weight = 50;
                break;
            case MEDIUM:
                weight = 100;
                break;
            default:
                weight = 200;
                break;
        }
        this.items = new ArrayList<>();
        Meat meat = new Meat(type, weight);
        this.items.add(meat);
    }

    @Override
    public BurgerCook with_cheese() {
        Cheddar cheese = new Cheddar(10);
        this.items.add(cheese);
        return this;
    }

    @Override
    public BurgerCook with_onions() {
        DeepFriedOnions onions = new DeepFriedOnions(10);
        this.items.add(onions);
        return this;
    }

    @Override
    public BurgerCook with_sauce(SauceType sauce) {
        Sauce with_sauce = new Sauce(sauce, 40);
        this.items.add(with_sauce);
        return this;
    }

    @Override
    public BurgerCook with_tomato() {
        Tomato tomato = new Tomato(10);
        this.items.add(tomato);
        return this;
    }

    @Override
    public Burger cook() {
        MacDeauBurger macDeauBurger = new MacDeauBurger(name, this.items);
        return macDeauBurger;
    }
}
