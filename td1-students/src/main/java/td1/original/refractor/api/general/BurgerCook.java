package main.java.td1.original.refractor.api.general;

public interface BurgerCook {

    public BurgerCook with_cheese();
    public BurgerCook with_onions();
    public BurgerCook with_sauce(SauceType sauce);
    public BurgerCook with_tomato();
    public Burger cook();
}
