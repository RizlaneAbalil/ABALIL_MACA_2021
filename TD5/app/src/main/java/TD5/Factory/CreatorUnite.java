package TD5.Factory;

import TD5.context.IUnite;
import TD5.context.Unite;

public class CreatorUnite extends Creator{
    @Override
    public IUnite creerUnite() {
        return new Unite();
    }
}
