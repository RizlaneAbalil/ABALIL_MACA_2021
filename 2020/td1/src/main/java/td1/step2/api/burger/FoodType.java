package td1.step2.api.burger;

import td1.step2.api.restauration.FoodProduct;

public enum FoodType implements FoodProduct {
    BURGER, BARBECUE, BEARNAISE, BEEF, WHITEFISH, CHEDDAR, DEEPFRIEDONIONS, TOMATO;

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
                rtr = 550;
                break;
            case BEEF:
                rtr = 200;
                break;
            case WHITEFISH:
                rtr = 170;
                break;
            case CHEDDAR:
                rtr = 400;
                break;
            case DEEPFRIEDONIONS:
                rtr = 590;
                break;
            case TOMATO:
            default:
                rtr = 21;
        }
        return rtr;
    }

    @Override
    public double price() {
        double rtr;
        switch (this) {
            case BURGER:
            case BARBECUE:
            case BEARNAISE:
                rtr = 1;
                break;
            case BEEF:
                rtr = 4;
                break;
            case WHITEFISH:
                rtr = 6;
                break;
            case CHEDDAR:
                rtr = 4;
                break;
            case DEEPFRIEDONIONS:
                rtr = 1.5;
                break;
            case TOMATO:
            default:
                rtr = 0.5;
        }
        return rtr;
    }

    public boolean hasUniquePrice() {
        boolean rtr;
        switch (this) {
            case BURGER:
            case BARBECUE:
            case BEARNAISE:
                rtr = true;
                break;
            default:
                rtr = false;
        }
        return rtr;
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
                rtr = "BEARNAISE sauce";
                break;
            case BEEF:
                rtr = "BEEF";
                break;
            case WHITEFISH:
                rtr = "WHITEFISH";
                break;
            case CHEDDAR:
                rtr = "cheddar";
                break;
            case DEEPFRIEDONIONS:
                rtr = "deep fried onions";
                break;
            case TOMATO:
            default:
                rtr = "tomato";
        }
        return rtr;
    }
}
