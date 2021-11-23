package TD4;

public class Eteinte extends AmpouleEtat{
//SINGLETON
    public Eteinte(Ampoule context)
    {
        super(context);
    }

    @Override //GONEXT()
    public void allumer(Ampoule a) {
        if(a.getUsage()+1 <= a.getUsageMax())
        {
            a.setState(new Allumee(a));
        }
        System.out.println("L'ampoule est allumée");
    }

    @Override
    public void eteindre(Ampoule a) {
        System.out.println("L'ampoule est déjà éteinte");
    }

    @Override
    public void cassee(Ampoule a) {
        if(a.getUsage()+1 > a.getUsageMax())
        {
            a.setState(new Cassee(a));
        }
        System.out.println("L'ampoule est cassée");
    }
}
