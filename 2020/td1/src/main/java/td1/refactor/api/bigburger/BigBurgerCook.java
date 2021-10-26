package td1.refactor.api.bigburger;

import td1.refactor.api.general.Size;
import td1.refactor.api.general.FoodProduct;
import td1.refactor.api.general.Burger;
import td1.refactor.api.general.Meat;
import td1.refactor.api.general.MeatType;
import td1.refactor.api.general.Sauce;
import td1.refactor.api.general.SauceType;
import td1.refactor.api.general.BurgerCook;
import td1.refactor.api.general.Tomato;
import td1.refactor.api.general.Cheddar;
import td1.refactor.api.general.DeepFriedOnions;

import java.util.ArrayList;
import java.util.List;

public class BigBurgerCook implements BurgerCook {

    private String name;
    private List<FoodProduct> products;

    BigBurgerCook(String name, Size size, MeatType type) {
        this.name = name;
        double weight_for_size;
        switch (size) {
            case SMALL:
                weight_for_size = 100;
                break;
            case MEDIUM:
                weight_for_size = 200;
                break;
            case BIG:
            default:
                weight_for_size = 400;
        }
        this.products = new ArrayList<>();
        this.products.add(new Meat(type, weight_for_size));
    }

    @Override
    public BurgerCook with_sauce(SauceType sauce) {
        this.products.add(new Sauce(sauce, 20));
        return this;
    }

    @Override
    public BurgerCook with_onions() {
        this.products.add(new DeepFriedOnions(20));
        return this;
    }

    @Override
    public BurgerCook with_tomato() {
        this.products.add(new Tomato(10));
        return this;
    }

    @Override
    public BurgerCook with_cheese() {
        this.products.add(new Cheddar(30));
        return this;
    }

    @Override
    public Burger cook() {
        return new BigBurgerBurger(name, products);
    }

}