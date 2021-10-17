package main.java.td1.original.refractor.api.bigburger;

import main.java.td1.original.refractor.api.general.*;

public class BigBurgerCook implements BurgerCook {

    private String name;
    private List<FoodProduct> products;

    public BigBurgerCook(String name, Size size, MeatType type)
    {
        this.name = name;
        double weight;

        switch (size)
        {
            case SMALL:
                weight = 100;
                break;
            case MEDIUM:
                weight = 200;
                break;
            default:
                weight = 400;
                break;
        }
        this.products = new ArrayList<>();
        Meat meat = new Meat(type, weight);
        this.products.add(meat);
    }

    @Override
    public BurgerCook with_cheese() {
        Cheddar cheddar = new Cheddar(30);
        this.products.add(cheddar);
        return this;
    }

    @Override
    public BurgerCook with_onions() {
        DeepFriedOnions deepFriedOnions = new DeepFriedOnions(20);
        this.products.add(deepFriedOnions);
        return this;
    }

    @Override
    public BurgerCook with_sauce(SauceType sauce) {
        Sauce with_sauce = new Sauce(sauce, 20);
        this.products.add(with_sauce);
        return this;
    }

    @Override
    public BurgerCook with_tomato() {
        Tomato tomato = new Tomato(10);
        this.products.add(tomato);
        return this;
    }

    @Override
    public Burger cook() {
        BigBurgerBurger bigBurgerBurger = new BigBurgerBurger(this.name, this.products);
        return bigBurgerBurger;
    }
}
