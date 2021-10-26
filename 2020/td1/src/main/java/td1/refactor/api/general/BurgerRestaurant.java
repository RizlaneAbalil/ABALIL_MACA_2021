package td1.refactor.api.general;

public interface BurgerRestaurant {
    BurgerCook order_menu(MenuType menu);

    BurgerCook order_personal(Size size, MeatType type);
}
