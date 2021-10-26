package td2.forum.v2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public abstract class Conteneur<T extends IContenu<T>> implements IConteneur<T> {

    private final String sujet;
    private final List<IContenu<T>> children;

    public Conteneur(String sujet) {
        this.sujet = sujet;
        this.children = new ArrayList<>();
    }

    public void add(IContenu<T> child) {
        children.add(child);
    }

    public void remove(int index) {
        children.remove(index);
    }

    public int size() {
        return children.size();
    }

    @Override
    public String sujet() {
        return sujet;
    }

    @Override
    public String contenu() {
        return children.stream().map(IForumObject::repr).collect(Collectors.joining("\n"));
    }

    @Override
    public String toString() { return repr(); }

}
