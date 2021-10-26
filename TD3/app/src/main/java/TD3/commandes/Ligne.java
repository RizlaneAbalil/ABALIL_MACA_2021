package TD3.commandes;

import TD3.visitable.PrePostVisitable;
import TD3.visitable.Visitable;
import TD3.visitors.PrePostVisitor;
import TD3.visitors.Visitor;

public class Ligne implements PrePostVisitable, Visitable {
    private String name;
    private int sum;

    public Ligne(String name, int sum)
    {
        this.name = name;
        this.sum = sum;
    }

    public Ligne(String name)
    {
        this.name = name;
    }

    @Override
    public void accept(PrePostVisitor prePostVisitor) {
        prePostVisitor.preVisit(this);
        prePostVisitor.postVisit(this);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
