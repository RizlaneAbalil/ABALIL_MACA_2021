package TD5.context;

import TD5.strategyA.Deplacement;
import TD5.strategyB.Attaque;

public interface IUnite {
    public void seDeplacer();

    public void combattre();

    public void setDeplacement(Deplacement deplacement);

    public void setAttaque(Attaque attaque);

}

