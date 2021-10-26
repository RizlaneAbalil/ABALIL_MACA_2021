package TD3.commandes;

import TD3.visitable.PrePostVisitable;
import TD3.visitable.Visitable;
import TD3.visitors.PrePostVisitor;
import TD3.visitors.Visitor;

import java.util.Map;


public class Client implements PrePostVisitable, Visitable {
    private String name;
    private Map<String, Commande> commandes;

    public Client(String name)
    {
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public void addCommande(Commande commande)
    {
        this.commandes.put(commande.getName(), commande);
    }

    public void addLigne(String name, Ligne l)
    {
        Commande tmp = this.commandes.get(name);
        tmp.addLigne(l);
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
