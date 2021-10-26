package TD3.visitable;

import TD3.visitors.Visitor;

public interface Visitable {
    public void accept(Visitor visitor);
}
