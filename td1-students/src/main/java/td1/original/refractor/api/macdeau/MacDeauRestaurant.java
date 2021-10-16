package main.java.td1.original.refractor.api.macdeau;

import main.java.td1.original.refractor.api.general.BurgerCook;
import main.java.td1.original.refractor.api.general.MeatType;
import main.java.td1.original.refractor.api.general.MenuType;
import main.java.td1.original.refractor.api.general.Size;

import static main.java.td1.original.refractor.api.general.MeatType.BEEF;
import static main.java.td1.original.refractor.api.general.MeatType.WHITEFISH;
import static main.java.td1.original.refractor.api.general.Size.MEDIUM;
import static main.java.td1.original.refractor.api.general.Size.SMALL;

public class MacDeauRestaurant {

    private static MacDeauRestaurant instance;

    //Constructeur interne au package
    private MacDeauRestaurant()
    {
    }

    MacDeauRestaurant queue()
    {
        //On renvoie un restaurant
        return this.instance;
    }

    BurgerCook order_menu(MenuType menu)
    {
        BurgerCook burgerCook;
        switch (menu)
        {
            case MEAT_MENU:
                burgerCook = new MacDeauCook("Beefy", MEDIUM, BEEF);
                break;
            case FISH_MENU:
                burgerCook = new MacDeauCook("Fishy", SMALL, WHITEFISH);
                break;
            default:
                burgerCook = new MacDeauCook("Cheesy", SMALL, BEEF);
                break;
        }
        return burgerCook;
    }

    BurgerCook order_personal(Size size, MeatType type)
    {
        BurgerCook burgerCook = new MacDeauCook("Own style", size, type);
        return burgerCook;
    }
}
