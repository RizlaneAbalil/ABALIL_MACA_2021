package TD3.visitors;

import TD3.commandes.Client;
import TD3.commandes.Commande;
import TD3.commandes.GroupeClient;
import TD3.commandes.Ligne;

public interface Visitor extends AbstractVisitor{
    public void visit(GroupeClient groupeClient);
    public void visit(Client client);
    public void visit(Commande commande);
    public void visit(Ligne ligne);
}
