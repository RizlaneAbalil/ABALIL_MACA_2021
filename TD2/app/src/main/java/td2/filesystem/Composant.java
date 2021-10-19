package main.java.td2.filesystem;

public interface Composant {
    public String getName();

    public Owner getOwner();

    public void setOwner(Owner owner, boolean recursive);

    public int getSize();

    public String getContent();

    public void appendContent(String name);

    public boolean isComposite();
}
