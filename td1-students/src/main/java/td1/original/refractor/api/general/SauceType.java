package main.java.td1.original.refractor.api.general;

public enum SauceType implements FoodConstituent{
    BURGER, BARBECUE, BEARNAISE;

    // BURGER : 240 kcal / 100g
    // BARBECUE : 130 kcal / 100g
    // BEARNAISE : 550 kcal / 100g

    public double calories_per_100g()
    {
        double rtn;
        switch (this)
        {
            case BURGER -> {
                rtn = 240;
                break;
            }
            case BARBECUE -> {
                rtn = 130;
                break;
            }
            default -> {
                rtn = 550;
                break;
            }
        }
        return rtn;
    }
}
