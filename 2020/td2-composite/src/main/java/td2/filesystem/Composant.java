package td2.filesystem;

public interface Composant {

    String getName();
    int getSize();
    String getContent();
    void appendContent(String name);
    Owner getOwner();
    void setOwner(Owner owner, boolean recursive);
    boolean isComposite();
}
