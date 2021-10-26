package TD3.visitors;

import TD3.commandes.Client;
import TD3.commandes.Commande;
import TD3.commandes.GroupeClient;
import TD3.commandes.Ligne;

public interface PrePostVisitor extends AbstractVisitor {
    public void preVisit(GroupeClient groupeClient);
    public void preVisit(Client client);
    public void preVisit(Commande commande);
    public void preVisit(Ligne ligne);
    public void postVisit(GroupeClient groupeClient);
    public void postVisit(Client client);
    public void postVisit(Commande commande);
    public void postVisit(Ligne ligne);
}
