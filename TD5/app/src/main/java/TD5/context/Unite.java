package TD5.context;

import TD5.strategyA.Deplacement;
import TD5.strategyB.Attaque;

public class Unite {
    public Deplacement deplacement;
    public Attaque attaque;

    public void setDeplacement(Deplacement deplacement)
    {
        this.deplacement = deplacement;
    }

    public void setAttaque(Attaque attaque)
    {
        this.attaque = attaque;
    }

    public void seDeplacer()
    {
        this.deplacement.deplacer();
    }

    public void combattre()
    {
        this.attaque.attaquer();
    }
}
