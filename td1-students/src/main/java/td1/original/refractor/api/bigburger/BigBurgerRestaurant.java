package main.java.td1.original.refractor.api.bigburger;

import main.java.td1.original.refractor.api.general.BurgerCook;
import main.java.td1.original.refractor.api.general.MeatType;
import main.java.td1.original.refractor.api.general.MenuType;
import main.java.td1.original.refractor.api.general.Size;

import static main.java.td1.original.refractor.api.general.MeatType.BEEF;
import static main.java.td1.original.refractor.api.general.MeatType.WHITEFISH;
import static main.java.td1.original.refractor.api.general.Size.BIG;
import static main.java.td1.original.refractor.api.general.Size.MEDIUM;

public class BigBurgerRestaurant {

    private static BigBurgerRestaurant instance ;

    private BigBurgerRestaurant(){}

    public static BigBurgerRestaurant queue()
    {
        return instance;
    }

    public BurgerCook order_menu(MenuType menu)
    {
        BigBurgerCook bigBurgerCook;

        switch (menu)
        {
            case FISH_MENU :
                bigBurgerCook = new BigBurgerCook("FiletO'Poisson", MEDIUM, WHITEFISH);
                break;
            case MEAT_MENU:
                bigBurgerCook = new BigBurgerCook("BigMarcel", BIG, BEEF);
            default:
                bigBurgerCook = new BigBurgerCook("MaxeeCheesee", MEDIUM, BEEF);
        }
        return  bigBurgerCook;
    }

    public BurgerCook order_personal(Size size, MeatType type)
    {
        BigBurgerCook bigBurgerCook = new BigBurgerCook("Own Style", size, type);
        return bigBurgerCook;
    }
}
