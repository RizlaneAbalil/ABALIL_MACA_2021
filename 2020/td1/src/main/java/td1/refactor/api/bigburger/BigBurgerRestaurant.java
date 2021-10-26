package td1.refactor.api.bigburger;

import td1.refactor.api.general.BurgerRestaurant;
import td1.refactor.api.general.BurgerCook;
import td1.refactor.api.general.MenuType;
import td1.refactor.api.general.Size;
import td1.refactor.api.general.MeatType;
import td1.refactor.api.general.SauceType;

public class BigBurgerRestaurant implements BurgerRestaurant {

    private static BigBurgerRestaurant instance = null;

    private BigBurgerRestaurant() {
    }

    public static BurgerRestaurant queue() {
        if (instance == null) {
            instance = new BigBurgerRestaurant();
        }
        return instance;
    }

    @Override
    public BurgerCook order_menu(MenuType menu) {
        BurgerCook b = null;
        switch (menu) {
            case MEAT_MENU:
                b = new BigBurgerCook("BigMarcel", Size.BIG, MeatType.BEEF).with_sauce(SauceType.BURGER).with_onions().with_tomato();
                break;
            case FISH_MENU:
                b = new BigBurgerCook("FiletO'Poisson", Size.MEDIUM, MeatType.WHITEFISH).with_sauce(SauceType.BEARNAISE);
                break;
            case CHEESE_MENU:
            default:
                b = new BigBurgerCook("MaxeeCheesee", Size.MEDIUM, MeatType.BEEF).with_cheese().with_onions();
        }
        return b;
    }

    @Override
    public BurgerCook order_personal(Size size, MeatType type) {
        return new BigBurgerCook("Own style", size, type);
    }

}
