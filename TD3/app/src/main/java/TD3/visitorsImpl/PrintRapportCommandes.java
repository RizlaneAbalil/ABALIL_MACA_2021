package TD3.visitorsImpl;

import TD3.commandes.Client;
import TD3.commandes.Commande;
import TD3.commandes.GroupeClient;
import TD3.commandes.Ligne;
import TD3.visitors.Visitor;

public class PrintRapportCommandes implements Visitor {
    @Override
    public void visit(GroupeClient groupeClient) {
        groupeClient.accept(this);
    }

    @Override
    public void visit(Client client) {
        client.accept(this);
    }

    @Override
    public void visit(Commande commande) {
        commande.accept(this);
    }

    @Override
    public void visit(Ligne ligne) {
        ligne.accept(this);
    }
}
