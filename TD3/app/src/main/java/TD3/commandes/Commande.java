package TD3.commandes;

import TD3.visitable.PrePostVisitable;
import TD3.visitable.Visitable;
import TD3.visitors.PrePostVisitor;
import TD3.visitors.Visitor;

import java.util.HashMap;
import java.util.List;

public class Commande implements PrePostVisitable, Visitable {
    private String name;
    private List<Ligne> lignes;

    public Commande(String name)
    {
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public void addLigne(Ligne ligne)
    {
        lignes.add(ligne);
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
