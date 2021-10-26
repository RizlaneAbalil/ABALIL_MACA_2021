package td1.refactor.api.macdeau;

import td1.refactor.api.general.BurgerRestaurant;
import td1.refactor.api.general.BurgerCook;
import td1.refactor.api.general.MenuType;
import td1.refactor.api.general.Size;
import td1.refactor.api.general.MeatType;
import td1.refactor.api.general.SauceType;

public class MacDeauRestaurant implements BurgerRestaurant {

    private static MacDeauRestaurant instance = null;

    private MacDeauRestaurant() {
    }

    public static BurgerRestaurant queue() {
        if (instance == null) {
            instance = new MacDeauRestaurant();
        }
        return instance;
    }

    @Override
    public BurgerCook order_menu(MenuType menu) {
        BurgerCook b = null;
        switch (menu) {
            case MEAT_MENU:
                b = new McDeauCook("Beefy", Size.MEDIUM, MeatType.BEEF).with_sauce(SauceType.BURGER).with_onions().with_cheese();
                break;
            case FISH_MENU:
                b = new McDeauCook("Fishy", Size.SMALL, MeatType.WHITEFISH).with_sauce(SauceType.BEARNAISE);
                break;
            case CHEESE_MENU:
            default:
                b = new McDeauCook("Cheesy", Size.SMALL, MeatType.BEEF).with_cheese();
        }
        return b;
    }

    @Override
    public BurgerCook order_personal(Size size, MeatType type) {
        return new McDeauCook("Own style", size, type);
    }

}
