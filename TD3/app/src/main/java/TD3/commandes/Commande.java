package TD3.commandes;

import TD3.visitors.PrePostVisitor;
import TD3.visitors.Visitor;

public class Commande implements PrePostVisitable, Visitable{
    @Override
    public void accept(PrePostVisitor prePostVisitor) {

    }

    @Override
    public void accept(Visitor visitor) {

    }
}
