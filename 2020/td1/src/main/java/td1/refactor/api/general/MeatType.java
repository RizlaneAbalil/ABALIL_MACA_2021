package td1.refactor.api.general;

public enum MeatType implements FoodConstituent {
    BEEF, WHITEFISH;

    @Override
    public double calories_per_100g() {
        double rtr;
        switch (this) {
            case WHITEFISH:
                rtr = 170;
                break;
            case BEEF:
            default:
                rtr = 200;
        }
        return rtr;
    }

    public double price() {
        double rtr;
        switch (this) {
            case WHITEFISH:
                rtr = 6;
                break;
            case BEEF:
            default:
                rtr = 4;
        }
        return rtr;
    }
}
