package TD3.commandes;

import TD3.visitors.PrePostVisitor;

public interface PrePostVisitable{
    public void accept(PrePostVisitor prePostVisitor);
}
