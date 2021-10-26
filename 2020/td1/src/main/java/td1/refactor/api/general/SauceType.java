package td1.refactor.api.general;

public enum SauceType implements FoodConstituent {
    BURGER, BARBECUE, BEARNAISE;

    @Override
    public double calories_per_100g() {
        double rtr = 0;
        switch (this) {
            case BARBECUE:
                rtr = 130;
                break;
            case BEARNAISE:
                rtr = 550;
                break;
            case BURGER:
            default:
                rtr = 240;
        }
        return rtr;
    }
}
