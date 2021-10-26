package TD3.visitors;

public interface Visitor extends AbstractVisitor{
    public void visit(GroupeClient);
    public void visit(Client);
    public void visit(Commande);
    public void visit(Ligne);
}
