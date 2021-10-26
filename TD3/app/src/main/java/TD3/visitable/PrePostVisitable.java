package TD3.visitable;

import TD3.visitors.PrePostVisitor;

public interface PrePostVisitable{
    public void accept(PrePostVisitor prePostVisitor);
}
