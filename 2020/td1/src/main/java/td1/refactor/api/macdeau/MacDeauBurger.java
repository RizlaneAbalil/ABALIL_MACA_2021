package td1.refactor.api.macdeau;

import java.util.List;

import td1.refactor.api.general.Burger;
import td1.refactor.api.general.FoodProduct;

public class MacDeauBurger extends Burger {
    MacDeauBurger(String name, List<FoodProduct> items) {
        super(name, items);
    }
}