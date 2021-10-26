package td1.step4.api.burger;

import td1.step4.api.restauration.ComposedFood;

public class BurgerBuilder {

    private ComposedFood burger;

    // private pour forcer à utiliser order_menu, order_beef ou order_fish
    private BurgerBuilder() {
    }

    public static BurgerBuilder order_menu(String name, MenuType type) {
        BurgerBuilder rtr;
        switch (type) {
            case MEAT_MENU:
                rtr = order_beef(name, MenuSize.MEDIUM).with_burger_sauce().with_onions().with_cheese();
                break;
            case FISH_MENU:
                rtr = order_fish(name, MenuSize.SMALL).with_bearnaise_sauce();
                break;
            case CHEESE_MENU:
            default:
                rtr = order_beef(name, MenuSize.SMALL).with_cheese();
                break;
        }
        return rtr;
    }

    public static BurgerBuilder order_beef(String name, MenuSize size) {
        BurgerBuilder rtr = new BurgerBuilder();
        rtr.burger = new Burger(name);
        rtr.burger.add(BurgerBase.BEEF, size.meatWeight());
        return rtr;
    }

    public static BurgerBuilder order_fish(String name, MenuSize size) {
        BurgerBuilder rtr = new BurgerBuilder();
        rtr.burger = new Burger(name);
        rtr.burger.add(BurgerBase.WHITEFISH, size.meatWeight());
        return rtr;
    }

    public BurgerBuilder with_onions() {
        this.burger.add(BurgerBase.DEEPFRIEDONIONS, 10);
        return this;
    }

    public BurgerBuilder with_tomato() {
        this.burger.add(BurgerBase.TOMATO, 10);
        return this;
    }

    public BurgerBuilder with_bearnaise_sauce() {
        this.burger.add(BurgerBase.BEARNAISE, 40);
        return this;
    }

    public BurgerBuilder with_burger_sauce() {
        this.burger.add(BurgerBase.BURGER, 40);
        return this;
    }

    public BurgerBuilder with_barbecue_sauce() {
        this.burger.add(BurgerBase.BARBECUE, 40);
        return this;
    }

    public BurgerBuilder with_cheese() {
        this.burger.add(BurgerBase.CHEDDAR, 15);
        return this;
    }

    public ComposedFood cook() {
        return this.burger;
    }
}
