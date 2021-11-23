package TD4;

public abstract class AmpouleEtat {

    Ampoule context;

    public AmpouleEtat(Ampoule context)
    {
        this.context = context;
    }

    public abstract void allumer(Ampoule a);
    public abstract void eteindre(Ampoule a);
    public abstract void cassee(Ampoule a);
}
