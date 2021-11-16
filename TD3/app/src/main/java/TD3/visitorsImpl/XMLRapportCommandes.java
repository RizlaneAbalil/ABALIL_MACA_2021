package TD3.visitorsImpl;

import TD3.commandes.Client;
import TD3.commandes.Commande;
import TD3.commandes.GroupeClient;
import TD3.commandes.Ligne;
import TD3.visitors.PrePostVisitor;

public class XMLRapportCommandes implements PrePostVisitor {
    @Override
    public void preVisit(GroupeClient groupeClient) {
        System.out.println("<groupe>");
        this.postVisit(groupeClient);
    }

    @Override
    public void preVisit(Client client) {
        System.out.println("<client>");client.getname
        this.postVisit(client);
    }

    @Override
    public void preVisit(Commande commande) {
        System.out.println("<commande>");
        this.postVisit(commande);
    }

    @Override
    public void preVisit(Ligne ligne) {
        System.out.println("<ligne>");
        this.preVisit(ligne);
    }

    @Override
    public void postVisit(GroupeClient groupeClient) {
        System.out.println("</groupe>");
    }

    @Override
    public void postVisit(Client client) {
        System.out.println("</client>");

    }

    @Override
    public void postVisit(Commande commande) {
        System.out.println("</commande>");

    }

    @Override
    public void postVisit(Ligne ligne) {
        System.out.println("</ligne>");
    }
}
