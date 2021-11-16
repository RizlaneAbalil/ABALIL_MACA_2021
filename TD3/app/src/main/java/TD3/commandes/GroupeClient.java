package TD3.commandes;

import TD3.exceptions.MonException;
import TD3.visitable.PrePostVisitable;
import TD3.visitable.Visitable;
import TD3.visitors.PrePostVisitor;
import TD3.visitors.Visitor;

import java.util.HashMap;
import java.util.Map;

public class GroupeClient implements PrePostVisitable, Visitable {
    private String name;
    private Map<String, Client> clients ;

    public GroupeClient(String name)
    {
        this.name = name;
        this.clients = new HashMap<>();
    }

    public void addClient(Client client)
    {
        this.clients.put(client.getName(), client);
    }

    public void addCommande(String name, Commande commande) throws MonException {
        Client tmp = this.clients.get(name);
        //Si le client existe
        if(tmp!=null)
        {
            tmp.addCommande(commande);
        }
        else throw new MonException("Le client n'existe pas");
    }

    public void addLigne(String name, String nameL, Ligne ligne)
    {
        Client tmp = this.clients.get(name);
        tmp.addLigne(nameL, ligne);
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
