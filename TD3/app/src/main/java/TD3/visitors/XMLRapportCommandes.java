package TD3.visitors;

import TD3.commandes.Client;
import TD3.commandes.Commande;
import TD3.commandes.GroupeClient;
import TD3.commandes.Ligne;

public class XMLRapportCommandes implements PrePostVisitor{
    @Override
    public void preVisit(GroupeClient groupeClient) {

    }

    @Override
    public void preVisit(Client client) {

    }

    @Override
    public void preVisit(Commande commande) {

    }

    @Override
    public void preVisit(Ligne ligne) {

    }

    @Override
    public void postVisit(GroupeClient groupeClient) {

    }

    @Override
    public void postVisit(Client client) {

    }

    @Override
    public void postVisit(Commande commande) {

    }

    @Override
    public void postVisit(Ligne ligne) {

    }
}
