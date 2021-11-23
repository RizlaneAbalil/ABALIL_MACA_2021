package TD4;

public class Ampoule {

    private AmpouleEtat ampouleEtat;
    private int usage;
    private final int usageMax = 10;

    public Ampoule()
    {
        this.ampouleEtat = new Eteinte(this);
        this.usage=0;
    }

    public void setState(AmpouleEtat ampouleEtat)
    {
        this.ampouleEtat = ampouleEtat;
    }

    public AmpouleEtat getState()
    {
        return this.ampouleEtat;
    }

    public void setUsage()
    {
        this.usage ++;
    }

    public int getUsage()
    {
        return this.usage;
    }

    public int getUsageMax()
    {
        return this.usageMax;
    }

    //AJOUTER LES 3 METHODES
}
