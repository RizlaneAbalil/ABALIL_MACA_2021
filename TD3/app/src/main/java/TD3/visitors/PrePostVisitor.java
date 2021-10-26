package TD3.visitors;

public interface PrePostVisitor extends AbstractVisitor {
    public void preVisit(GroupeClient);
    public void preVisit(Client);
    public void preVisit(Commande);
    public void preVisit(Ligne);
    public void postVisit(GroupeClient);
    public void postVisit(Client);
    public void postVisit(Commande);
    public void postVisit(Ligne);
}
