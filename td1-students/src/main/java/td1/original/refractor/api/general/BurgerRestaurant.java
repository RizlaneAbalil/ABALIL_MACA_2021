package main.java.td1.original.refractor.api.general;

public interface BurgerRestaurant {

    public BurgerCook order_menu(MenuType type);

    public BurgerCook order_personal(Size size, MeatType type);
}
