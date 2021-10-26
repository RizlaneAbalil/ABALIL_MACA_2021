package TD3.commandes;

import TD3.visitable.PrePostVisitable;
import TD3.visitable.Visitable;
import TD3.visitors.PrePostVisitor;
import TD3.visitors.Visitor;

import java.util.List;

public class GroupeClient implements PrePostVisitable, Visitable {
    private String name;
    private List<Client> clients ;

    public GroupeClient(String name)
    {
        this.name = name;
    }

    public void addClient(Client client)
    {
        this.clients.add(client);
    }

    public void addCommande(String name, Commande commande)
    {
        this.name=name;
        this.clients.addCommande(commande);
    }

    public void addLigne(String name, String nameL, Ligne ligne)
    {
        this.name = name;
        this.clients.addLigne(nameL, ligne);
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
