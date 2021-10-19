package main.java.td2.filesystem;

import java.util.Objects;

public abstract class ComposantImpl implements Composant{

    private final String name;
    private Owner owner;

    public ComposantImpl(String name, Owner owner)
    {
        this.name = name;
        this.owner = owner;
    }

    public String getName()
    {
        return this.name;
    }

    public Owner getOwner()
    {
        return this.owner;
    }

    public void setOwner(Owner owner, boolean recursive)
    {
        this.owner = owner;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ComposantImpl composant = (ComposantImpl) o;
        return name.equals(composant.name) && owner.equals(composant.owner);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, owner);
    }
}
