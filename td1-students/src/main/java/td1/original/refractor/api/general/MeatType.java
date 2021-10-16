package main.java.td1.original.refractor.api.general;

public enum MeatType implements FoodConstituent{
    BEEF, WHITEFISH;

    @Override
    public double calories_per_100g()
    {
        double rtn;
        switch(this)
        {
            case BEEF :
                rtn = 200;
                break;
            default:
                rtn = 170;
                break;
        }
        return rtn;
    }

    public double price()
    {
        double rtn;
        switch(this)
        {
            case BEEF :
                rtn = 4;
                break;
            default:
                rtn = 6;
                break;
        }
        return rtn;
    }
}
