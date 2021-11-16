package TD3.visitorsImpl;

import TD3.commandes.Client;
import TD3.commandes.Commande;
import TD3.commandes.GroupeClient;
import TD3.commandes.Ligne;
import TD3.visitors.Visitor;

public class PrintRapportCommandes implements Visitor {
    STRIG?INTEGER factures
            cumulclient
    cummulcommandes
    @Override
    public void visit(GroupeClient groupeClient){
        //On parcourt la liste des clients de groupeClient
        //Pour chaque client on affiche la sum des lignes des commandes du client concerné
        //POur tous les cliets dans le groupe on affiche le
        System.out.println();factures.get(c.getName())
    }

    @Override
    public void visit(Client client) {
    }

    @Override
    public void visit(Commande commande) {
    }

    @Override
    public void visit(Ligne ligne) {
        l;GETSUM()
    }

}
