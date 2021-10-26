package td1.step5.api.burger;

import td1.step5.api.restauration.Base;

public enum BurgerSauce implements Base {
    BURGER, BARBECUE, BEARNAISE;

    @Override
    public double calories_per_100g() {
        double rtr;
        switch (this) {
            case BURGER:
                rtr = 240;
                break;
            case BARBECUE:
                rtr = 130;
                break;
            case BEARNAISE:
            default:
                rtr = 550;
                break;
        }
        return rtr;
    }

    @Override
    public double price() {
        return 1;
    }

    public boolean hasUniquePrice() {
        return true;
    }

    @Override
    public String toString() {
        String rtr;
        switch (this) {
            case BURGER:
                rtr = "BURGER sauce";
                break;
            case BARBECUE:
                rtr = "BARBECUE sauce";
                break;
            case BEARNAISE:
            default:
                rtr = "BEARNAISE sauce";
                break;
        }
        return rtr;
    }
}
