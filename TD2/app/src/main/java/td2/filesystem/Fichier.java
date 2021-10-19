package main.java.td2.filesystem;

public final class Fichier extends ComposantImpl implements Composant{

    private StringBuilder content;

    public Fichier(String name, Owner owner)
    {
        super(name, owner);
    }

    @Override
    public int getSize() {
        return 0;
    }

    @Override
    public String getContent() {
        return this.content.toString();
    }

    @Override
    public void appendContent(String name) {
        this.content.append(name);
    }

    @Override
    public boolean isComposite() {
        return false;
    }

    public String toString()
    {
        return this.getContent();
    }
}
