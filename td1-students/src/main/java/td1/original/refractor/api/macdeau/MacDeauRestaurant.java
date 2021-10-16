package main.java.td1.original.refractor.api.macdeau;

import main.java.td1.original.refractor.api.general.BurgerCook;
import main.java.td1.original.refractor.api.general.MeatType;
import main.java.td1.original.refractor.api.general.MenuType;
import main.java.td1.original.refractor.api.general.Size;

public class MacDeauRestaurant {

    private static MacDeauRestaurant instance;

    //Constructeur interne au package
    MacDeauRestaurant()
    {
        //this.instance ?
    }

    MacDeauRestaurant queue()
    {
        //On renvoie un restaurant
        return this.instance;
    }

    BurgerCook order_menu(MenuType menu)
    {
        BurgerCook
    }

    BurgerCook order_personal(Size size, MeatType type)
    {
        BurgerCook burgerCook = new BurgerCook(size, type);
        return burgerCook;
    }
}
