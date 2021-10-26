package TD3.commandes;

import TD3.visitors.Visitor;

public interface Visitable {
    public void accept(Visitor visitor);
}
