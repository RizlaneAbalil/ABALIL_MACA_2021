package td2.filesystem;

import java.util.Objects;

public abstract class ComposantImpl implements Composant {

    private final String name;
    private Owner owner;

    public ComposantImpl(String name, Owner owner) {
        this.name = name;
        this.owner = owner;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public Owner getOwner() {
        return this.owner;
    }

    @Override
    public void setOwner(Owner owner, boolean recursive) {
        this.owner = owner;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fichier fichier = (Fichier) o;
        return Objects.equals(this.getName(), fichier.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.getName());
    }
}
