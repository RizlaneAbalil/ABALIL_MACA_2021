package TD4;

public class Eteinte extends AmpouleEtat{
//SINGLETON
    public Eteinte(Ampoule context)
    {
        super(context);
    }

    @Override //GONEXT()
    public void allumer(Ampoule a) {
        context.setState(new Allumee(a));
    }

    @Override
    public void eteindre(Ampoule a) {
        context.setState(new Eteinte(a));

    }

    @Override
    public void cassee(Ampoule a) {
        context.setState(new Cassee(a));
    }
}
