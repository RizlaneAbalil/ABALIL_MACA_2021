package TD4;

public class Allumee extends AmpouleEtat{

    public Allumee(Ampoule context)
    {
        super(context);
    }
    @Override
    public void allumer(Ampoule a) {
        System.out.println("L'ampoule est déjà allumée");
    }

    @Override
    public void eteindre(Ampoule a) {
        a.setState(new Eteinte(a));
        System.out.println("L'ampoule est éteinte");
    }

    @Override
    public void cassee(Ampoule a) {

    }
}
