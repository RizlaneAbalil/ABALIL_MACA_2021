package td1.refactor.api.bigburger;

import java.util.List;

import td1.refactor.api.general.Burger;
import td1.refactor.api.general.FoodProduct;

public class BigBurgerBurger extends Burger {
    BigBurgerBurger(String name, List<FoodProduct> items) {
        super(name, items);
    }
}