package td1.step5.api.burger;

import td1.step5.api.restauration.Base;

public enum BurgerMeat implements Base {
    BEEF, WHITEFISH;

    @Override
    public double calories_per_100g() {
        double rtr;
        switch (this) {
            case BEEF:
                rtr = 200;
                break;
            case WHITEFISH:
            default:
                rtr = 170;
                break;
        }
        return rtr;
    }

    @Override
    public double price() {
        double rtr;
        switch (this) {
            case BEEF:
                rtr = 4;
                break;
            case WHITEFISH:
            default:
                rtr = 6;
                break;
        }
        return rtr;
    }

    public boolean hasUniquePrice() {
        return false;
    }

    @Override
    public String toString() {
        String rtr;
        switch (this) {
            case BEEF:
                rtr = "BEEF";
                break;
            case WHITEFISH:
            default:
                rtr = "WHITEFISH";
                break;
        }
        return rtr;
    }
}
