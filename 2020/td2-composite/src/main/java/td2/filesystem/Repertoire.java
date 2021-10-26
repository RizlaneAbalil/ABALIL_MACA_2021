package td2.filesystem;

import java.util.ArrayList;
import java.util.List;

public class Repertoire extends ComposantImpl implements Composant, Composite<Composant> {
    private List<Composant> children;

    Repertoire(String name, Owner owner) {
        super(name, owner);
        children = new ArrayList<>();
    }

    @Override
    public void setOwner(Owner owner, boolean recursive) {
        super.setOwner(owner, recursive);
        if (recursive) {
            this.children.forEach(c -> {
                c.setOwner(owner, recursive);
            });
        }
    }

    @Override
    public boolean isComposite() {
        return true;
    }

    @Override
    public List<Composant> getChildren() {
        return this.children;
    }

    @Override
    public void addChild(Composant composant) {
        this.children.add(composant);
    }

    @Override
    public boolean removeChild(Composant composant) {
        return this.children.remove(composant);
    }

    @Override
    public boolean removeChildren(List<Composant> t) {
        return this.children.removeAll(t);
    }

    @Override
    public int getSize() {
        return this.children.size();
    }

    @Override
    public String getContent() {
        StringBuilder sb = new StringBuilder();
        this.children.forEach(c -> {
            sb.append(c.getName()).append("\n");
        });
        return sb.toString();
    }

    @Override
    public void appendContent(String name) {
        throw new UnsupportedOperationException("Cannot append content to directory");
    }

    @Override
    public String toString() {
        return getContent();
    }
}
